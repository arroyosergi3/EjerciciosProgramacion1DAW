package capitulo08.bloque01.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Coche {

	


		


			public static void main(String[] args) throws SQLException {
				Connection conexion = null;
				try {
					conexion = (Connection) DriverManager
							.getConnection("jdbc:mysql://localhost:3310/tutorialjavaconcesionarios?serverTimezone=UTC", "root", "1234");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scanner sc = new Scanner(System.in);
				// TODO Auto-generated method stub
				int eleccion = 0;
				do {
					System.out.println("Menú\n" + "\n0. Salir" + "\n1. Listar "
							+ "\n2. Crear concesionario" + "\n3. Modificar  concesionario" + "\n4. Eliminar concesionario");
					eleccion = Integer.parseInt(sc.nextLine());

					switch (eleccion) {
					case 0: {

						break;
					}
					case 1: {
						listar(conexion);
						break;
					}
					case 2: {
						String cif = "";
						String nombre = "";

						System.out.println("Dame el CIF: ");
						cif = sc.nextLine();
						System.out.println("Dame el nombre: ");
						nombre = sc.nextLine();
						aniadir(conexion, cif, nombre);

						break;
					}
					case 3: {
						int id;
						String cif, name;
						System.out.println("Dame el ID ");
						id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from concesionario where id=" + id);
						if (!rs.next()) {
							System.err.println("Error, el ID no es valido");
							break;
						}
						System.out.println("Dame el CIF ");
						cif = sc.nextLine();
						System.out.println("Dame el nombre  ");
						name = sc.nextLine();

					
							modificar(conexion, id, cif, name);
						
						
						
						
						break;
					}
					case 4: {
						System.out.println("Dame el ID para eliminar");
						int id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from concesionario where id=" + id);
						if (!rs.next()) {
							System.err.println("Error, el ID no es valido");
							break;
						}
							eliminar(conexion, id);
						
						
						break;
					}
					}
				} while (eleccion != 0);
				conexion.close();
			}


			

			private static void listar(Connection conn) {
				try {
				
					Class.forName("com.mysql.cj.jdbc.Driver");

					// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
					// tipo Connection, al cual
					// le tenemos que pasar los parámetros de conexión.
					Connection conexion = conn;

					// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
					// Statement
					Statement s = (Statement) conexion.createStatement();

					// La ejecución de la consulta se realiza a través del objeto Statement y se
					// recibe en forma de objeto
					// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
					// obtenidos por la consulta
					ResultSet rs = s.executeQuery("select * from concesionario");

					// Navegación del objeto ResultSet
					while (rs.next()) {
						System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
					}
					// Cierre de los elementos
					rs.close();

				} catch (ClassNotFoundException ex) {
					System.out.println("Imposible acceder al driver Mysql");
					ex.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("Error en la ejecución SQL: " + ex.getMessage());
					ex.printStackTrace();
				}
			}


			
			private static void aniadir(Connection conn, String cif, String n) throws SQLException {

				Statement s = (Statement) conn.createStatement();

				int filasAfectadas = s.executeUpdate("insert into tutorialjavaconcesionarios.concesionario " + "(id, cif, nombre) values ("
						+ getSiguienteIdValidoConcesionario(conn) + ", '" + cif + "','" + n + "')");

				System.out.println("Filas afectadas: " + filasAfectadas);

			}
			
			private static int getSiguienteIdValidoConcesionario(Connection conn) throws SQLException {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavaconcesionarios.concesionario");

				if (rs.next()) {
					return rs.getInt(1) + 1;
				}

				return 1;
			}

			private static void modificar(Connection conn, int id, String cif, String n) throws SQLException {

				Statement s = (Statement) conn.createStatement();

				int filasAfectadas = s.executeUpdate("update tutorialjavaconcesionarios.concesionario " + "set cif = '" + cif + "', "
						+ "nombre = '" + n + "'\r\n" + "where id = " + id);

				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}

			
			private static void eliminar(Connection conn, int id) throws SQLException {
				Statement s = (Statement) conn.createStatement(); 

				int filasAfectadas = s.executeUpdate("Delete from "
						+ "tutorialjavaconcesionarios.concesionario "
						+ "where id = " + id);
			   
				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}








		}






