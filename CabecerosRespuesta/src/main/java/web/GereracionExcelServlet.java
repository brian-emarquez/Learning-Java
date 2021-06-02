package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GeneracionExcelServlet")
public class GereracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest resquest, HttpServletResponse response) throws IOException{
        
        /* Indicamos el tipo de respuesta al navegador*/
        response.setContentType("applicacion/vnd.ms-excel"); // Informacion tipo excel
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        /* par aun uso mas profesionas de escel pol.aparache.prg*/
        
        /*cabeceros - Limpiar cache*/
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-control", "no-store");
        response.setDateHeader("Expires", -1);
        
        /* Desplagamos la informacion al cliente */
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2;B3)");
        out.close();
    }
}
