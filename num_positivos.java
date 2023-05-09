
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class num_positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        int contador = 0;
        
        System.out.println("Introduce un número positivo (introduce un número negativo para terminar):");
        int numero = sc.nextInt();
        
        while(numero >= 0) {
            suma += numero;
            contador++;
            System.out.println("Introduce otro número positivo (introduce un número negativo para terminar):");
            numero = sc.nextInt();
        }
        
        if(contador == 0) {
            System.out.println("No se ha introducido ningún número.");
        } else {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números introducidos es: " + promedio);
        }
    }
}
    

