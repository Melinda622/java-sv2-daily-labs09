package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void ticketCreate(){
        LocalDateTime date = LocalDateTime.of(2021, 12, 22, 20, 30);
        Ticket ticket = new Ticket("Omega", date, 5000);
        Person person=new Person(ticket);
        assertEquals(ticket,person.getTicket());
    }
}