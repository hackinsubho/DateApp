package org.jspiders.dateApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/da")
public class DateController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		Date d = new Date();
		String out="<html><body bgcolor=\"yellow\"><h2 color=\"red\">"+d+"</h2></body></html>";
		pw.println(out);
	}

}
