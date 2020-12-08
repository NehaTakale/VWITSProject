package com.vwits.register;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class TeacherValidationFilter
 */
@WebFilter(urlPatterns= {"/TeacherLoginServlet"})
public class TeacherValidationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TeacherValidationFilter() {
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
		String firstname = request.getParameter("name1") ;
		String password = request.getParameter("password1") ;	
		//String email = request.getParameter("email") ;
		
		if(firstname.length()<=1 && password.length()<=1)
		{
			response.getWriter().println("Please enter correct username and password");
			
		}else 
		{
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
