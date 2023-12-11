package org.example.person.event;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Event {
    private Date date;
    private Time time;
    private String description;
    public Event (Date date, Time time, String description){
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public void showNotification () {

    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(date, event.date) && Objects.equals(time, event.time) && Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, description);
    }
}
