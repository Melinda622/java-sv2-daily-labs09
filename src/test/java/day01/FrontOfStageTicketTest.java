package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    @Test
    void entryTimeTest() {
        LocalDateTime date = LocalDateTime.of(2021, 12, 22, 20, 30);
        FrontOfStageTicket stageTicket=new FrontOfStageTicket("Omega",date,5000,"VIP");
        LocalTime time = LocalTime.of(18, 30);
        assertEquals(time, stageTicket.entryTime());
    }
}