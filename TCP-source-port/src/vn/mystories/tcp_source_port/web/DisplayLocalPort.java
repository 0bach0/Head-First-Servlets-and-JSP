package vn.mystories.tcp_source_port.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DisplayLocalPort extends HttpServlet {
  public void doGet(HttpServletRequest request,
      HttpServletResponse response) throws IOException, ServletException{


    int requestPort = request.getRemotePort();
    String requestHost = request.getRemoteHost();
    String requestAddr = request.getRemoteAddr();

    request.setAttribute("request_port", requestPort);
    request.setAttribute("request_host", requestHost);
    request.setAttribute("request_addr", requestAddr);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }
}