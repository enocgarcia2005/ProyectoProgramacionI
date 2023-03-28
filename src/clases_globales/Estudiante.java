package clases_globales;

/**
 * Esta clase tiene la funcion de almacenar y devolver la informacion de un
 * estudiante, se utiliza un patron de diseño para hacer uso de las funciones.
 *
 * @author enocgarcia
 * @since 13/02/2023
 */
public class Estudiante {

    /**
     * Nombres y apellidos del estudiante.
     */
    private final String nombres;
    /**
     * Numero de carnet del estudiante.
     */
    private String carnet;
    /**
     * Asignatura que esta cursando.
     */
    private String asignatura;
    /**
     * nota del primer parcial.
     */
    private double primerParcial;
    /**
     * nota del segundo parcial.
     */
    private double segundoParcial;
    /**
     * nota de acumulado.
     */
    private double acumulado;
    /**
     * nota final obtenida.
     */
    private double notaFinal;

    /**
     * Constructor con los nombres del estudiante.
     *
     * @param nombres
     */
    public Estudiante(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Establecer la nota final obtenida.
     *
     * @param notaFinal- nota final
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
        return this;
    }

    /**
     * Establecer el numero de carnet
     *
     * @param carnet numero de carnet.
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setCarnet(String carnet) {
        this.carnet = carnet;
        return this;
    }

    /**
     * Establecer la asignatura.
     *
     * @param asignatura-asignatura.
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setAsignatura(String asignatura) {
        this.asignatura = asignatura;
        return this;
    }

    /**
     * Establecer la nota del segundo parcial.
     *
     * @param segundoParcial-nota del segundo parcial.
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
        return this;
    }

    /**
     * Establecer la nota del primer parcial.
     *
     * @param primerParcial-nota primer parcial.
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setPrimerPacial(double primerParcial) {
        this.primerParcial = primerParcial;
        return this;
    }

    /**
     * Establecer nota de acumulado.
     *
     * @param acumulado-nota de acumulado
     * @return retorna el mismo objeto, para poder seguir usando mas funciones.
     */
    public Estudiante setAcumulado(double acumulado) {
        this.acumulado = acumulado;
        return this;
    }

    /**
     * Obtener nombres y apellidos.
     *
     * @return retorna nombres y apellidos del estudiante.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Obtener la nota final obtenida
     *
     * @return retorna la nota final obtenida por el estudiante.
     */
    public double getNotaFinal() {
        return notaFinal;
    }

    /**
     * Obtener el numero de carnet.
     *
     * @return retorna el numero de carnet del estudiante.
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * Obtener la asignatura.
     *
     * @return retorna la asignatura que cursa el estudiante.
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Obtener la nota obtenida en el primer parcial.
     *
     * @return retorna la nota obtenida en el primer parcial por el estudiante.
     */
    public double getPrimerPacial() {
        return primerParcial;
    }

    /**
     * Obtener la nota obtenida en el segundo parcial.
     *
     * @return retorna la nota obtenida en el segundo parcial por el estudiante.
     */
    public double getSegundoParcial() {
        return segundoParcial;
    }

    /**
     * Obtener la nota de acumulado obtenida.
     *
     * @return retorna la nota de acumulado obtenida por el estudiante.
     */
    public double getAcumulado() {
        return acumulado;
    }

}
