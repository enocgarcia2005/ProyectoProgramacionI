package Animaciones;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Animaciones {

    public void JComboBoxXIzquierda(final int Start, final int Stop, final int Delay, final int Increment, final JComboBox JComboBox) {
        if (JComboBox.getX() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JComboBox.getX() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JComboBox.setLocation(i, JComboBox.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JComboBox.setLocation(Stop, JComboBox.getY());
                }
            }.start();

        }

    }

    public void JPanelXIzquierda(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getX() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getX() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(Stop, JPanel.getY());
                }
            }.start();

        }

    }

    public void JPanelXDerecha(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getX() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getX() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(Stop, JPanel.getY());
                }
            }.start();

        }

    }

    public void JPanelYAbajo(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getY() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), Stop);
                }
            }.start();

        }

    }

    public void JPanelYArriba(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JPanel.getY() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), Stop);
                }
            }.start();

        }

    }
       public void JLabelXIzquierda(final int Start, final int Stop, final int Delay, final int Increment, final JLabel JLabel) {
        if (JLabel.getX() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getX() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JLabel.setLocation(i, JLabel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(Stop, JLabel.getY());
                }
            }.start();

        }

    }

    public void JLabelXDerecha(final int Start, final int Stop, final int Delay, final int Increment, final JLabel JLabel) {
        if (JLabel.getX() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getX() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JLabel.setLocation(i, JLabel.getY());
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(Stop, JLabel.getY());
                }
            }.start();

        }

    }

    public void JLabelYAbajo(final int Start, final int Stop, final int Delay, final int Increment, final JLabel JLabel) {
        if (JLabel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getY() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JLabel.setLocation(JLabel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(JLabel.getX(), Stop);
                }
            }.start();

        }

    }

    public void JLabelYArriba(final int Start, final int Stop, final int Delay, final int Increment, final JLabel JLabel) {
        if (JLabel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JLabel.getY() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JLabel.setLocation(JLabel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JLabel.setLocation(JLabel.getX(), Stop);
                }
            }.start();

        }

    }

      public void JTabPanelYAbajo(final int Start, final int Stop, final int Delay, final int Increment, final JTabbedPane JTabPanel) {
        if (JTabPanel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JTabPanel.getY() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JTabPanel.setLocation(JTabPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JTabPanel.setLocation(JTabPanel.getX(), Stop);
                }
            }.start();

        }

    }

    public void JTabPanelArriba(final int Start, final int Stop, final int Delay, final int Increment, final JTabbedPane JTabPanel) {
        if (JTabPanel.getY() == Start) {
            new Thread() {
                @Override
                public void run() {
                    while (JTabPanel.getY() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JTabPanel.setLocation(JTabPanel.getX(), i);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    JTabPanel.setLocation(JTabPanel.getX(), Stop);
                }
            }.start();

        }

    }

}
