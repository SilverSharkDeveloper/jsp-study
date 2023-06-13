package newLecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				response.setContentType("text/html; charset=UTF-8");
				response.setCharacterEncoding("UTF-8");
				request.setCharacterEncoding("UTF-8");
		String x_ = request.getParameter("x");
				String y_ = request.getParameter("y");
				String operator = request.getParameter("button");
				System.out.println(operator);
				
				PrintWriter pr = response.getWriter();
				
				int x = 0, y= 0;
				
				if(x_!=null && !x_.equals("")) {
					x = Integer.parseInt(x_);
				}
				if(y_!=null && !y_.equals("")) {
					y = Integer.parseInt(y_);
				}
				
				if(operator.equals("덧셈")) {
					
					pr.println(x+y);
				}else {
					pr.print(x-y);
				}
	}
	


}
