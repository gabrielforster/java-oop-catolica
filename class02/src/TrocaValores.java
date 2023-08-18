import java.util.Scanner;

public class TrocaValores {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       String nome1 = "mestre do universo";
       String nome2;

        System.out.print("Digite seu nome: ");
        nome2 = nome1;
        nome1 = scanner.next();

        System.out.println(nome1 + " " + nome2);

    }
}
