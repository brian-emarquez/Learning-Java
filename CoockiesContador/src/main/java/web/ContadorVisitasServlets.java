package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlets")
public class ContadorVisitasServlets extends HttpServlet{
    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
         //Decalramos un variable contador
         
        int contador = 0;
        
        // Revisamos si existe la coockie contadorVistas
        Cookie[] cookies = request.getCookies();
        if(cookies !=null){
            for (Cookie c: cookies) {
                if(c.getName().equals("ContadorVisitas")){
                    contador = Integer.parseInt(c.getValue()); //cnversion a entero  
                }
            }  
        }
        //Incrementamos el contador en uno
        contador++;
        //Agregamos la respuesta al navegador
        Cookie c = new Cookie("ContadorVisitas", Integer.toString(contador));    
        //la cookie se almacenara en el cliente por una hora (3600 segundos)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        
        /* Mandamos mensaje al navegador*/
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
        
        
    }
}