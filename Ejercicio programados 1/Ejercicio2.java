import java.util.Scanner;
public class Ejercicio_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero en celsius");
        int celsius = input.nextInt();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("El resultado es: " + fahrenheit );
}
} 