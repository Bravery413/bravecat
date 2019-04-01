package main.java.tomcat;


import main.java.tomcat.listen.Listener;

public class runner {
    public static void main(String[] args){
        new Listener(8080).start();
    }
}
