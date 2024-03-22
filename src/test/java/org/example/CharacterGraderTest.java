package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterGraderTest {

    @Test
    void markThirtyNineReturnF(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('F', character.markGrader(39));
    }
    @Test
    void markFourtyReturnD(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('D', character.markGrader(40));
    }
    @Test
    void markFiftyFiveReturnC(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('C', character.markGrader(55));
    }
    @Test
    void markSixtyFiveReturnB(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('B', character.markGrader( 65));
    }

    @Test
    void markSeventyFiveReturnA(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('A', character.markGrader(75));
    }
    @Test
    void markTwentyReturnF(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('F', character.markGrader(20));
    }
    @Test
    void markFourtyFiveReturnD(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('D', character.markGrader(45));
    }
    @Test
    void markSixtyReturnC(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('C', character.markGrader(60));
    }
    @Test
    void markSeventyTwoReturnB(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('B', character.markGrader( 72));
    }

    @Test
    void markEightyFiveReturnA(){
        CharacterGrader character = new CharacterGrader();
        assertEquals('A', character.markGrader(75));
    }

    @Test
    void negativeValueThrowsException(){
        CharacterGrader character = new CharacterGrader();
        assertThrows(IllegalArgumentException.class, ()-> {
            character.markGrader(-10);
        });
    }
}