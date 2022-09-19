package GraceAssignment;

import java.util.Scanner;
public class Phone {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.printf("%nEnter 1. Phone book");
        System.out.printf("%nEnter 2. Messages");
        System.out.printf("%nEnter 3. Chat");
        System.out.printf("%nEnter 4. Call register");
        System.out.printf("%nEnter 5. Tones");
        System.out.printf("%nEnter 6. Settings");
        System.out.printf("%nEnter 7. Call divert");
        System.out.printf("%nEnter 8. Games");
        System.out.printf("%nEnter 9. Calculator");
        System.out.printf("%nEnter 10. Reminder");
        System.out.printf("%nEnter 11. Clock");
        System.out.printf("%nEnter 12. Profiles");
        System.out.printf("%nEnter 13. SIM services: ");
        System.out.printf("%nEnter 0 to end ");
        int number = input.nextInt();
        if ((number >= 0) && (number <= 13)) {
            switch (number) {
                case 1 -> phoneBook();
                case 2 -> messages();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> tones();
                case 6 -> settings();
                case 7 -> callDivert();
                case 8 -> games();
                case 9 -> calculator();
                case 10 -> reminders();
                case 11 -> clock();
                case 12 -> profiles();
                case 13 -> simServices();
                case 0 -> closeApp();
            }
        } else {
            System.out.println("invalid option");
            System.out.println("Please enter a valid option");
            menu();
        }
    }
    public static void phoneBook() {
        System.out.println("Phone book");
        System.out.println("""
                1. Search\s
                2. Service Nos.
                3. Add Name\s
                4. Erase\s
                5. Edit\s
                6. Assign tone\s
                7. Send b'card\s
                8. Options\s
                9. Speed dials\s
                10. Voice tags\s
                0 to go back to main menu""");
        int number = input.nextInt();
        if ((number >= 1) && (number <= 10) || (number == 0)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Type to search");
                    phoneBook();
                }
                case 2, 3, 4, 5, 6, 7, 9, 10 -> {
                    System.out.println("Oops, Nothing here");
                    phoneBook();
                }
                case 8 -> phoneBookMenu8();
                case 0 -> menu();
            }
        } else {
            System.out.println("invalid selection");
            System.out.println("Enter a valid number");
            phoneBook();
        }
    }

    public static void phoneBookMenu8() {
        System.out.println("Options");
        System.out.println("1. Type of view \n2. Memory Status \n 0 to go back to the previous menu");
        int number = input.nextInt();
        if ((number == 1) || (number ==2) || (number == 0)){
            switch (number) {
                case 1 -> {
                    System.out.println("Type of View");
                    System.out.println("Oops, There's nothing here");
                    phoneBook();
                }
                case 2 -> {
                    System.out.println("Memory status");
                    System.out.println("Oops, memory size is not specified");
                    phoneBook();
                }
                case 0 -> phoneBookMenu8();
            }
        }
        else {
            System.out.println("invalid selection");
            System.out.println("Please enter a valid number");
            phoneBook();
        }
    }
    public static void messages() {
        System.out.println("Messages");
        System.out.println("""
                1. Write messages\s
                2. Inbox\s
                3. Outbox\s
                4. Picture messages\s
                5. Templates\s
                6. Smileys\s
                7. Message settings\s
                8. Info services\s
                9. Voice mailbox number\s
                10. Service command editor\s
                0 to return to main menu""");
        int number = input.nextInt();
        if ((number >= 1) && (number <= 10) || (number == 0)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Messages");
                    System.out.println("Type the message:");
                    String mssg = input.next();
                    System.out.printf("%n%s",mssg);
                    messages();
                }
                case 2, 3, 4, 5, 6, 7, 9, 10 -> {
                    System.out.println("Oops, Nothing here");
                    messages();
                }
                case 8 -> messagesMenu7();
                case 0 -> menu();
            }
        }
        else {
            System.out.println("Please enter a valid number");
            menu();
        }
    }
    public static void messagesMenu7() {
        System.out.println("Message settings");
        System.out.println("1. set \n2. Common \n0 to return to the previous menu");
        int number = input.nextInt();
        if ((number == 1) || (number == 2) || (number == 0)) {
            switch (number){
                case 1 -> {
                    System.out.println("Set");
                    System.out.println("""
                            1. Message centre number\s
                            2. Messages sent as\s
                            3. Message validity\s
                            0 return to the previous menu\s
                            99 return to the main menu""");
                    int setOption = input.nextInt();
                    if  (((setOption >= 1) && (setOption <= 3)) || (setOption == 0) || (setOption == 99)) {
                        switch (setOption){
                            case 1 -> {
                                System.out.println("Message centre number");
                                System.out.println("09085678357288");
                                messagesMenu7();
                            }
                            case 2 -> {
                                System.out.println("Messages sent as: \n 0 sent messages");
                                messagesMenu7();
                            }
                            case 3 -> {
                                System.out.println("Message validity");
                                System.out.println("Oops, Nothing here");
                                messagesMenu7();
                            }
                            case 0 -> messagesMenu7();
                            case 99 -> menu();
                        }
                    }
                    else {
                        System.out.println("Please enter a valid number");
                        messagesMenu7();
                    }
                }
                case 2 -> {
                    System.out.println("Common");
                    System.out.println("""
                            1. Delivery reports\s
                            2. Reply via same centre\s
                            3. Character Support\s
                            0 Return to the previous menu\s
                            99 Return to main menu""");
                    int commonOption = input.nextInt();
                    if (((commonOption >= 1) && (commonOption <= 3)) || (commonOption == 99) || (commonOption == 0)) {
                        switch (commonOption){
                            case 1 -> {
                                System.out.println("Delivery reports");
                                System.out.println("Oops, Nothing here");
                                messagesMenu7();
                            }
                            case 2 -> {
                                System.out.println("Reply via same centre");
                                System.out.println("Oops, Nothing here");
                                messagesMenu7();
                            }
                            case 3 -> {
                                System.out.println("Character support");
                                System.out.println("Oops, Nothing here");
                                messagesMenu7();
                            }
                            case 0 -> messagesMenu7();
                            case 99 -> menu();
                        }
                    }
                    else {
                        System.out.println("Enter a valid number");
                        messagesMenu7();
                    }
                }
            }
        }
    }

    public static void chat(){
        System.out.println("Chat page");
        System.out.println("Enter the recipient contact to start chatting or 99 to go back to the main menu");
        int contactNumber = input.nextInt();
        if (contactNumber > 0) {
            if (contactNumber == 99) {
                menu();
            }
            else {
                System.out.println("Type a message to start chatting");
                menu();
            }
        }
        else {
            System.out.println("Enter a valid number");
            menu();
        }
    }

    public static void callRegister() {
        System.out.println("Call register page");
        System.out.println("""
                1. Missed calls\s
                2. Received calls\s
                3. Dialled numbers\s
                4. Erase recent call list\s
                5. Show call duration\s
                6. Show call costs\s
                7. Call cost settings
                8. Prepaid credit
                0. return to the previous menu
                99 return to the main menu""");
        int number = input.nextInt();
        if ((number >= 1) && (number <= 8) || (number == 0) ||(number == 99)){
            switch(number){
                case 1 -> {
                    System.out.println("Missed call page");
                    System.out.println("You have 0 missed calls");
                    callRegister();
                }
                case 2 -> {
                    System.out.println("Received calls page");
                    System.out.println("You received 0 call");
                    callRegister();
                }
                case 3 -> {
                    System.out.println("Dialled numbers page");
                    System.out.println("You have 0 dialled number");
                    callRegister();
                }
                case 4 -> {
                    System.out.println("Erase recent calls page");
                    System.out.println("No calls to erase ");
                    callRegister();
                }
                case 5 -> callRegisterMenu5();
                case 6 -> callRegisterMenu6();
                case 7 -> callRegisterMenu7();
                case 8 -> {
                    System.out.println("Prepaid credit");
                    System.out.println("Oops, Nothing here");
                }
                case 0 -> callRegister();
                case 99 -> menu();
            }
        }
        else {
            System.out.println("invalid selection");
            System.out.println("Please enter a valid number");
            callRegister();
        }
    }

    public static void callRegisterMenu5() {
        System.out.println("Show calls duration page");
        System.out.println("""
                1. Last call duration\s
                2. All calls' duration\s
                3. Received calls' duration\s
                4. Dialled call duration\s
                5. Clear timers\s
                0. to return to the previous menu\s
                99. to return to the main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 5)) || (number == 0) || (number == 99)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Last call duration page");
                    System.out.println("Your last call duration is 0");
                    callRegisterMenu5();
                }
                case 2 -> {
                    System.out.println("All calls' duration page");
                    System.out.println("Your total call duration is 0");
                    callRegisterMenu5();
                }
                case 3 -> {
                    System.out.println("Received calls' durations page");
                    System.out.println("Your received call duration is 0");
                    callRegisterMenu5();
                }
                case 4 -> {
                    System.out.println("Dialled call duration page");
                    System.out.println("Your dialled call duration is 0");
                    callRegisterMenu5();
                }
                case 5 -> {
                    System.out.println("Clear timers page");
                    System.out.println("Timers cleared");
                    callRegisterMenu5();
                }
                case 0 -> {
                    callRegister();
                }
                case 99 -> {
                    menu();
                }

            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        callRegister();
    }

    public static void callRegisterMenu6() {
        System.out.println("Show call cost page");
        System.out.println("""
                1. Last call cost\s
                2. All calls' cost\s
                3. Clear counters\s
                0 return to the previous menu\s
                99 return to the main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 3)) || (number == 0) || (number == 99)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Last call cost page");
                    System.out.println("Your last call cost is 0");
                    callRegisterMenu6();
                }
                case 2 -> {
                    System.out.println("All calls' cost page");
                    System.out.println("Your total call cost is 0");
                    callRegisterMenu6();
                }
                case 3 -> {
                    System.out.println("Clear counters page");
                    System.out.println("Counter cleared ");
                    callRegisterMenu6();
                }
                case 0 -> callRegister();
                case 99 -> menu();
            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        callRegister();
    }

    public static void callRegisterMenu7() {
        System.out.println("Call cost settings Page");
        System.out.println("""
                1. Call cost limit\s
                2. Show cost in\s
                0. Return to the previous menu\s
                99. Return to the main menu""");
        int number = input.nextInt();
        if ((number == 1) || (number == 2) || (number == 0) || (number == 99)){
            switch (number) {
                case 1 -> {
                    System.out.println("Call cost limit page");
                    System.out.println("Oops, Nothing here");
                    callRegisterMenu7();
                }
                case 2 -> {
                    System.out.println("Show cost in page ");
                    System.out.println("Oops, Nothing here");
                    callRegisterMenu7();
                }
                case 0 -> callRegister();
                case 99 -> menu();
            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        callRegister();
    }

    public static void tones() {
        System.out.println("Tones page");
        System.out.println("""
                1. Ringing tone\s
                2. Ringing volume\s
                3. Incoming call alert\s
                4. Composer\s
                5. Message alert tones\s
                6. Keypad tones\s
                7. Warning and game tones\s
                8. Vibrating alert\s
                9. Screen saver\s
                0 to go back to main menu""");
        int number = input.nextInt();
        if ((number >= 1) && (number <= 9) || (number == 0)) {
            switch (number) {
                case 1, 2, 3, 4, 5, 6, 7, 9 -> {
                    System.out.println("Oops, Nothing here");
                    tones();
                }
                case 8 -> tones();
                case 0 -> menu();
            }
        }
        else {
            System.out.println("invalid selection");
            System.out.println("Enter a valid number");
            tones();
        }
    }

    public static void settings() {
        System.out.println("settings page");
        System.out.println("""
                1. Call settings\s
                2. Phone settings\s
                3. Security settings\s
                4. Restore factory\s
                0. return to the main menu""");
        int number = input.nextInt();
        if ((number >= 1) && (number <= 4) || (number == 0)) {
            switch (number) {
                case 1 -> settingsMenu1();
                case 2 -> settingsMenu2();
                case 3 -> settingsMenu3();
                case 4 -> System.out.println("Restore factory settings");
                case 0 -> menu();
            }
        }
        else {
            System.out.println("invalid selection");
        }
        System.out.println("Enter a valid number");
        settings();
    }

    public static void settingsMenu1() {
        System.out.println("Call settings page");
        System.out.println("""
                1. Automatic redial\s
                2. Speed dialling\s
                3. Call waiting options\s
                4. Own number sending\s
                5. Phone line in use\s
                6. Automatic answer\s
                0. to return to the previous menu\s
                99. to return to the main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 6)) || (number == 0) || (number == 99)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Automatic redial page");
                    System.out.println("1 to activate automatic redial, 2 to cancel");
                    int autoRedial = input.nextInt();
                    if ((autoRedial == 1) || (autoRedial == 2)) {
                        if (autoRedial == 1) {
                            System.out.println("Automatic redial successfully activated");
                            settingsMenu1();
                        }
                        else System.out.println("Automatic redial cancelled");
                        settingsMenu1();
                    }
                    else System.out.println("Please enter a valid option");
                    settingsMenu1();
                }
                case 2, 3, 4, 5, 6 -> {
                    System.out.println("Oops, Nothing here");
                    settingsMenu1();
                }
                case 0 -> settings();
                case 99 -> menu();
            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        settings();
    }

    public static void settingsMenu2() {
        System.out.println("Phone settings");
        System.out.println("""
                1. Language\s
                2. Call info display\s
                3. Welcome note\s
                4. Network selection\s
                5. Lights\s
                6. Confirm SIM services actions\s
                0. to return to the previous menu\s
                99. to return to the main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 6)) || (number == 0) || (number == 99)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Language page");
                    System.out.println("No language available");
                        settingsMenu2();
                }
                case 2, 3, 4, 5, 6 -> {
                    System.out.println("Oops, Nothing here");
                    settingsMenu2();
                }
                case 0 -> settings();
                case 99 -> menu();
            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        settings();
    }

    public static void settingsMenu3() {
        System.out.println("Security settings");
        System.out.println("""
                1. PIN code request\s
                2. Call barring service\s
                3. Fixed dialling\s
                4. Closed user group\s
                5. Phone security\s
                6. Change access codes\s
                0. to return to the previous menu\s
                99. to return to the main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 6)) || (number == 0) || (number == 99)) {
            switch (number) {
                case 1, 2, 3, 4, 5, 6 -> {
                    System.out.println("Oops, Nothing here");
                    settingsMenu3();
                }
                case 0 -> settings();
                case 99 -> menu();
            }
        }
        else System.out.println("invalid selection");
        System.out.println("Enter a valid number");
        settings();
    }

    public static void callDivert(){
        System.out.println("Call divert page");
        System.out.println("Oops, Nothing here");
    }

    public static void games(){
        System.out.println("Games page");
        System.out.println("Oops, No games available");
        menu();
    }

    public static void calculator(){
        System.out.println("calculator page");
        System.out.println("Nothing here");
        menu();
    }
    public static void reminders(){
        System.out.println("reminder page");
        System.out.println("Nothing here");
        menu();
    }
    public static void clock() {
        System.out.println("Clock page");
        System.out.println("""
                1. Alarm clock\s
                2. Clock settings\s
                3. Date settings\s
                4. Stopwatch\s
                5. Countdown timer\s
                6. Auto update of date and time\s
                0 return to main menu""");
        int number = input.nextInt();
        if (((number >= 1) && (number <= 6)) || (number == 0)) {
            switch (number) {
                case 1 -> {
                    System.out.println("Alarm clock page");
                    System.out.println("Set the alarm clock");
                    menu();
                }
                case 2 -> {
                    System.out.println("Clock settings");
                    System.out.println("Set clock");
                    menu();
                }
                case 3 -> {
                    System.out.println("Date settings");
                    System.out.println("Set date");
                    menu();
                }
                case 4 -> {
                    System.out.println("Stopwatch");
                    System.out.println("Set time");
                    menu();
                }
                case 5 -> {
                    System.out.println("Counter timer");
                    System.out.println("Set counter");
                    menu();
                }
                case 6 -> {
                    System.out.println("Auto update of date and time page");
                    menu();
                }
            }
        }
        else {
            System.out.println("invalid selection");
            System.out.println("Please enter a valid number");
            menu();
        }
    }

    public static void profiles() {
        System.out.println("reminder page");
        System.out.println("Nothing here");
        menu();
    }

    public static void simServices() {
        System.out.println("SIM services page");
        System.out.println("Nothing here");
        menu();
    }

    public static void closeApp() {

        System.out.println("Thank you for using this app");
    }
}
