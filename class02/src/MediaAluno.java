import java.util.Scanner;

public class MediaAluno {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = scanner.nextFloat();

        System.out.print("Digite a nota 4: ");
        float nota4 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua media eh: " + media);
    }
}
