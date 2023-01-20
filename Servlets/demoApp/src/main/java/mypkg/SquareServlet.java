package mypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
	      
	
	private static final long serialVersionUID = 2L;

	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
		   
           
		   int k = (int)(req.getAttribute("ans"));
		   k = k*k;
		   PrintWriter out = res.getWriter();
		   out.print("result is : " + k);
	 }
}