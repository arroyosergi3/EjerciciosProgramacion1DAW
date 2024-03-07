package capitulo08.centro.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo08.centro.entities.CentroEducativo;

public class ControladorCentro {
	private static String nombreTabla = "centro.centroeducativo";

	public static List<CentroEducativo> getTodos() {
		List<CentroEducativo> l = new ArrayList<CentroEducativo>();
		try {
			ResultSet rs = ConnectionManager.getConexion().createStatement()
					.executeQuery("select * from " + nombreTabla);
			while (rs.next()) {
				CentroEducativo o = getEntidadFromResulSet(rs);
				l.add(o);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	private static CentroEducativo getEntidadFromResulSet(ResultSet rs) throws SQLException {
		CentroEducativo o = null;

		o = new CentroEducativo();
		o.setId(rs.getInt("id"));
		o.setDesc(rs.getString("descripcion"));

		return o;
	}

}
