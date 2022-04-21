/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_PRACTICO1;

/**
 *
 * @author Armando
 */
public class Casa {
    private String NumeroCasa;
    private int NumeroPSJ;
    private String NombreCalle;

    public Casa() {
    }

    public Casa(String NumeroCasa, int NumeroPSJ, String NombreCalle) {
        this.NumeroCasa = NumeroCasa;
        this.NumeroPSJ = NumeroPSJ;
        this.NombreCalle = NombreCalle;
    }
    

    public String getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(String NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }

    public int getNumeroPSJ() {
        return NumeroPSJ;
    }

    public void setNumeroPSJ(int NumeroPSJ) {
        this.NumeroPSJ = NumeroPSJ;
    }

    public String getNombreCalle() {
        return NombreCalle;
    }

    public void setNombreCalle(String NombreCalle) {
        this.NombreCalle = NombreCalle;
    }
    public void imprimirdatos(){
        System.out.println("----------------------------");
        System.out.println("CASA CREADA");
        System.out.println("Numero de casa asignado: "+ this.getNumeroCasa());
        System.out.println("Numero de pasaje asignado: "+this.getNumeroPSJ());
        System.out.println("Nombre de calle: "+ this.getNombreCalle());
    }
}

