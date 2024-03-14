package capitulo08.idiomasQuerida.controlelrs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import capitulo08.idiomasQuerida.entities.Pais;



public class ControladorPais {
	
	private static String nombreTabla = "pais";

	public static List<Pais> getTodos(){
		List<Pais> l = new ArrayList<Pais>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				Pais o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	private static Pais getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Pais o = null;


			o = new Pais();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));
			

		
		
		return o;
	}
	
	
	
	
	
	
	
}
