
package modelo;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class GuardarToXML {
    
    private static final String SERIALIZED_FILE_NAME="datos.xml";

    public GuardarToXML() {
    }   
    
    public static void guardar(Controlador controlador) throws FileNotFoundException{
        
        XMLEncoder encoder;

        encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));

        encoder.writeObject(controlador);
        encoder.close();
        
    }
    
}
