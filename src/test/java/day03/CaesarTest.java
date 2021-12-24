package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    String input="ZXYW";

    @Test
    void testEncrypts(){
        Caesar caesar=new Caesar(13);
        String output= caesar.encrypts(input);
        assertEquals(input,caesar.encrypts(output));
    }

    @Test
    void testEncryptsWithLowerCase(){
        input="zxyw";
        Caesar caesar=new Caesar(13);
        String output= caesar.encrypts(input);
        assertEquals(input.toUpperCase(),caesar.encrypts(output));
    }

}