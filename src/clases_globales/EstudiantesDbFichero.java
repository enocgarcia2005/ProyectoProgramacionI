package clases_globales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Esta clase se crea como implementacion de los principios SOLID, y tiene como
 * funcion conectar con la informacion almacenadas en el foochero de texto,
 * realiza las operaciones tales como guardar, leer, borrar y eliminar (CRUD).
 *
 * @author enocgarcia
 * @since 18/02/2023.
 */
public class EstudiantesDbFichero implements EstudiantesDb {

    /**
     * El objeto "archivo" de tipo File contiene el fichero de textoque almacena
     * toda la informacion.
     */
    File archivo = new File("Notas.txt");

    /**
     * Este metodo se encarga de guardar la informacion que se le mande dentro
     * del fichero de texto que previamente tenemos creado en un objeto.
     *
     * @param registro-Informacion que se desea guardar.
     */
    @Override
    public void guardarRegistro(String registro) {
        try (FileWriter escribir = new FileWriter(archivo, true)) {
            escribir.write(registro);
            escribir.write(System.getProperty("line.separator"));
            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar");
        }
    }

    /**
     * Este metodo se encarga de modificar la informacion, dentro de un archivo
     * de texto, creamos un archivo temporal con la informacion existente pero
     * con otro nuevo, y luego de esto se agrega la parte modificada, una vez
     * hecho esto, borramos el archivo original y el temporal lo renombramos con
     * el de original.
     *
     * @param registro-registro sin modificar
     * @param registroModificado-registro modificado
     */
    @Override
    public void modificarRegistro(String registro, String registroModificado) {
        String nombreTemporalFichero = "Modificar2.txt";
        String linea = "";
        File ficheroNuevo = new File(nombreTemporalFichero);

        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(fileReader);
            FileWriter escribirDatos = new FileWriter(ficheroNuevo);
            while ((linea = buffer.readLine()) != null) {
                String escribir = linea;
                if (linea.equals(registro)) {
                    escribirDatos.write(registroModificado);
                    escribirDatos.write(System.getProperty("line.separator"));
                } else if (linea.equalsIgnoreCase(escribir)) {
                    escribirDatos.write(escribir);
                    escribirDatos.write(System.getProperty("line.separator"));
                }
            }
            buffer.close();
            escribirDatos.close();
            String nombreFichero = archivo.getName();
            archivo.delete();
            ficheroNuevo.renameTo(archivo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }

    @Override
    public void eliminarRegistro() {
    }

}
