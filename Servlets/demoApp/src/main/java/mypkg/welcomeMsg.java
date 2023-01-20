package mypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class welcomeMsg extends GenericServlet{
	
		
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		
		   
		   PrintWriter out = res.getWriter();
		   out.print("Hello World !");
	}

}
