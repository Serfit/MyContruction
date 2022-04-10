<%-- 
    Document   : registroUsuario
    Created on : sep 9, 2020, 10:08:44 p.m.
    Author     : sa_fi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #fafafa;
  margin: 1rem;
  padding: 1rem;
  border: 2px solid #ccc;
  /* IMPORTANTE */
  display: flex;
  justify-content: center;
  align-items: center;">
        <form action="/maven_project/registroUsuario" method="post">
            <table>
                <tr>
                    <td>Usuario:</td> 
                    <td><input type="text" id="usuario" name="usuario"/></td>
                    <td>Password:</td>
                    <td><input type="password" id="contrasena" name="contrasena"/></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Registrar Usuario" />
            <a href="index.jsp">Volver</a>
        </form>
    </body>
</html>
