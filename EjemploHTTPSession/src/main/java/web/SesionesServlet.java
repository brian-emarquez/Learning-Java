package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTf-8");
        
        HttpSession sesion  = request.getSession();
        String titulo = null;
        
        /*Pedir el atributo contador visitas a la sesion */
        Integer contadorVisitas = (Integer)sesion.getAttribute("ContadorVisitas");
        /* si es nulo es la  primera ves que estamos accedesmos a la aplicacion*/
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera ves";      
        }else{
            contadorVisitas++;
            titulo= "Bienvenido nuevamente";
        } 
        
        //Agregamos el nuevo valor a la sesion
        sesion. setAttribute("ContadorVisitas", contadorVisitas);
        
        // Mandamos la respuesl al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("Nro de accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: " + sesion.getId());
        
        out.close();   
    }
}
