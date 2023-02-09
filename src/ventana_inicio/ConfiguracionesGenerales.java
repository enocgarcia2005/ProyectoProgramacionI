package ventana_inicio;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

/**
 * Esta clase contiene todas las configuraciones generales de la ventana de
 * inicio(coloreado,place holder, links,etc).
 *
 * @author enocgarcia Codigo creado:
 * @since 06/02/2023
 */
public class ConfiguracionesGenerales {

    /**
     * El objeto "GRIS" almacena el codigo RGB del color que indica su nombre,
     * por ello esta creado de tipo estatica.
     */
    private final Color GRIS = new Color(153, 153, 153);
    /**
     * El objeto "NEGRO" almacena el codigo RGB del color que indica su nombre,
     * por ello esta creado de tipo estatica.
     */
    private final Color NEGRO = new Color(0, 0, 0);

    /**
     * El metodo colorearEtiqueta, como su nombre inidica se encarga de darle
     * color a los JLabel, de tal forma que parezcan botones, es decir colorea
     * los bordes y fuente de texto.
     *
     * @param color-Objeto de la clase color.
     * @param boton- La etiqueta que deseamos "transformar" en boton.
     */
    public void colorearEtiqueta(Color color, JLabel boton) {
        boton.setBorder(new EtchedBorder(1, color, color));
        boton.setForeground(color);

    }

    /**
     * Este metodo se encarga de crear el efecto place holder en el login, es
     * decir el campo de texto mantiene un texto por defecto hasta que no es
     * cambiado por uno diferente.
     *
     * @param campoSeleccionado-El txt que el usuario hizo click.
     * @param campoSecundario- El txt que esta libre.
     * @param textoCambio-El texto que tiene el campo seleccionado.
     * @param textoDefecto-El texto que tiene el campo que no esta en uso.
     */
    public void crearPlaceHolder(JTextField campoSeleccionado, JTextField campoSecundario, String textoCambio, String textoDefecto) {
        if (campoSeleccionado.getText().equalsIgnoreCase(textoCambio)) {
            campoSeleccionado.setText("");
            campoSeleccionado.setForeground(NEGRO);
        }
        if (campoSecundario.getText().isEmpty()) {
            campoSecundario.setText(textoDefecto);
            campoSecundario.setForeground(GRIS);
        }
    }

    /**
     * Este metodo se encarga de abrir la url que tu le pases en tu navegador
     * web, es decir te manda fuera del programa, por ende todo lo que hagas
     * ahi, no tiene relacion con el funcionamiento del programa.
     *
     * @param url -direccion url
     */
    public void redirigir(String url) {
        try {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este metodo se necarga de mostrar un pequeña ventana con el texto "¿Estas
     * seguro que quieres salir?", con las opciones aceptar y cancelar, esto
     * para ebitar que el usuario cierre el programa por error
     */
    public void confirmarSalir() {
        int salir = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?");
        if (salir == 0) {
            System.exit(0);
        }
    }
}
