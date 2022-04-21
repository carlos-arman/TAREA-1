/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO2;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcularIVA cal = new CalcularIVA();
        System.out.println("INGRESE LOS DATOS");
        System.out.println("Ingrese El precio del producto: $");
        cal.setPrecioArticulo(sc.nextDouble());
        System.out.println("Ingrese porcentaje IVA: %");
        cal.setPorcentaje(sc.nextDouble());
        
        
        
        System.out.println("----------INFO-----------");
        System.out.println("Precio de articulo: $"+ cal.getPrecioArticulo());
        System.out.println("Porcentaje descontado de iva: $" + cal.Calculariva());
        System.out.println("Precio con iva: $"+ cal.precioconiva());
        System.out.println("Precio sin IVA: $"+cal.perciosiniva());
    }
}
