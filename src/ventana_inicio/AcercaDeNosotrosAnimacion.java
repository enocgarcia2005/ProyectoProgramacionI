package ventana_inicio;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * Esta clase se encarga de las animaciones correspondientes al presionar el
 * boton de acercamde nosotros.
 *
 * @author enocgarcia Codigo creado:
 * @since 06/02/2023
 */
public class AcercaDeNosotrosAnimacion {

    /**
     * El objeto "animarEtiqueta" se usa para la implementacion del efecto slide
     * en las etiquetas de texto.
     *
     * nota: Contiene el patron Singleton para ahorrar recursos.
     */
    JLabelAnimaciones animarEtiqueta = JLabelAnimaciones.getInstance();
    /**
     * El objeto "animarPanel" se usa para la implementacion del efecto slide en
     * los paneles.
     *
     * nota: Contiene el patron Singleton para ahorrar recursos.
     */
    JPanelAnimaciones animarPanel = JPanelAnimaciones.getInstance();

    /**
     * La funcion principal de esta clase es quitar la pantalla principal al
     * presionar el boton acerca de nosotros. y mostrar el panel con las redes
     * del desarrollador.
     *
     *
     * @param pnlAcercaDe- Panel con btn acerca de nosotros.
     * @param pnlRedes- Panel con las redes sociales del desarrollador.
     * @param btnVolver- btn volver a inicio.
     * @param logo- Logo de la aplicacion.
     * @param pnlDescripcion- Panel que describe el programa.
     */
    public void quitarPantallaPrincipal(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver, JLabel logo, JPanel pnlDescripcion) {
        if (logo.getX() == 110 && pnlDescripcion.getX() == 400) {
            animarEtiqueta.JLabelXIzquierda(110, -270, 15, 10, logo);
            animarPanel.JPanelXDerecha(400, 1100, 8, 10, pnlDescripcion);
            animacionesRepetidas(pnlAcercaDe, pnlRedes, btnVolver);
        }
    }

    /**
     * La funcion principal de esta clase es quitar la pantalla de Login al
     * presionar el boton acerca de nosotros. y mostrar el panel con las redes
     * del desarrollador.
     *
     *
     * @param pnlAcercaDe -Panel con btn acerca de nosotros.
     * @param pnlRedes- Panel con las redes sociales del desarrollador.
     * @param btnVolver- btn volver a inicio.
     * @param btn- btn iniciar sesion.
     * @param pnlLogin-Panel de Login
     */
    public void quitarPantallaLogin(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver, JLabel btn, JPanel pnlLogin) {
        if (pnlLogin.getY() == 150) {
            animarPanel.JPanelYAbajo(150, 600, 10, 10, pnlLogin);
            animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btn);
            animacionesRepetidas(pnlAcercaDe, pnlRedes, btnVolver);
        }
    }

    /**
     * Metodo privado con la funcion de ahorrar codigo en animaciones repetidas
     *
     * @param pnlAcercaDe-Panel con btn acerca de nosotros.
     * @param pnlRedes- Panel con las redes sociales del desarrollador.
     * @param btnVolver- btn volver a inicio.
     */
    private void animacionesRepetidas(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver) {
        animarPanel.JPanelYAbajo(500, 600, 10, 10, pnlAcercaDe);
        animarPanel.JPanelYArriba(600, 150, 10, 10, pnlRedes);
        animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btnVolver);
    }
}
