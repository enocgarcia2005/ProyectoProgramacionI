package animaciones;

import javax.swing.JLabel;

/**
 * Esta clase es la enncargada de dar el efecto de animacion slide a todo
 * componente de tipo JLabel.
 *
 * Tambien se aplica el patron Singleton, todo esto para ahorrar recrusos al
 * ejecutar el programa.
 *
 * Este codigo fue creado por:
 *
 * @author enocgarcia
 * @since 06/02/2023
 */
public class JLabelAnimaciones {

    /**
     * Objeto de la misma clase para pode realizar el patron SIngleton.
     */
    private static JLabelAnimaciones jLabelAnimaciones;

    /**
     * Constructor privado para no poder instanciar la clase.
     */
    private JLabelAnimaciones() {

    }

    /**
     * EL metodo getInstance se encarga de generar un objeto, si la variable es
     * nula crea una instancia y la returna, si no solamente la retorna
     *
     * @return jLabelAnimaciones
     */
    public static JLabelAnimaciones getInstance() {
        if (jLabelAnimaciones == null) {
            jLabelAnimaciones = new JLabelAnimaciones();
        }
        return jLabelAnimaciones;
    }

    /**
     * Este metodo crea el efecto slide hacia la izquiera, mediante el uso de
     * hilos y un ciclo while.
     *
     * @param start- posicion inicial del JLabel.
     * @param stop-posicion final del JLabel.
     * @param delay- retraso entre cada incremento.
     * @param increment- valor que incrementa hasta llega a la posicon final.
     * @param JLabel -Componente de Javax Swing.
     */
    public void JLabelXIzquierda(final int start, final int stop, final int delay, final int increment, final JLabel JLabel) {
        if (JLabel.getX() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getX() > stop) {
                        for (int i = start; i >= stop; i -= increment) {
                            try {
                                Thread.sleep(delay);
                                JLabel.setLocation(i, JLabel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(stop, JLabel.getY());
                }
            }.start();

        }

    }

    /**
     * Este metodo crea el efecto slide hacia la derecha, mediante el uso de
     * hilos y un ciclo while.
     *
     * @param start- posicion inicial del JLabel.
     * @param stop-posicion final del JLabel.
     * @param delay- retraso entre cada incremento.
     * @param increment- valor que incrementa hasta llega a la posicon final.
     * @param JLabel -Componente de Javax Swing.
     */
    public void JLabelXDerecha(final int start, final int stop, final int delay, final int increment, final JLabel JLabel) {
        if (JLabel.getX() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getX() < stop) {
                        for (int i = start; i <= stop; i += increment) {
                            try {
                                Thread.sleep(delay);
                                JLabel.setLocation(i, JLabel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(stop, JLabel.getY());
                }
            }.start();

        }

    }

    /**
     * Este metodo crea el efecto slide hacia la abajo, mediante el uso de hilos
     * y un ciclo while.
     *
     * @param start- posicion inicial del JLabel.
     * @param stop-posicion final del JLabel.
     * @param delay- retraso entre cada incremento.
     * @param increment- valor que incrementa hasta llega a la posicon final.
     * @param JLabel -Componente de Javax Swing.
     */
    public void JLabelYAbajo(final int start, final int stop, final int delay, final int increment, final JLabel JLabel) {
        if (JLabel.getY() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getY() < stop) {
                        for (int i = start; i <= stop; i += increment) {
                            try {
                                Thread.sleep(delay);
                                JLabel.setLocation(JLabel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(JLabel.getX(), stop);
                }
            }.start();

        }

    }

    /**
     * Este metodo crea el efecto slide hacia la arriba, mediante el uso de
     * hilos y un ciclo while.
     *
     * @param start- posicion inicial del JLabel.
     * @param stop-posicion final del JLabel.
     * @param delay- retraso entre cada incremento.
     * @param increment- valor que incrementa hasta llega a la posicon final.
     * @param JLabel -Componente de Javax Swing.
     */
    public void JLabelYArriba(final int start, final int stop, final int delay, final int increment, final JLabel JLabel) {
        if (JLabel.getY() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getY() > stop) {
                        for (int i = start; i >= stop; i -= increment) {
                            try {
                                Thread.sleep(delay);
                                JLabel.setLocation(JLabel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(JLabel.getX(), stop);
                }
            }.start();

        }

    }
}
