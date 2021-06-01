package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Simulacion de valores correctos
    String usuarioOk = "Brian";
    String passwordOk = "123456";   
    
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
    
    PrintWriter out = response.getWriter();
    
    if(usuarioOk.equals(usuario)&& passwordOk.equals(password)){
        out.print("<h1>");
        out.print("Datos Correctos");
        out.print("<br> Usuario: " + usuario);
        out.print("<br> Password: " + password);
        out.print("</h1>");
    }else{
        response.sendError(response.SC_UNAUTHORIZED, "Las credencialess son incorrectas");
    }
    out.close();
   } 
}
 