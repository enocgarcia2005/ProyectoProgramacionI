package ventana_maestros;

public class Datos {
    //Atributos

    private String nombres;
    private String carnet;
    private String asignatura;
    private double primerParcial;
    private double segundoParcial;
    private double acumulado;
    private double notaFinal;

    //Constructor parametrizado
    public Datos(String nombres, String carnet, String asignatura, double primerPacial, double segundoParcial, double acumulado, double notaFinal) {
        this.nombres = nombres;
        this.carnet = carnet;
        this.asignatura = asignatura;
        this.primerParcial = primerPacial;
        this.segundoParcial = segundoParcial;
        this.acumulado = acumulado;
        this.notaFinal = notaFinal;
    }

    //Constructor vacio
    public Datos() {
    }

    //Getters y Setters
    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPrimerPacial() {
        return primerParcial;
    }

    public void setPrimerPacial(double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }

}
