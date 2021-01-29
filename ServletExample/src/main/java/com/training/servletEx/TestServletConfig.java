package com.training.servletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServletConfig extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig serv = getServletConfig();
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello generic servlet</b>");
		// ServletConfig
		out.println("<br>" + "<h2>The page is rendered by:" + serv.getInitParameter("author") + "</h2>");

		 // ServletContext
		ServletContext application = getServletContext();
		out.print("<br>" + "<h2>Copyright@:" + application.getInitParameter("copyrights"));
		out.print("</body></html>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet Destroyed");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet Initialization");
	}
}
