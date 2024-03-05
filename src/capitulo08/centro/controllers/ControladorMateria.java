package capitulo08.centro.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo08.centro.entities.Materia;

public class ControladorMateria {
	private static String nombreTabla = "centro.materia";

	
	
	
	
	public static List<Materia> getTodos( int idNivel){
		List<Materia> l = new ArrayList<Materia>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla +  " where idNivel = " + idNivel);
			while(rs.next()) {
				Materia o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	private static Materia getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Materia o = null;


			o = new Materia();
			o.setId(rs.getInt("id"));
			o.setNombre(rs.getString("nombre"));
			o.setIdNivel(rs.getInt("idNivel"));
			o.setCodigo(rs.getString("codigo"));
			o.setUrlClassroom(rs.getString("urlClassroom"));
			o.setAdmiteMatricula(rs.getBoolean("admiteMatricula"));
			o.setFechaInicio(rs.getString("fechaInicio"));

		
		
		return o;
	}
	
	
	
	
}
