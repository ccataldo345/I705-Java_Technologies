package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
    	// Date date_s1 = new Date();
    	// String date_s = date_s1.toString();
    	// SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
    	// Date date = dt.parse(date_s); 
    	Thread.sleep(1000); // simulated delay
        return new Greeting("" + new Date() + ":  " + message.getName() + "");
        // return new Greeting("Hello, " + message.getName() + "!");
    }

}
