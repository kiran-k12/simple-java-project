package works.buddy.samples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WorksWithHerokuServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setStatus(404);
        PrintWriter writer = response.getWriter();
        writer.print("Buddy Works with Heroku");
        writer.close();
    }
    
    public void methodTest(int input1, int input2, int input3, int input4, int input5, int input6){ 
    System.out.println(input1+input2+input3+input4+input5+input6);
 } 
}
