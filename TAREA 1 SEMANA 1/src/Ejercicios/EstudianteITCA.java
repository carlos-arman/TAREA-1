/*
6-. Un estudiante de del ITCA tiene 5 evaluaciones en cada ciclo de estudio.
La  primera  evaluación  tiene  una  ponderación del  25%  de  la  nota  final,
la segunda evaluación tiene un 15% de la nota final, la tercera evaluación tiene
un 15% de la nota final, la cuarta evaluación tiene un 20% del valor de la nota
final y la quinta evaluación tiene un 25% del valor de la nota final. Si el 
estudiante obtuvo las siguientes calificaciones:

Parcial 1: 8.0  Parcial 2: 7.5 
Parcial 3: 9.0  Parcial 4: 8.0  Parcial 5: 9.0

¿Cuál sería el promedio final del
estudiante al final del ciclo?
 */
package Ejercicios;

import java.text.DecimalFormat;

/**
 *
 * @author Armando
 */
public class EstudianteITCA {
    public static void main(String[] args){
        double Parcial1;
        double Parcial2;
        double Parcial3;
        double Parcial4;
        double Parcial5;
        double PromedioFinal;
        
        Parcial1 = 8 * 0.25;
        Parcial2 = 7.5 * 0.15;
        Parcial3 = 9 * 0.15;
        Parcial4 = 8 * 0.20;
        Parcial5 = 9 * 0.25;
        
        PromedioFinal = Parcial1 + Parcial2 + Parcial3 + Parcial4 + Parcial5;
      
        DecimalFormat R = new DecimalFormat("#.0");
        System.out.println("El promedio Final es: "  + R.format(PromedioFinal));
    }
}
