package app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

public class App {
    Client client;
    Map<EventType,EventLogger> loggers;
    EventLogger defaultLogger;

    void logEvent(EventType type, String msg){
        EventLogger logger = loggers.get(type);
        if(logger == null) logger = defaultLogger;
        Event event = new Event(new Date(), DateFormat.getInstance(), type, msg);
        logger.logEvent(event);
    }

    public App(Client client, EventLogger eventlogger, Map<EventType,EventLogger> loggers) {
        this.client = client;
        this.loggers = loggers;
        this.defaultLogger = eventlogger;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "spring.xml");

        App app = (App) ctx.getBean("app");


       app.logEvent(EventType.ERROR, "testLog");

        ctx.close();
    }
}
