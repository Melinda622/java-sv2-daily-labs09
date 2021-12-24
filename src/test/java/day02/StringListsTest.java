package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    List<String> words= Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
    List<String> result= Arrays.asList( "aa", "bb", "dd");

    @Test
    void testShortestWords(){
        StringLists stringLists=new StringLists();
        assertEquals(result,stringLists.shortestWords(words));
    }
}