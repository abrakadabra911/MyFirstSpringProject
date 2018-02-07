package app;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Event {
    private int id = (int) (Math.random() * 100);
    private String msg;
    private Date date;
    private DateFormat df;
    private EventType type;

    public Event(Date date, DateFormat df, EventType type, String msg) {
        this.date = date;
        this.df = df;
        this.type = type;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                ", df=" + df +
                '}';
    }

    public static boolean isDay(){
        int currentHour = LocalTime.now().getHour();
        return (currentHour > 8 && currentHour < 17);
    }
}
