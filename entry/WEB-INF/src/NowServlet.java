package foo;
import java.util.Date;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NowServlet extends HttpServlet{

  public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
    PrintWriter out = response.getWriter();
    out.println(new Date());
  }
}
