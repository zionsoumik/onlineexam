package master.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import master.DAO.Useranswer;
import master.DAO.loginDAO;
import master.DAO.scoredao;
import master.DTO.Questions;
import master.DTO.useranswerDTO;
import master.DTO.userscore;

/**
 * Servlet implementation class Scoreservlet
 */
public class Scoreservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		useranswerDTO udto=new useranswerDTO();
		Useranswer uans=new Useranswer();
		Questions q=new Questions();
		HttpSession session= request.getSession();
		String username=(String) session.getAttribute("uname");
		userscore usc=new userscore();
		scoredao sdao=new scoredao();
		int i=0;
		@SuppressWarnings("unchecked")
		ArrayList<Questions> arr=(ArrayList<Questions>) session.getAttribute("res");
		String[] ans = new String[arr.size()];
		int[] qno = new int[arr.size()];
		while(i<arr.size()){
			String a=Integer.toString(i+1);
			q=arr.get(i);
			ans[i]=(String) session.getAttribute("ans"+a);
			qno[i]=q.getQuestionno();
			i++;
			
			
		}
		udto.setUsername(username);
		udto.setAnswerno(ans);
		udto.setQuestionno(qno);
		uans.insertData(udto,arr.size());
		usc.setUsername(username);
		usc.setPaperno(uans.getPaperno());
		sdao.setScore(usc,uans);
		session.setAttribute("score", sdao.getscore(uans));
		response.sendRedirect("score.jsp");
		
	    
	}

}
