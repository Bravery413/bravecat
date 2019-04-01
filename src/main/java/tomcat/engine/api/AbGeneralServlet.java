package main.java.tomcat.engine.api;

import main.java.tomcat.connector.ServletRequest;
import main.java.tomcat.connector.ServletResponse;

public abstract class AbGeneralServlet implements Servlet{
    public abstract void doGet(ServletRequest request, ServletResponse response);
    public abstract void doPost(ServletRequest request,ServletResponse response);
    @Override
    public void service(ServletRequest request,ServletResponse response){
        String method = request.getMethod();
        if ("GET".equalsIgnoreCase(method)){
            doGet(request,response);
        }else if("POST".equalsIgnoreCase(method)){
            doPost(request,response);
        }else if ("PUT".equalsIgnoreCase(method)){
        // ...
        }else if ("DELETE".equalsIgnoreCase(method)){
        // ...
    }

    }
}
