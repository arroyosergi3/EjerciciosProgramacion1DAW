package capitulo08.centroEducativo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import capitulo08.centroEducativo.entidades.Estudiante;

public class ControladorEstudiantes {

	
	
	
	private static String nombreTabla = "estudiante";

	
	public static Estudiante getPrimero() {
		try {
			return getEntidad(ConnectionManager.getConexion(),
					"select * from " + nombreTabla + " order by id asc limit 1");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public static Estudiante getUltimo() {
		try {
			return getEntidad(ConnectionManager.getConexion(),
					"select * from " + nombreTabla + " order by id desc limit 1");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Estudiante getFabricanteSiguienteAnterior(int id) {

		if (id > getUltimo().getId()) {
			return getPrimero();
		} else if (id < getPrimero().getId()) {
			return getUltimo();
		}
		
		

		try {

			return getEntidad(ConnectionManager.getConexion(), "select * from " + nombreTabla +  " where id=" + id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

	public static Estudiante getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		Estudiante o = null;

		if (rs.next()) {
			o = new Estudiante();
			o.setId(rs.getInt("id"));
			o.setNombre(rs.getString("nombre"));
			o.setApellido_1(rs.getString("Apellido1"));
			o.setApellido_2(rs.getString("Apellido2"));
			o.setDni(rs.getString("dni"));
			o.setDireccion(rs.getString("direccion"));
			o.setMail(rs.getString("email"));
			o.setTelefono(rs.getString("telefono"));
			o.setIdSexo(rs.getInt("sexo_id"));
			o.setImagen(rs.getBytes("imagen"));
			o.setColorFavorito(rs.getString("colorFavorito"));
			
			

		}
		return o;
	}
	
	
	public static List<Estudiante> getTodos(){
		List<Estudiante> l = new ArrayList<Estudiante>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				Estudiante o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	
	
	private static Estudiante getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Estudiante o = null;


		o = new Estudiante();
		o.setId(rs.getInt("id"));
		o.setNombre(rs.getString("nombre"));
		o.setApellido_1(rs.getString("Apellido1"));
		o.setApellido_2(rs.getString("Apellido2"));
		o.setDni(rs.getString("dni"));
		o.setDireccion(rs.getString("direccion"));
		o.setMail(rs.getString("email"));
		o.setTelefono(rs.getString("telefono"));
		o.setId(rs.getInt("sexo_id"));
		o.setImagen(rs.getBytes("imagen"));
		
		
		
		return o;
	}
	
	
	
	public static int insercion (Estudiante o, Connection conn) {
		int nuevoId = SuperControlador.maxIdEnTabla("estudiante");
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "insert into estudiante (id, nombre, apellido1, apellido2, dni, direccion, email, telefono, sexo_id, imagen, colorFavorito) "
		+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, nuevoId);
			ps.setString(2, o.getNombre());
			ps.setString(3, o.getApellido_1());
			ps.setString(4, o.getApellido_2());
			ps.setString(5, o.getDni());
			ps.setString(6, o.getDireccion());
			ps.setString(7, o.getMail());
			ps.setString(8, o.getTelefono());
			ps.setInt(9, o.getIdSexo());
			ps.setBytes(10, o.getImagen());
			ps.setString(11, o.getColorFavorito());

			ps.execute();
			return nuevoId;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	public static void modificacion (Estudiante  o, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "update estudiante set nombre=?, apellido1=?, apellido2=?, dni=?, direccion=?, email=?, telefono=?, sexo_id=?, imagen=?, colorFavorito =? where id=?");
			ps.setString(1, o.getNombre());
			ps.setString(2, o.getApellido_1());
			ps.setString(3, o.getApellido_2());
			ps.setString(4, o.getDni());
			ps.setString(5, o.getDireccion());
			ps.setString(6, o.getMail());
			ps.setString(7, o.getTelefono());
			ps.setInt(8, o.getIdSexo());
			ps.setBytes(9, o.getImagen());
			ps.setString(10, o.getColorFavorito());
			ps.setInt(11, o.getId());
			
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void eliminacion (int id, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""
					+ "delete from estudiante where id = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
