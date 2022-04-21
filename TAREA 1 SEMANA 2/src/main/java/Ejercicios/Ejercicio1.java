/*
 1-. Escriba  un  programa  que  imprima  por  pantalla  cuánto  le 
costará  comprar  una computadora  a un determinado precio  si sabe 
que puede conseguir una rebaja del 15%. No  olvidar  que  al  precio
del  artículo  se  le  debe  de  agregar  el  IVA.  El  programa  
deberá permitir  digitar  el  precio  de  la  computadora  y deberá 
de  realizar  los  cálculos correspondientes.
 */
package Ejercicios;


import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String [] args){
        Scanner precio = new Scanner(System.in);
        double PrecioPC;
        double rebaja ;
        double PrecioTotal;
        double IVA ;       
        System.out.println("Ingrese el precio de la Computadora: $"); 
        PrecioPC = precio.nextDouble();
        
        rebaja = PrecioPC * 0.15;
        IVA = PrecioPC * 0.13;
        PrecioTotal =  PrecioPC - rebaja + IVA ;
        //Agregar decimales a numeros
        DecimalFormat Deci = new DecimalFormat("###,###.##");
        
        System.out.println("El precio a pagar es: $" + Deci.format(PrecioTotal));
        System.out.println("IVA agregado: $" + IVA);
    }
}
