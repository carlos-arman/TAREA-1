

package Developer;

import java.text.DecimalFormat;


/**
 *
 * @author ITCA
 */
public class Calcularelradiodeuncirculo {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#0.00");
        double area, radio;
        final double pi = 3.1416;
        
        area = 145;
        radio = Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format (radio) + "cm");
    }
}
