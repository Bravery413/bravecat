package main.java.tomcat.connector.util;


import main.java.tomcat.connector.ServletRequest;
import main.java.tomcat.connector.ServletResponse;
import main.java.tomcat.engine.api.AbGeneralServlet;
import main.java.tomcat.engine.mapping.ServletMappingConfig;

public class ConnectUtil {
    public static void dispatch(ServletRequest request, ServletResponse response) {
        String url = request.getUrl();
        String clazzName = ServletMappingConfig.urlMap.get(url);
        try {
            Class clazz=Class.forName(clazzName);
            AbGeneralServlet servlet = (AbGeneralServlet) clazz.newInstance();
            servlet.service(request,response);
        } catch (Exception e) {
            System.out.println("404 not found");
        }
    }
}
