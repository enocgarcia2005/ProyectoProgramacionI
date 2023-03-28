package clases_globales;

import javax.swing.JTextField;

/**
 * Esta clase se crea con el fin de realizar ajustes a los campos de texto
 * (JTextField), tales como efecto limpiar, inabilitarlos, y habilitarlos,etc.
 *
 * @author enocgarcia
 * @since 21/02/2021
 */
public class CamposTexto {

    /**
     * Este metodo se encarga de borrar el texto que se encuentra en uno o mas
     * JTextField, su implementecion permite poner de manera indefinida todos
     * los JTextField que quieras.
     *
     * @param camposTexto- campo de texto de tipo JTextField.
     */
    public void limpiarCampos(JTextField... camposTexto) {
        for (JTextField campoIndividual : camposTexto) {
            campoIndividual.setText("");
        }
    }

    /**
     * Este metodo se encarga de quitar la posibilidad de poder escribir en uno
     * o mas campos de textos segun sea caso, ya que su implementacion permite
     * poner de manera indefinida los campos de texto.
     *
     * @param camposTexto- campo de texto de tipo JTextField.
     */
    public void desactivarCampos(JTextField... camposTexto) {
        for (JTextField campoIndividual : camposTexto) {
            campoIndividual.setEditable(false);
        }
    }

    /**
     * Este metodo se encarga de dar la posibilidad de poder escribir en uno
     * o mas campos de textos que esten inhabilitados segun sea caso, ya que su implementacion permite
     * poner de manera indefinida los campos de texto.
     *
     * @param camposTexto- campo de texto de tipo JTextField.
     */
    public void activarCampos(JTextField... camposTexto) {
        for (JTextField campoIndividual : camposTexto) {
            campoIndividual.setEditable(true);
        }
    }
}
