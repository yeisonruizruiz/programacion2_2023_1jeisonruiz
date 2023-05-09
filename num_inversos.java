
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class num_inversos {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        // Pedir al usuario que ingrese los 10 números
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("Los números ingresados en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
