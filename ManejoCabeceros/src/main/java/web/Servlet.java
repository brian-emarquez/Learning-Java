package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Header HTTP </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Headdes HTTP </h1>");
        out.print("<br>");
        out.print("Metodo Http: " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.print("<br>");
        out.print("Uri solicitada" + uri);
        
        out.print("</body>");
        out.print("</html>");
        
        out.close();
                
    }
}
