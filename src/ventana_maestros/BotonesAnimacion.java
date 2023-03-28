package ventana_maestros;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta clase fue creada con el fin de crear el efecto slider al presionar
 * botones en el Frame Maestros.
 *
 * @author enocgarcia
 * @since 10/02/2023
 */
public class BotonesAnimacion {

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
     * Este metodo tiene la funcion de crear el efecto slide al presionar el btn
     * de control de notas, recibe los siguientes 3 parametros:
     *
     * @param pnlNotas- El panel que contiene las notas.
     * @param btnNotas-El boton que dirige a las notas.
     * @param pnlBienvenida- El panel que se muestra al iniciar sesion.
     */
    public void animarBotonNotas(JPanel pnlNotas, JLabel btnNotas, JPanel pnlBienvenida) {
        if (pnlNotas.getY() == 600 && btnNotas.getY() == 380 && pnlBienvenida.getY() == 10) {
            animarPanel.JPanelYArriba(10, -380, 10, 10, pnlBienvenida);
            animarEtiqueta.JLabelYAbajo(380, 600, 10, 10, btnNotas);
            animarPanel.JPanelYArriba(600, 10, 10, 10, pnlNotas);
        }
    }

    /**
     * Este metodo tiene la funcion de crear el efecto slide al presionar el btn
     * de Regresar a inicio, recibe los siguientes 3 parametros:
     *
     * @param pnlNotas- El panel que contiene las notas.
     * @param btnNotas-El boton que dirige a las notas.
     * @param pnlBienvenida- El panel que se muestra al iniciar sesion.
     */
    public void animarBotonRegresar(JPanel pnlNotas, JLabel btnNotas, JPanel pnlBienvenida) {
        if (pnlNotas.getY() == 10 && btnNotas.getY() == 600 && pnlBienvenida.getY() == -380) {
            animarPanel.JPanelYArriba(-380, 10, 10, 10, pnlBienvenida);
            animarEtiqueta.JLabelYAbajo(600, 380, 10, 10, btnNotas);
            animarPanel.JPanelYArriba(10, 600, 10, 10, pnlNotas);
        }
    }
}
