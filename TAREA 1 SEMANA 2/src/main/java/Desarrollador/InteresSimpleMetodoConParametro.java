
package Desarrollador;


public class InteresSimpleMetodoConParametro {
    public static void main(String[] args) {
        double cantidadPrestada , tiempo, tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75;
        tasaDeInteres = 0.08;
        
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $" + valorInteresSimple);
    }

    private static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres) {
        double interesSimple;
        interesSimple = cantidadPrestada * tiempo * tasaDeInteres;
        return interesSimple;
    }
}
