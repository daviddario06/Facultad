

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/Marvel")
	private DataSource miPool;
	
	
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida = response.getWriter();
		
		response.setContentType("text/plain");
		Connection conexion = null;
		Statement miStatement = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.postgresql.Driver"); 
			 //conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Marvel", "postgres", "postgre");
			
			
			
			
			conexion = miPool.getConnection();
			miStatement = conexion.createStatement();
			String consultaSql = "SELECT *FROM PELICULAS";
			rs = miStatement.executeQuery(consultaSql);
			
			
			while (rs.next()) {
				String nombre_peli = rs.getString(2);
				salida.println(nombre_peli);
				System.out.println(nombre_peli);
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
