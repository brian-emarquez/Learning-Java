package controlador;

import java.awt.Rectangle;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //1. Procesamos parametros 
        
        //2, Creamos los javaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3. Agregamos al javabeans aa algun alcance
        request.setAttribute("mensaje", "Saludos desde el servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        
        
    
    }
}
