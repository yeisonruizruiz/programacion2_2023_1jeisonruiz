/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class orden1_10 {
    
public static void main(String[] args) {
    int[] arreglo = new int[10];
    
    int subindice = 0;
    while(subindice < 10){
        arreglo[subindice] = subindice + 1;
        subindice++;
    }
    
    System.out.println("contenido del arreglo");
    
    for (int i = 0; i < 10; i++) {
    System.out.println(arreglo[i]);
    
    
        }
    }
}
