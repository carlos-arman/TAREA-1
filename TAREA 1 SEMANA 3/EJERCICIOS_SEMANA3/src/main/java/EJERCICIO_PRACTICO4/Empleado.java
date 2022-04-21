/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO4;

/**
 * Crear la clase Empleadoutilizando ENCAPSULAMIENTOcon
 * las siguientes características:Atributos:(NoNit, Apellidos,Nombres,Dirección,
 * Salario Devengado, Salario Con Descuento,Bandera de Empleado Activo o Inactivo)
 * @author Armando
 */
public class Empleado {
    private int NoNit;
    private String nombre,apellido,Direccion,BanderaEmpleado;
    private double SalarioDevengado, SalarioConDes;

    public int getNoNit() {
        return NoNit;
    }

    public void setNoNit(int NoNit) {
        this.NoNit = NoNit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getBanderaEmpleado() {
        return BanderaEmpleado;
    }

    public void setBanderaEmpleado(String BanderaEmpleado) {
        this.BanderaEmpleado = BanderaEmpleado;
    }

    public double getSalarioDevengado() {
        return SalarioDevengado;
    }

    public void setSalarioDevengado(double SalarioDevengado) {
        this.SalarioDevengado = SalarioDevengado;
    }

    public double getSalarioConDes() {
        return SalarioConDes;
    }

    public void setSalarioConDes(double SalarioConDes) {
        this.SalarioConDes = SalarioConDes;
    }
    
    //CALCULAR RENTA
    public double DescuentoRenta(){
        double renta;
        renta = this.getSalarioDevengado() * 0.10;
        return renta;
    }
    //DESCONTAR RENTA
    public double CalcularSalarioConDes(){
        double salarioCondes;
         salarioCondes = this.getSalarioDevengado() - this.DescuentoRenta();
         return salarioCondes;
    }
    
    //IMPRIMIR NOMBRE COMPLETO
    public void imprimirNombreContribuyente(){
        System.out.println("--------------------------------");
        System.out.println("Nombre completo: " + this.getNombre()+ " " + this.getApellido());
    }
    //IMPRIMIR TODOS LOS DATOS 
    public void imprimirAtributos(){
        System.out.println("=====DATOS====");
        System.out.println("No Nit: #" + this.getNoNit());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Salario devengado: $"+this.getSalarioDevengado());
        System.out.println("Salario con descuento: $" + this.CalcularSalarioConDes());
        System.out.println("Bandera de empleado: "+this.getBanderaEmpleado());
    }
}
