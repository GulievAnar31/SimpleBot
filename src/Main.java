import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");
        String name = scanner.next();
        System.out.println("What a great name you have! " + name);
    }
}