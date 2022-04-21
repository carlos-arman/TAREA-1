/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO2;

/**
 *
 * @author Armando
 */
public class CalcularIVA extends Articulo{
       private double Porcentaje;
       private double iva;
       private double PrecioSinIva;

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioSinIva() {
        return PrecioSinIva;
    }

    public void setPrecioSinIva(double PrecioSinIva) {
        this.PrecioSinIva = PrecioSinIva;
    }
       public double Calculariva(){
           double Tiva;
           Tiva = this.getPrecioArticulo() * this.getPorcentaje() / 100;
           
           return Tiva;
       }
       
       
       public double precioconiva(){
           double preciosiniva;
           preciosiniva = this.Calculariva() + this.getPrecioArticulo();
           return preciosiniva;
       }
       public double perciosiniva(){
           double precio;
           precio = this.precioconiva() - this.Calculariva();
           return precio;
       }
       
       
}
