package org.formation.servlet;


import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/TableDeMultiplicationServlet")
public class TableDeMultiplicationServlet  extends HttpServlet 
{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException 
	{
		req.setAttribute("date", new Date());
		req.getRequestDispatcher("/jsp/TableDeMultiplicationServlet.jsp").forward(req, resp);
	}
}