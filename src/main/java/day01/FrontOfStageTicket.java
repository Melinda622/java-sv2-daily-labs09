package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{

    private String code;

    public FrontOfStageTicket(String bandName, LocalDateTime dateTime, int price, String code) {
        super(bandName, dateTime, price);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(super.entryTime().getHour()-1,super.entryTime().getMinute());
    }
}
