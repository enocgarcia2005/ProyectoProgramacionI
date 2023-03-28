package clases_globales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase se crea con el fin de separar las configuraciones de las tablas
 * del proyecto con el fin de reutilizar el mayor codigo posible.
 *
 * @author enocgarcia
 * @since 13/02/2023
 */
public class ConfiguracionesTabla {

    /**
     * Este metodo tiene la funcion de llenar una tabla con los datos del
     * fichero de texto que se le pase.
     *
     * @param archivo-FIchero de texto con la informacion.
     * @param modeloTabla- modelo de la tabla ya implementado.
     */
    public void llenarTabla(File archivo, DefaultTableModel modeloTabla) {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            Object[] filasTabla = leer.lines().toArray();
            for (int i = 0; i < filasTabla.length; i++) {
                String filaCompleta = filasTabla[i].toString();
                String[] filaElementosSeparados = filaCompleta.split(",");
                modeloTabla.addRow(filaElementosSeparados);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla: " + e);
        }
    }

    /**
     * Este metodo tiene la funcion de vaciar cualquier tabla llena de datos.
     *
     * @param tabla-Tabla que se quiere limpiar.
     */
    public void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int numeroFilas = tabla.getRowCount() - 1;
        for (int i = numeroFilas; i >= 0; i--) {
            modelo.removeRow(modelo.getRowCount() - 1);
        }
    }
}
