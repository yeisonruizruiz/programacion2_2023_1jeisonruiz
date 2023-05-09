
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class piramide_numeros {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un número entero: ");
      int num = sc.nextInt();
      
      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
         }
         System.out.println();
      }
   }
}
    

