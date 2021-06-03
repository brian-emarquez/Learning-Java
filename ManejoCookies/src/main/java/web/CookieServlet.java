package web;

import com.sun.net.httpserver.HttpServer;
import jakarta.jws.WebService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ManejoCookies")
public class CookieServlet extends HttpServlet{
    @Override
    protected void  doGet(HttpServletRequest request, HttpServletResponse response){
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
           
        
        
        
    }
}
