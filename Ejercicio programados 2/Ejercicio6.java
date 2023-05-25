import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("Ingrese el día:");
        int dia = entrada.nextInt();
        while (dia > 30 || dia <1  ){
            System.out.println("Ingrese otra vez el día: ");
            dia = entrada.nextInt();
         }

        System.out.println("Ingrese el mes:");
        int mes = entrada.nextInt();
        while (mes > 12 || mes <1  ){
            System.out.println("Ingrese otra vez el mes: ");
            mes = entrada.nextInt();
         }

        System.out.println("Ingrese el año:");
        int anio = entrada.nextInt();
        while (anio > 2024 || anio <0  ){
            System.out.println("Ingrese otra vez el anio: ");
            anio = entrada.nextInt();
         }
         System.out.println("La fecha dia: "+dia +", Mes: "+ mes +", Año: "+anio+ " ingresada es correcta.");
        }
    }
       // boolean esFechaCorrecta = verificarFecha(dia, mes, anio);
       
        /*if (esFechaCorrecta) {
            System.out.println("La fecha ingresada es correcta.");
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }*/
   

    /*  public static boolean verificarFecha(int dia, int mes, int anio) {
        if (anio < 0) {
            return false;  // Año inválido
        }

        if (mes < 1 || mes > 12) {
            return false;  // Mes inválido
        }

        if (dia < 1 || dia > 31) {
            return false;  // Día inválido
        }

        return true;  // La fecha es válida
    }*/

        
    
