package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import master.DAO.loginDAO;
import master.DAO.regisDAO;
import master.DTO.userinfoDTO;

/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		HttpSession session= request.getSession();
		session.setAttribute("uname",username);
		String password=request.getParameter("password");
	    loginDAO login=new loginDAO();
	    if(login.isuserexist(username,password))
	    {
	    	response.sendRedirect("question.jsp");
	    	
	    }
	    else
	    {
	    	response.sendRedirect("loginunsuccessful.jsp");
	    }

	}

}
