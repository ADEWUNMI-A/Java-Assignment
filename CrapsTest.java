package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CrapsTest {
    Craps craps;


    @BeforeEach
    void startAllTestWith() {
        craps = new Craps();
    }

    @Test
    void thatIHaveTheObject() {
        assertNotNull(craps);
    }

        @Test
    void playerWinsWhenSumOfDiceIs7() {
        craps.sumOfDice = 7;
        assertEquals(Craps.Status.WON, craps.getGameStatus());
    }

        @Test
    void playerWinsWhenSumOfDiceIs11(){
        craps.sumOfDice = 11;
        assertEquals(Craps.Status.WON, craps.getGameStatus());
        }

        @Test
    void playerLosesWhenSumOfDiceIs2(){
        craps.sumOfDice = 2;
        assertEquals(Craps.Status.LOST,craps.getGameStatus());
        }

        @Test
    void playerLosesWhenSumOfDiceIs3(){
            craps.sumOfDice = 3;
            assertEquals(Craps.Status.LOST, craps.getGameStatus());
        }

        @Test
    void playerLosesWhenSumOfDiceIs12(){
        craps.sumOfDice = 12;
        assertEquals(Craps.Status.LOST, craps.getGameStatus());
        }

        @Test
    void playerContinuesWhenSumOfDiceIs4() {
            craps.sumOfDice = 4;
            assertEquals(Craps.Status.CONTINUE,craps.getGameStatus());
        }

        @Test
    void playerContinuesWhenSumOfDiceIs5() {
        craps.sumOfDice = 5;
        assertEquals(Craps.Status.CONTINUE, craps.getGameStatus());
        }

    @Test
    void playerContinuesWhenSumOfDiceIs6() {
        craps.sumOfDice = 5;
        assertEquals(Craps.Status.CONTINUE, craps.getGameStatus());
    }

    @Test
    void playerContinuesWhenSumOfDiceIs8() {
        craps.sumOfDice = 5;
        assertEquals(Craps.Status.CONTINUE, craps.getGameStatus());
    }

    @Test
    void playerContinuesWhenSumOfDiceIs9() {
        craps.sumOfDice = 5;
        assertEquals(Craps.Status.CONTINUE, craps.getGameStatus());
    }

    @Test
    void playerContinuesWhenSumOfDiceIs10() {
        craps.sumOfDice = 5;
        assertEquals(Craps.Status.CONTINUE, craps.getGameStatus());
    }
}