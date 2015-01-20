package manage.util;
import java.io.IOException;

import javax.servlet.Filter; 
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginFilter implements Filter{
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest  httpReq  = (HttpServletRequest) request;  
         HttpServletResponse httpResp = (HttpServletResponse) response;  
         httpResp.setContentType("text/html"); 
         //获取调转过来的页面名称
         String servletPath = httpReq.getServletPath();  
         //判断是否是登陆页面  
         //flag:若为登陆页面的action路径 showloginPath/nologinPath,则赋值true，否则赋值false  
         boolean flag = false;  
         if(servletPath.equals("/showLogin.jsp") ){  
             chain.doFilter(request, response);  
             flag = true;  
             return;  
         }  
         else  
         {   //如果不是登录页面，则需先判断用户是否已登录  
             //String url = servletPath;  
             Object loginId = httpReq.getSession().getAttribute("user");  
             if(loginId != null){//如果不为空,则进行已登录处理  
                 chain.doFilter(request, response);  
             }else{//如果为空,则进行未登录处理  
                 if ( httpReq.getQueryString() != null )  
                 {  
                     servletPath += "?"+httpReq.getQueryString();  
                 }  
                 httpReq.getSession().setAttribute("returnUri", servletPath);  
                 if ( flag == false )  
                 {    
                    httpReq.getRequestDispatcher("/showLogin.jsp").forward(httpReq,httpResp);  
                 }   
             }  
         }  
		
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

}
