import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How can I assist you today?");
        
        while (true) {
            String command = scanner.nextLine().toLowerCase();
            if (command.contains("hello") || command.contains("hi")) {
                System.out.println("Hello there!");
            } else if (command.contains("time")) {
                System.out.println("The current time is: " + getCurrentTime());
            } else if (command.contains("date")) {
                System.out.println("Today's date is: " + getCurrentDate());
            } else if (command.contains("thank you") || command.contains("thanks")) {
                System.out.println("You're welcome!");
            } else if (command.contains("exit") || command.contains("bye")) {
                System.out.println("Goodbye! Have a great day!");
                break;
            } else {
                System.out.println("I'm sorry, I didn't understand that command.");
            }
        }
        scanner.close();
    }
    
    public static String getCurrentTime() {
        // Code to get current time (not shown)
        return "12:00 PM";
    }
    
    public static String getCurrentDate() {
        // Code to get current date (not shown)
        return "April 10, 2024";
    }
}
