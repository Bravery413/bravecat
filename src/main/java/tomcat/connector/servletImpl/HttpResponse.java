package main.java.tomcat.connector.servletImpl;

import main.java.tomcat.connector.ServletResponse;

import java.io.OutputStream;

public class HttpResponse implements ServletResponse {
    private OutputStream outputStream;
    public HttpResponse(){

    }
    public HttpResponse(OutputStream outputStream){
        this.outputStream=outputStream;
    }


    @Override
    public void write(String content) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("\r\n")
                .append("<html>")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append(content)
                .append("</body>")
                .append("</html>");
        outputStream.write(sb.toString().getBytes());
        outputStream.close();

    }


    @Override
    public OutputStream getOutputStream() {
        return this.outputStream;
    }
}
