import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Nice to meet you.");

        scanner.close();
    }
}

