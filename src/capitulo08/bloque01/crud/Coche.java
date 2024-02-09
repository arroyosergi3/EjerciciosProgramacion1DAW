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
							.getConnection("jdbc:mysql://localhost:3310/tutorialjavacoches?serverTimezone=UTC", "root", "1234");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scanner sc = new Scanner(System.in);
				// TODO Auto-generated method stub
				int eleccion = 0;
				do {
					System.out.println("Menú\n" + "0. Salir" + "\n1. Listar "
							+ "\n2. Crear coche" + "\n3. Modificar  coche" + "\n4. Eliminar coche" + "\n5. Volver Atrás");
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
						String bastidor = "";
						String modelo = "";
						String color = "";
						int idFabricante = 0;
						Fabricante.listar(conexion);
						System.out.println("Dame el ID del fabricante:");
						idFabricante = Integer.parseInt(sc.nextLine());
						System.out.println("Dame el bastidor : ");
						bastidor = sc.nextLine();
						System.out.println("Dame el modelo: ");
						modelo = sc.nextLine();
						System.out.println("Dame el color: ");
						color = sc.nextLine();
						aniadir(conexion, idFabricante, bastidor, modelo, color);

						break;
					}
					case 3: {
						int id, idf;
						String bas, mod, col;
						System.out.println("Dame el ID ");
						
						id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from coche where id=" + id);
						if (!rs.next()) {
							System.err.println("Error, el ID no es valido");
							break;
						}
						Fabricante.listar(conexion);
						System.out.println("Dame el ID del Fabricante ");
						idf = Integer.parseInt(sc.nextLine());
						System.out.println("Dame el bastidor ");
						bas = sc.nextLine();
						System.out.println("Dame el modelo  ");
						mod = sc.nextLine();
						System.out.println("Dame el color  ");
						col = sc.nextLine();

					
							modificar(conexion, id, idf, bas, mod, col);
							
	
						
						
						
						
						break;
					}
					case 4: {
						System.out.println("Dame el ID para eliminar");
						int id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from coche where id=" + id);
						if (!rs.next()) {
							System.err.println("Error, el ID no es valido");
							break;
						}
							eliminar(conexion, id);
						
						
						break;
					}
					case 5:{
						Programa.main(args);
						break;
					}
					}
				} while (eleccion != 0);
				conexion.close();
			}


			

			public static void listar(Connection conn) {
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
					ResultSet rs = s.executeQuery("select * from coche");

					// Navegación del objeto ResultSet
					while (rs.next()) {
						System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4) + " " + rs.getString(5));
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


			
			private static void aniadir(Connection conn,int idF, String b, String m, String c) throws SQLException {

				Statement s = (Statement) conn.createStatement();

				int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.coche " + "(id, idfabricante, bastidor, modelo, color) values ("
						+ getSiguienteIdValidocoche(conn) + ", " + idF + ", '" + b+ "','" + m + "','" + c  + "')");

				System.out.println("Filas afectadas: " + filasAfectadas);

			}
			
			private static int getSiguienteIdValidocoche(Connection conn) throws SQLException {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.coche");

				if (rs.next()) {
					return rs.getInt(1) + 1;
				}

				return 1;
			}

			private static void modificar(Connection conn, int id, int idf, String b, String m, String c) throws SQLException {

				Statement s = (Statement) conn.createStatement();

				int filasAfectadas = s.executeUpdate("update tutorialjavacoches.coche " 
						+ "set idfabricante = '" + idf + "', "
						+ "bastidor = '" + b+ "', "
						+ "modelo = '" + m + "', "
						+ "color = '" + c + "' "
						+  " where id = " + id);

				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}

			
			private static void eliminar(Connection conn, int id) throws SQLException {
				Statement s = (Statement) conn.createStatement(); 

				int filasAfectadas = s.executeUpdate("Delete from "
						+ "tutorialjavacoches.coche "
						+ "where id = " + id);
			   
				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}








		}






