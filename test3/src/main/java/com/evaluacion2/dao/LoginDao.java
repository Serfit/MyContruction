package com.evaluacion2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.evaluacion2.conexion.Conexion;

public class LoginDao extends Conexion{
//Metodo autenticar usuario para inicio de sesion
    public boolean autenticacion(String usuario, String contrasena){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from login where usuario=? and contrasena=?";
            pst = getConexion().prepareStatement(consulta); 
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
                
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
            
        }
        return false;
    }
    //Metodo registro de usuario
    public boolean crearUsuario(String usuario, String contrasena){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into login (usuario, contrasena) values(?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            
            if(pst.executeUpdate()== 1){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.out.println("Error"+ e);
            }
        }
        return false;
    }
}
