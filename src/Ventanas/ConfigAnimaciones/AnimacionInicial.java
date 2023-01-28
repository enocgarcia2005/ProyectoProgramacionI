package Ventanas.ConfigAnimaciones;

import Animaciones.Animaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * El objetivo de esta clase es darle dinamismo al frame inicio mediante la
 * clase animaciones.
 *
 * Nota: Los if dentro de los metodos sirven para evitar bugs en las
 * animaciones, es decir no permiten una segunda animacion sin antes terminar la
 * primera
 *
 * Codigo creado por:
 *
 * @author enocgarcia
 * @since 27/01/2023
 */
public class AnimacionInicial{

    /**
     * Objeto de la clase animaciones
     */
    Animaciones animar = new Animaciones();

    /**
     * Este metodo se encarga de las animaciones al abrir la ventana de inicio.
     *
     * @param pnlDescripcion- Panel descriptor del programa
     * @param lblLogo -Logo del programa
     */
    public void abrirVentana(JPanel pnlDescripcion, JLabel lblLogo) {
        animar.JLabelXDerecha(-270, 110, 15, 10, lblLogo);
        animar.JPanelXIzquierda(1100, 400, 8, 10, pnlDescripcion);
    }

}
