/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class EJERCICIO3_2 {
    public static void main(String[] args) {
        double salario = 800;
        double comision = 170;
        double ValordeVenta = 0.05;
        double AutosVendidos ;
        double MontoVentas = 0 ;
        String Nombre;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        Nombre = Leer.nextLine();
        System.out.println("Ingrese cantidad de autos vendidos: ");
        AutosVendidos = Leer.nextDouble();
        
        double CalcularSalarios = SalarioDevengado(salario, comision, ValordeVenta,AutosVendidos, MontoVentas);
        
        System.out.println("Nombre de personal: "+Nombre);
        System.out.println("Salario Devengado: " + CalcularSalarios);
    }

    private static double SalarioDevengado(double salario, double comision, double ValordeVenta, double AutosVendidos, double MontoVentas) {
        double salarioTotal;
        salarioTotal = salario + comision * ValordeVenta * AutosVendidos ;
        return salarioTotal;
    }
    
}
