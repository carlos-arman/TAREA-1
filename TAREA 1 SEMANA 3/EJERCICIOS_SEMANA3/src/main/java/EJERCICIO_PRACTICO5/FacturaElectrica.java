/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO5;

/**
 *
 * @author Armando
 */
public class FacturaElectrica {
    private int NoCuenta;
    private int lecturaActualMedidor;
    private int LecturaMedidor;
    private int multiplicador;
    private int consumoMensual;
    private int consumoDiario;
    private double valorFactura;

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public int getLecturaActualMedidor() {
        return lecturaActualMedidor;
    }

    public void setLecturaActualMedidor(int lecturaActualMedidor) {
        this.lecturaActualMedidor = lecturaActualMedidor;
    }

    public int getLecturaMedidor() {
        return LecturaMedidor;
    }

    public void setLecturaMedidor(int LecturaMedidor) {
        this.LecturaMedidor = LecturaMedidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(int consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public int getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(int consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    public double ConsumoMes(){
        double total;
        total =  (this.getLecturaActualMedidor() - this.getLecturaMedidor()) * this.getMultiplicador();
        return total;
    }
    public double ConsumoDiario(){
        double total;
        total = this.ConsumoMes()/ 30;
        return total;
    }
    
    public int valorfactura(){
        int total;
        total = (int) (this.ConsumoMes() * 0.20);
        return total;
    }
    public void imprimir(){
        System.out.println("INFORMACION");
        System.out.println("Codigo cuenta: "+this.getNoCuenta());
        System.out.println("Lectura actual del medidor: "+ this.getLecturaActualMedidor());
        System.out.println("Lectura anterior del medidor: "+this.getLecturaMedidor());
        System.out.println("Valor del multiplicador: " + this.getMultiplicador());
        System.out.println("Consumo del mes: "+ this.ConsumoMes());
        System.out.println("Consumo diario: "+this.ConsumoDiario());
    }
}
//70 Kwh x 10 horas = 700
//700 x 30 días (mes) = 21,000
//21,000 / 1000 = 21Kwh/mes