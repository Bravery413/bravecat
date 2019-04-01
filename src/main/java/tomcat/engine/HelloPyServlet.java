package main.java.tomcat.engine;

import main.java.tomcat.connector.ServletRequest;
import main.java.tomcat.connector.ServletResponse;
import main.java.tomcat.engine.api.AbGeneralServlet;

public class HelloPyServlet extends AbGeneralServlet {
    @Override
    public void doGet(ServletRequest request, ServletResponse response) {
        try {
            response.write("Hello py");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(ServletRequest request, ServletResponse response) {

    }

    @Override
    public void init() {

    }

    @Override
    public void destory() {

    }
}
