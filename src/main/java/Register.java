

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String number = request.getParameter("uphoneNumber");
		String city = request.getParameter("ucity");
		String password = request.getParameter("upassword");
		
		Model m = new Model();
		m.setName(name);
		m.setCity(city);
		m.setEmail(email);
		m.setNumber(number);
		m.setPassword(password);
		
		int effected=m.register();
		
		
		HttpSession session = request.getSession();
		session.setAttribute("name",name);
		
		if (effected!=0) {
			System.out.println("update sucesss");
			
			response.sendRedirect("success.jsp");
			
		}else if (effected==0) {
			System.out.println("update failed");
			response.sendRedirect("failure.jsp");
		}
		
		
		
		
	}

}
