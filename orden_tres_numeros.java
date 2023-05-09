
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class orden_tres_numeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tres números enteros:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();

        System.out.println("Los números introducidos son:");
        System.out.println(num1 + " " + num2 + " " + num3);

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Los números ordenados son:");
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);

    }

}