
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hiddenFormFieldSer1"})
public class hiddenFormFieldSer1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html");
           PrintWriter out=response.getWriter();
           
           try{
                String n=request.getParameter("name");
               int count=1;
                String e=request.getParameter("mail");
                String status="Admin";
                if(n.equals("Admin")){
                    status="Admin";
                    count=1;
                }
                else if(n.equals("Faculty")){
                    status="Faculty";
                     count=1;
                }
                else if(n.equals("Student")){
                    status="Student";
                     count=1;
                }
                else{
                    count=0;
                }
               
                if(count==1){
                    
                out.print("<form action='hiddenFormFieldSer2' method='post'>");
                out.print("<input type='hidden' name='name' value='"+n+"'/>");
                out.print("<input type='hidden' name='mail' value='"+e+"'/>");
                out.print("<input type='hidden' name='status' value='"+status+"'/>");
                out.print("<input type='submit'value='submit'/>");
                out.print("</form>");
                }
                else{
                    out.print("Error");
                }
           }
           catch(Exception e){
               out.print(e.getMessage().toString());
           }
    }

}
