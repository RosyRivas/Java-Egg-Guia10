
package guia10java.pkg01;

import modelo.*;

/**
 *
 * @author Rosi-PC
 */
public class Guia10Java01 {

    
    public static void main(String[] args) {
        Animal perro = new Perro("Stich","Carnivoro","15","Doberman");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Teddy","Croquetas","10","Chihuahua");
        perro1.alimentarse();
        
        Animal gato = new Gato("Pelusa","Galletas","15","Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark","Pasto","25","Fino");
        caballo.alimentarse();
    }
    
}
