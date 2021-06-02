package web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    protected void goGet(HttpServletRequest resquest, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actializada' HH:mm:ss");
        
        
        
    }   
}
