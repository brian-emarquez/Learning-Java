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
        
        // Recuperacion de parametros
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String Comentario = request.getParameter("comentario");

        out.print("<html>");
        out.print("<head>");
        out.print("<title> Resultado del Servlet<title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Parametros pricesador pro el servlet</h1>");
        out.print("<table border='1'>");       
        out.print("<tr>");
        out.print("<td>");
        out.print("usuario");
        out.print("</td>");
        out.print("</tr>");
        out.print("<table>");
        

        
        
        
        
    }
}
