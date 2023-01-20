package mypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlets extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		   
		   int a  = Integer.parseInt(req.getParameter("num1"));
		   int b = Integer.parseInt(req.getParameter("num2"));
		   int ans = a+b;
		   
		   req.setAttribute("ans", ans);
		   
		   RequestDispatcher rd = req.getRequestDispatcher("square");
		   rd.forward(req, res);
//		   PrintWriter out = res.getWriter();
//		   out.print("result is : " + ans);
	}

}
