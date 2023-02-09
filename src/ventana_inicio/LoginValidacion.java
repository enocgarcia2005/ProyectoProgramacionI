package ventana_inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Esta clase es crreada con el fin de de implemetar las validaciones
 * correspondientes al login de la ventana de inicio.
 *
 * @author enocgarcia
 * @since 09/02/2023
 */
public class LoginValidacion {

    /**
     * La variable intentos almacena el numero de intentos erroneos que realiza
     * el usuarios, estos se reinician cada vez que el usuario ingresa de manera
     * correcta a su perfil.
     */
    private static int intentos;
    /**
     * Las variables usuario y contra almacenas el nombre de usuario y
     * contraseña respectivamente estos para ser comprobados con los que ingreso
     * el usuario.
     */
    private static String usuario, contra;

    /**
     * Este metodo tiene la funcion de dar el numero de intentos y poder
     * resetearlos cuando sea necesario.
     *
     * @param Intentos- numero de intentos erroneos.
     */
    public void setIntentos(int Intentos) {
        LoginValidacion.intentos = Intentos;
    }

    /**
     * El metodo autenticar tiene la funcion validar si el usuario y contraseña
     * coinciden o no con los almacenados en la base de datos.
     *
     * @param identificador-este parametro contiene el nombre del tipo de perfil
     * (alumno o maestro).
     * @param fichero-El fichero correspondiente al tipo de perfil que
     * corresponde.
     * @param nombreUsuario-nombre de usuario ingresados por el usuario
     * @param password- contraseña ingresado por el usuario.
     */
    public void autenticar(String identificador, File fichero, JTextField nombreUsuario, JTextField password) {
        int longitudArray = 0, indice = 0;
        String linea;
        String[] usuarios;
        try {
            Scanner escaner = new Scanner(fichero);
            FileReader archivo = new FileReader(fichero);
            BufferedReader leer = new BufferedReader(archivo);

            while ((linea = leer.readLine()) != null) {
                longitudArray++;
            }
            usuarios = new String[longitudArray];
            while (escaner.hasNext()) {
                usuarios[indice++] = escaner.nextLine();
            }
            intentos++;
            usuario = nombreUsuario.getText();
            contra = password.getText();

            Seguridad verificacion = new Seguridad();
            verificacion.validarUsuario(usuarios, usuario, contra, intentos, identificador);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la base de datos " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la base de datos " + ex.getMessage());
        }

    }
}
