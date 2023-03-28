package ventana_inicio;

import ventana_alumnos.FrmAlumnos;
import ventana_maestros.FrmMaestros;
import javax.swing.JFrame;

/**
 * Esta clase se encarga de seleccionar la ventana que corresponde al tipo de
 * usuario seleccionado, esto se logra gracias a la implementacionde patron
 * factory, la implemtencion de esta clase se da luego de un refactoring general
 * en el codigo.
 *
 * Codigo creado por:
 *
 * @author enocgarcia
 * @since 21/01/2023
 */
public class UsuariosFactory {

    /**
     * El objeto "ventana" se crea para poder implementar de manera correcta el
     * patron ya mencionado
     */
    private JFrame ventana;

    /**
     * A como sabemos el patron factory usa el contructor parametrizado de la
     * clase.
     *
     * @param identificador -Almacena dos tipos de respuesta, Alumnos/Maestros.
     * dependiendo el caso se selecciona el jframe que corresponda
     */
    public UsuariosFactory(String identificador) {
        if ("Alumnos".equals(identificador)) {
            ventana = new FrmAlumnos();
        }
        if ("Maestros".equals(identificador)) {
            ventana = new FrmMaestros();
        }
    }

    /**
     * El siguiente metodo se encarga de abrir la ventana que haya sido
     * seleccionada anteriormente.
     */
    public void abrirVentana() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
