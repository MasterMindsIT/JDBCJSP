package praxis.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
private static Connection con = null;
	
	private Conexion() {
		// logica de la conexión a la BD.
		try {
			
			Class.forName("org.postgresql.Driver"); // porque esto es postgresql
			// Class.forName("com.mysql.jdbc.Driver"); // si fuese mysql
			// Class.forName("oracle.jdbc.driver.OracleDriver"); // si fuese oracle
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/desafioevaluadounojsp", "postgres", "admin");
			
			
			boolean isValid = con.isValid(50000);
			
			System.out.println(isValid ? "TEST OK POSTGRESQL" : "TEST FAILED POSTGRESQL");
			
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Error al conectar con la BD: " + ex.getMessage());
		}
		
	}

	public static Connection getCon() {	
		if (con == null) {
			new Conexion();
		}
		
		return con;
	}	
}
