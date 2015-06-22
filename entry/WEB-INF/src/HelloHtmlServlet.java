import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloHtmlServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html; charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
    out.println("<HEAD>");

		out.println("<TITLE>HTMLÇ≥Å[Ç‘ÇÍÇ¡Ç∆</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("<H1>ÇøÇ·Ç®!</H1>");
    out.println("</BODY>");
    out.println("</HTML>");

	}
}
