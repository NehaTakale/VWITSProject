package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateQuesServlet
 */
@WebServlet("/CreateQuesServlet")
public class CreateQuesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateQuesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		 String quest=request.getParameter("question");
         String op1=request.getParameter("option1");
         String op2=request.getParameter("option2");
         String op3=request.getParameter("option3");
         String op4=request.getParameter("option4");
         String ans=request.getParameter("answer");
  
         Question q=new Question();
         q.setQuestion(quest);
         q.setOption1(op1);
         q.setOption2(op2);
         q.setOption3(op3);
         q.setOption4(op4);
         q.setAnswer(ans);
       
       QuestionRepo.Insert(q);
       out.println("inserted successfully");
       
       response.sendRedirect("CreateQuiz.jsp");

         
	}

}
