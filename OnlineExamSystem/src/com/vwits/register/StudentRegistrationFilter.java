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
 * Servlet Filter implementation class StudentRegistrationFilter
 */
@WebFilter(urlPatterns= {"/StudentRegistrationServlet"})
public class StudentRegistrationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public StudentRegistrationFilter() {
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
		String fname=request.getParameter("firstn");
        String lname=request.getParameter("lastn");
        String password=request.getParameter("pass");
        String conpass=request.getParameter("confirmpass");
        String email=request.getParameter("emailid");
		
		if(fname.length()<=1 && lname.length()<=1 && password.length()<=1 && conpass.length()<=1 && email.length()<=1)
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
