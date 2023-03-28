package ventana_inicio;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * Esta clase tiene como funcion realizar las animaciones correspondientes al
 * hacer click en el boton Volver a inicio del Frame Inicio.
 *
 * nota: Los if dentro de los metodos sirven para evitar bugs en las animaciones
 *
 * @author enocgarcia
 * @since 28/01/2023
 */
public class VolverAInicioAnimacion {

    /**
     * El objeto "animarEtiqueta" se usa para la implementacion del efecto slide
     * en las etiquetas de texto.
     *
     * nota: Contiene el patron Singleton para ahorrar recursos.
     */
    private final JLabelAnimaciones animarEtiqueta = JLabelAnimaciones.getInstance();
    /**
     * El objeto "animarPanel" se usa para la implementacion del efecto slide en
     * los paneles.
     *
     * nota: Contiene el patron Singleton para ahorrar recursos.
     */
    private final JPanelAnimaciones animarPanel = JPanelAnimaciones.getInstance();

    /**
     * Este metodo se encarga de quitar la pantalla de login al presionar el
     * boton volver a inicio,esto para que se muestres la pantalla de inicio.
     *
     * @param pnlDescripcion-Panel descriptor del programa.
     * @param btnVolver-btn volver a inicio.
     * @param btnIniciarSesion - btn iniciar sesion .
     * @param pnlLogin- Panel de Login.
     * @param logo- Logo de la app.
     */
    public void quitarLogin(JPanel pnlDescripcion, JLabel btnVolver, JLabel btnIniciarSesion, JPanel pnlLogin, JLabel logo) {
        if (pnlLogin.getY() == 150 && logo.getX() == -270 && pnlDescripcion.getX() == 1100) {
            animarPanel.JPanelYAbajo(150, 600, 10, 10, pnlLogin);
            animacionesRepetidas(pnlDescripcion, btnVolver, btnIniciarSesion, logo);
        }
    }

    /**
     * Este metodo se encarga de quitar el panel que contienen las redes
     * sociales del desarrollador al presionar el boton volver a inicio, esto
     * para que se muestres la pantalla de inicio.
     *
     * @param pnlDescripcion-Panel descriptor del programa.
     * @param btnVolver-btn volver a inicio.
     * @param btnIniciarSesion - btn iniciar sesion .
     * @param pnlRedes- Panel con las redes sociales
     * @param pnlAcercaDe-Panel con btn acerca de nosotros
     * @param logo- logo del programa
     */
    public void quitarRedes(JPanel pnlDescripcion, JLabel btnVolver, JLabel btnIniciarSesion, JPanel pnlRedes, JPanel pnlAcercaDe, JLabel logo) {
        if (pnlRedes.getY() == 150 && pnlAcercaDe.getY() == 600) {
            animarPanel.JPanelYAbajo(150, 600, 10, 10, pnlRedes);
            animarPanel.JPanelYArriba(600, 500, 10, 1, pnlAcercaDe);
            animacionesRepetidas(pnlDescripcion, btnVolver, btnIniciarSesion, logo);
        }
    }

    /**
     * Metodo privado con el fin de ahorrar codigo con las animaciones
     * repetidas.
     *
     * @param pnlDescripcion-Panel descriptor del programa.
     * @param btnVolver-btn volver a inicio.
     * @param btnIniciarSesion - btn iniciar sesion .
     */
    private void animacionesRepetidas(JPanel pnlDescripcion, JLabel btnVolver, JLabel btnIniciarSesion, JLabel logo) {
        animarPanel.JPanelXIzquierda(1100, 400, 8, 10, pnlDescripcion);
        animarEtiqueta.JLabelYArriba(10, -50, 10, 5, btnVolver);
        animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btnIniciarSesion);
        animarEtiqueta.JLabelXDerecha(-270, 110, 15, 10, logo);

    }
}
