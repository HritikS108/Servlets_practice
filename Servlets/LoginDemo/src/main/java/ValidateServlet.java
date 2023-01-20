import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {
            
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		   String uname = req.getParameter("userName");
		   String pswrd = req.getParameter("userPass");
		   
		   res.setContentType("text/html");
		   PrintWriter out = res.getWriter();
		   
		   if(uname.equals("hritik") && pswrd.equals("hritik123")) {
			   out.println("forwarded to servlet");  
			   RequestDispatcher rd = req.getRequestDispatcher("welcome");
			   rd.forward(req,res);
			   out.println("back to servlet"); //this won't be displayed
		   }
		   else {
			  
			   out.println("Invalid username or password");
			   RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			   rd.include(req, res);
			   out.println("back to servlet"); 

		   }
	}
}
