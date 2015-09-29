package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.AnswerDAO;
import master.DTO.AnswerDTO;

/**
 * Servlet implementation class Questionansweraction
 */
public class Questionansweraction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int questionno=Integer.parseInt(request.getParameter("questionno"));
		System.out.println(questionno);
		String answerno=request.getParameter("answerno");
		System.out.println(answerno);
		 int paperno=Integer.parseInt(request.getParameter("paperno"));
		 System.out.println(paperno);
		AnswerDTO anto=new AnswerDTO();
		anto.setQuestionno(questionno);
		anto.setPaperno(paperno);
		anto.setAnswerno(answerno);
		AnswerDAO andao=new AnswerDAO();
		andao.insertData(anto);
	}

}
