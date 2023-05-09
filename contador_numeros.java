
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class contador_numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}

