package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void entryTimeTest() {
        LocalDateTime date = LocalDateTime.of(2021, 12, 22, 20, 30);
        Ticket ticket = new Ticket("Omega", date, 5000);
        LocalTime time = LocalTime.of(19, 30);
        assertEquals(time, ticket.entryTime());
    }
}