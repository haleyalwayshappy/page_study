package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodoListController
 */
@WebServlet(name="todoListController", urlPatterns="/todo/list")
public class TodoListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/list");
		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
		
	}
}
