import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloHtmlServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html; charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
    out.println("<HEAD>");

		out.println("<TITLE>HTML���[�Ԃ����</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("<H1>���Ⴈ!</H1>");
    out.println("</BODY>");
    out.println("</HTML>");

	}
}
