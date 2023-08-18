import java.util.Scanner;

public class Tabuada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i*num);
        }
    }
}
