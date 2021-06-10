package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        //procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        // creamos o recuperamos el objeto
        HttpSession sesion = request.getSession();
                
        //recuperamos la lista de articulos agregados prevoamente si esisten
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
                
    }
  
}
