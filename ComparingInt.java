package Chapter2;

public class ComparingInt {

    int value = 100;

    public boolean greaterThan100(int number) {
       return number > value;
    }

    public boolean greaterLess100(int number) {
        return number < value;
    }

    public boolean greaterEqualsTo100(int number) {
        return number == value;
    }
}
