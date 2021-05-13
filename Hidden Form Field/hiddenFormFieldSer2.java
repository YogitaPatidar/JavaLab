/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/hiddenFormFieldSer2"})
public class hiddenFormFieldSer2 extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
           try{
                String name=request.getParameter("name");
                String mail=request.getParameter("mail");
                String status=request.getParameter("status");
                out.print("Hello...."+name+"<br>Status: "+status+"<br>"+mail);
           }
           catch(Exception e){
               out.print(e.getMessage().toString());
           }
    }

}
