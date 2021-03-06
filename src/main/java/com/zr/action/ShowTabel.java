package com.zr.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zr.model.N_label;
import com.zr.service.NoteService;
import com.zr.service.impl.NoteServiceimpl;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class ShowTabel
 */
@WebServlet("/showtabel")
public class ShowTabel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   NoteService ns = new NoteServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(11111);
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		List<N_label> labels = ns.getNotetabel();
		HttpSession session = request.getSession();
		session.setAttribute("labels", labels);
		//request.getRequestDispatcher("note.jsp").forward(request, response);
	}

}
