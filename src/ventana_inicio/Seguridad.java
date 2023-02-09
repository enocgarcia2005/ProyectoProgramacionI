package ventana_inicio;

import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de verificar si los usuarios y contraseñas son
 * correctos para que de esta manera la siguiente ventana solo se abra al
 * ingresar los datos correctamente.
 *
 * Si los datos no coinciden se suma un intento erroneo, al acumular 5 de estos
 * el programa se detendra.
 *
 * Este codigo fue creado por:
 *
 * @author enocgarcia
 * @since 20/10/2022
 */
public class Seguridad {

    /**
     * El objeto "inicio" se crea con el fin de poder implementar el reinico de
     * intentos fallidos en el login..
     */
    LoginValidacion inicio = new LoginValidacion();

    /**
     * El metodo funciona con 5 parametros:
     *
     * @param usuarios -Arreglo de usuarios almacenados en la base de datos.
     * @param nombreUsuario -almacena el nombre de usuario ingresado en el
     * programa.
     * @param contra -almacena la contraseña ingresada en el programa.
     * @param intentos - sirve como contador de intentos erroneos.
     * @param identificador -identifica el tipo de usuario que se esta
     * ingresando.
     *
     * En un ciclo for se recorren todos los usuarios y mediante una variable
     * interna (encontrado) de tipo boolean se logra determinar si coinciden o
     * no los datos,esta variable inicialmente igualada a false, si el usuario y
     * contra coinciden esta se iguala a true, si no permanece igual, una vez
     * recorrido el for si la variable encontrado es verdadera se abre la
     * ventana correspondiente al tipo de usuario, si no lansa un mensaje que
     * notifica que los datos son erroneos, y se suma un intento erroneo.
     */
    public void validarUsuario(String usuarios[], String nombreUsuario, String contra, int intentos, String identificador) {
        boolean encontrado = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(nombreUsuario) && usuarios[i + 1].equals(contra)) {
                encontrado = true;
                intentos = 0;
                inicio.setIntentos(intentos);
            }
        }
        if (encontrado == true) {
            UsuariosFactory elecccionVentana = new UsuariosFactory(identificador);
            elecccionVentana.abrirVentana();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o  contraseña incorrectos  \nIntentos erroneos:" + intentos);
        }
        if (intentos > 5) {
            System.exit(0);
        }
    }
}
