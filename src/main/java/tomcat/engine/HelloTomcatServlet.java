package main.java.tomcat.engine;

import main.java.tomcat.connector.ServletRequest;
import main.java.tomcat.connector.ServletResponse;
import main.java.tomcat.engine.api.AbGeneralServlet;

public class HelloTomcatServlet extends AbGeneralServlet {
    @Override
    public void doGet(ServletRequest request, ServletResponse response) {
        try {
            response.write("GET method -- from engine/HelloTomcatServlet");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(ServletRequest request, ServletResponse response) {
        try {
            response.write("POST method --from engine/HelloTomcatServlet");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() {

    }

    @Override
    public void destory() {

    }

}
