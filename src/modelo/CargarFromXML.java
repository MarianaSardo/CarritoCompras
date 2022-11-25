package modelo;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CargarFromXML {

    private static final String SERIALIZED_FILE_NAME = "datos.xml";

    public static Controlador cargar() {

        XMLDecoder decoder;

        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
            return new Controlador();
        }
        
        Controlador controlador = (Controlador) decoder.readObject();
        return controlador;

    }

}
