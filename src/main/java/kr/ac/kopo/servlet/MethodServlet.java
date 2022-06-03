package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet {

	// http://localhost:9999/Lecture-Web/method?id=hong -> request
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL(); // stringbuffer형
		String id = request.getParameter("id"); // id란 속성값으로 날라온 값이 어떻게 되니?
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); // i/o 통로가 필요하기 때문에 PrintWriter 작성
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		==========================================<br>");
		out.println("		&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("		==========================================<br>");
		out.println("		파라미터(id) : " + id + "<br>");
		out.println("		요청방식 : " + method + "<br>");
		out.println("		uri : " + uri + "<br>");	
		out.println("		==========================================<br>");
		out.println("	</body>");
		out.println("</html>");
		
		
		/*
		System.out.println("요청 Method : " + method);
		System.out.println("요청 URI : " + uri); // server 내에서 구분자 역할을 하는 것
		System.out.println("요청 URL : " + url.toString()); // 프로토콜 ip port location 
		System.out.println("id : " + id);
		*/
		
		// 클라이언트에게 보여주고 싶으면 response 사용 -> outputStream 문자 stream의 형태로 넘김
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 코드 해석 get 말고 post 방식일 때는 반드시 써야한다
		request.setCharacterEncoding("utf-8");
		
		String method = request.getMethod();
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL(); // stringbuffer형
		String id = request.getParameter("id"); // id란 속성값으로 날라온 값이 어떻게 되니?
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); // i/o 통로가 필요하기 때문에 PrintWriter 작성
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		==========================================<br>");
		out.println("		&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("		==========================================<br>");
		out.println("		파라미터(id) : " + id + "<br>");
		out.println("		요청방식 : " + method + "<br>");
		out.println("		uri : " + uri + "<br>");	
		out.println("		==========================================<br>");
		out.println("	</body>");
		out.println("</html>");
		
		
		/*
		System.out.println("요청 Method : " + method);
		System.out.println("요청 URI : " + uri); // server 내에서 구분자 역할을 하는 것
		System.out.println("요청 URL : " + url.toString()); // 프로토콜 ip port location 
		System.out.println("id : " + id);
		*/
		
		// 클라이언트에게 보여주고 싶으면 response 사용 -> outputStream 문자 stream의 형태로 넘김
	}
	
	
}
