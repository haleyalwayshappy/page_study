package com.home.project.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.project.todo.dto.TodoDTO;
import com.home.project.todo.service.TodoService;


@WebServlet(name="todoListController", urlPatterns="/todo/list")
public class TodoListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/list");
		
		List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
		
		request.setAttribute("list", dtoList);
		
		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
		
	}
}
