package servlet_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class TestSerlvet implements Servlet{
	ServletConfig config = null;
	
	
	
	@Override
	public void init(ServletConfig sc) throws ServletException {
		// TODO Auto-generated method stub
		config = sc;
        System.out.println("in init");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		 return config; // getServletConfig
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h2>hello from life cycle servlet</h2>");
        System.out.println("in service");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "LifeCycleServlet";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("in destroy");
	}
}
