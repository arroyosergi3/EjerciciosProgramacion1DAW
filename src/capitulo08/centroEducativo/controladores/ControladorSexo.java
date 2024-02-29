package capitulo08.centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo08.centroEducativo.entidades.Sexo;

public class ControladorSexo {
private static String nombreTabla = "centroeducativo.sexo";
	
	public static List<Sexo> getTodos(){
		List<Sexo> l = new ArrayList<Sexo>();
		try {
			ResultSet rs =  ConnectionManager.getConexion().createStatement().executeQuery("select * from " + nombreTabla);
			while(rs.next()) {
				Sexo o = getEntidadFromResulSet(rs);
				l.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	
	
	private static Sexo getEntidadFromResulSet(ResultSet rs) throws SQLException {
		Sexo o = null;


			o = new Sexo();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));

		
		
		return o;
	}
}
