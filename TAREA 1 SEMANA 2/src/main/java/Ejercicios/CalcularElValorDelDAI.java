
package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*2-.  Hacer  un  programa  que  calcule  el  valor  del  DAI  
(Derecho  Arancelario  a  la  Importación)  para  un  vehículo 
del  año  2010 utilizando la siguiente fórmula:DAI = (Valor Vehículo 
en USA –Depreciación -Flete –Seguro) * 0.25Depreciación = Valor Vehículo 
en USA * 0.10
El programa deberá permitir ingresar vía teclado los valores para el valor 
del vehículo en  USA,  flete  y  seguro.  Por  el momento  el  porcentaje 
de  la  depreciación  será constante. Para efectos de prueba puede utilizar 
los siguientes valores:
Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100. 
Imprimir los valores capturados así como el monto del DAI. */

public class CalcularElValorDelDAI {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        double ValorVehiculoUSA;
        double depreciacion =  0.10 ;
        double flete;
        double seguro;
        
        
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Valor del vehiculo en USA: ");
        ValorVehiculoUSA = imprimir.nextDouble();
        
        System.out.println("Ingrese el valor de FLETE: ");
        flete = imprimir.nextDouble();
        
        System.out.println("Ingrese el valor del seguro: ");
        seguro = imprimir.nextDouble();
       
        double calcularDAI = DAI(ValorVehiculoUSA,depreciacion,flete,seguro);

        System.out.println("El valor del vehiculo es: " +  df.format(ValorVehiculoUSA));
        System.out.println("El valor de FLETE es: "+  df.format(flete));
        System.out.println("El valor del seguro es: " +  df.format(seguro));
        System.out.println("Depreciacion es: " + df.format(depreciacion * ValorVehiculoUSA));
        System.out.println("El calculo de DAI es: " + df.format(calcularDAI));
        
        
    }

    public static double DAI(double ValorVehiculoUSA, double depreciacion, double flete, double seguro) {
        double Dai;
        Dai = (ValorVehiculoUSA - flete - depreciacion - seguro) * 0.25;
        
        return Dai;
    }
}
