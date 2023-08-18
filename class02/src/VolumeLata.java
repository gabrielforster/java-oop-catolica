import java.util.Scanner;

public class VolumeLata {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double V, R, A;

        R = 20;
        A = 30;

        V = 3.14159 * R * R * A;

        System.out.println("O volume da lata eh: " + V);
    }
}
