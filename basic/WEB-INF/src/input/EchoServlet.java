package input;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class EchoServlet extends HttpServlet{

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      request.setCharacterEncoding("UTF-8");
      String msg = request.getParameter("message");
      response.setContentType("text/plain, charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("message = " + msg);

    }

}
