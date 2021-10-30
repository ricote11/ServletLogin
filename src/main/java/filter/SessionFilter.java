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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import carpetaServlets.servletLogin;
import net.bytebuddy.build.ToStringPlugin.Exclude;

/**
 * Servlet Filter implementation class SessionFilter
 */
//@WebFilter("/*") 
public class SessionFilter implements Filter {
	private static Logger logger = LogManager.getLogger(SessionFilter.class);
    
    /**
     * Default constructor. 
     */
    public SessionFilter() {
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
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession(false);
		String path = req.getRequestURI(); 
		System.out.println(path);
		if (session != null || path.endsWith("login.html")|| path.endsWith("EjercicicioServletLogin/servletLogin") || path.endsWith(".css"  )|| path.endsWith(".png")) {
			
			logger.info("El usuario está loggueado");
			// pasa la request al siguiente filtro si existe, si no al servlet
			chain.doFilter(request, response);
		
		} else {
			// redirige al login
			logger.info("El usuario se desconectado");
			res.sendRedirect("login.html");
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
