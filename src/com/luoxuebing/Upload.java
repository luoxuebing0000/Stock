package com.luoxuebing;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Upload
 */
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		InputStream inputStream = (InputStream) request.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(inputStream);
		File file = new File("C:\\Users\\Administrator\\Documents\\CODE\\Java\\Workspace-javaee\\Server03\\data\\upload\\test.png");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fis = new FileOutputStream(file);
		byte[] buff = new byte[1024];
		int len;
		String string = "";
		while((len = bis.read(buff,0,buff.length)) != -1) {
			string +=new String(buff, 0, len);
			fis.write(buff, 0, len);
			fis.flush();
		}
		System.out.println(string);
		fis.close();
		inputStream.close();
	}

}
