package capitulo08.bloque01.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente {

	




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
					System.out.println("Menú\n" + "\n0. Salir" + "\n1. Listar "
							+ "\n2. Crear cliente" + "\n3. Modificar  cliente" + "\n4. Eliminar cliente");
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
						String dniNie = "";
						String nombre = "";
						String apellido="";
						String localidad="";
						String f_nac="";
						boolean activo = true;

						System.out.println("Dame el DNI o NIE: ");
						dniNie = sc.nextLine();
						System.out.println("Dame el nombre: ");
						nombre = sc.nextLine();
						System.out.println("Dame el apellido: ");
						apellido = sc.nextLine();
						System.out.println("Dame la localidad: ");
						localidad = sc.nextLine();
						System.out.println("Dame la fecha de nacimiento: ");
						f_nac = sc.nextLine();
						
						SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
		               
		               
		                Date date = new Date();
		                try {
		                        date = sdfEntrada.parse(f_nac);
		                } catch (ParseException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }
		               
		                SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						
						
						
						aniadir(conexion, dniNie, nombre, apellido, localidad, date, activo);
						
						

						break;
					}
					case 3: {
						int id;
						String dniNie = "";
						String nombre = "";
						String apellido="";
						String localidad="";
						String f_nac="";
						boolean activo = true;
						
						System.out.println("Dame el ID ");
						id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from cliente where id=" + id);
						if (!rs.next()) {
							System.err.println("Error, el ID no es valido");
							break;
						}
						

						System.out.println("Dame el DNI o NIE: ");
						dniNie = sc.nextLine();
						System.out.println("Dame el nombre: ");
						nombre = sc.nextLine();
						System.out.println("Dame el apellido: ");
						apellido = sc.nextLine();
						System.out.println("Dame la localidad: ");
						localidad = sc.nextLine();
						System.out.println("Dame la fecha de nacimiento: ");
						f_nac = sc.nextLine();
						
						SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
		               
		               
		                Date date = new Date();
		                try {
		                        date = sdfEntrada.parse(f_nac);
		                } catch (ParseException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }
		               
						
						
						
					
					
						modificar(conexion, id, apellido, nombre, f_nac, localidad, date, activo);

						
						break;
					}
					case 4: {
						System.out.println("Dame el ID para eliminar");
						int id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from cliente where id=" + id);
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
					ResultSet rs = s.executeQuery("select * from cliente");

					// Navegación del objeto ResultSet
					while (rs.next()) {
						System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " 
					            + rs.getString(3) + " " + rs.getString(4) + " " 
					                        + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
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
 

			
			private static void aniadir(Connection conn,String d, String n, String a, String l,  Date f, boolean ac) throws SQLException {

				Statement s = (Statement) conn.createStatement();
                SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.cliente " + "(id, nombre, apellidos, localidad, dniNie, fechaNac, activo) values ("
						+ getSiguienteIdValidoConcesionario(conn) + ", '" + n + "','" + a + "','" + l + "','" + d + "','" + sdfSalida.format(f) + "','" + ((ac)? 1: 0) + "')");

				System.out.println("Filas afectadas: " + filasAfectadas);

			}
			
			private static int getSiguienteIdValidoConcesionario(Connection conn) throws SQLException {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.cliente");

				if (rs.next()) {
					return rs.getInt(1) + 1;
				}

				return 1;
			}

			private static void modificar(Connection conn, int id, String d, String n,String a, String l,  Date f, boolean ac) throws SQLException {

				Statement s = (Statement) conn.createStatement();
                SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				int filasAfectadas = s.executeUpdate("update tutorialjavacoches.cliente " + 
				"set nombre = '" + n + "', "+
				"apellido = '" + a + "'," +
				"localidad = '" + l + "'," +
				"dniNie = '" + d + "'," +
				"fechaNac = '" + sdfSalida.format(f) + "'," +
				"activo = '" + ac + "'," +
				"where id = " + id);

				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}

			
			private static void eliminar(Connection conn, int id) throws SQLException {
				Statement s = (Statement) conn.createStatement(); 

				int filasAfectadas = s.executeUpdate("Delete from "
						+ "tutorialjavacoches.cliente "
						+ "where id = " + id);
			   
				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}








		}






