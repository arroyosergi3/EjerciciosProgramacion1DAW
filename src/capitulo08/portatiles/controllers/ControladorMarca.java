package capitulo08.portatiles.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import capitulo08.portatiles.entities.Marca;



public class ControladorMarca {
private static String nombreTabla = "marca";


	
	
	public static List<Marca> getTodos(){
		List<Marca> l = new ArrayList<Marca>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				Marca o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	
	
	
	
	private static Marca getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Marca o = null;


			o = new Marca();
			o.setId(rs.getInt("id"));
			o.setDenominacion(rs.getString("denominacion"));
			o.setIdPais(rs.getInt("idPais"));

		
		
		return o;
	}
	
	
	public static  Marca seleccionarItemJComboBox(int n) {
		Marca o = null;
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla + " where id = " + n);
			while(rs.next()) {
				o = getEntidadFromResulSet(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return o;
	}
	
	public static int getidMarca(Marca o) {
		return o.getId();
	}
	
	
	
	
	
	
	
	}

	
	


