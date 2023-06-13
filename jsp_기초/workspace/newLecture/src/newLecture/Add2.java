package newLecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add2")
public class Add2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Add2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		ServletContext application = request.getServletContext();

		HttpSession session = request.getSession();

		Cookie[] cookies = request.getCookies();

		String value_ = request.getParameter("v");
		int value = 0;

		if (!value_.equals("")) {
			value = Integer.parseInt(value_);
		}
		String[] opers_ = request.getParameterValues("oper");
		String oper = opers_[0];

		if (opers_[0].equals("=")) {
			PrintWriter pr = response.getWriter();

//			if (String.valueOf(application.getAttribute("oper")).equals("+")) {
//
//				value = value + Integer.parseInt(String.valueOf(application.getAttribute("value")));
//			} else {
//				value = value - Integer.parseInt(String.valueOf(application.getAttribute("value")));
//
//			}

//			if (String.valueOf(session.getAttribute("oper")).equals("+")) {
//
//				value = value + Integer.parseInt(String.valueOf(session.getAttribute("value")));
//			} else {
//				value = value - Integer.parseInt(String.valueOf(session.getAttribute("value")));
//
//			}
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("oper")) {

					oper = cookie.getValue();
				}
			}

			if (oper.equals("+")) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("value")) {

						value = value + Integer.parseInt(cookie.getValue());
					}
				}

			} else {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("value")) {

						value = value - Integer.parseInt(cookie.getValue());
					}
				}

			}

			pr.print(value);
		} else {
//			application.setAttribute("value", value);
//			application.setAttribute("oper", oper);

//			session.setAttribute("value", value_);
//			session.setAttribute("oper", oper);

			Cookie cookieValue = new Cookie("value", String.valueOf(value));
			Cookie cookieOper = new Cookie("oper", String.valueOf(oper));

			response.addCookie(cookieOper);
			response.addCookie(cookieValue);
			response.sendRedirect("add2.jsp");
		}

	}

}
