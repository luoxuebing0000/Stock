package com.luoxuebing;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginRegisterProcess
 */
public class LoginRegisterProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegisterProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		InputStream iStream = (InputStream) request.getInputStream();
//		
//		byte[] buff = new byte[1024];
//		int len;
//		String string ="";
//		while((len = iStream.read(buff,0,buff.length)) != -1)
//			string+=new String(buff, 0, len);
//		System.out.println(string);
//		iStream.close();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String username = "",password = "";
		if(null != request.getParameter("username") && 
			null != request.getParameter("password")) {
			username = request.getParameter("username");
			password = request.getParameter("password");
		}else {
			response.sendRedirect("/Server03");
		}
		
		if(username.equals("luoxuebing") && password.equals("123456")) {
			// �ض���
			// URL��ַ�����仯 ������� ��������
			//response.sendRedirect("/Server03/views/success.html");
			
			// WEB-INF Ŀ¼����ͨ��URL��ַȥ���� �Ƚϰ�ȫ����ͨ��ת���ķ�ʽ���Է���WEB-INF
			// ͨ���ǽ�ҳ��  ͼƬ��Դ����WEB-INF ����
			
			
			
			
			// ת��
			// URL��ַ���䣬������� 1��
			//request.getRequestDispatcher("/views/success.html").forward(request, response);
		
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			//request.getRequestDispatcher("/ServletSuccess").forward(request, response);
			
			HttpSession session = request.getSession();
			session.setAttribute("username", "luoxuebing");
			session.setAttribute("password", "123456");
			
			response.sendRedirect("/Server03/views/success.html");
			
		}
		else {
			//request.getRequestDispatcher("/views/false.html").forward(request, response);
			
			request.getRequestDispatcher("/WEB-INF/false.html").forward(request, response);
		}
		
		
	}

}
