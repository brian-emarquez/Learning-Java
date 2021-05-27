package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer lo parametros de formulario HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        System.out.println("usuario = " + usuario);
        System.out.println("password = " + usuario);
        
        /* respodner al cliente*/
        PrintWriter out = response.getWriter();
        
        /* HTML */
        out.print("<html>");
        out.print("<body>");
        out.print("El paramento Usuario es:" + usuario );
        out.print("<br/>");
        out.print("El paramento Password es:" + password );
        out.print("</body>");
        out.print("</html>");
    }
}
