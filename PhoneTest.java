package GraceAssignment;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
class PhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For main menu, press 1 or 0 to end: ");
        int option = input.nextInt();
        if ((option == 1)  || (option == 0)) {
            if(option == 1) {
                Phone.menu();
            } else {
                System.out.println("Thank you for checking by");
            }
        } else {
            System.out.println("Invalid selection");
            System.out.println("For main menu, press 1 or 0 to end: ");
        }
    }
}