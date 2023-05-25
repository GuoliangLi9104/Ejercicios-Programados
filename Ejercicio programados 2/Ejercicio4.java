import java.util.Arrays;
import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese el primer numero: ");
         int a = entrada.nextInt();
         while (a <= 0){
            System.out.println("Ingrese un numero entero: ");
            a = entrada.nextInt();
         }
         System.out.println("Ingrese el segundo numero: ");
         int b = entrada.nextInt();
         while (b <= 0){
            System.out.println("Ingrese un numero entero: ");
            b = entrada.nextInt();
         }
         System.out.println("Ingrese el tercer numero: ");
         int c = entrada.nextInt();
         while (c <= 0){
            System.out.println("Ingrese un numero entero: ");
            c = entrada.nextInt();
         }

        int[] numeros = {a,b,c};
        //La función Arrays.sort(numeros) se utiliza para ordenar los números de forma ascendente
        Arrays.sort(numeros); 

        System.out.println("Los numeros ordenados de mayor a menor son: ");
        //Bucle for que recorre el arreglo numeros desde el último elemento hasta el primero, imprimiendo cada número en la consola.
        for (int i = numeros.length - 1; i >= 0; i--){ 
         System.out.println(numeros[i]);
        }
      }
   }
        
    
