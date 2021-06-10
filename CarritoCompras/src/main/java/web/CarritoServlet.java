package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        // creamos o recuperamos el objeto
        HttpSession sesion = request.getSession();
                
        //recuperamos la lista de articulos agregados prevoamente si esisten
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        // verificar si la lista de articulos existe
        if(articulos ==null){
            //inicializamos la lista lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
         //procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        //revisamos y agregamos el articulo
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }  
        try ( //imprimir la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            
            //Iteramos todos lo articulos
             for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //Agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/EjemploCompras'>regresar al inicio</a>");
        }   
    } 
}
