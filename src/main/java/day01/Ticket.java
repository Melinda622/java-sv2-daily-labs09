package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String bandName;
    private LocalDateTime dateTime;
    private int price;

    public Ticket(String bandName, LocalDateTime dateTime, int price) {
        this.bandName = bandName;
        this.dateTime = dateTime;
        this.price = price;
    }

    public LocalTime entryTime(){
        return LocalTime.of(dateTime.getHour()-1,dateTime.getMinute());
    }

    public String getBandName() {
        return bandName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getPrice() {
        return price;
    }
}