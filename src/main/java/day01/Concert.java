package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    List<Person> persons=new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person, LocalTime time){
        if(time.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("It is too early to enter!");
        }else{
            persons.add(person);
        }
    }
}
