

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	/*@Resource(name = "jdbc/Marvel")
	private DataSource miPool;*/
	
	
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida = response.getWriter();
		
		response.setContentType("text/plain");
		
		
		try {
			Class.forName("org.postgresql.Driver"); 
			Connection conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Marvel", "postgres", "postgre");
			//String consultaSql = "SELECT *FROM PELICULAS";
			
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("SELECT * FROM PELICULAS");
			
			while (rs.next()) {
				String nombre_peli = rs.getString(2);
				salida.append(nombre_peli);
			}
			rs.close();
			miStatement.close();
			conexion.close();
			
		}catch (Exception e) {
			salida.append("Error");
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
