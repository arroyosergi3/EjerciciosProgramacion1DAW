package capitulo08.idiomasQuerida.controlelrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo08.idiomasQuerida.entities.Usuario;


public class ControladorUsuario {

	private static String nombreTabla = "usuario";
	
	public static void insercion (Usuario o, Connection conn) {
		int nuevoId = maxIdEnTabla("usuario");
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(""+ "insert into usuario (id, email, usuario, password, idIdioma) "
		+ "values (?, ?, ?, ?, ?)");
			ps.setInt(1, nuevoId);
			ps.setString(2, o.getEmail());
			ps.setString(3, o.getUsuario());
			ps.setString(4, o.getPassword());
			ps.setInt(5, o.getIdIdioma());
			

			ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	
	
	
}
