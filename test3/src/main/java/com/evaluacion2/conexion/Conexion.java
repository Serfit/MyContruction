package com.evaluacion2.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	 
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String HOST ="localhost";
    private String PORT = "3306";
    private String DATABASE = "dbLogin"; 
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con = null;
    
    public Conexion(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion a base de datos exitisa!!!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error"+ e);
        }catch(SQLException e){
            System.err.println("Error"+ e);
        }
    }
    public Connection getConexion(){
        return con;
    }
   
  
}
