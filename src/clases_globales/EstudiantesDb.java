package clases_globales;

/**
 *
 * @author enocgarcia
 */
public interface EstudiantesDb {

    void guardarRegistro(String registro);

    void modificarRegistro(String registro, String registroModificado);

    void eliminarRegistro();
}
