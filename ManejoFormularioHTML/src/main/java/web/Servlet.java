package web;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html:charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Recuperadno el parametro
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = response.getParameterValues("tecnologias");
        
        
    }
}
