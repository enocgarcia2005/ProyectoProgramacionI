package ventana_maestros;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class FrmMaestros extends javax.swing.JFrame {


    /*Arrays*/
    final String[] ENCABEZADO_COLUMNAS = {"Nombres y Apellidos", "N de Carnet",
        "Asignatura", "I parcial", "II parcial", "Acumulado", "Nota Final"};
    String[][] informacion = {};
    ArrayList<Datos> datosTabla = new ArrayList<>();
    /*Objetos*/
    JLabelAnimaciones animarEtiqueta =  JLabelAnimaciones.getInstance();
    JPanelAnimaciones animarPanel=JPanelAnimaciones.getInstance();
    Datos datosAcademicos = new Datos();
    DefaultTableModel modeloTabla = new DefaultTableModel(informacion, ENCABEZADO_COLUMNAS);
    File notas = new File("Notas.txt");
    /*variables constantes*/
    //colores
    private final Color BLANCO = new Color(255, 255, 255);
    private final Color VERDE_OSCURO = new Color(51, 153, 0);
    private final Color VERDE_CLARO = new Color(51, 180, 0);
    //enteros
    private final int ALTURA_FILAS = 25;
    private final int ANCHO_COLUMNAS = 200;
    //fuentes
    private final Font TIMES_NEW_ROMAN = new Font("Times New Roman", Font.PLAIN, 18);

    /*variables estaticas*/
    //variables comunes
    private String nombresAlumno;
    private String numeroCarnet;
    private String asignatura;
    private double notaPrimerParcial;
    private double notaSegundoParcial;
    private double notaAcumulado;
    private double notaFinal;
    private String registroModificado;
    private String registroNormal;
    private String registro;

    public FrmMaestros() {
        initComponents();
        configTable(modeloTabla);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        mostrarInfoEnCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnControldeNotas = new javax.swing.JLabel();
        pnlBienvenida = new javax.swing.JPanel();
        lblElegir = new javax.swing.JLabel();
        lblTituloBienvenida = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        PnlModificar = new javax.swing.JPanel();
        cbxOpcionesModificar = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        pnlControlNotas = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblSegundoParcial = new javax.swing.JLabel();
        txtSegundoParcial = new javax.swing.JTextField();
        lblCarnet = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblAcumulado = new javax.swing.JLabel();
        lblPrimerParcial = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();
        txtPrimerParcial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistroNotas = new javax.swing.JTable();
        lblTituloTabla = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit-2.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        btnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        background.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 1, 36, 36));

        btnControldeNotas.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnControldeNotas.setForeground(new java.awt.Color(51, 153, 0));
        btnControldeNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnControldeNotas.setText("Control de notas");
        btnControldeNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnControldeNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControldeNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnControldeNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnControldeNotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnControldeNotasMousePressed(evt);
            }
        });
        background.add(btnControldeNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 290, 150));

        pnlBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        lblElegir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblElegir.setForeground(new java.awt.Color(51, 153, 0));
        lblElegir.setText("Elija una opcion");

        lblTituloBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblTituloBienvenida.setForeground(new java.awt.Color(51, 153, 0));
        lblTituloBienvenida.setText("Bienvenid@ Maestr@ a Grading System");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good-mark-2.png"))); // NOI18N

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblTituloBienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(lblElegir)
                        .addGap(246, 246, 246))))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblElegir)
                .addContainerGap())
        );

        background.add(pnlBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -380, 640, 360));

        PnlModificar.setBackground(new java.awt.Color(255, 255, 255));
        PnlModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxOpcionesModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxOpcionesModificar.setForeground(new java.awt.Color(51, 153, 0));
        cbxOpcionesModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres y Apellidos", "N de Carnet", "Asignatura", "I parcial", "II parcial", "Acumulado" }));
        cbxOpcionesModificar.setSelectedIndex(-1);
        cbxOpcionesModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        PnlModificar.add(cbxOpcionesModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        lblModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(51, 153, 0));
        lblModificar.setText("Seleccione el campo a Modificar");
        PnlModificar.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        btnSeleccionar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(51, 153, 0));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        PnlModificar.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        btnVolver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 153, 0));
        btnVolver.setText("Regresar");
        btnVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        PnlModificar.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, -1));

        btnGuardarCambios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(51, 153, 0));
        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        PnlModificar.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 60, -1));

        background.add(PnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 490, 240, 100));

        pnlControlNotas.setBackground(new java.awt.Color(255, 255, 255));
        pnlControlNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 153, 0));
        lblTitulo.setText("Control de Notas");
        pnlControlNotas.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        lblNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(51, 153, 0));
        lblNombres.setText("Nombres y apellidos de el/la estudiante:");
        pnlControlNotas.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNombres.setBorder(null);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        pnlControlNotas.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 580, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 590, 10));

        lblSegundoParcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSegundoParcial.setForeground(new java.awt.Color(51, 153, 0));
        lblSegundoParcial.setText("II parcial:");
        pnlControlNotas.add(lblSegundoParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        txtSegundoParcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSegundoParcial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSegundoParcial.setBorder(null);
        txtSegundoParcial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoParcialKeyTyped(evt);
            }
        });
        pnlControlNotas.add(txtSegundoParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 110, -1));

        lblCarnet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCarnet.setForeground(new java.awt.Color(51, 153, 0));
        lblCarnet.setText("N de Carnet:");
        pnlControlNotas.add(lblCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtCarnet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCarnet.setBorder(null);
        pnlControlNotas.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 10));

        lblAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAcumulado.setForeground(new java.awt.Color(51, 153, 0));
        lblAcumulado.setText("Acumulado:");
        pnlControlNotas.add(lblAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        lblPrimerParcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPrimerParcial.setForeground(new java.awt.Color(51, 153, 0));
        lblPrimerParcial.setText("I parcial:");
        pnlControlNotas.add(lblPrimerParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        txtAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAcumulado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcumulado.setBorder(null);
        txtAcumulado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcumuladoKeyTyped(evt);
            }
        });
        pnlControlNotas.add(txtAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 110, -1));

        txtPrimerParcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrimerParcial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrimerParcial.setBorder(null);
        txtPrimerParcial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerParcialKeyTyped(evt);
            }
        });
        pnlControlNotas.add(txtPrimerParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 110, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 110, 10));

        jSeparator5.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 110, 10));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 153, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlControlNotas.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 100, -1));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(51, 153, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlControlNotas.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 85, 100, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(51, 153, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("Volver a la pantalla de inicio");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlControlNotas.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 100, -1));

        tbRegistroNotas.setAutoCreateRowSorter(true);
        tbRegistroNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        tbRegistroNotas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbRegistroNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tbRegistroNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbRegistroNotas.setGridColor(new java.awt.Color(0, 0, 0));
        tbRegistroNotas.setRowHeight(25);
        tbRegistroNotas.setSelectionBackground(new java.awt.Color(0, 204, 0));
        tbRegistroNotas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbRegistroNotas.setShowHorizontalLines(true);
        tbRegistroNotas.setShowVerticalLines(true);
        tbRegistroNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRegistroNotasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbRegistroNotas);

        pnlControlNotas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1080, 290));

        lblTituloTabla.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTituloTabla.setForeground(new java.awt.Color(51, 153, 0));
        lblTituloTabla.setText("Listado de Estudiantes");
        pnlControlNotas.add(lblTituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        lblAsignatura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAsignatura.setForeground(new java.awt.Color(51, 153, 0));
        lblAsignatura.setText("Asignatura:");
        pnlControlNotas.add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        txtAsignatura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAsignatura.setBorder(null);
        txtAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAsignaturaKeyTyped(evt);
            }
        });
        pnlControlNotas.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, -1));

        jSeparator6.setForeground(new java.awt.Color(51, 153, 0));
        pnlControlNotas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 130, 10));

        btnModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(51, 153, 0));
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Volver a la pantalla de inicio");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlControlNotas.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 100, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 153, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Volver a la pantalla de inicio");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlControlNotas.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 155, 100, -1));

        background.add(pnlControlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 1080, 540));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "Profe \n¿Estas seguro que quieres cerrar sesion?");
        if (salir == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnControldeNotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControldeNotasMousePressed
        animacionesBtnControlDeNotas();
    }//GEN-LAST:event_btnControldeNotasMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        animarPanel.JPanelYAbajo(-380, 10, 10, 10, pnlBienvenida);
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        animacionesBtnRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnControldeNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControldeNotasMouseEntered
        if (btnControldeNotas.getY() == 380) {
            btnControldeNotas.setForeground(VERDE_CLARO);
        }
    }//GEN-LAST:event_btnControldeNotasMouseEntered

    private void btnControldeNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControldeNotasMouseExited
        if (btnControldeNotas.getY() == 380) {
            btnControldeNotas.setForeground(VERDE_OSCURO);
        }
    }//GEN-LAST:event_btnControldeNotasMouseExited

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        activarCampos();
        txtNombres.requestFocus();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarEnFichero();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (cbxOpcionesModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una opcion");
        } else if (camposVacios()) {
            //este condicion es una medida de seguridad si el boton modificar se puede seleccionar sin haber hecho click en la tabla
            JOptionPane.showMessageDialog(null, "Seleccione un registro");
        } else {
            SeleccionCbxModificar();
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        animarPanel.JPanelXIzquierda(20, -300, 15, 10, PnlModificar);
        desactivarCampos();
        limpiarCampos();
        cbxOpcionesModificar.setSelectedIndex(-1);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnRegresar.setEnabled(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (cbxOpcionesModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Primero selleccione un campo y realize los cambios correspondientes");
        } else {
            modificarFichero("", "");
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        animarPanel.JPanelXDerecha(-300, 20, 15, 10, PnlModificar);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnRegresar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tbRegistroNotas.getRowCount() == 1) {
            JOptionPane.showMessageDialog(null, "La tabla no puede estar vacia");
        } else {
            eliminar();
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbRegistroNotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegistroNotasMousePressed
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_tbRegistroNotasMousePressed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtSegundoParcialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoParcialKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtSegundoParcialKeyTyped

    private void txtAcumuladoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcumuladoKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtAcumuladoKeyTyped

    private void txtPrimerParcialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerParcialKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtPrimerParcialKeyTyped

    private void txtAsignaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAsignaturaKeyTyped

    }//GEN-LAST:event_txtAsignaturaKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMaestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMaestros().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlModificar;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnControldeNotas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxOpcionesModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAcumulado;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblElegir;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPrimerParcial;
    private javax.swing.JLabel lblSegundoParcial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloBienvenida;
    private javax.swing.JLabel lblTituloTabla;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JPanel pnlControlNotas;
    private javax.swing.JTable tbRegistroNotas;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPrimerParcial;
    private javax.swing.JTextField txtSegundoParcial;
    // End of variables declaration//GEN-END:variables
    /*Codigo animaciones*/

    public void animacionesBtnControlDeNotas() {
        if (pnlControlNotas.getY() == 600 && btnControldeNotas.getY() == 380 && pnlBienvenida.getY() == 10) {
            animarPanel.JPanelYArriba(10, -380, 10, 10, pnlBienvenida);
            animarEtiqueta.JLabelYAbajo(380, 600, 10, 10, btnControldeNotas);
            animarPanel.JPanelYArriba(600, 10, 10, 10, pnlControlNotas);
        }
    }

    public void animacionesBtnRegresar() {
        if (pnlControlNotas.getY() == 10 && btnControldeNotas.getY() == 600 && pnlBienvenida.getY() == -380) {
            animarPanel.JPanelYArriba(-380, 10, 10, 10, pnlBienvenida);
            animarEtiqueta.JLabelYAbajo(600, 380, 10, 10, btnControldeNotas);
            animarPanel.JPanelYArriba(10, 600, 10, 10, pnlControlNotas);
            limpiarCampos();
        }
    }

    //codigo encargado de la personalizacion del JTable
    public void configTable(DefaultTableModel modeloTabla) {
        tbRegistroNotas.setModel(modeloTabla);
        tbRegistroNotas.getTableHeader().setFont(TIMES_NEW_ROMAN);
        tbRegistroNotas.getTableHeader().setOpaque(false);
        tbRegistroNotas.getTableHeader().setBackground(VERDE_OSCURO);
        tbRegistroNotas.getTableHeader().setForeground(BLANCO);
        tbRegistroNotas.setRowHeight(ALTURA_FILAS);
        tbRegistroNotas.getColumnModel().getColumn(0).setPreferredWidth(ANCHO_COLUMNAS);
    }

    //metodo campos vacios
    public boolean camposVacios() {
        return txtNombres.getText().isEmpty() || txtCarnet.getText().isEmpty()
                || txtAcumulado.getText().isEmpty() || txtPrimerParcial.getText().isEmpty()
                || txtSegundoParcial.getText().isEmpty() || txtAsignatura.getText().isEmpty();
    }

    //Este metodo muestra los datos en los Jtextfields y comboBoxs cuando se hace click en una fila de la tabla
    public void mostrarInfoEnCampos() {
        tbRegistroNotas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_Event) {
                JTable tabla = (JTable) Mouse_Event.getSource();
                Point coordenadas = Mouse_Event.getPoint();
                int fila = tabla.rowAtPoint(coordenadas);
                if (Mouse_Event.getClickCount() == 1) {
                    txtNombres.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 0).toString());
                    txtCarnet.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 1).toString());
                    txtAsignatura.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 2).toString());
                    txtPrimerParcial.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 3).toString());
                    txtSegundoParcial.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 4).toString());
                    txtAcumulado.setText(tbRegistroNotas.getValueAt(tbRegistroNotas.getSelectedRow(), 5).toString());

                    desactivarCampos();
                }
            }
        });
    }

    // Metodos que configuran la tabla par que muestre los datos correctamente
    public void llenarTabla() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(notas));
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

    public void limpiarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) tbRegistroNotas.getModel();
        int numeroFilas = tbRegistroNotas.getRowCount() - 1;
        for (int i = numeroFilas; i >= 0; i--) {
            tabla.removeRow(tabla.getRowCount() - 1);
        }
    }

    //Este metodo se encarga de guardar los datos en el txt
    public void guardarEnFichero() {
        if (camposVacios()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");
        } else {
            dividirRegistroEnVariables(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado);
            calculoNotaFinal(notaPrimerParcial, notaSegundoParcial, notaAcumulado);
            registro = registroString(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado, notaFinal);

            try (FileWriter escribir = new FileWriter(notas, true)) {
                escribir.write(registro);
                escribir.write(System.getProperty("line.separator"));
                JOptionPane.showMessageDialog(this, "Guardado Correctamente");

                limpiarTabla();
                llenarTabla();
                limpiarCampos();
                desactivarCampos();
            } catch (IOException e) {
            }
        }
    }

    //Este metodo se encarga de limpiar campos
    public void limpiarCampos() {
        txtNombres.setText("");
        txtCarnet.setText("");
        txtPrimerParcial.setText("");
        txtSegundoParcial.setText("");
        txtAcumulado.setText("");
        txtAsignatura.setText("");
    }

    //Este metodo inhabilita los txt
    public void desactivarCampos() {
        txtNombres.setEditable(false);
        txtCarnet.setEditable(false);
        txtPrimerParcial.setEditable(false);
        txtSegundoParcial.setEditable(false);
        txtAcumulado.setEditable(false);
        txtAsignatura.setEditable(false);
    }

    //Este metodo habilita los txt
    public void activarCampos() {
        txtNombres.setEditable(true);
        txtCarnet.setEditable(true);
        txtPrimerParcial.setEditable(true);
        txtSegundoParcial.setEditable(true);
        txtAcumulado.setEditable(true);
        txtAsignatura.setEditable(true);
    }
    //Este metodo vincula el CbxModificar con los campos ingresados

    public void SeleccionCbxModificar() {
        switch (cbxOpcionesModificar.getSelectedIndex()) {

            case 0 -> {
                desactivarCampos();
                txtNombres.setEditable(true);
                txtNombres.requestFocus();
            }
            case 1 -> {
                desactivarCampos();
                txtCarnet.setEditable(true);
                txtCarnet.requestFocus();
            }
            case 2 -> {
                desactivarCampos();
                txtAsignatura.setEditable(true);
                txtAsignatura.requestFocus();
            }
            case 3 -> {
                desactivarCampos();
                txtPrimerParcial.setEditable(true);
                txtPrimerParcial.requestFocus();
            }
            case 4 -> {
                desactivarCampos();
                txtSegundoParcial.setEditable(true);
                txtSegundoParcial.requestFocus();
            }
            case 5 -> {
                desactivarCampos();
                txtAcumulado.setEditable(true);
                txtAcumulado.requestFocus();
            }
        }
        dividirRegistroEnVariables(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado);
        calculoNotaFinal(notaPrimerParcial, notaSegundoParcial, notaAcumulado);
        registroString(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado, notaFinal);
        registroNormal = registro;
    }

    //Este metodo se encarga de Modificar valores dentro del archivo txt
    public void modificarFichero(String linea, String nombreFichero) {
        dividirRegistroEnVariables(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado);
        calculoNotaFinal(notaPrimerParcial, notaSegundoParcial, notaAcumulado);
        registroString(nombresAlumno, numeroCarnet, asignatura, notaPrimerParcial, notaSegundoParcial, notaAcumulado, notaFinal);
        registroModificado = registro;

        String nombreTemporalFichero = "Modificar2.txt";
        File ficheroNuevo = new File(nombreTemporalFichero);

        try {

            BufferedReader leer;
            FileWriter sobreEscribirDatos;
            try (FileReader archivo = new FileReader(notas)) {
                leer = new BufferedReader(archivo);
                sobreEscribirDatos = new FileWriter(ficheroNuevo);
                while ((linea = leer.readLine()) != null) {
                    String escribir = linea;
                    if (linea.equals(registroNormal)) {

                        sobreEscribirDatos.write(registroModificado);
                        sobreEscribirDatos.write(System.getProperty("line.separator"));
                    } else if (linea.equalsIgnoreCase(escribir)) {
                        System.out.println(escribir);
                        sobreEscribirDatos.write(escribir);
                        sobreEscribirDatos.write(System.getProperty("line.separator"));
                    }

                }
            }
            leer.close();
            sobreEscribirDatos.close();
            nombreFichero = notas.getName();
            notas.delete();
            ficheroNuevo.renameTo(notas);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
        limpiarTabla();
        llenarTabla();
    }

    //Este metodo pasa los datos del archivo de texto a objetos para poder manipular con ellos
    public void leerDeTextoAObjeto(String linea) {

        try {
            BufferedReader leer;
            try (FileReader archivo = new FileReader(notas)) {
                leer = new BufferedReader(archivo);
                while ((linea = leer.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nombresTemp = st.nextToken();
                    String carnetTemp = st.nextToken();
                    String asignaturaTemp = st.nextToken();
                    double primerParcialTemp = Double.parseDouble(st.nextToken());
                    double segundoParcialTemp = Double.parseDouble(st.nextToken());
                    double acumuladoTemp = Double.parseDouble(st.nextToken());
                    double notaFinalTemp = Double.parseDouble(st.nextToken());
                    //lo añado al vector para poder manipular con el
                    datosAcademicos = new Datos(nombresTemp, carnetTemp, asignaturaTemp, primerParcialTemp, segundoParcialTemp, acumuladoTemp, notaFinalTemp);

                    datosTabla.add(datosAcademicos);
                }
            }
            leer.close();
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
    }

    //Este metodo elimina el registro seleccionado en la tabla
    public void eliminar() {
        try {
            if (datosTabla.isEmpty()) {

                leerDeTextoAObjeto("");
            }

            try (FileWriter archivo = new FileWriter(notas); BufferedWriter escribir = new BufferedWriter(archivo)) {
                String nombre = txtNombres.getText();
                String carnet = txtCarnet.getText();
                String asignaturas = txtAsignatura.getText();
                double primerParcial = Double.parseDouble(txtPrimerParcial.getText());
                double segundoParcial = Double.parseDouble(txtSegundoParcial.getText());
                double acumulado = Double.parseDouble(txtAcumulado.getText());
                for (Datos n : datosTabla) {
                    if (!n.getNombres().equals(nombre)
                            || !n.getCarnet().equals(carnet)
                            || !n.getAsignatura().equals(asignaturas)
                            || n.getPrimerPacial() != primerParcial
                            || n.getSegundoParcial() != segundoParcial
                            || n.getAcumulado() != acumulado) {

                        escribir.write(n.getNombres() + "," + n.getCarnet() + "," + n.getAsignatura() + "," + n.getPrimerPacial()
                                + "," + n.getSegundoParcial() + "," + n.getAcumulado() + ", " + n.getNotaFinal() + "\r\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    }
                }
            }
            datosTabla.clear();
            limpiarTabla();
            llenarTabla();
            limpiarCampos();
        } catch (HeadlessException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void soloLetras(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(mayusculas || minusculas || espacio)) {
            evt.consume();
        }
    }

    public void soloNumeros(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(num || punto)) {
            evt.consume();
        }
    }

    public void calculoNotaFinal(double notaPrimerParcial, double notaSegundoParcial, double acumulado) {
        notaFinal = notaPrimerParcial + notaSegundoParcial + acumulado;
    }

    public void dividirRegistroEnVariables(String nombre, String carnet, String asignatura, double notaPrimerParcial, double notaSegundoParcial, double acumulado) {
        nombre = String.valueOf(txtNombres.getText());
        carnet = String.valueOf(txtCarnet.getText());
        asignatura = String.valueOf(txtAsignatura.getText());
        notaPrimerParcial = Double.parseDouble(txtPrimerParcial.getText());
        notaSegundoParcial = Double.parseDouble(txtSegundoParcial.getText());
        acumulado = Double.parseDouble(txtAcumulado.getText());
    }

    public String registroString(String nombre, String carnet, String asignatura, double notaPrimerParcial, double notaSegundoParcial, double acumulado, double notaFinal) {
        return nombre + "," + carnet + "," + asignatura + "," + notaPrimerParcial + "," + notaSegundoParcial + "," + acumulado + "," + notaFinal + ",";
    }
}
