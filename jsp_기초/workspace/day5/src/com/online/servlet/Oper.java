package com.online.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Oper
 */
@WebServlet("/Oper")
public class Oper extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Oper() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String input = request.getParameter("input");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		int opersIndex = 0, result = 0, count = 0;
		String[] numbers = {};
		Calc c = null;

		input = input.replaceAll(" ", "");
		String opers = "+-*/";

		for (int i = 0; i < opers.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				if (opers.charAt(i) == input.charAt(j)) {
					opersIndex = i;
					count++;
				}
			}
		}

		numbers = input.split("\\" + opers.charAt(opersIndex));

		c = new Calc();

		out.print("<p>");

		if (count == 1) {
			try {
				c.setNum1(Integer.parseInt(numbers[0]));
				c.setNum2(Integer.parseInt(numbers[1]));
				switch (opersIndex) {
				case 0:
					result = c.plus();
					break;
				case 1:
					result = c.sub();
					break;
				case 2:
					result = c.multi();
					break;
				case 3:
					result = c.devide();
					break;

				}
				out.print("결과 :" + result);
			} catch (NumberFormatException e) {
				out.print("정수만 입력하세여");
			} catch (ArithmeticException e) {
				out.print("0으로 나눌 수 없습니다.");
			}

		} else if (count == 0) {
			out.print("연산자를 찾을 수 없습니다.");
		} else {
			out.print("두개의 정수만 입력해 주세요");
		}
		out.print("</p>");
		out.print("<a href ='calc'>돌아가기</a>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
