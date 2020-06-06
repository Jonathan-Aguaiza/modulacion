/*
Realizar un algotmo que me permita ingresar por teclado el sistema y su
modulacion.
 */
package modularidad;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese el sistema:");
        String sis=objeto.nextLine();
        /*
        Predicción de la serie de tiempo de velocidad del vehículo usando red neuronal
        */
        System.out.println("Ingrese modulo 1:");
        String mod1=objeto.nextLine();
        /*
        Velocidad del vehículo
        */
        System.out.println("Ingrese modulo 2:");
        String mod2=objeto.nextLine();
        /*
        
        */
        System.out.println("Ingrese modulo 3:");
        String mod3=objeto.nextLine();
        /*
        
        */
        System.out.println("Ingrese modulo 4:");
        String mod4=objeto.nextLine();
        /*
        
        */
        System.out.println("Ingrese modulo 5:");
        String mod5=objeto.nextLine();
        /*
        
        */
        
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        System.out.println("");
        System.out.println("Sistema");
        System.out.println(""+sis);
        System.out.println("Modulación");
        System.out.println("");
        System.out.println("MODULO 1:   "+mod1);
        System.out.println("");
        System.out.println("MODULO 2:   "+mod2);
        System.out.println("");
        System.out.println("MODULO 3:   "+mod3);
        System.out.println("");
        System.out.println("MODULO 4:   "+mod4);
        System.out.println("");
        System.out.println("Modulo 5:   "+mod5);
    }
    
}
