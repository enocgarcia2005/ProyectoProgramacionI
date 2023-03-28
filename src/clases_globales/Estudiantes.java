package clases_globales;

/**
 * Esta clase se crea con el objetivo de realizar operaciones con estudiantes
 * tales como guardar eliminar y modificar.
 *
 * @author enocgarcia
 * @since 22/02/2023
 */
public class Estudiantes {

    /**
     * El objeto estudianteDB almacena la base de datos que utiliza el programa,
     * solo se necesita cambiar su instancia para cambiar entre bases de datos,
     * realiza las conecciones a la base de datos(Memoria, Fichero, Sql y
     * NoSql).
     */
    EstudiantesDb estudianteDB = new EstudiantesDbFichero();

    /**
     * El metodo guardar como su nombre indica, se encarga de guardar un listado
     * de estudiante.
     *
     * @param estudiante
     */
    public void guardar(Estudiante estudiante) {
        estudianteDB.guardarRegistro(separarPorComas(estudiante));
    }

    /**
     * El metodo modifcar como su nombre indica, se encarga de modificar un
     * listado de estudiante que ya han sido guardados previamente.
     *
     * @param estudiante-objeto estudiante con datos sin modificar
     * @param estudianteModificado-objeto estudiante con los datos modificados o
     * actualizados
     */
    public void modificar(Estudiante estudiante, Estudiante estudianteModificado) {
        estudianteDB.modificarRegistro(separarPorComas(estudiante), separarPorComas(estudianteModificado));
    }

    /**
     * Se encarga de crear un String con toda la informacion dentro de un objeto
     * de tipo estudiante.
     *
     * @param estudiante
     * @return returna un String.
     */
    public String separarPorComas(Estudiante estudiante) {
        return estudiante.getNombres() + "," + estudiante.getCarnet() + "," + estudiante.getAsignatura() + ","
                + estudiante.getPrimerPacial() + "," + estudiante.getSegundoParcial() + "," + estudiante.getAcumulado() + ","
                + estudiante.getNotaFinal();

    }
}
