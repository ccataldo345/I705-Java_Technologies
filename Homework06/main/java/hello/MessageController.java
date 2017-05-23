package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {


    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    public Message message(NewMessage message) throws Exception {
    	// Date date_s1 = new Date();
    	// String date_s = date_s1.toString();
    	// SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
    	// Date date = dt.parse(date_s); 
    	Thread.sleep(1000); // simulated delay
        return new Message("" + new Date() + ":  " + message.getName() + "");
        // return new Greeting("Hello, " + message.getName() + "!");
    }

}
