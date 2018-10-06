package hello;

public class Greeter {

    private String content;

    public Greeter(String content){
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public String saysHello(){
        return "Hello World";
    }
}
