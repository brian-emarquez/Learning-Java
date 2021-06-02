package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    protected void doGet(HttpServletRequest resquest, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        /*actualizcion de hroa cada segundo*/
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        /*formateador de hora */
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actializada' HH:mm:ss");
        String fechaConFomato = formateador.format(fecha);
        PrintWriter out = response.getWriter();
        out.print("Hora actual es " + fechaConFomato);
        out.close();
        
    }   
}
