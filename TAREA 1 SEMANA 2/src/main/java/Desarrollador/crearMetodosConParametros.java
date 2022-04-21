
package Desarrollador;


public class crearMetodosConParametros {
    public static void main(String[] args){
        System.out.println("Metodo Void");
        metodoConParametrosVoid(1, 24.34, "Lucas");
        System.out.println("---------------");
        System.out.println("Metodo int");
        metodoConParametroInt(1);
        System.out.println("---------------");
        System.out.println("Metodo double");
        metodoConParametroDoubles(24.34);
        System.out.println("---------------");
        System.out.println("Metodo String");
        metodoConParametrosString("Lucas");
    }

    private static void metodoConParametrosVoid  (int valorInt, double valorDouble, String valorString) {
        System.out.println("Valor Int: "+ valorInt);
        System.out.println("Valor Double: " + valorDouble);
        System.out.println("Valor String: " + valorString);
    }

    private static void metodoConParametroInt(int valorInt) {
        System.out.println("El valor int es: " + valorInt);
    }

    private static void metodoConParametroDoubles(double valorDouble) {
        System.out.println("El valor double es: "+ valorDouble);
    }

    private static void metodoConParametrosString(String valorString) {
        System.out.println("El valor String es: " + valorString);
    }
}
