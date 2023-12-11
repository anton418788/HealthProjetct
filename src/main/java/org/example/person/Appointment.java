package org.example.person;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Appointment {
    private Pacient pacient;
    private Doctor doctor;
    private Date date;
    private Time time;
    private Hostital place;

    public Appointment(Pacient pacient, Doctor doctor, Date date, Time time, Hostital place) {
        this.pacient = pacient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Hostital getPlace() {
        return place;
    }

    public void setPlace(Hostital place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(pacient, that.pacient) && Objects.equals(doctor, that.doctor) && Objects.equals(date, that.date) && Objects.equals(time, that.time) && Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacient, doctor, date, time, place);
    }
}
