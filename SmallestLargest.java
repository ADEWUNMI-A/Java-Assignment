package Chapter2;

public class SmallestLargest {

    public int sum(int num1, int num2, int num3) {
        int total = num1 +  num2 + num3;
        return total;
    }


    public int average(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        int avg = total / 3;
        return avg;
    }


    public int product(int num1, int num2, int num3) {
        int product = num1 * num2 * num3;
        return product;
    }

    public int smallestInteger(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }
        else
        return num3;
    }

    public int largestInteger(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else
            return num3;
    }


}

