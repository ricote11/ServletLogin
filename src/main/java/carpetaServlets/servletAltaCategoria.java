package carpetaServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import daos.CategoriasDao;
import daos.RolDao;
import utils.HibernateUtil;

/**
 * Servlet implementation class servletAltaCategoria
 */
@WebServlet("/servletAltaCategoria")
public class servletAltaCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAltaCategoria() {
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
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		CategoriasDao categoria = new CategoriasDao();
		//HttpSession session = request.getSession(true);
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		categoria.insertarCategoria(session, nombre, descripcion);
		trans.commit();
		//logger.info("el usuario ha insertado un nuevo rol");
		response.sendRedirect("Menu.jsp");
	}

}
