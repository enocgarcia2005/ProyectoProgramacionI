package Ventanas;

import javax.swing.JOptionPane;

public class Seguridad {
    
    Inicio inicio = new Inicio();
    
    public void ValidarUsuario(String Usuarios[], String Usuario, String Contra, int Intentos, String Identificador) {
        boolean encontrado = false;
        
        for (int i = 0; i < Usuarios.length; i++) {
            if (Usuarios[i].equalsIgnoreCase(Usuario) && Usuarios[i + 1].equals(Contra)) {
                String res = Usuario;
                encontrado = true;
                Intentos = 0;
                inicio.setIntentos(Intentos);
                if (encontrado == true) {
                    if ("Alumnos".equals(Identificador)) {
                        FrmAlumnos abrir = new FrmAlumnos();
                        abrir.setVisible(true);
                        abrir.setUser(res);
                        abrir.setLocationRelativeTo(null);
                        
                    }
                    
                    if ("Maestros".equals(Identificador)) {
                        FrmMaestros abrir = new FrmMaestros();
                        abrir.setVisible(true);
                        FrmMaestros.setUser(res);
                        abrir.setLocationRelativeTo(null);
                    }
                }
                break;
            }
            
        }
        
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Usuario y/o  contraseña incorrectos  \nIntentos erroneos:" + Intentos);
            
        }
        if (Intentos > 5) {
            System.exit(0);
        }
    }
}
