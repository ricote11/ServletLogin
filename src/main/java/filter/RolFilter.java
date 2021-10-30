package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class RolFilter
 */
@WebFilter("/RolFilter")
public class RolFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RolFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession(true);
		Integer idRol = (Integer) session.getAttribute("idRol");
		System.out.println("desde el filtro del rol "+idRol);
		//int rol = Integer.valueOf(session.getAttribute("idRol").toString());
		String path = req.getRequestURI(); 
		if(idRol != 1 &&  (path.endsWith("AltaRol.jsp") ||  path.endsWith("AltaUsuario.jsp")))
		{
			res.sendRedirect("Menu.jsp");
			
			
		}
		else {
		// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
