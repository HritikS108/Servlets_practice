import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{  
    
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
     
    Cookie ck[]=request.getCookies();  
    out.print(" Hello "+ck[0].getValue() + " Welcome to our Website");  
  
    out.close();  
  }
}