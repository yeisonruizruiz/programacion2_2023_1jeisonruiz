
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class par_impar {
   public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];
        
        // Solicitamos al usuario que ingrese los números
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        
        // Determinamos si los números son pares o impares y los mostramos
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " es par");
            } else {
                System.out.println(numeros[i] + " es impar");
            }
        }
    }
}



