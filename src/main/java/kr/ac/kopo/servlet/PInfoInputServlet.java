package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PInfoInputServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
	
		String gender = request.getParameter("gender"); 
		if(gender.equals("male")) {
		gender="남"; } else { gender="여"; }
		 
		String notice = request.getParameter("notice");
		String ad = request.getParameter("ad");
		String deliver = request.getParameter("deliver");
		String job = request.getParameter("job");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>개인 정보 출력</h1>");
		out.println("이름 : " + name+ "<br>");
		out.println("아이디 : " + id+ "<br>");
		out.println("암호 : " + pwd+ "<br>");
		out.println("성별 : " + gender+ "<br>");
		out.println("공지메일 : " + mailcheck(notice)+ "<br>");
		out.println("광고메일 : " + mailcheck(ad)+ "<br>");
		out.println("배송 확인 메일 : " + mailcheck(deliver)+ "<br>");
		out.println("직업 : " + job+ "<br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
	String mailcheck(String mail) {
		if(mail == null) {
			return "받지않음";
		} else {
			return "받음";
		}
	}
}
