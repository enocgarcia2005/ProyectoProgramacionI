package Ventanas;

import Animaciones.Animaciones;
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

    private static String User;
    File Notas = new File("Notas.txt");
    Animaciones animar = new Animaciones();
    String[] Cabecera = {"Nombres y Apellidos", "N de Carnet",
        "Asignatura", "I parcial", "II parcial", "Acumulado", "Nota Final"};
    String[][] datos = {};
    DefaultTableModel MaestrosT = new DefaultTableModel(datos, Cabecera);
    String nNota;
    String aNota;
    Datos D = new Datos();
    ArrayList<Datos> DatosT = new ArrayList<Datos>();

    public FrmMaestros() {
        initComponents();
        TbMaestros.setModel(MaestrosT);
        TbMaestros.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 18));
        TbMaestros.getTableHeader().setOpaque(false);
        TbMaestros.getTableHeader().setBackground(new Color(51, 153, 0));
        TbMaestros.getTableHeader().setForeground(new Color(255, 255, 255));
        TbMaestros.setRowHeight(25);
        TbMaestros.getColumnModel().getColumn(0).setPreferredWidth(200);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        Mostrar();
    }

    public static void setUser(String User) {
        FrmMaestros.User = User;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        BtnControldeNotas = new javax.swing.JLabel();
        pnlBienvenida = new javax.swing.JPanel();
        lblElegir = new javax.swing.JLabel();
        tituloBienvenida1 = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        PnlModificar = new javax.swing.JPanel();
        CbxModificar = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        BtnGuardarCambios = new javax.swing.JButton();
        PnlControlNotas = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblIIparcial = new javax.swing.JLabel();
        txtIIparcial = new javax.swing.JTextField();
        lblCarnet = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblAcumulado = new javax.swing.JLabel();
        lblIparcial = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();
        txtIparcial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbMaestros = new javax.swing.JTable();
        lbltituloTabla = new javax.swing.JLabel();
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

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit-2.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        BtnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        BtnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitOn.png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        BackGround.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 1, 36, 36));

        BtnControldeNotas.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BtnControldeNotas.setForeground(new java.awt.Color(51, 153, 0));
        BtnControldeNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnControldeNotas.setText("Control de notas");
        BtnControldeNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnControldeNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnControldeNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnControldeNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnControldeNotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnControldeNotasMousePressed(evt);
            }
        });
        BackGround.add(BtnControldeNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 290, 150));

        pnlBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        lblElegir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblElegir.setForeground(new java.awt.Color(51, 153, 0));
        lblElegir.setText("Elija una opcion");

        tituloBienvenida1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tituloBienvenida1.setForeground(new java.awt.Color(51, 153, 0));
        tituloBienvenida1.setText("Bienvenid@ Maestr@ a Grading System");

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good-mark-2.png"))); // NOI18N

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(tituloBienvenida1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(Logo1)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(lblElegir)
                        .addGap(246, 246, 246))))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloBienvenida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblElegir)
                .addContainerGap())
        );

        BackGround.add(pnlBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -380, 640, 360));

        PnlModificar.setBackground(new java.awt.Color(255, 255, 255));
        PnlModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CbxModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxModificar.setForeground(new java.awt.Color(51, 153, 0));
        CbxModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres y Apellidos", "N de Carnet", "Asignatura", "I parcial", "II parcial", "Acumulado" }));
        CbxModificar.setSelectedIndex(-1);
        CbxModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        PnlModificar.add(CbxModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        lblModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(51, 153, 0));
        lblModificar.setText("Seleccione el campo a Modificar");
        PnlModificar.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        BtnSeleccionar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnSeleccionar.setForeground(new java.awt.Color(51, 153, 0));
        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        BtnVolver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(51, 153, 0));
        BtnVolver.setText("Regresar");
        BtnVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, -1));

        BtnGuardarCambios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnGuardarCambios.setForeground(new java.awt.Color(51, 153, 0));
        BtnGuardarCambios.setText("Guardar");
        BtnGuardarCambios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCambiosActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 60, -1));

        BackGround.add(PnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 490, 240, 100));

        PnlControlNotas.setBackground(new java.awt.Color(255, 255, 255));
        PnlControlNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 153, 0));
        lblTitulo.setText("Control de Notas");
        PnlControlNotas.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        lblNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(51, 153, 0));
        lblNombres.setText("Nombres y apellidos de el/la estudiante:");
        PnlControlNotas.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNombres.setBorder(null);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PnlControlNotas.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 580, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 590, 10));

        lblIIparcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIIparcial.setForeground(new java.awt.Color(51, 153, 0));
        lblIIparcial.setText("II parcial:");
        PnlControlNotas.add(lblIIparcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        txtIIparcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIIparcial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIIparcial.setBorder(null);
        txtIIparcial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIIparcialKeyTyped(evt);
            }
        });
        PnlControlNotas.add(txtIIparcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 110, -1));

        lblCarnet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCarnet.setForeground(new java.awt.Color(51, 153, 0));
        lblCarnet.setText("N de Carnet:");
        PnlControlNotas.add(lblCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtCarnet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCarnet.setBorder(null);
        PnlControlNotas.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 10));

        lblAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAcumulado.setForeground(new java.awt.Color(51, 153, 0));
        lblAcumulado.setText("Acumulado:");
        PnlControlNotas.add(lblAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        lblIparcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIparcial.setForeground(new java.awt.Color(51, 153, 0));
        lblIparcial.setText("I parcial:");
        PnlControlNotas.add(lblIparcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        txtAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAcumulado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcumulado.setBorder(null);
        txtAcumulado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcumuladoKeyTyped(evt);
            }
        });
        PnlControlNotas.add(txtAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 110, -1));

        txtIparcial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIparcial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIparcial.setBorder(null);
        txtIparcial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIparcialKeyTyped(evt);
            }
        });
        PnlControlNotas.add(txtIparcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 110, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 110, 10));

        jSeparator5.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 110, 10));

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
        PnlControlNotas.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 100, -1));

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
        PnlControlNotas.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 85, 100, -1));

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
        PnlControlNotas.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 100, -1));

        TbMaestros.setAutoCreateRowSorter(true);
        TbMaestros.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        TbMaestros.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TbMaestros.setModel(new javax.swing.table.DefaultTableModel(
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
        TbMaestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TbMaestros.setGridColor(new java.awt.Color(0, 0, 0));
        TbMaestros.setRowHeight(25);
        TbMaestros.setSelectionBackground(new java.awt.Color(0, 204, 0));
        TbMaestros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TbMaestros.setShowHorizontalLines(true);
        TbMaestros.setShowVerticalLines(true);
        TbMaestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbMaestrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbMaestros);

        PnlControlNotas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1080, 290));

        lbltituloTabla.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbltituloTabla.setForeground(new java.awt.Color(51, 153, 0));
        lbltituloTabla.setText("Listado de Estudiantes");
        PnlControlNotas.add(lbltituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        lblAsignatura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAsignatura.setForeground(new java.awt.Color(51, 153, 0));
        lblAsignatura.setText("Asignatura:");
        PnlControlNotas.add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        txtAsignatura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAsignatura.setBorder(null);
        txtAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAsignaturaKeyTyped(evt);
            }
        });
        PnlControlNotas.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, -1));

        jSeparator6.setForeground(new java.awt.Color(51, 153, 0));
        PnlControlNotas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 130, 10));

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
        PnlControlNotas.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 100, -1));

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
        PnlControlNotas.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 155, 100, -1));

        BackGround.add(PnlControlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 1080, 540));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "Profe: " + User + "\n¿Estas seguro que quieres cerrar sesion?");
        if (salir == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnControldeNotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnControldeNotasMousePressed
        if (PnlControlNotas.getY() == 600 && BtnControldeNotas.getY() == 380 && pnlBienvenida.getY() == 10) {
            animar.JPanelYArriba(10, -380, 10, 10, pnlBienvenida);
            animar.JLabelYAbajo(380, 600, 10, 10, BtnControldeNotas);
            animar.JPanelYArriba(600, 10, 10, 10, PnlControlNotas);
        }
    }//GEN-LAST:event_BtnControldeNotasMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        animar.JPanelYAbajo(-380, 10, 10, 10, pnlBienvenida);
        LlenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if (PnlControlNotas.getY() == 10 && BtnControldeNotas.getY() == 600 && pnlBienvenida.getY() == -380) {
            animar.JPanelYArriba(-380, 10, 10, 10, pnlBienvenida);
            animar.JLabelYAbajo(600, 380, 10, 10, BtnControldeNotas);
            animar.JPanelYArriba(10, 600, 10, 10, PnlControlNotas);
            LimpiarCampos();
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void BtnControldeNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnControldeNotasMouseEntered
        if (BtnControldeNotas.getY() == 380) {
            BtnControldeNotas.setForeground(new Color(51, 180, 0));
        }
    }//GEN-LAST:event_BtnControldeNotasMouseEntered

    private void BtnControldeNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnControldeNotasMouseExited
        if (BtnControldeNotas.getY() == 380) {
            BtnControldeNotas.setForeground(new Color(51, 153, 0));
        }
    }//GEN-LAST:event_BtnControldeNotasMouseExited

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LimpiarCampos();
        activarCampos();
        txtNombres.requestFocus();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una opcion");
        } else if (txtNombres.getText().isEmpty()
                || txtCarnet.getText().isEmpty()
                || txtAcumulado.getText().isEmpty()
                || txtIparcial.getText().isEmpty()
                || txtIIparcial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            SeleccionCbxModificar();
        }
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        animar.JPanelXIzquierda(20, -300, 15, 10, PnlModificar);
        desactivarCampos();
        LimpiarCampos();
        CbxModificar.setSelectedIndex(-1);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnRegresar.setEnabled(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Primero selleccione un campo y realize los cambios correspondientes");
        } else {
            Modificar();
        }
    }//GEN-LAST:event_BtnGuardarCambiosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        animar.JPanelXDerecha(-300, 20, 15, 10, PnlModificar);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnRegresar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (TbMaestros.getRowCount() == 1) {
            JOptionPane.showMessageDialog(null, "La tabla no puede estar vacia");
        } else {

            Eliminar();
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TbMaestrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMaestrosMousePressed
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_TbMaestrosMousePressed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtIIparcialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIIparcialKeyTyped
        soloNumeros(evt);      
    }//GEN-LAST:event_txtIIparcialKeyTyped

    private void txtAcumuladoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcumuladoKeyTyped
        soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcumuladoKeyTyped

    private void txtIparcialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIparcialKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtIparcialKeyTyped

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
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BtnControldeNotas;
    private javax.swing.JButton BtnGuardarCambios;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CbxModificar;
    private javax.swing.JLabel Logo1;
    private javax.swing.JPanel PnlControlNotas;
    private javax.swing.JPanel PnlModificar;
    private javax.swing.JTable TbMaestros;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
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
    private javax.swing.JLabel lblIIparcial;
    private javax.swing.JLabel lblIparcial;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbltituloTabla;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JLabel tituloBienvenida1;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtIIparcial;
    private javax.swing.JTextField txtIparcial;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    //Este metodo muestra los datos en los Jtextfields y comboBoxs cuando se hace click en una fila de la tabla
    public void Mostrar() {
        TbMaestros.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_Event) {
                JTable tabla = (JTable) Mouse_Event.getSource();
                Point point = Mouse_Event.getPoint();
                int Fila = tabla.rowAtPoint(point);
                if (Mouse_Event.getClickCount() == 1) {
                    txtNombres.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 0).toString());
                    txtCarnet.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 1).toString());
                    txtAsignatura.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 2).toString());
                    txtIparcial.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 3).toString());
                    txtIIparcial.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 4).toString());
                    txtAcumulado.setText(TbMaestros.getValueAt(TbMaestros.getSelectedRow(), 5).toString());

                    desactivarCampos();
                }

            }
        });
    }

    // Metodos que configuran la tabla par que muestre los datos correctamente
    public void LlenarTabla() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(Notas));
            Object[] tableLines = leer.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString();
                String[] dataRow = line.split(",");
                MaestrosT.addRow(dataRow);
            }
        } catch (IOException e) {

        }
    }

    public void LimpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) TbMaestros.getModel();
        int a = TbMaestros.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    //Este metodo se encarga de guardar los datos en el txt
    public void Guardar() {
        if (txtNombres.getText().isEmpty()
                || txtCarnet.getText().isEmpty()
                || txtAcumulado.getText().isEmpty()
                || txtIparcial.getText().isEmpty()
                || txtIIparcial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");
        } else {
            double NF = Double.parseDouble(txtIparcial.getText()) + Double.parseDouble(txtIIparcial.getText())
                    + Double.parseDouble(txtAcumulado.getText());

            String introducirNotas = txtNombres.getText() + "," + txtCarnet.getText() + "," + txtAsignatura.getText() + "," + Double.valueOf(txtIparcial.getText())
                    + "," + Double.valueOf(txtIIparcial.getText()) + "," + Double.valueOf(txtAcumulado.getText()) + "," + NF;

            try {
                FileWriter escribir = new FileWriter(Notas, true);
                escribir.write(introducirNotas);
                escribir.write(System.getProperty("line.separator"));
                JOptionPane.showMessageDialog(this, "Guardado Correctamente");
                escribir.close();
                LimpiarCampos();
                LimpiarTabla();
                LlenarTabla();
                desactivarCampos();
            } catch (IOException e) {
            }
        }
    }

    //Este metodo se encarga de limpiar campos
    public void LimpiarCampos() {
        txtNombres.setText("");
        txtCarnet.setText("");
        txtIparcial.setText("");
        txtIIparcial.setText("");
        txtAcumulado.setText("");
        txtAsignatura.setText("");
    }

    //Este metodo inhabilita los txt
    public void desactivarCampos() {
        txtNombres.setEditable(false);
        txtCarnet.setEditable(false);
        txtIparcial.setEditable(false);
        txtIIparcial.setEditable(false);
        txtAcumulado.setEditable(false);
        txtAsignatura.setEditable(false);
    }

    //Este metodo habilita los txt
    public void activarCampos() {
        txtNombres.setEditable(true);
        txtCarnet.setEditable(true);
        txtIparcial.setEditable(true);
        txtIIparcial.setEditable(true);
        txtAcumulado.setEditable(true);
        txtAsignatura.setEditable(true);
    }
    //Este metodo vincula el CbxModificar con los campos ingresados

    public void SeleccionCbxModificar() {
        switch (CbxModificar.getSelectedIndex()) {
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
                txtIparcial.setEditable(true);
                txtIparcial.requestFocus();
            }
            case 4 -> {
                desactivarCampos();
                txtIIparcial.setEditable(true);
                txtIIparcial.requestFocus();
            }
            case 5 -> {
                desactivarCampos();
                txtAcumulado.setEditable(true);
                txtAcumulado.requestFocus();
            }
        }
        double NF = Double.parseDouble(txtIparcial.getText()) + Double.parseDouble(txtIIparcial.getText())
                + Double.parseDouble(txtAcumulado.getText());

        aNota = txtNombres.getText() + "," + txtCarnet.getText() + "," + txtAsignatura.getText() + "," + Double.valueOf(txtIparcial.getText())
                + "," + Double.valueOf(txtIIparcial.getText()) + "," + Double.valueOf(txtAcumulado.getText()) + "," + NF;
    }

    //Este metodo se encarga de Modificar valores dentro del archivo txt
    public void Modificar() {
        double NF = Double.parseDouble(txtIparcial.getText()) + Double.parseDouble(txtIIparcial.getText())
                + Double.parseDouble(txtAcumulado.getText());

        nNota = txtNombres.getText() + "," + txtCarnet.getText() + "," + txtAsignatura.getText() + "," + Double.valueOf(txtIparcial.getText())
                + "," + Double.valueOf(txtIIparcial.getText()) + "," + Double.valueOf(txtAcumulado.getText()) + "," + NF;
        String nFnuevo = "Modificar2.txt";
        File fNuevo = new File(nFnuevo);
        String Linea;
        try {

            FileReader fr = new FileReader(Notas);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fNuevo);
            while ((Linea = br.readLine()) != null) {
                String escribir = Linea;
                if (Linea.equals(aNota)) {

                    fw.write(nNota);
                    fw.write(System.getProperty("line.separator"));
                } else if (Linea.equalsIgnoreCase(escribir)) {
                    System.out.println(escribir);
                    fw.write(escribir);
                    fw.write(System.getProperty("line.separator"));

                }

            }
            fw.close();
            br.close();
            fr.close();
            String nAntiguo = Notas.getName();

            Notas.delete();
            fNuevo.renameTo(Notas);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
        LimpiarTabla();
        LlenarTabla();
    }

    //Este metodo pasa los datos del archivo de texto a objetos para poder manipular con ellos
    public void LeerDetextoAObjeto() {
        String Linea, Nombres, Carnet, Asignatura;
        double Iparcial, IIparcial, Acumulado, NotaFinal;
        try {
            FileReader fr = new FileReader(Notas);
            BufferedReader br = new BufferedReader(fr);
            while ((Linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, ",");
                Nombres = st.nextToken();
                Carnet = st.nextToken();
                Asignatura = st.nextToken();
                Iparcial = Double.parseDouble(st.nextToken());
                IIparcial = Double.parseDouble(st.nextToken());
                Acumulado = Double.parseDouble(st.nextToken());
                NotaFinal = Double.parseDouble(st.nextToken());
                //lo añado al vector para poder manipular con el 
                D = new Datos(Nombres, Carnet, Asignatura, Iparcial, IIparcial, Acumulado, NotaFinal);

                DatosT.add(D);
            }
            fr.close();
            br.close();
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
    }

    //Este metodo elimina el registro seleccionado en la tabla
    public void Eliminar() {
        try {
            if (DatosT.isEmpty()) {

                LeerDetextoAObjeto();
            }

            try ( FileWriter fw = new FileWriter(Notas);  BufferedWriter bw = new BufferedWriter(fw)) {
                String Nombre = txtNombres.getText();
                String Carnet = txtCarnet.getText();
                String Asignatura = txtAsignatura.getText();
                double Iparcial = Double.parseDouble(txtIparcial.getText());
                double IIparcial = Double.parseDouble(txtIIparcial.getText());
                double Acumulado = Double.parseDouble(txtAcumulado.getText());
                for (Datos n : DatosT) {
                    if (!n.getNombres().equals(Nombre)
                            && !n.getCarnet().equals(Carnet)
                            && !n.getAsignatura().equals(Asignatura)
                            && n.getIpacial() != Iparcial
                            && n.getIIparcial() != IIparcial
                            && n.getAcumulado() != Acumulado) {
                        bw.write(n.Nombres + "," + n.Carnet + "," + n.Asignatura + "," + n.Ipacial + "," + n.IIparcial + "," + n.Acumulado + ", " + n.NF + "\r\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    }
                }
            }
            DatosT.clear();
            LimpiarTabla();
            LlenarTabla();
            LimpiarCampos();
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
}
