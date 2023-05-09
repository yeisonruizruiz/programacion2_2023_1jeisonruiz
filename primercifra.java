
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class primercifra {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero de hasta 5 cifras: ");
        int numero = scanner.nextInt();

        String numeroComoCadena = Integer.toString(numero);
        char primerCaracter = numeroComoCadena.charAt(0);
        int primerDigito = Character.getNumericValue(primerCaracter);

        System.out.println("El primer dígito del número ingresado es: " + primerDigito);
    }
}
