package capitulo08.portatiles.controllers;

import java.awt.Panel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo08.portatiles.entities.Portatil;
import capitulo08.portatiles.views.PanelPortatil;

public class ControladorPortatil {
private static String nombreTabla = "portatil";

	
	public static Portatil getPrimero() {
		try {
			return getEntidad(ConnectionManager.getConexion(),
					"select * from " + nombreTabla + " order by id asc limit 1");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public static Portatil getUltimo() {
		try {
			return getEntidad(ConnectionManager.getConexion(),
					"select * from " + nombreTabla + " order by id desc limit 1");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Portatil getFabricanteSiguienteAnterior(int id) {

		if (id > getUltimo().getId()) {
			return getPrimero();
		} else if (id < getPrimero().getId()) {
			return getUltimo();
		}
		
		

		try {

			return getEntidad(ConnectionManager.getConexion(), "select * from portatil where id=" + id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

	public static Portatil getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		Portatil o = null;

		if (rs.next()) {
			o = new Portatil();
			o.setId(rs.getInt("id"));
			o.setModelo(rs.getString("modelo"));
			o.setSn(rs.getString("sn"));
			o.setnProc(rs.getInt("numProcesadores"));
			o.setFechaVenta(rs.getString("fechaVenta"));
			o.setVendido(rs.getBoolean("vendido"));
			o.setIdMarca(rs.getInt("idMarca"));
			

		}
		return o;
	}
	
	
	public static List<Portatil> getTodos(){
		List<Portatil> l = new ArrayList<Portatil>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				Portatil o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	public static int getNuemroPortatiles(){
		int n = 0;
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				n++;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return n;
	}
	
	
	
	
	
	private static Portatil getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Portatil o = null;


			o = new Portatil();
			o = new Portatil();
			o.setId(rs.getInt("id"));
			o.setModelo(rs.getString("modelo"));
			o.setSn(rs.getString("sn"));
			o.setnProc(rs.getInt("numProcesadores"));
			o.setFechaVenta(rs.getString("fechaVenta"));
			o.setVendido(rs.getBoolean("vendido"));
			o.setIdMarca(rs.getInt("idMarca"));
		
		
		return o;
	}
	

	
	
	public static int insercion (Portatil o, Connection conn) {
		int nuevoId = maxIdEnTabla("portatil");
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "insert into portatil (id, modelo, sn, numProcesadores, vendido, fechaVenta, idMarca) "
		+ "values (?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, nuevoId);
			ps.setString(2, o.getModelo());
			ps.setString(3, o.getSn());
			//ESTOY AQUI
			ps.setInt(4, PanelPortatil.getInstance().numeroProcesadores());
			ps.setBoolean(5, o.isVendido());
			ps.setString(6, o.getFechaVenta());
			ps.setInt(7, o.getIdMarca());

			ps.execute();
			return nuevoId;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int maxIdEnTabla(String nombreTabla) {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select max(id) from " + nombreTabla);
			
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1; 		
	}
	
	
	
	public static void modificacion (Portatil  o, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "update portatil set modelo=?, sn=?, numProcesadores=?, vendido=?, fechaVenta=?, idMarca=? where id=?");
			
			ps.setString(1, o.getModelo());
			ps.setString(2, o.getSn());
			ps.setInt(3, o.getnProc());
			ps.setBoolean(4, o.isVendido());
			ps.setString(5, o.getFechaVenta());
			ps.setInt(6, o.getIdMarca());
			ps.setInt(7, o.getId());
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void eliminacion (int id, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""
					+ "delete from portatil where id = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
