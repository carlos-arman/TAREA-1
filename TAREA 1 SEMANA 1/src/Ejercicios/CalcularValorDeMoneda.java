/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
2-. Nos  piden  hacer  un  programa  que  calcule  el  
valor  de  la  moneda  para  los  siguientes países:  
Europa,  Reino  Unido,  Australia  y  Canadá.  El  programa  
tiene  declarada  una variable  con  el  valor  $100.00  de  
tipo  double  y  tenemos  que  realizar  la  conversión  de
dólares  a  las  monedas  solicitadas.  A  continuación  se
muestra  los  valores  de conversión:1 USD    0.70 Europa 

0.61 Reino Unido  0.95 Australia  0.97 Canadá

*/
package Ejercicios;


public class CalcularValorDeMoneda {
    public static void main(String[] args){
        double usd, Cantidad, Europa, ReinoUnido,Australia, canada, ResultadoEuro, ResultadoReino,ResultadoAutra, ResultadoCanada;
        
        Cantidad = 100.00;
        
        usd = 1;
        Europa = 0.70;
        ReinoUnido = 0.61  ; 
        Australia = 0.95 ;
        canada = 0.97 ;
        
        
        
        System.out.println("La conversion a dolares es: " + Cantidad * usd);
        System.out.println("----------------------------------------------");
        ResultadoEuro = Cantidad * Europa;
        
        System.out.println("Dolares en euros es: " + ResultadoEuro);
        
        System.out.println("----------------------------------------------");
        ResultadoReino = Cantidad * ReinoUnido;
        System.out.println("Dolares en Reino Unido es: " + ResultadoReino);
        
        System.out.println("----------------------------------------------");
        ResultadoAutra = Cantidad * Australia;
        System.out.println("Monedas de dolares a Australia: " + ResultadoAutra);
        
        System.out.println("----------------------------------------------");
        ResultadoCanada = Cantidad * canada;
        System.out.println("Monedas de dolares a canada: " + ResultadoCanada);
        
    }
}
