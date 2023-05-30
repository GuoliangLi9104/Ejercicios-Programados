import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese el primer numero: ");
         int num = entrada.nextInt();
        
         
         System.out.println("Ingrese el segundo numero: ");
         int num2 = entrada.nextInt();
         
     if(num==num2){
      System.out.println("Los numeros son iguales");
     }else{
      System.out.println("Los numeros son diferentes");
     }
     
      }
        }
      
    
