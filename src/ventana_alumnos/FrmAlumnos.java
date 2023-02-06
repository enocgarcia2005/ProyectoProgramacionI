package ventana_alumnos;

import animaciones.JLabelAnimaciones;
import animaciones.JPanelAnimaciones;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAlumnos extends javax.swing.JFrame {

    File Notas = new File("Notas.txt");
    JLabelAnimaciones animar = JLabelAnimaciones.getInstance();
    JPanelAnimaciones animarPaneles = JPanelAnimaciones.getInstance();
    String[] Cabecera = {"Nombres y Apellidos", "N de Carnet",
        "Asignatura", "I parcial", "II parcial", "Acumulado", "Nota Final"};
    String[][] datos = {};
    DefaultTableModel AlumnosT = new DefaultTableModel(datos, Cabecera);

    public FrmAlumnos() {
        initComponents();
        TbAlumnos.setModel(AlumnosT);
        TbAlumnos.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 18));
        TbAlumnos.getTableHeader().setOpaque(false);
        TbAlumnos.getTableHeader().setBackground(new Color(51, 153, 0));
        TbAlumnos.getTableHeader().setForeground(new Color(255, 255, 255));
        TbAlumnos.setRowHeight(25);
        TbAlumnos.getColumnModel().getColumn(0).setPreferredWidth(200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        BtnMisNotas = new javax.swing.JLabel();
        BtnNotas = new javax.swing.JLabel();
        pnlBienvenida = new javax.swing.JPanel();
        lblElegir = new javax.swing.JLabel();
        tituloBienvenida = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PnlNotas = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbAlumnos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pnlMisNotas = new javax.swing.JPanel();
        txtNdeCarnet = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMisnotas = new javax.swing.JTextArea();
        bntNuevo = new javax.swing.JButton();
        btnRegresarMisNotas = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 593));
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
        BackGround.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 1, 36, 36));

        BtnMisNotas.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BtnMisNotas.setForeground(new java.awt.Color(51, 153, 0));
        BtnMisNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnMisNotas.setText("Mis notas");
        BtnMisNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), new java.awt.Color(0, 0, 0)));
        BtnMisNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMisNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMisNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMisNotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnMisNotasMousePressed(evt);
            }
        });
        BackGround.add(BtnMisNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 200, 150));

        BtnNotas.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BtnNotas.setForeground(new java.awt.Color(51, 153, 0));
        BtnNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnNotas.setText("Notas");
        BtnNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), new java.awt.Color(0, 0, 0)));
        BtnNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNotasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnNotasMousePressed(evt);
            }
        });
        BackGround.add(BtnNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 200, 150));

        pnlBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        lblElegir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblElegir.setForeground(new java.awt.Color(51, 153, 0));
        lblElegir.setText("Elija una opcion");

        tituloBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tituloBienvenida.setForeground(new java.awt.Color(51, 153, 0));
        tituloBienvenida.setLabelFor(tituloBienvenida);
        tituloBienvenida.setText("Bienvenid@ a Grading System");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good-mark-2.png"))); // NOI18N

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(tituloBienvenida)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(lblElegir)
                        .addGap(246, 246, 246))))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblElegir)
                .addContainerGap())
        );

        BackGround.add(pnlBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -380, 640, 360));

        PnlNotas.setBackground(new java.awt.Color(255, 255, 255));

        BtnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(51, 153, 0));
        BtnRegresar.setText("Regresar");
        BtnRegresar.setToolTipText("Volver al inicio");
        BtnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        TbAlumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        TbAlumnos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TbAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres y Apellidos", "Materia", "I parcial", "II parcial", "Acumulado", "Nota FInal", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbAlumnos.setFocusable(false);
        TbAlumnos.setGridColor(new java.awt.Color(0, 0, 0));
        TbAlumnos.setRowHeight(25);
        TbAlumnos.setSelectionBackground(new java.awt.Color(0, 204, 0));
        TbAlumnos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TbAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TbAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TbAlumnos.setShowHorizontalLines(true);
        TbAlumnos.setShowVerticalLines(true);
        TbAlumnos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TbAlumnos);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Registro de notas Grading System");

        javax.swing.GroupLayout PnlNotasLayout = new javax.swing.GroupLayout(PnlNotas);
        PnlNotas.setLayout(PnlNotasLayout);
        PnlNotasLayout.setHorizontalGroup(
            PnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNotasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlNotasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlNotasLayout.createSequentialGroup()
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlNotasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(316, 316, 316))))
        );
        PnlNotasLayout.setVerticalGroup(
            PnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNotasLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRegresar)
                .addGap(17, 17, 17))
        );

        BackGround.add(PnlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 1010, 430));

        pnlMisNotas.setBackground(new java.awt.Color(255, 255, 255));
        pnlMisNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNdeCarnet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNdeCarnet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNdeCarnet.setBorder(null);
        pnlMisNotas.add(txtNdeCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Mis Notas");
        pnlMisNotas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("N de Carnet:");
        pnlMisNotas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 153, 0));
        pnlMisNotas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 10));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Asignatura:");
        pnlMisNotas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, -1, -1));

        txtAsignatura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAsignatura.setBorder(null);
        pnlMisNotas.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 130, 20));

        jSeparator2.setForeground(new java.awt.Color(51, 153, 0));
        pnlMisNotas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 130, -1));

        txtMisnotas.setEditable(false);
        txtMisnotas.setColumns(20);
        txtMisnotas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMisnotas.setForeground(new java.awt.Color(51, 153, 0));
        txtMisnotas.setRows(5);
        txtMisnotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        jScrollPane3.setViewportView(txtMisnotas);

        pnlMisNotas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 580, -1));

        bntNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bntNuevo.setForeground(new java.awt.Color(51, 153, 0));
        bntNuevo.setText("Nuevo");
        bntNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        bntNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoActionPerformed(evt);
            }
        });
        pnlMisNotas.add(bntNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, -1));

        btnRegresarMisNotas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresarMisNotas.setForeground(new java.awt.Color(51, 153, 0));
        btnRegresarMisNotas.setText("Regresar");
        btnRegresarMisNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnRegresarMisNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMisNotasActionPerformed(evt);
            }
        });
        pnlMisNotas.add(btnRegresarMisNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 80, -1));

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 153, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlMisNotas.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, -1));

        BackGround.add(pnlMisNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 620, 320));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "\n¿Estas seguro que quieres cerrar sesion?");
        if (salir == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnNotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotasMousePressed
        if (PnlNotas.getY() == 600 && BtnMisNotas.getY() == 410 && BtnNotas.getY() == 410 && pnlBienvenida.getY() == 10) {
            animarPaneles.JPanelYArriba(10, -380, 10, 10, pnlBienvenida);
            animar.JLabelYAbajo(410, 600, 10, 10, BtnMisNotas);
            animar.JLabelYAbajo(410, 600, 10, 10, BtnNotas);
            animarPaneles.JPanelYArriba(600, 50, 10, 10, PnlNotas);
        }
    }//GEN-LAST:event_BtnNotasMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        animarPaneles.JPanelYAbajo(-380, 10, 10, 10, pnlBienvenida);
        LlenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void BtnMisNotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMisNotasMousePressed
        if (BtnMisNotas.getY() == 410 && BtnNotas.getY() == 410 && pnlBienvenida.getY() == 10 && pnlMisNotas.getY() == 600) {
            animarPaneles.JPanelYArriba(10, -380, 10, 10, pnlBienvenida);
            animar.JLabelYAbajo(410, 600, 10, 10, BtnMisNotas);
            animar.JLabelYAbajo(410, 600, 10, 10, BtnNotas);
            animarPaneles.JPanelYArriba(600, 100, 10, 10, pnlMisNotas);
        }
    }//GEN-LAST:event_BtnMisNotasMousePressed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        if (PnlNotas.getY() == 50 && BtnMisNotas.getY() == 600 && BtnNotas.getY() == 600 && pnlBienvenida.getY() == -380) {
            animarPaneles.JPanelYAbajo(-380, 10, 10, 10, pnlBienvenida);
            animar.JLabelYAbajo(600, 410, 10, 10, BtnMisNotas);
            animar.JLabelYAbajo(600, 410, 10, 10, BtnNotas);
            animarPaneles.JPanelYAbajo(50, 600, 5, 10, PnlNotas);
        }
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotasMouseEntered
        if (BtnNotas.getY() == 410 && pnlBienvenida.getY() == 10) {
            BtnNotas.setForeground(new Color(51, 180, 0));
        }

    }//GEN-LAST:event_BtnNotasMouseEntered

    private void BtnNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotasMouseExited
        if (BtnNotas.getY() == 410) {
            BtnNotas.setForeground(new Color(51, 153, 0));
        }
    }//GEN-LAST:event_BtnNotasMouseExited

    private void btnRegresarMisNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMisNotasActionPerformed
        if (pnlMisNotas.getY() == 100 && BtnMisNotas.getY() == 600 && BtnNotas.getY() == 600 && pnlBienvenida.getY() == -380) {
            animarPaneles.JPanelYAbajo(-380, 10, 15, 10, pnlBienvenida);
            animar.JLabelYAbajo(600, 410, 15, 10, BtnMisNotas);
            animar.JLabelYAbajo(600, 410, 15, 10, BtnNotas);
            animarPaneles.JPanelYAbajo(100, 600, 10, 10, pnlMisNotas);
        }
        txtAsignatura.setEditable(true);
        txtNdeCarnet.setEditable(true);
        txtAsignatura.setText("");
        txtNdeCarnet.setText("");
    }//GEN-LAST:event_btnRegresarMisNotasActionPerformed

    private void BtnMisNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMisNotasMouseEntered
        if (BtnMisNotas.getY() == 410 && pnlBienvenida.getY() == 10) {
            BtnMisNotas.setForeground(new Color(51, 180, 0));
        }
    }//GEN-LAST:event_BtnMisNotasMouseEntered

    private void BtnMisNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMisNotasMouseExited
        if (BtnMisNotas.getY() == 410 && pnlBienvenida.getY() == 10) {
            BtnMisNotas.setForeground(new Color(51, 153, 0));
        }
    }//GEN-LAST:event_BtnMisNotasMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Misnotas();
        txtAsignatura.setEditable(false);
        txtNdeCarnet.setEditable(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void bntNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoActionPerformed
        txtAsignatura.setEditable(true);
        txtNdeCarnet.setEditable(true);
        txtAsignatura.setText("");
        txtNdeCarnet.setText("");
        txtAsignatura.requestFocus();
    }//GEN-LAST:event_bntNuevoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmAlumnos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BtnMisNotas;
    private javax.swing.JLabel BtnNotas;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PnlNotas;
    private javax.swing.JTable TbAlumnos;
    private javax.swing.JButton bntNuevo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresarMisNotas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblElegir;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JPanel pnlMisNotas;
    private javax.swing.JLabel tituloBienvenida;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextArea txtMisnotas;
    private javax.swing.JTextField txtNdeCarnet;
    // End of variables declaration//GEN-END:variables

    // Metodo que configuran la tabla par que muestre los datos correctamente
    public void LlenarTabla() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(Notas));
            Object[] tableLines = leer.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString();
                String[] dataRow = line.split(",");
                AlumnosT.addRow(dataRow);
            }
        } catch (IOException e) {

        }
    }

    public void Misnotas() {
        String Linea, Nombres, Carnet, Asignatura;
        double Iparcial, IIparcial, Acumulado, NotaFinal;
        String Imprimir = "Nota no encontrada";

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

                if (txtNdeCarnet.getText().equalsIgnoreCase(Carnet) && txtAsignatura.getText().equalsIgnoreCase(Asignatura)) {
                    Imprimir = Nombres + "\nNumero de Carnet: " + Carnet + "\nAsignatura: " + Asignatura + "\nNota I parcial: " + Iparcial + "\nNota II parcial: " + IIparcial
                            + "\nNota de Acumulado" + Acumulado + "\nNota Final: " + NotaFinal;
                }
            }

            txtMisnotas.setText(Imprimir);
            fr.close();
            br.close();
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
    }
}
