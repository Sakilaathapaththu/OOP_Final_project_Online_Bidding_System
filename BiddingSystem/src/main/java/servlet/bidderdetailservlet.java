package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bidderdetails;

import utill.adminDbutill;

@WebServlet("/bidderdetailservlet")
public class bidderdetailservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			List<bidderdetails> bidderdetail = adminDbutill.getbidderDetails();
			request.setAttribute("bidderdetail", bidderdetail);
		
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("bidderdetail servlet is not connected!");
	}
		RequestDispatcher dis = request.getRequestDispatcher("bidderlist.jsp");
		dis.forward(request, response);
		
		
	}

}
