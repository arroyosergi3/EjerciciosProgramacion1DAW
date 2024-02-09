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

public class Venta {

	


		


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
							+ "\n2. Crear venta" + "\n3. Modificar  venta" + "\n4. Eliminar venta" + "\n5. Volver Atrás");
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
						int idCl = 0, idCo = 0, idCoc = 0;
						String fecha = "";
						float precio;
						
						Cliente.listar(conexion);
						System.out.println("Dame el ID del Cliente: ");
						idCl = Integer.parseInt(sc.nextLine());
						
						Concesionario.listar(conexion);
						System.out.println("Dame el ID del Concesionario: ");
						idCo = Integer.parseInt(sc.nextLine());
						
						Coche.listar(conexion);
						System.out.println("Dame el ID del Coche: ");
						idCoc = Integer.parseInt(sc.nextLine());
						
						
						System.out.println("Dame la fecha: ");
						fecha = sc.nextLine();
						
						System.out.println("Dame el precio");
						precio = Float.parseFloat(sc.nextLine());
						
						
						SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
			               
			               
		                Date date = new Date();
		                try {
		                        date = sdfEntrada.parse(fecha);
		                } catch (ParseException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }
		               
		                
		                
						aniadir(conexion, idCl, idCo, idCoc, date, precio);

						break;
					}
					case 3: {
						int idCl = 0, idCo = 0, idCoc = 0;
						String fecha = "";
						float precio;
						
						System.out.println("Dame el ID de la venta a modificar");
						int id = Integer.parseInt(sc.nextLine());
						
						Cliente.listar(conexion);
						System.out.println("Dame el ID del Cliente: ");
						idCl = Integer.parseInt(sc.nextLine());
						
						Concesionario.listar(conexion);
						System.out.println("Dame el ID del Concesionario: ");
						idCo = Integer.parseInt(sc.nextLine());
						
						Coche.listar(conexion);
						System.out.println("Dame el ID del Coche: ");
						idCoc = Integer.parseInt(sc.nextLine());
						
						
						System.out.println("Dame la fecha: ");
						fecha = sc.nextLine();
						
						System.out.println("Dame el precio");
						precio = Float.parseFloat(sc.nextLine());
						
						
						SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
			               
			               
		                Date date = new Date();
		                try {
		                        date = sdfEntrada.parse(fecha);
		                } catch (ParseException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }
		               
					modificar(conexion, id, idCl, idCo, idCoc, date, precio);
					
						
						
						
						
						break;
					}
					case 4: {
						System.out.println("Dame el ID para eliminar");
						int id = Integer.parseInt(sc.nextLine());
						ResultSet rs =  conexion.createStatement().executeQuery("select * from venta where id=" + id);
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
					ResultSet rs = s.executeQuery("select * from venta");

					// Navegación del objeto ResultSet
					while (rs.next()) {
						System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4)+ " " + rs.getString(5)+ " " + rs.getString(6));
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


			
			private static void aniadir(Connection conn, int idCl, int idCo, int idCoc, Date date, float p) throws SQLException {

				Statement s = (Statement) conn.createStatement();

                SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                

				
				
				int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.venta " + "(id, idCliente, idConcesionario, idCoche, fecha, precioVenta) values ("
						+ getSiguienteIdValidoventa(conn) + "," + idCl + "," + idCo + "," + idCoc + ",'" + sdfSalida.format(date)+ "'," + p+ ")");

				System.out.println("Filas afectadas: " + filasAfectadas);

			}
			
			private static int getSiguienteIdValidoventa(Connection conn) throws SQLException {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.venta");

				if (rs.next()) {
					return rs.getInt(1) + 1;
				}

				return 1;
			}

			private static void modificar(Connection conn,int id,  int idCl, int idCo, int idCoc, Date date, float p) throws SQLException {

				Statement s = (Statement) conn.createStatement();

				  SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				
				int filasAfectadas = s.executeUpdate("update tutorialjavacoches.venta " + 
				"set idCliente = " + idCl + ", "
				+ "idConcesionario = " + idCo + ", "
				+ "idCoche = " + idCoc + ", "
				+ "fecha = '" + sdfSalida.format(date) + "', "
				+ "precioVenta = " + p 
				+ "where id = " + id);

				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}

			
			private static void eliminar(Connection conn, int id) throws SQLException {
				Statement s = (Statement) conn.createStatement(); 

				int filasAfectadas = s.executeUpdate("Delete from "
						+ "tutorialjavacoches.venta "
						+ "where id = " + id);
			   
				System.out.println("Filas afectadas: " + filasAfectadas);
				
				
				s.close();
			}








		}






