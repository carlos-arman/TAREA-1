/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO3;

/**
 *
 * @author Armando
 */
public class Estudiante {
    int numeroCarnet;
    String nombre;
    int codigocarrera;

    public Estudiante(int numeroCarnet, String nombre, int codigocarrera) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
        this.codigocarrera = codigocarrera;
    }

    public void imprimir(){
        System.out.println("Informacion Estudiante");
        System.out.println("El codigo del estudiante es: "+ numeroCarnet);
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo carrera: "+codigocarrera);
    }

}
