/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO5;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class main {
    public static void main(String[] args) {
        FacturaElectrica f = new FacturaElectrica();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N cuenta: ");
        f.setNoCuenta(sc.nextInt());
        System.out.println("Ingrese Lectura actual del medido: ");
        f.setLecturaActualMedidor(sc.nextInt());
        System.out.println("Ingrese Lectura anterior del medidor: ");
        f.setLecturaMedidor(sc.nextInt());
        System.out.println("Ingrese el multiplicador: ");
        f.setMultiplicador(sc.nextInt());
       
        f.imprimir();
        
    }
}
