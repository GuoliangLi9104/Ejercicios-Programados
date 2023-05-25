import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int treta = 0;
           
          for(int i = 1; i < 16; i++ ){ 
            numero = 0;
            System.out.println("Ingrese un número "+i);
                numero = entrada.nextInt();
                while (numero <= 0){
                    System.out.println("Ingrese de nuevo un numero: "+i);
                    numero = entrada.nextInt();
                 }
               treta += numero ;
          }
           
            System.out.println("La suma de todos los numeros fue: " + treta);
            

    }


    }

        
    
