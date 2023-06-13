package calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Oper extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter out = resp.getWriter();

		String exp = req.getParameter("exp");
		String[] numbers = {};
		String opers = "+-*/";
		int operIndex = -1;
		int result = 0;
		int operCnt = 0;
		String message = "";
		
		boolean error = false;
		boolean isMinus = false;

		Calc calc = new Calc();

		for (int i = 0; i < exp.length(); i++) {
			if(exp.charAt(0)=='-' &&i==0) {
				isMinus =true;
				continue;
			}
			for (int j = 0; j < opers.length(); j++) {
				if (exp.charAt(i) == opers.charAt(j)) {
					operIndex = j;
					operCnt++;
					break;
				}
			}
			
		}

		if (operCnt==1) {
			int num1 = 0;
			int num2 = 0;
			
			numbers = isMinus ? exp.substring(1).split("\\" + opers.charAt(operIndex)) : exp.split("\\" + opers.charAt(operIndex));
			
				num1 = isMinus ? -Integer.parseInt(numbers[0]) : Integer.parseInt(numbers[0]);
				num2 = Integer.parseInt(numbers[1]);

			switch (opers.charAt(operIndex)) {
			case '+':
				result = calc.add(num1, num2);
				break;
			case '-':
				result = calc.sub(num1, num2);
				break;

			case '*':
				result = calc.multi(num1, num2);
				break;

			case '/':
				try {
					result = calc.div(num1, num2);
				} catch (ArithmeticException e) {
					message = "0으로는 나눌 수 없어요!";
					error = true;
				}
				break;

			}
			if (!error) {
				message = "결과 값은" + result + "입니다!";
			}

		} else if(operCnt==0){
			message = "연산자가 존재하지 않습니다! ";
		}else {
			message = "두 정수의 연산이 아닙니다! 연산자는 한개만 작성해주세요!";
		}

		out.print("<h3>" + message + "</h3>");
		out.print("<a href ='calc'>계산식 다시 쓰기</a>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
