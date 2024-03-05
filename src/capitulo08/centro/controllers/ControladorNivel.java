package capitulo08.centro.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo08.centro.entities.Nivel;

public class ControladorNivel {
	private static String nombreTabla = "centro.nivel";

	
	
	
	
	public static List<Nivel> getTodos( int idCentro){
		List<Nivel> l = new ArrayList<Nivel>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla +  " where idCentro = " + idCentro);
			while(rs.next()) {
				Nivel o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	private static Nivel getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Nivel o = null;


			o = new Nivel();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));
			o.setIdCentro(rs.getInt("idCentro"));

		
		
		return o;
	}
	
	
	
	
}
