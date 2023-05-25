//Solcitar al usuario un número N de sueldos, y mostrar el sueldo máximo/
import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de sueldos: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("El número de sueldos debe ser mayor a cero.");
            return;
        }
        System.out.println("Ingrese los sueldos a continuación");
       
        int sueldoMaximo = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Sueldo " + (i + 1) + ": ");
            int sueldo = scanner.nextInt();
            if (i == 0 || sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: " + sueldoMaximo);
        
    }
}