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
 * Servlet Filter implementation class TeacherRegistrationFilter
 */
@WebFilter(urlPatterns= {"/TeacherRegistrationServlet"})
public class TeacherRegistrationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TeacherRegistrationFilter() {
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
		String tfname=request.getParameter("tfirstname");
        String tlname=request.getParameter("tlastname");
        String tpass=request.getParameter("tpassword");
        String tconpass=request.getParameter("tconfirmpass");
        String temail=request.getParameter("temailid"); 
		
		if(tfname.length()<=1 && tlname.length()<=1 && tpass.length()<=1 && tconpass.length()<=1 && temail.length()<=1)
		{
			response.getWriter().println("Please enter correct details");
			
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
