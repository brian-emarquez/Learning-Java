package controlador;

import java.awt.Rectangle;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //1. Procesamos parametros 
        String accion = request.getParameter("accion");
        
        //2, Creamos los javaBeans
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSesion = new Rectangulo(3,4);
        Rectangulo recAplicacion = new Rectangulo(5,6);

        //3. Agregamos al javabeans aa algun alcance
        
        
        //Revisamos la accion proporcinada
        if("agregarVariables".equals(accion)){
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            // Alcance session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", request);
            
            //Alcanse apllication
            ServletContext application = this.getServletContext();
            application.setAttribute("mensaje", "Las variables fueron agregadas");
        }else if("listarVariables".equals(accion)){           
            //4. Redirecciones al jsp 
            request.getRequestDispatcher("WEB-INF/alcanseVariables.jsp").forward(request, response);  
        }
        else{
            //4. Redirecciones a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            // Esta liena no agregaria informacion al JSP
            //response.sendRedirect("index.jsp");
        }             
    }
}
