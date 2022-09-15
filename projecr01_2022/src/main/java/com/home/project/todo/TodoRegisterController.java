package com.home.project.todo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name= "todoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("입력화면을 볼 수 있도록 구성 ");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("입력을 처리하고 목록 페이지로 이동!");
		response.sendRedirect("/todo/list");
	}

}
