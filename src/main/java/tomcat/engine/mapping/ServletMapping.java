package main.java.tomcat.engine.mapping;
//mapper对象
//包含三个属性和它们的get/set,2构造方法 有参/无参
public class ServletMapping {
    //servletName
    private String servletName;
    //url
    private String url;
    //clazz
    private String clazz;

    public ServletMapping(){

    }
    public ServletMapping(String servletName,
                          String url,
                          String clazz){
        this.servletName=servletName;
        this.url=url;
        this.clazz=clazz;
    }
    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }




}
