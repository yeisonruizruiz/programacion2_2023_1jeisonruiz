/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class promedio_diez_numeros {
      public static void main(String[] args) {
    int[] grados = {67, 78, 89, 67, 87, 98, 93, 85, 82, 100};
    int total = 0;

    for (int grado : grados) {
      total += grado;
    }

    double promedio = total / grados.length;

    System.out.println("El total de los 10 grados es: " + total);
    System.out.println("El promedio de la clase es: " + promedio);
  }
}
  


