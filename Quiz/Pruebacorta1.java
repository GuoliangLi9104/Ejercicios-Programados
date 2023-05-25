import java.util.Scanner;

public class Pruebacorta1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca el numero de filas:  ");
    int filas = scanner.nextInt();
    System.out.println("Introduzca el numero de columna:  ");
    int columnas = scanner.nextInt();

    String [][] matriz = new String [filas] [columnas];

   System.out.println("Ingrese su nombre:");
   String nombre = scanner.next();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = nombre;
            }
        }
        System.out.println("Ingrese su nombre:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

        
    
