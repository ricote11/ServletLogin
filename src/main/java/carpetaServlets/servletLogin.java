package carpetaServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import daos.UsuarioDao;
import principal.Principal;
import utils.HibernateUtil;

/**
 * Servlet implementation class servletLogin
 */
@WebServlet("/servletLogin")
public class servletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(servletLogin.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 
		
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("clave");
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
	    UsuarioDao user = new UsuarioDao();
	    boolean condicion = user.consultaUsuarios(session, nombre, clave);
	    if(condicion == true)
	    {
	    	 response.sendRedirect("envio.html");
	    	 logger.info("Informacion correcta!");
	    	
	    }
	    else  {
	    	logger.info("El usuario o contraseña es incorrecto ");
	    	
	    	 response.sendRedirect("login.html");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    
	}

}
