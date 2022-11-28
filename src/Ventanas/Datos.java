package Ventanas;

public class Datos {

    String Nombres;
    String Carnet;
    String Asignatura;
    double Ipacial;
    double IIparcial;
    double Acumulado;
    double NF;

    public Datos(String Nombres, String Carnet, String Asignatura, double Ipacial, double IIparcial, double Acumulado, double NF) {
        this.Nombres = Nombres;
        this.Carnet = Carnet;
        this.Asignatura = Asignatura;
        this.Ipacial = Ipacial;
        this.IIparcial = IIparcial;
        this.Acumulado = Acumulado;
        this.NF = NF;
    }

    public Datos() {
    }

    public double getNF() {
        return NF;
    }

    public void setNF(double NF) {
        this.NF = NF;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public double getIpacial() {
        return Ipacial;
    }

    public void setIpacial(double Ipacial) {
        this.Ipacial = Ipacial;
    }

    public double getIIparcial() {
        return IIparcial;
    }

    public void setIIparcial(double IIparcial) {
        this.IIparcial = IIparcial;
    }

    public double getAcumulado() {
        return Acumulado;
    }

    public void setAcumulado(double Acumulado) {
        this.Acumulado = Acumulado;
    }

}
