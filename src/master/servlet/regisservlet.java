package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import master.DAO.regisDAO;

import master.DTO.userinfoDTO;

/**
 * Servlet implementation class regisservlet
 */
public class regisservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String firstname=request.getParameter("firstname");
		
		String lastname=request.getParameter("lastname");
	
		String emailid=request.getParameter("emailid");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		userinfoDTO udto=new userinfoDTO();
		udto.setFirstname(firstname);
		udto.setLastname(lastname);
		udto.setEmailid(emailid);
		udto.setUsername(username);
		udto.setPassword(password);
		
		regisDAO rdao=new regisDAO();
		if(!rdao.isuserexist(username))
		{
		rdao.insertData(udto);
		response.sendRedirect("examhome.jsp");
		}
		else 
		{
			response.sendRedirect("eregisunsuccesful.jsp");
		}
	}

}
