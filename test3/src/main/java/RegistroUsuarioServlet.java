

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.evaluacion2.dao.LoginDao;

/**
 * Servlet implementation class RegistroUsuarioServlet
 */
@WebServlet("/registroUsuario" )
public class RegistroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        LoginDao co = new LoginDao();
          if(co.crearUsuario(usuario, contrasena)){
            response.sendRedirect("index.jsp");
            
        }else{
           response.sendRedirect("registroUsuario.jsp");
        }
	}

}
