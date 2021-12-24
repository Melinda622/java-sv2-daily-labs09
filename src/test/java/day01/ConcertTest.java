package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    LocalDateTime date = LocalDateTime.of(2021, 12, 22, 20, 30);
    Ticket ticket = new Ticket("Omega", date, 5000);
    Ticket ticket2=new FrontOfStageTicket("Omega",date,5000,"VIP");
    Person person=new Person(ticket);
    Person person2=new Person(ticket2);
    Concert concert=new Concert();

    @Test
    void testAddPerson(){
        concert.addPerson(person, LocalTime.of(19,46));
        assertEquals(1,concert.getPersons().size());
    }

    @Test
    void testAddPerson3(){
       IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->concert.addPerson(person,
               LocalTime.of(19,6)));
       assertEquals("It is too early to enter!",iae.getMessage());
    }

    @Test
    void testAddPerson4(){
        concert.addPerson(person2, LocalTime.of(19,6));
        assertEquals(1,concert.getPersons().size());
    }
}