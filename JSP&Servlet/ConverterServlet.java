/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/ConverterServlet"})
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         float cm,m,num;
         String res;
         num=Float.parseFloat(request.getParameter("numD"));
         if(request.getParameter("btnM")!=null){
             m=num/100;
             res=m+" meter";
             RequestDispatcher req=request.getRequestDispatcher("ConverterJSP.jsp?q="+res);
              req.forward(request,response);
         }
         if(request.getParameter("btnCM")!=null){
             cm=num*100;
             res=cm+" centimeter";
             RequestDispatcher req=request.getRequestDispatcher("ConverterJSP.jsp?q="+res);
             req.forward(request,response);
         }
    }

    
}
