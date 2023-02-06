package ventana_inicio;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author enocgarcia
 */
public class AcercaDeNosotrosAnimacion {

    JLabelAnimaciones animarEtiqueta = JLabelAnimaciones.getInstance();
    JPanelAnimaciones animarPanel = JPanelAnimaciones.getInstance();

    public void quitarPantallaPrincipal(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver, JLabel logo, JPanel pnlDescripcion) {
        if (logo.getX() == 110 && pnlDescripcion.getX() == 400) {
            animarEtiqueta.JLabelXIzquierda(110, -270, 15, 10, logo);
            animarPanel.JPanelXDerecha(400, 1100, 8, 10, pnlDescripcion);
            animacionesRepetidas(pnlAcercaDe, pnlRedes, btnVolver);
        }
    }

    public void quitarPantallaLogin(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver, JLabel btn, JPanel pnlLogin) {
        if (pnlLogin.getY() == 150) {
            animarPanel.JPanelYAbajo(150, 600, 10, 10, pnlLogin);
            animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btn);
            animacionesRepetidas(pnlAcercaDe, pnlRedes, btnVolver);
        }
    }

    private void animacionesRepetidas(JPanel pnlAcercaDe, JPanel pnlRedes, JLabel btnVolver) {
        animarPanel.JPanelYAbajo(500, 600, 10, 10, pnlAcercaDe);
        animarPanel.JPanelYArriba(600, 150, 10, 10, pnlRedes);
        animarEtiqueta.JLabelYAbajo(-50, 10, 10, 10, btnVolver);
    }
}
