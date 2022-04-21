/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO6;





/**
 *
 * @author Armando
 */
public class FormatoFecha {
    private int mes;
    private int dia;
    private int anio;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    
    public void imprimirguiones(){
        
        System.out.println("FECHAS POLIMORFISMO");
        System.out.println("FECHA CON GUIONES: "+ this.getMes() + "-" + this.getDia()+ "-" + this.getAnio());
        
        
    }
    public void imprimirplecas(){
        System.out.println("FECHA CON GUIONES: "+ this.getMes() + "/" + this.getDia()+ "/" + this.getAnio());
    }
}
        
       
