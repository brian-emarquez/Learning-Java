package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UT8");
        
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
        
        
    }
}
