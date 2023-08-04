import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ur name: ");
        String name = scanner.next();

        System.out.printf("Hello, %s!", name);
    }
}