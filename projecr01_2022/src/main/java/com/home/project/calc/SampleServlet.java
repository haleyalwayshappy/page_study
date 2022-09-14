package com.home.project.calc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet(name="sampleServlet", urlPatterns = "/sample")
public class SampleServlet extends HttpServlet {

//	public SampleServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("do Get..." + this);
	}

	@Override
	public void destroy() {
		System.out.println("destroy ...... ");
	}
	
	@Override 
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("init(ServletConfig)............");
	 
	}
	

}
