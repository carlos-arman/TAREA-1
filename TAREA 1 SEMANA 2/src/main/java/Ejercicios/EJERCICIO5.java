
package Ejercicios;

import java.util.Scanner;

/*5-.  Escriba un programa para calcular el salario bruto de un empleado. 
Para calcular el salario del empleado debemos de hacer los descuentos por 
llegadas tardías así como la  retención de la renta que es el 10% del salario 
menos el descuento por llegada tardía. Debe de crear una  fórmula  para  
determinar  el  salario  por  minuto  y  calcular  el  monto  por  las  
llegadas tardías y descontarlo  al  salario,  luego  debe  de  descontar  
el  monto  de  la  renta.  El  programa  deberá  permitir  ingresar  el  
nombre  delempleado, el salario mensual. El programa deberá de imprimir 
el nombre del empleado, el descuento por llegadas tardías, la retención 
de la renta y finalmente el salario bruto.*/

public class EJERCICIO5 {
        public static void main(String[] args) {
        EJERCICIO5 ejer = new EJERCICIO5();
        
        ejer.PedirDatos();
        ejer.DescuentaTardias();
        ejer.TotalT();
        ejer.DescuentoRenta();
        ejer.SalarioBrut();
        ejer.Mostardatos();
    }
        Scanner leer = new Scanner(System.in);
        
        
        String nombre;
        double SalarioM;
        int llegadasTMinutos;
        double DescuentoT;
        double renta;
        double SalarioBruto;
        double DescuentoLLT;
        public void PedirDatos(){
             
             System.out.println("Ingrese su nombre: ");
             nombre = leer.nextLine();
             System.out.println("Ingrese su salario Mensual: ");
             SalarioM = leer.nextDouble();
             System.out.println("Ingrese su llegada tardia en minutos: ");
             llegadasTMinutos = leer.nextInt();
        }
        
        
        public void DescuentaTardias(){
            DescuentoT =  llegadasTMinutos %  60  ;
        }
        public void TotalT(){
             DescuentoLLT =  DescuentoT *SalarioM ;
        }
        public void DescuentoRenta(){
            renta = SalarioM * 0.1;
        }
        public void SalarioBrut(){
            SalarioBruto = SalarioM - DescuentoT - renta;
        }
        public void Mostardatos(){
            System.out.println("Nombre Del empleado: "+nombre);
            System.out.println("Descuento de Llegadas tardias: "+DescuentoLLT);
            System.out.println("Descuento renta: "+renta);
            System.out.println("Salario bruto: "+SalarioBruto);
        }
        
        
        
    
}
