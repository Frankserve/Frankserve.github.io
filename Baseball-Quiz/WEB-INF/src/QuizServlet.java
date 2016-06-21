package com.example.web;

import com.example.model.*;		
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class QuizServlet extends HttpServlet{

	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
					throws IOException, ServletException{
						
		String c = request.getParameter("people");
		//out.println("&lt;br&gt;Got beeer color " + c);
		AnswerAnalysis AA = new AnswerAnalysis();
		int result = AA.tureOrFalse(c);
		
		
		
		if(result==1){
		RequestDispatcher view = request.getRequestDispatcher("result-correct.jsp");
		view.forward(request, response);
		}else{
		RequestDispatcher view = request.getRequestDispatcher("result-wrong.jsp");
		view.forward(request, response);
		}
	}
}

