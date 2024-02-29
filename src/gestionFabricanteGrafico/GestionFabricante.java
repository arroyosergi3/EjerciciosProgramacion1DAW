package gestionFabricanteGrafico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import capitulo08.bloque01.crud.Fabricante;

public class GestionFabricante extends SupertipoGestion {

	/**
	 * 
	 */
	public static void eliminarFabricante() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del fabricante para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from fabricante where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static Fabricante getPrimero(Connection conn) throws SQLException {
		return getFabricante(conn, "select * from tutorialjavacoches.fabricante order by id asc limit 1");

	}
	

	public static Fabricante getUltimo(Connection conn) throws SQLException {
		return getFabricante(conn, "select * from tutorialjavacoches.fabricante order by id desc limit 1");
		
	}
	
	public static Fabricante getFabricanteSiguienteAnterior(Connection conn, int id) throws SQLException {
		
		if(id > getUltimo(conn).getId()) {
			return getPrimero(conn);
		} else if (id < getPrimero(conn).getId()) {
			return getUltimo(conn);
		}
		
		return getFabricante(conn, "select * from tutorialjavacoches.fabricante where id="+id);
		
		
	}
	
	
	
	
	
	
	
	public static Fabricante getFabricante(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		Fabricante f = null;
		
		if(rs.next()) {
			f = new Fabricante();
			f.setId(rs.getInt("id"));
			f.setCif(rs.getString("cif"));
			f.setNombre(rs.getString("nombre"));
		}
		return f;
	}
	
	
	
	
	/**
	 * 
	 */
	public static void modificarFabricante () {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String cif = "", nombre = "";
		String nuevoCif = "", nuevoNombre = "";
		
		System.out.println("Introduce id del fabricante: ");
		id = Integer.parseInt(sc.nextLine());
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from fabricante where id=" + id);
			if (rs.next()) {
				cif = rs.getString("cif");
				nombre = rs.getString("nombre");
			}

			System.out.println("Cif (" + cif + ") (Intro para mantener): ");
			nuevoCif = sc.nextLine();
			if (!nuevoCif.trim().equals("")) {
				cif = nuevoCif;
			}
	
			System.out.println("Nombre (" + nombre + ") (Intro para mantener): ");
			nuevoNombre = sc.nextLine();
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			int registrosAfectados = s.executeUpdate(
					"update fabricante set cif='" + cif + "', nombre='" + nombre + "' " +
					"where id=" + id);
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	/**
	 * 
	 */
	public static void nuevoFabricante () {
		Scanner sc = new Scanner(System.in);
		String cif, nombre;
		int nuevoIdDisponible;
		
		System.out.println("Creación de un nuevo fabricante:");
		System.out.println("Dame el cif:");
		cif = sc.next();
		System.out.println("Dame el nombre:");
		nombre = sc.next();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("fabricante");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into fabricante values (" + nuevoIdDisponible + ",'" + cif + "', '" + nombre + "')");
				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	public static void listarFabricantes() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
		String fechaDadaPorUsuario = "19/03/1977";
		
		Date date = new Date();
		try {
			date = sdfEntrada.parse(fechaDadaPorUsuario);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("fecha en la tabla: " + sdfSalida.format(date));
		
	}
	
	
	
	public static int insercion (Fabricante f, Connection conn) {
		int nuevoId = SupertipoGestion.maxIdEnTabla("fabricante");
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "insert into fabricante (id, cif, nombre) "
		+ "values (?, ?, ?)");
			ps.setInt(1, nuevoId);
			ps.setString(2, f.getCif());
			ps.setString(3, f.getNombre());
			ps.execute();
			return nuevoId;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	public static void modificacion (Fabricante f, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "update fabricante set cif=?, nombre=? where id=?");
			ps.setString(1, f.getCif());
			ps.setString(2, f.getNombre());
			ps.setInt(3, f.getId());
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void eliminacion (int id, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""
					+ "delete from fabricante where id = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
