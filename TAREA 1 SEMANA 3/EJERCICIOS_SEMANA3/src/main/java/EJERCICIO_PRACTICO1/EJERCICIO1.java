/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EJERCICIO_PRACTICO1;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS LOS DATOS
        System.out.println("==================================");
        System.out.println("INGRESE LA INFORMACION DE LA CASA ");
        System.out.println("Ingrese el numero de casa: ");
        casa.setNumeroCasa(sc.nextLine());
        System.out.println("Ingrese numero de pasaje: ");
        casa.setNumeroPSJ(sc.nextInt());
        sc.nextLine();
        System.out.println("Nombre de la calle: ");
        casa.setNombreCalle(sc.nextLine());
        
        //LAMAMOS EL METODO
        casa.imprimirdatos();
    }
}
