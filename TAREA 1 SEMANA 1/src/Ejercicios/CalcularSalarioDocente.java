/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;


public class CalcularSalarioDocente {
    public static void main(String[] args){
        double SalarioH, Hora , DesRenta, CalcularSalario, SalarioTotal;
        SalarioH = 8.00;
        Hora = 36;
        
        
        CalcularSalario = SalarioH * Hora;
        DesRenta = CalcularSalario  * 0.1;
        SalarioTotal = CalcularSalario - DesRenta ;
        
        System.out.println("Salario total del docente es: " + "$" + SalarioTotal);
    }
}
