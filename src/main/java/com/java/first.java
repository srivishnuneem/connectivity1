package com.java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public first() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
PrintWriter out = response.getWriter();  

String n=request.getParameter("username");  
String p=request.getParameter("userpass");  
      
if(LoginDao.validate(n, p)){  
    RequestDispatcher rd=request.getRequestDispatcher("Servlet2");  
    rd.forward(request,response);  
}  
else{  
    out.print("Sorry username or password error");  
    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
    rd.include(request,response);  
}  
      
out.close();  
}  

	
	}


