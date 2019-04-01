package main.java.tomcat.engine.api;

import main.java.tomcat.connector.ServletRequest;
import main.java.tomcat.connector.ServletResponse;

public interface Servlet {
    void init();
    void service(ServletRequest request, ServletResponse response);
    void destory();
}
