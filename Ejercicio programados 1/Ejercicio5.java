import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.println("Ingrese un numero entero: ");
      int num = input.nextInt();
      while (num <= 0){
         System.out.println("Ingrese un numero entero: ");
         num = input.nextInt();
      }
      int factorial = 1;

      while (num !=0){
          factorial=factorial*num; num--;
      }
      System.out.println("El resultado de la factorial es: " + factorial);
    }
}