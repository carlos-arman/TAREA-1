/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
  Si un trabajador de la empresa privada está afiliado a las AFP y los porcentajes 
  que se paga a las AFP es de 6% por parte del trabajador y 6.5% por parte del 
  empleador, si el empleado gana $500 al mes,¿Cuánto está pagando a la AFP el 
  trabajador en concepto de empleado y de empleador?
 */
public class TrabajadorEmpresaPrivada {
    public static void main(String[] args){
        double AFPTrabajador, AFPEmpleador, Empleador, Empleado;
        
        AFPTrabajador = 0.06;
        AFPEmpleador = 0.065;
        double SalarioTotal = 500;
        Empleado = SalarioTotal * AFPTrabajador;
        Empleador = SalarioTotal * AFPEmpleador;
        
        System.out.println("El total de AFP de Trabajador es: $" +Empleado);
        System.out.println("El total de AFP de Empleador es: $" + Empleador);
        
        
        
        
    }
}
