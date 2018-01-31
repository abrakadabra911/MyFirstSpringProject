package app;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    int id = (int)(Math.random()*100);
    String msg;
    Date date;
    DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
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
}
