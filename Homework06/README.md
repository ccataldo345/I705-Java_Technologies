DESCRIPTION
------------


Homework 6 - A chat application with Spring Boot


Create a simple chat application with Spring (and Spring boot) that uses websockets.

First, clone the spring websocket sample https://github.com/spring-guides/gs-messaging-stomp-websocket and import a maven project from the "complete" directory.

To make automatic server reloads on code change happen, add the spring-boot-devtools dependency. There is no need to configure anything, Spring boot finds the devtools from the classpath and uses it.

To access the message bus, add just a SimpMessagingTemplate (i.e to the controller)

<pre>
@Autowired
SimpMessagingTemplate messages;
</pre>

The object has a useful method called convertAndSend.

NB! The application must still look like a real chat application!

* Get rid of those connect/disconnect buttons, and connect to the websocket automatically
* The reconnection should be automatic (i.e when server is restarted)
* The code should not be reading "helloController", "greetings" or anything like that anywhere - all must be named chat-related
* The cursor should appear in the right box when loaded, and message must be send when enter is hit

You are welcome to add more features to the application, but it is okay if there is no database used (only real-time messages), just one chatroom, and no naming for the guests implemented.

USAGE
------------

run: <br/>
<pre>main/java/hello/Application.java</pre>
<!-- - ee.itcollege.maven.HW03_v01.java

my files: <br/>
- output.txt

