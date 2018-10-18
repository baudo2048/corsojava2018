package firstprogram.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloHandler extends AbstractHandler
{
    public void handle(String target,Request baseRequest,HttpServletRequest request,HttpServletResponse response) 
        throws IOException, ServletException
    {
    	String nome = request.getParameter("nome");
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Hello " + nome + "</h1>");
    }

}
