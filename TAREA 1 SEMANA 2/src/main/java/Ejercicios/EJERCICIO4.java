/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;


/*4-. Una  empresa  de  venta  de  computadoras  paga  a  su  personal  de  
ventas  un  salario  de $300,00 más una comisión de $50,00 por computadora
vendida. Diseñar un programa para calcular  el  salario  de  un  vendedor 
en  un  determinado  mes,  conociendo  el  nº  de computadoras vendidas. Al
salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta.*/

public class EJERCICIO4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        double salario = 300;
        double comision = 50;
        double computadorasVendidas;
        double totalcomision;
        double renta = 0.1;
        double totalRenta;
        double salarioVendegado;
        String nombre;
       
        //ENTRADA DE DATOS POR TECLADO
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de computadoras vendidas: ");
        computadorasVendidas = leer.nextDouble();
        
        
        //PROCEDIMIENTO
         totalcomision = comision * computadorasVendidas;
         totalRenta =  totalcomision +salario  * renta;
         salarioVendegado = salario + totalcomision - totalRenta;
         
        //IMPRIMIR LOS DATOS EN PANTALLA
        System.out.println("-------------------------------");
        System.out.println("Nombre del personal: " + nombre);
        System.out.println("concepto de renta retenido: $" + df.format(totalRenta));
        System.out.println("Salario devengado: $"+ df.format(salarioVendegado));
        
    }
}
