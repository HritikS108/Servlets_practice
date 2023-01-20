import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
     
	public void doPost(HttpServletRequest req, HttpServletResponse res)  
	        throws ServletException, IOException {  
	  
		// Q. doubt --> we passed the response object but here it is not showing its content ?
//	    res.setContentType("text/html");  
	    PrintWriter out = res.getWriter();  
	          
	    String name = req.getParameter("userName");  
	    out.print("Welcome "+ name);  
	    }  
}
