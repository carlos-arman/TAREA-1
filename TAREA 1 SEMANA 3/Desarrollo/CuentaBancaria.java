
package clases.y.objetos;

public class CuentaBancaria {
    long numeroCuenta; 
    Cliente propietarioCuenta;
    double saldoCuenta;
    
    public void abonar (double cantidad){
        saldoCuenta += cantidad;
    }
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("¡saldo insuficiete!");
        }
        saldoCuenta -= cantidad;
            
        }
     public String datosPropietarioCuenta(){
         String informacion = "";
         informacion += "DUI:" + propietarioCuenta.duiCliente + "\n";
         informacion += "Nombre:" + propietarioCuenta.nombreCliente + "\n";
         informacion += "Telefono:" + propietarioCuenta.telefonoCliente + "\n";
         return informacion;
         
         
        
    }
            
}
