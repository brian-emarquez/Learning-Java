package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //suponemos que el usuauario vista por primera ves nuestro sitio
        boolean nuevoUsuario = true;
        
        // Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //buscamos sin ya existe una cookie creada con anterioridad
        //llamda visitanteRecurrente
        if(cookies !=null){
            for(Cookie c: cookies){
                  if(c.getName().equals("VitanteRecurrente") && c.getValue().equals("si")){
                  //si ya existe la cookie es usuario recurrente
                   nuevoUsuario = false;
                   break;
                  }
            }
        }
        
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("VitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera ves";
        }
        else{
            mensaje = "Gracias por visitar NUEVAMENTEe nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje" + mensaje);
        out.close();
    }
}

