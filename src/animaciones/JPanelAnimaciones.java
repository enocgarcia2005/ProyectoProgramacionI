package animaciones;

import javax.swing.JPanel;

/**
 * Esta clase es la enncargada de dar el efecto de animacion slide a todo
 * componente de tipo JPanel.
 *
 * Tambien se aplica el patron Singleton, todo esto para ahorrar recrusos al
 * ejecutar el programa.
 *
 * Este codigo fue creado por:
 *
 * @author enocgarcia
 * @since 06/02/2023
 */
public class JPanelAnimaciones {

    /**
     * Objeto de la misma clase para pode realizar el patron SIngleton.
     */
    private static JPanelAnimaciones jPanelAnimaciones;

    /**
     * Constructor privado para no poder instanciar la clase.
     */
    private JPanelAnimaciones() {

    }

    /**
     * EL metodo getInstance se encarga de generar un objeto, si la variable es
     * nula crea una instancia y la returna, si no solamente la retorna
     *
     * @return jLabelAnimaciones
     */
    public static JPanelAnimaciones getInstance() {
        if (jPanelAnimaciones == null) {
            jPanelAnimaciones = new JPanelAnimaciones();
        }
        return jPanelAnimaciones;
    }

    /**
     * Este metodo crea el efecto slide hacia la izquiera, mediante el uso de
     * hilos y un ciclo while.
     *
     * @param start- posicion inicial del JLabel.
     * @param stop-posicion final del JLabel.
     * @param delay- retraso entre cada incremento.
     * @param increment- valor que incrementa hasta llega a la posicon final.
     * @param JPanel -Componente de Javax Swing.
     */
    public void JPanelXIzquierda(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getX() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getX() > stop) {
                        for (int i = start; i >= stop; i -= increment) {
                            try {
                                Thread.sleep(delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(stop, JPanel.getY());
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
     * @param JPanel -Componente de Javax Swing.
     */
    public void JPanelXDerecha(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getX() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getX() < stop) {
                        for (int i = start; i <= stop; i += increment) {
                            try {
                                Thread.sleep(delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(stop, JPanel.getY());
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
     * @param JPanel -Componente de Javax Swing.
     */
    public void JPanelYAbajo(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getY() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getY() < stop) {
                        for (int i = start; i <= stop; i += increment) {
                            try {
                                Thread.sleep(delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), stop);
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
     * @param JPanel -Componente de Javax Swing.
     */
    public void JPanelYArriba(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getY() == start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getY() > stop) {
                        for (int i = start; i >= stop; i -= increment) {
                            try {
                                Thread.sleep(delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), stop);
                }
            }.start();

        }

    }
}
