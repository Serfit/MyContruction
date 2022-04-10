<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión </title>
    </head>
    <body style="background-color: #fafafa;
  margin: 1rem;
  padding: 1rem;
  border: 2px solid #ccc;
  /* IMPORTANTE */
  display: flex;
  justify-content: center;
  align-items: center;">
        
        <form action="/maven_project/login" method="post"  style="text-align: center">
            <h1>Inicio de sesión My Contruction</h1>
            <table style="border: 1px solid; text-align: center; ">
                <tr><td>Usuario: <input type="text" id="usuario" name="usuario"></td></tr>
            <tr><td>Password: <input type="password" id="pass" name="contrasena"></td></tr>
            <tr><td><input type="submit" id="loginbtn" value="Iniciar session"></td></tr>
            </table>
            No tienes una cuenta.. <a href="registroUsuario.jsp">Registrate</a>
        </form>
        <br>
        
        
    </body>
</html>