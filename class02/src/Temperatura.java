import java.util.Scanner;

public class Temperatura {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite sua temperatura em Celsius: ");
        float celsius = scanner.nextFloat();

        float kelvin = (float)(celsius + 273.15);
        float fahrenheit = (float)((celsius * 1.8) + 32);
        float reamur = (float)(celsius * 0.8);
        float rankine = (float)(((celsius + 1.8 ) + 32) + 459.67);

        System.out.println("Temperatura em Kelvin: " + kelvin + "K");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Temperatura em Reamur: " + reamur + "°R");
        System.out.println("Temperatura em Rankine: " + rankine + "°Ra");
    }
}
