import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws 
			IOException, ServletException{
		int fn = Integer.parseInt(request.getParameter("fnum"));
		int sn = Integer.parseInt(request.getParameter("snum"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(fn+sn);
	}
}
