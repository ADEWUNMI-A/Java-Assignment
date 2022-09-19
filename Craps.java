package Chapter6;

public class Craps {
    public int sumOfDice;
    public Status gameStatus;
    public int myPoint;

    public enum Status {WON, LOST, CONTINUE}


    public Status getGameStatus() {

        switch (sumOfDice){
            case 7, 11 -> gameStatus = Status.WON;
            case 2, 3, 12 -> gameStatus = Status.LOST;
            default -> {gameStatus = Status.CONTINUE;
                        myPoint = sumOfDice;
            }
        }
        return gameStatus;
    }
}
