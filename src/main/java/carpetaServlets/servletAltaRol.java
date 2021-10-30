package carpetaServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;


import daos.RolDao;
import utils.HibernateUtil;

/**
 * Servlet implementation class servletAltaRol
 */
@WebServlet("/servletAltaRol")
public class servletAltaRol extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(servletAltaRol.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAltaRol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rol = request.getParameter("rol");
		RolDao roles = new RolDao();
		//HttpSession session = request.getSession(true);
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		roles.insertarRoles(session, rol);
		trans.commit();
		logger.info("el usuario ha insertado un nuevo rol");
		response.sendRedirect("Menu.jsp");
	}

}
