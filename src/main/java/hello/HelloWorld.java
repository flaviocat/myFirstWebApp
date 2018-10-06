package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args){
        LocalTime localTime=new LocalTime();
        System.out.println("SONO LE ORE: "+localTime);
        Greeter g=new Greeter("ciao");
        System.out.println(g.saysHello());
    }
}