
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SearchWordsServlet")
public class SearchWordsServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws
		IOException, ServletException
		{
			System.out.println("In Service Method of SearchWordsServlet 1");
			ArrayList<String> alist = new ArrayList<String>();
			alist.add("Apple");alist.add("Ant");alist.add("Axe");
			alist.add("Ball");alist.add("Banana");alist.add("Bat");
			alist.add("Cat");alist.add("Cow");alist.add("Cap");
			alist.add("Dog");alist.add("Duck");alist.add("Docker");
			
			String searchLetter = request.getParameter("searchText");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String string = "";
			for(String s:alist)
			{
				if(s.toLowerCase().charAt(0)==searchLetter.toLowerCase().charAt(0))
					string=string+s+",";
					
			}
			out.print(string);
			
		}
}
