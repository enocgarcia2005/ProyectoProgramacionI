package Ventanas;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import Animaciones.Animaciones;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Inicio extends javax.swing.JFrame {

    File Alumnos = new File("Alumnos.txt");
    File Maestros = new File("Maestros.txt");
    Animaciones animar = new Animaciones();
    private Scanner sc;
    private static int Intentos;
    private static String usuario, conrtraseña;

    public Inicio() {
        initComponents();
        Icono();
    }

    public void setIntentos(int Intentos) {
        Inicio.Intentos = Intentos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agruparbotones = new javax.swing.ButtonGroup();
        BackGround = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        LogoHeader = new javax.swing.JLabel();
        NombreLogo = new javax.swing.JLabel();
        BtnVolverAInicio = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        SepararHeader = new javax.swing.JSeparator();
        PnlInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Logo256px = new javax.swing.JLabel();
        Iniciodesesion = new javax.swing.JPanel();
        lblContraseña = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        txtAlumnoUsuario = new javax.swing.JTextField();
        SeparadorContra = new javax.swing.JSeparator();
        SeparadorUserA = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        BtnIniciarSA = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        iconoUser = new javax.swing.JLabel();
        iconoPasword = new javax.swing.JLabel();
        Alumno = new javax.swing.JRadioButton();
        Maestro = new javax.swing.JRadioButton();
        acercadeNos = new javax.swing.JPanel();
        SeparadorAcercaDeNosotros = new javax.swing.JSeparator();
        BtnAcercaDeNosotros = new javax.swing.JLabel();
        pnlAcercaDeNosotros = new javax.swing.JPanel();
        ImagenDesarrollador = new javax.swing.JLabel();
        lblPiedefoto = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        TikTok = new javax.swing.JLabel();
        Instagram = new javax.swing.JLabel();

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

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 0));
        jLabel13.setText("© 2022 Enoc Garcia. Todos los derechos reservados.");
        BackGround.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setForeground(new java.awt.Color(153, 153, 153));
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderMouseClicked(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        Header.add(LogoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        NombreLogo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        NombreLogo.setForeground(new java.awt.Color(0, 153, 0));
        NombreLogo.setText("Grading System");
        Header.add(NombreLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));

        BtnVolverAInicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnVolverAInicio.setForeground(new java.awt.Color(51, 153, 0));
        BtnVolverAInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVolverAInicio.setText("Volver a Inicio");
        BtnVolverAInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolverAInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverAInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverAInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVolverAInicioMousePressed(evt);
            }
        });
        Header.add(BtnVolverAInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -50, 160, 30));

        BtnIniciarSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(51, 153, 0));
        BtnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnIniciarSesion.setText("Iniciar Sesión");
        BtnIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnIniciarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnIniciarSesionMousePressed(evt);
            }
        });
        Header.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 10, 160, 30));

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
        Header.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 36, 36));

        BackGround.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 1090, 50));
        BackGround.add(SepararHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 53, 1098, 10));

        PnlInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Sistema de Notas Grading System");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Es una sofisticada herramienta que integra en un solo paquete la administración ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("y consulta de calificaciones estudiantiles.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("El sistema esta pensado para funcionar atravez de 2 perfiles:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("-Docente");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("-Estudiante");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Cada perfil tiene perfiles y funciones diferentes para su correcto funcionamiento.");

        javax.swing.GroupLayout PnlInfoLayout = new javax.swing.GroupLayout(PnlInfo);
        PnlInfo.setLayout(PnlInfoLayout);
        PnlInfoLayout.setHorizontalGroup(
            PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInfoLayout.createSequentialGroup()
                .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(PnlInfoLayout.createSequentialGroup()
                        .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlInfoLayout.setVerticalGroup(
            PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackGround.add(PnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 590, -1));

        Logo256px.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good-mark-2.png"))); // NOI18N
        BackGround.add(Logo256px, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 110, -1, -1));

        Iniciodesesion.setBackground(new java.awt.Color(255, 255, 255));
        Iniciodesesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        Iniciodesesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Iniciodesesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraseña.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 153, 0));
        lblContraseña.setText("Contraseña:");
        Iniciodesesion.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lblUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(51, 153, 0));
        lblUsuarios.setText("Usuario:");
        Iniciodesesion.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtAlumnoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAlumnoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtAlumnoUsuario.setText("Introduzca su usuario");
        txtAlumnoUsuario.setBorder(null);
        txtAlumnoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAlumnoUsuarioMousePressed(evt);
            }
        });
        txtAlumnoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlumnoUsuarioActionPerformed(evt);
            }
        });
        Iniciodesesion.add(txtAlumnoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, -1));

        SeparadorContra.setBackground(new java.awt.Color(51, 153, 0));
        SeparadorContra.setForeground(new java.awt.Color(51, 153, 0));
        Iniciodesesion.add(SeparadorContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 10));

        SeparadorUserA.setBackground(new java.awt.Color(51, 153, 0));
        SeparadorUserA.setForeground(new java.awt.Color(51, 153, 0));
        Iniciodesesion.add(SeparadorUserA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, -1));

        txtContra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(153, 153, 153));
        txtContra.setText("JPasword");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        Iniciodesesion.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 20));

        BtnIniciarSA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnIniciarSA.setForeground(new java.awt.Color(0, 153, 0));
        BtnIniciarSA.setText("Iniciar Sesión");
        BtnIniciarSA.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        BtnIniciarSA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIniciarSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIniciarSAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnIniciarSAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnIniciarSAMouseExited(evt);
            }
        });
        BtnIniciarSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSAActionPerformed(evt);
            }
        });
        Iniciodesesion.add(BtnIniciarSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 153, 0));
        lblTitulo.setText("Inicio de sesión");
        Iniciodesesion.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        iconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrarse.png"))); // NOI18N
        Iniciodesesion.add(iconoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 45, -1, -1));

        iconoPasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/secure.png"))); // NOI18N
        Iniciodesesion.add(iconoPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 105, -1, -1));

        agruparbotones.add(Alumno);
        Alumno.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Alumno.setForeground(new java.awt.Color(51, 153, 0));
        Alumno.setSelected(true);
        Alumno.setText("Alumno");
        Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoActionPerformed(evt);
            }
        });
        Iniciodesesion.add(Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        agruparbotones.add(Maestro);
        Maestro.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Maestro.setForeground(new java.awt.Color(51, 153, 0));
        Maestro.setText("Maestro");
        Iniciodesesion.add(Maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        BackGround.add(Iniciodesesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 440, 270));

        acercadeNos.setBackground(new java.awt.Color(255, 255, 255));
        acercadeNos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acercadeNosMousePressed(evt);
            }
        });
        acercadeNos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        acercadeNos.add(SeparadorAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 10));

        BtnAcercaDeNosotros.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BtnAcercaDeNosotros.setForeground(new java.awt.Color(51, 153, 0));
        BtnAcercaDeNosotros.setText("Acerca de Nosotros");
        BtnAcercaDeNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAcercaDeNosotros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAcercaDeNosotrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAcercaDeNosotrosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAcercaDeNosotrosMousePressed(evt);
            }
        });
        acercadeNos.add(BtnAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BackGround.add(acercadeNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 180, 60));

        pnlAcercaDeNosotros.setBackground(new java.awt.Color(255, 255, 255));
        pnlAcercaDeNosotros.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        pnlAcercaDeNosotros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenDesarrollador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yo.jpeg"))); // NOI18N
        ImagenDesarrollador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 0), null));
        pnlAcercaDeNosotros.add(ImagenDesarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, 150));

        lblPiedefoto.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPiedefoto.setForeground(new java.awt.Color(51, 153, 0));
        lblPiedefoto.setText("Developed by Enoc Nehemías García Alcántara");
        pnlAcercaDeNosotros.add(lblPiedefoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lblNumero.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(51, 153, 0));
        lblNumero.setText("Numero: +50587620936");
        pnlAcercaDeNosotros.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 153, 0));
        lblEmail.setText("Email: Enocgarcia2005@gmail.com");
        pnlAcercaDeNosotros.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FacebookMousePressed(evt);
            }
        });
        pnlAcercaDeNosotros.add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        TikTok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiktok.png"))); // NOI18N
        TikTok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TikTok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TikTokMousePressed(evt);
            }
        });
        pnlAcercaDeNosotros.add(TikTok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        Instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instagram-3.png"))); // NOI18N
        Instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InstagramMousePressed(evt);
            }
        });
        pnlAcercaDeNosotros.add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        BackGround.add(pnlAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 570, 360));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSesionMouseEntered
        BtnIniciarSesion.setBorder(new EtchedBorder(1, new Color(51, 180, 0), new Color(51, 180, 0)));
        BtnIniciarSesion.setForeground(new Color(51, 180, 0));
    }//GEN-LAST:event_BtnIniciarSesionMouseEntered

    private void BtnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSesionMouseExited
        BtnIniciarSesion.setBorder(new EtchedBorder(1, new Color(51, 153, 0), new Color(51, 153, 0)));
        BtnIniciarSesion.setForeground(new Color(51, 153, 0));
    }//GEN-LAST:event_BtnIniciarSesionMouseExited

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?");
        if (salir == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAcercaDeNosotrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAcercaDeNosotrosMouseEntered
        BtnAcercaDeNosotros.setForeground(new Color(51, 180, 0));
    }//GEN-LAST:event_BtnAcercaDeNosotrosMouseEntered

    private void BtnAcercaDeNosotrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAcercaDeNosotrosMouseExited
        BtnAcercaDeNosotros.setForeground(new Color(51, 153, 0));
    }//GEN-LAST:event_BtnAcercaDeNosotrosMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        animar.JLabelXDerecha(-270, 110, 15, 10, Logo256px);
        animar.JPanelXIzquierda(1100, 400, 8, 10, PnlInfo);
    }//GEN-LAST:event_formWindowOpened

    private void txtAlumnoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlumnoUsuarioActionPerformed

    }//GEN-LAST:event_txtAlumnoUsuarioActionPerformed

    private void BtnIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSesionMousePressed
        if (Logo256px.getX() == 110 && PnlInfo.getX() == 400) {
            animar.JLabelXIzquierda(110, -270, 15, 10, Logo256px);
            animar.JPanelXDerecha(400, 1100, 8, 10, PnlInfo);
            animar.JPanelYArriba(600, 150, 10, 10, Iniciodesesion);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnVolverAInicio);
            animar.JLabelYArriba(10, -50, 10, 10, BtnIniciarSesion);
        }
        if (pnlAcercaDeNosotros.getY() == 150 && acercadeNos.getY() == 600) {
            animar.JPanelYAbajo(150, 600, 10, 10, pnlAcercaDeNosotros);
            animar.JPanelYArriba(600, 500, 10, 1, acercadeNos);
            animar.JPanelYArriba(600, 150, 10, 10, Iniciodesesion);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnVolverAInicio);
            animar.JLabelYArriba(10, -50, 10, 10, BtnIniciarSesion);
        }
    }//GEN-LAST:event_BtnIniciarSesionMousePressed

    private void BtnIniciarSAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSAMouseEntered
        BtnIniciarSA.setForeground(new Color(51, 180, 0));
    }//GEN-LAST:event_BtnIniciarSAMouseEntered

    private void BtnIniciarSAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSAMouseExited
        BtnIniciarSA.setForeground(new Color(51, 153, 0));
    }//GEN-LAST:event_BtnIniciarSAMouseExited

    private void BtnVolverAInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverAInicioMouseEntered
        BtnVolverAInicio.setForeground(new Color(51, 180, 0));

    }//GEN-LAST:event_BtnVolverAInicioMouseEntered

    private void BtnVolverAInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverAInicioMouseExited
        BtnVolverAInicio.setForeground(new Color(51, 153, 0));
    }//GEN-LAST:event_BtnVolverAInicioMouseExited

    private void BtnVolverAInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverAInicioMousePressed
        if (Iniciodesesion.getY() == 150 && Logo256px.getX() == -270 && PnlInfo.getX() == 1100) {
            animar.JPanelYAbajo(150, 600, 10, 10, Iniciodesesion);
            animar.JLabelXDerecha(-270, 110, 15, 10, Logo256px);
            animar.JPanelXIzquierda(1100, 400, 8, 10, PnlInfo);
            animar.JLabelYArriba(10, -50, 10, 5, BtnVolverAInicio);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnIniciarSesion);
        }
        if (pnlAcercaDeNosotros.getY() == 150 && acercadeNos.getY() == 600) {
            animar.JPanelYAbajo(150, 600, 10, 10, pnlAcercaDeNosotros);
            animar.JPanelYArriba(600, 500, 10, 1, acercadeNos);
            animar.JLabelXDerecha(-270, 110, 15, 10, Logo256px);
            animar.JPanelXIzquierda(1100, 400, 8, 10, PnlInfo);
            animar.JLabelYArriba(10, -50, 10, 5, BtnVolverAInicio);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnIniciarSesion);
        }


    }//GEN-LAST:event_BtnVolverAInicioMousePressed

    private void txtAlumnoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlumnoUsuarioMousePressed
        if (txtAlumnoUsuario.getText().equalsIgnoreCase("Introduzca su usuario")) {
            txtAlumnoUsuario.setText("");
            txtAlumnoUsuario.setForeground(Color.BLACK);
        }
        if (txtContra.getText().isEmpty()) {
            txtContra.setText("JPasword");
            txtContra.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAlumnoUsuarioMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (txtContra.getText().equals("JPasword")) {
            txtContra.setText("");
            txtContra.setForeground(Color.BLACK);
        }
        if (txtAlumnoUsuario.getText().isEmpty()) {
            txtAlumnoUsuario.setText("Introduzca su usuario");
            txtAlumnoUsuario.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void FacebookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMousePressed
        String Url = "https://www.facebook.com/enoc.garcia.395/";
        try {
            try {
                Desktop.getDesktop().browse(new URI(Url));
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FacebookMousePressed

    private void TikTokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TikTokMousePressed
        String Url = "https://www.tiktok.com/@enocnehemias7?is_from_webapp=1&sender_device=pc";
        try {
            try {
                Desktop.getDesktop().browse(new URI(Url));
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TikTokMousePressed

    private void BtnAcercaDeNosotrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAcercaDeNosotrosMousePressed
        if (Logo256px.getX() == 110 && PnlInfo.getX() == 400) {
            animar.JLabelXIzquierda(110, -270, 15, 10, Logo256px);
            animar.JPanelXDerecha(400, 1100, 8, 10, PnlInfo);
            animar.JPanelYAbajo(500, 600, 10, 10, acercadeNos);
            animar.JPanelYArriba(600, 150, 10, 10, pnlAcercaDeNosotros);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnVolverAInicio);
        }

        if (Iniciodesesion.getY() == 150) {
            animar.JPanelYAbajo(150, 600, 10, 10, Iniciodesesion);
            animar.JPanelYAbajo(500, 600, 10, 10, acercadeNos);
            animar.JPanelYArriba(600, 150, 10, 10, pnlAcercaDeNosotros);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnVolverAInicio);
            animar.JLabelYAbajo(-50, 10, 10, 10, BtnIniciarSesion);
        }
    }//GEN-LAST:event_BtnAcercaDeNosotrosMousePressed

    private void acercadeNosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercadeNosMousePressed

    }//GEN-LAST:event_acercadeNosMousePressed

    private void InstagramMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstagramMousePressed
        String Url = " https://www.instagram.com/enocnehemias_/ ";
        try {
            try {
                Desktop.getDesktop().browse(new URI(Url));
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InstagramMousePressed

    private void HeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseClicked

    }//GEN-LAST:event_HeaderMouseClicked

    private void AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoActionPerformed

    }//GEN-LAST:event_AlumnoActionPerformed

    private void BtnIniciarSAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIniciarSAMouseClicked

    }//GEN-LAST:event_BtnIniciarSAMouseClicked

    private void BtnIniciarSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSAActionPerformed
        if (Alumno.isSelected()) {
            ValidarContraAlumnos();
        }
        if (Maestro.isSelected()) {
            ValidarContraMaestros();
        }

    }//GEN-LAST:event_BtnIniciarSAActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alumno;
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BtnAcercaDeNosotros;
    private javax.swing.JButton BtnIniciarSA;
    private javax.swing.JLabel BtnIniciarSesion;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel BtnVolverAInicio;
    private javax.swing.JLabel Facebook;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImagenDesarrollador;
    private javax.swing.JPanel Iniciodesesion;
    private javax.swing.JLabel Instagram;
    private javax.swing.JLabel Logo256px;
    private javax.swing.JLabel LogoHeader;
    private javax.swing.JRadioButton Maestro;
    private javax.swing.JLabel NombreLogo;
    private javax.swing.JPanel PnlInfo;
    private javax.swing.JSeparator SeparadorAcercaDeNosotros;
    private javax.swing.JSeparator SeparadorContra;
    private javax.swing.JSeparator SeparadorUserA;
    private javax.swing.JSeparator SepararHeader;
    private javax.swing.JLabel TikTok;
    private javax.swing.JPanel acercadeNos;
    private static javax.swing.ButtonGroup agruparbotones;
    private javax.swing.JLabel iconoPasword;
    private javax.swing.JLabel iconoUser;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiedefoto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlAcercaDeNosotros;
    private javax.swing.JTextField txtAlumnoUsuario;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables

    public void Icono() {
        URL url = getClass().getResource("/Imagenes/Logo.png");
        ImageIcon I = new ImageIcon(url);
        this.setIconImage(I.getImage());

    }

    public void ValidarContraAlumnos() {
        int nLineas = 0;
        int i = 0;
        String[] Usuarios = null;
        String Linea;
        String Identificador = "Alumnos";

        try {
            sc = new Scanner(Alumnos);
            FileReader Fr = new FileReader(Alumnos);
            BufferedReader leer = new BufferedReader(Fr);

            while ((Linea = leer.readLine()) != null) {
                nLineas++;
            }
            Usuarios = new String[nLineas];
            while (sc.hasNext()) {
                Usuarios[i++] = sc.nextLine();
            }
            Intentos++;
            usuario = txtAlumnoUsuario.getText();
            conrtraseña = txtContra.getText();

            Seguridad S = new Seguridad();
            S.ValidarUsuario(Usuarios, usuario, conrtraseña, Intentos, Identificador);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

    public void ValidarContraMaestros() {
        int nLineas = 0;
        int i = 0;
        String[] Usuarios = null;
        String Linea;
        String Identificador = "Maestros";

        try {
            sc = new Scanner(Maestros);
            FileReader Fr = new FileReader(Maestros);
            BufferedReader leer = new BufferedReader(Fr);

            while ((Linea = leer.readLine()) != null) {
                nLineas++;
            }
            Usuarios = new String[nLineas];
            while (sc.hasNext()) {
                Usuarios[i++] = sc.nextLine();
            }
            Intentos++;
            usuario = txtAlumnoUsuario.getText();
            conrtraseña = txtContra.getText();

            Seguridad S = new Seguridad();
            S.ValidarUsuario(Usuarios, usuario, conrtraseña, Intentos, Identificador);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }
}
