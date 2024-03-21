package capitulo08.centroEducativo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import capitulo08.centroEducativo.entidades.Curso;
import capitulo08.centroEducativo.entidades.ValoracionMateria;

public class ControladorValoracionMateria extends SuperControlador {

	private static String nombreTabla = "valoracionmateria";

	

	
	
	public static ValoracionMateria findByIdMateriaAndIdProfesorAndIdEstudiante (int idMateria, int idProfesor, int idEstudiante){
		ValoracionMateria v = null;
		try {
			PreparedStatement ps =  ConnectionManager.getConexion().prepareStatement("select * from " + nombreTabla + " where idProfesor = ? and idMateria=? and idEstudiante=? limit 1");
			ps.setInt(1, idProfesor);
			ps.setInt(2, idMateria);
			ps.setInt(3, idEstudiante);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				v = getEntidadFromResulSet(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return v;
	}
	
	
	
	
	
	private static ValoracionMateria getEntidadFromResulSet(ResultSet rs) throws SQLException {
		
		ValoracionMateria o = new ValoracionMateria();

		o.setId(rs.getInt("id"));
		o.setIdEstudiante(rs.getInt("idEstudiante"));
		o.setIdMateria(rs.getInt("idMateria"));
		o.setIdProfesor(rs.getInt("idProfesor"));
		o.setValoracion(rs.getFloat("valoracion"));
		
		return o;
	}
	

	
	
	public static int insercion (Curso o, Connection conn) {
		int nuevoId = SuperControlador.maxIdEnTabla("curso");
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "insert into curso (id, descripcion) "
		+ "values (?, ?)");
			ps.setInt(1, nuevoId);
			ps.setString(2, o.getDescripcion());

			ps.execute();
			return nuevoId;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	public static void modificacion (Curso  o, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "update curso set descripcion=? where id=?");
			ps.setString(1, o.getDescripcion());
			ps.setInt(2, o.getId());
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void eliminacion (int id, Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement(""
					+ "delete from curso where id = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
