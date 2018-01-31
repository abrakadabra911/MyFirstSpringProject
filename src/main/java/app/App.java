package app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    EventLogger eventLogger;

    void logEvent(Event event){
       // String message = event.toString().replaceAll(""+client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "spring.xml");

        App app = (App) ctx.getBean("app");

        for(int i = 0; i < 10; i++)
        app.logEvent((Event) ctx.getBean("event"));

        ctx.close();
    }
}
