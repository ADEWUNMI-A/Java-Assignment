package Chapter7;

//Create an array and initialize it with values. Sum all the values in the array and print them out.

public class SumArray {

    public static void main(String[] args) {
        int[] number = {4, 20, 18, 16, 17};
        int total = 0;

        for (int count = 0; count < number.length; count++) {
            total += number[count];
        }
        System.out.printf("The total of array number is %d", total);
    }
}