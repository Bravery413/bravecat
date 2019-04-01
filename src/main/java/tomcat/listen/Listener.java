package main.java.tomcat.listen;


import main.java.tomcat.connector.servletImpl.HttpRequest;
import main.java.tomcat.connector.servletImpl.HttpResponse;
import main.java.tomcat.connector.util.ConnectUtil;
import main.java.tomcat.engine.mapping.ServletMapping;
import main.java.tomcat.engine.mapping.ServletMappingConfig;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener {

    /**
     * 监听的端口号
     */
    private int port;

    public Listener() {
    }

    public Listener(int port) {
        this.port = port;
    }
    
    private void initServletConfig() {
        for (ServletMapping servletMap : ServletMappingConfig.servletMaps) {
            ServletMappingConfig.urlMap.put(servletMap.getUrl(), servletMap.getClazz());
        }
    }

    public void start() {
        System.out.println("Tomcat run ...  listen to " + port);
        // 初始化Servlet配置
        initServletConfig();
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                HttpRequest request = new HttpRequest(inputStream);
                HttpResponse response = new HttpResponse(outputStream);
                // 请求转发
                ConnectUtil.dispatch(request, response);
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("Tomcat fail ...");
        }finally {
            if (server != null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
