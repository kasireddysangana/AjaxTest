import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import com.wavelabs.entity.User;
import com.wavelabs.dao.UsersDAO;

import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws 
	IOException,ServletException{
		
		String userName = request.getParameter("uid");
		String password = request.getParameter("pwd");
		User u = new User(userName,password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(new UsersDAO().checkUser(u))
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		else
			out.print("Invalid Username or Password");
	}
	
}
