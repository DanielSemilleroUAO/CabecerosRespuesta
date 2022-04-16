package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delga
 */
@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("'Hora actualizada'  HH:mm:ss");
        
        String horaFormato = formatoFecha.format(fecha);
        
        PrintWriter out = resp.getWriter();
        
        out.print("Hora actualizada: " + horaFormato);
        
    }
    
}
