


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class Convertir_Peso_Dolar {
    
 public static void main(String[] args) {
        double baseSinIVA = 3500;
        double tasaIVA = 0.19; // El 19% de IVA en Colombia
        double iva = baseSinIVA * tasaIVA;
        double total = baseSinIVA + iva;

        System.out.println("Base sin IVA: $" + baseSinIVA);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
}