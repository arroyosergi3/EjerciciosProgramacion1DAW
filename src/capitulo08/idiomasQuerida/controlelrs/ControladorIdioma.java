package capitulo08.idiomasQuerida.controlelrs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo08.idiomasQuerida.entities.Idioma;

public class ControladorIdioma {

	private static String nombreTabla = "idioma";

	public static List<Idioma> getTodos( int idPais){
		List<Idioma> l = new ArrayList<Idioma>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla + " where idPais = " +  idPais);
			while(rs.next()) {
				Idioma o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}
	
	
	
	private static Idioma getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Idioma o = null;


			o = new Idioma();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));
			o.setIdPais(rs.getInt("idPais"));
			

		
		
		return o;
	}
	
}
