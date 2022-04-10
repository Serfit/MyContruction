

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;


import com.evaluacion2.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login" )
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		HttpSession sesion = request.getSession();
		String usuario = request.getParameter("usuario");
		String contrasena = request.getParameter("contrasena");
		LoginDao co = new LoginDao();
		if(co.autenticacion(usuario, contrasena)){
		    sesion.setAttribute("usuario", usuario);
		    sesion.setAttribute("contrasena", contrasena);
		    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Menu.jsp");
		    dispatcher.forward(request, response);
		}else{
		    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Error.jsp");
		    dispatcher.forward(request, response);
	}
	}
}
