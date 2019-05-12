import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conexion = null;
		Statement miStatement = null;
		ResultSet rs = null;
		try {
			
			conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Marvel", "postgres", "postgres");
		
			miStatement = conexion.createStatement();
			
			rs = miStatement.executeQuery("SELECT * FROM PELICULAS");
			
			while (rs.next()) {
				
				System.out.println(rs.getString("NOMBRE"));
			}
			miStatement.close();
			conexion.close();
			rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
	
		}
	}

}
