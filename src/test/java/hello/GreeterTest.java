package hello;

import org.junit.jupiter.api.Test;
//import static org.hamcrest.CoreMatchers.containsString;



class GreeterTest {

    private Greeter g=new Greeter();

    @Test
    public void greeterSaysHello(){
        //assertThat(g.saysHello(),containsString("Hello"));
        assert g.saysHello().equals("Hello World");
    }

}