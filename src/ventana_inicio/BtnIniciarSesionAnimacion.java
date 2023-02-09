package ventana_inicio;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * Esta clase tiene como funcion realizar las animaciones correspondientes al
 * hacer click en el boton iniciar sesion del Frame Inicio.
 *
 * nota: Los if dentro de los metodos sirven para evitar bugs en las animaciones
 *
 * @author enocgarcia
 * @since 28/01/2023
 */
public class BtnIniciarSesionAnimacion {

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
     * Este metodo se encarga de quitar la pantalla de inicio para mostrar la de
     * inicio de sesion, solo si nos encontramos en la pantalla ya mencionada,
     * de lo contrario no hara nada.
     *
     * @param pnlDescripcion- Panel que describe el programa.
     * @param lblLogo- Logo del programa.
     * @param pnlLogin- Panel que contiene el inicio de sesion.
     * @param btnVolver- Etiqueta que sirve como boton de Volver a inicio.
     * @param btnIniciarS- Etiqueta que sirve como boton para activar la
     * animacion.
     *
     */
    public void quitarPantallaInicio(JPanel pnlDescripcion, JLabel lblLogo, JPanel pnlLogin, JLabel btnVolver, JLabel btnIniciarS) {
        if (lblLogo.getX() == 110 && pnlDescripcion.getX() == 400) {
            animarEtiqueta.JLabelXIzquierda(110, -270, 15, 10, lblLogo);
            animarPanel.JPanelXDerecha(400, 1100, 8, 10, pnlDescripcion);
            animarBotonesYPanelLogin(pnlLogin, btnVolver, btnIniciarS);
        }

    }

    /**
     * Este metodo se encarga de quitar la pantalla de Acerca de nosotros para
     * mostrar la de inicio de sesion, solo si nos encontramos en la pantalla ya
     * mencionada, de lo contrario no hara nada.
     *
     * @param pnlRedesSociales-Panel con las redes del desarrollador del
     * programa.
     * @param pnlAcercaDe- Panel con el boton acerca de Nosotros.
     * @param pnlLogin- Panel que contiene el inicio de sesion.
     * @param btnVolver-Etiqueta que sirve como boton de Volver a inicio.
     * @param btnIniciarS- Etiqueta que sirve como boton para activar la
     * animacion.
     */
    public void quitarPantallaAcercaDeNosotros(JPanel pnlRedesSociales, JPanel pnlAcercaDe, JPanel pnlLogin, JLabel btnVolver, JLabel btnIniciarS) {
        if (pnlRedesSociales.getY() == 150 && pnlAcercaDe.getY() == 600) {
            animarPanel.JPanelYAbajo(150, 600, 10, 10, pnlRedesSociales);
            animarPanel.JPanelYArriba(600, 500, 10, 1, pnlAcercaDe);
            animarBotonesYPanelLogin(pnlLogin, btnVolver, btnIniciarS);
        }

    }

    /**
     * Este metodo solo tiene un proposito, reutilizar el codigo en los 2
     * metodos anteriores, ya que se repetia en ambos.
     *
     * @param pnlLogin- Panel que contiene el inicio de sesion.
     * @param btnVolver-Etiqueta que sirve como boton de Volver a inicio.
     * @param btnIniciarS- Etiqueta que sirve como boton para activar la
     * animacion.
     */
    private void animarBotonesYPanelLogin(JPanel pnlLogin, JLabel btnVolver, JLabel btnIniciarS) {
        animarPanel.JPanelYArriba(600, 150, 10, 10, pnlLogin);
        animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btnVolver);
        animarEtiqueta.JLabelYArriba(10, -50, 10, 10, btnIniciarS);
    }
}
