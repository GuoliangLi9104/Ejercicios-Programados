import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int nega = 0;
          for(int i = 1; i < 11; i++ ){ 
            numero = 0;
            System.out.println("Ingrese un número "+i);
                numero = entrada.nextInt();
              if(numero < 0){
                nega = nega + 1;
              }
               
          }
           
            System.out.println("La cantidad de negativos es de: " + nega+ " numeros negativos");
            

    }


    }

        
    
