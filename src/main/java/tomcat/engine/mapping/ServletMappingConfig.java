package main.java.tomcat.engine.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//映射配置,类似于web.xml
public class ServletMappingConfig {
    public static List<ServletMapping> servletMaps=new ArrayList<>();
    public static Map<String,String> urlMap=new HashMap<>();
    static {
        //类似web.xml中配置<servlet>中的servlet-name servlet-mapping
        servletMaps.add(new ServletMapping("HelloTomcat","/hellotomcat",
                "main.java.tomcat.engine.HelloTomcatServlet"));
        servletMaps.add(new ServletMapping("PyTomcat","/hello",
                "main.java.tomcat.engine.HelloPyServlet"));
    }


}
