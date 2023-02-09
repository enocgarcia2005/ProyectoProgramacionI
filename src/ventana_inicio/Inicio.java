package ventana_inicio;

import java.awt.Color;
import java.io.File;

/**
 * Esta clase contiene las todas las implementaciones del frame inicio, tales
 * como animaciones, acciones, autenticacion de usuario, efectos de botones,
 * etc.
 *
 * nota: anteriormente esta clase poseia todo el contenido dentro de ella pero
 * haciendo uso de la refactorizacion, se hizo mas pequeña y legible.
 *
 * @author enocgarcia
 * @since 09/02/2023
 */
public final class Inicio extends javax.swing.JFrame {

    /**
     * El objeto "VERDE_CLARO" como su nombre lo indica contiene el color ya
     * mencionado en numero RGB haciendo uso de la clase Color de Java vanila.
     */
    private final Color VERDE_CLARO = new Color(51, 180, 0);
    /**
     * El objeto "VERDE_OSCURO" como su nombre lo indica contiene el color ya
     * mencionado en numero RGB haciendo uso de la clase Color de Java vanila.
     */
    private final Color VERDE_OSCURO = new Color(51, 153, 0);
    /**
     * La variable "FACEBOOK" de tipo cadena contiene el link al perfil de
     * facebook del desarrollador del proyecto.
     */
    private final String FACEBOOK = "https://www.facebook.com/enoc.garcia.395/";
    /**
     * La variable "INSTAGRAM" de tipo cadena contiene el link al perfil de
     * instagram del desarrollador del proyecto.
     */
    private final String INSTAGRAM = "https://www.instagram.com/enocnehemias_/";
    /**
     * La variable "TIKTOK" de tipo cadena contiene el link al perfil de tik tok
     * del desarrollador del proyecto.
     */
    private final String TIKTOK = "https://www.tiktok.com/@enocnehemias7?is_from_webapp=1&sender_device=pc";
    /**
     * El objeto "animarInicio" se crea con el fin de implementar las
     * animaciones que el programa debe realizar al iniciarse.
     */
    InicioAnimacion animarInicio = new InicioAnimacion();
    /**
     * El objeto "animacionBtnInicioS" se crea con el fin de implementar las
     * animaciones que se deben realizar al dar click en el boton iniciar
     * sesion.
     */
    BtnIniciarSesionAnimacion animacionBtnInicioS = new BtnIniciarSesionAnimacion();
    /**
     * El objeto "animarInfoAutor" se crea con el fin de implemetar las
     * animaciones correspondientes al hacer click en el boton Acerca de
     * nosotros.
     */
    AcercaDeNosotrosAnimacion animarInfoAutor = new AcercaDeNosotrosAnimacion();
    /**
     * El objeto "animarVolver" se crea con el fin de implementar las
     * animaciones correponidentes al presionar el boton volver a inicio.
     */
    VolverAInicioAnimacion animarVolver = new VolverAInicioAnimacion();
    /**
     * El objeto "configurar" se crea con el fin de implementar ajustes
     * generales del Frame, tales como colorear etiquetas para que parezcan
     * botones, crear el efecto de place holder en el login y mostrar un mensaje
     * al querer salir del programa.
     */
    ConfiguracionesGenerales configurar = new ConfiguracionesGenerales();
    /**
     * El objeto " validar " se crea con el fin de implementar la configuracion
     * necesaria para que el login haga la validacion de usuario correctamente.
     */
    LoginValidacion validar = new LoginValidacion();
    /**
     * El objeto "alumnoDatos" contiene un fichero de texto con los usuarios de
     * tipo alumno.
     */
    File alumnosDatos = new File("Alumnos.txt");
    /**
     * El objeto "maestrosDatos" contiene un fichero de texto con los usuarios
     * de tipo maestros.
     */
    File maestrosDatos = new File("Maestros.txt");

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agruparbotones = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        logoPeque = new javax.swing.JLabel();
        nombreApp = new javax.swing.JLabel();
        btnVolverAInicio = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        SepararHeader = new javax.swing.JSeparator();
        pnlDescripcionPrograma = new javax.swing.JPanel();
        lblTituloInfo = new javax.swing.JLabel();
        lblLinea1Info = new javax.swing.JLabel();
        lblLinea2Info = new javax.swing.JLabel();
        lblLinea3Info = new javax.swing.JLabel();
        lblLinea4Info = new javax.swing.JLabel();
        lblLinea5Info = new javax.swing.JLabel();
        lblLinea6Info = new javax.swing.JLabel();
        logoGrande = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblContraseña = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        separadorContra = new javax.swing.JSeparator();
        separadorUserA = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblEncabezadoLogin = new javax.swing.JLabel();
        iconoUser = new javax.swing.JLabel();
        iconoPasword = new javax.swing.JLabel();
        alumno = new javax.swing.JRadioButton();
        maestro = new javax.swing.JRadioButton();
        pnlAcercaDeNosotros = new javax.swing.JPanel();
        separadorAcercaDeNosotros = new javax.swing.JSeparator();
        btnAcercaDeNosotros = new javax.swing.JLabel();
        pnlRedesDesarrollador = new javax.swing.JPanel();
        imagenDesarrollador = new javax.swing.JLabel();
        lblPiedefoto = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnFacebook = new javax.swing.JLabel();
        btnTikTok = new javax.swing.JLabel();
        btnInstagram = new javax.swing.JLabel();

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

        copyright.setBackground(new java.awt.Color(255, 255, 255));
        copyright.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        copyright.setForeground(new java.awt.Color(51, 153, 0));
        copyright.setText("© 2022 Enoc Garcia. Todos los derechos reservados.");
        background.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setForeground(new java.awt.Color(153, 153, 153));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPeque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        pnlHeader.add(logoPeque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nombreApp.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        nombreApp.setForeground(new java.awt.Color(0, 153, 0));
        nombreApp.setText("Grading System");
        pnlHeader.add(nombreApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));

        btnVolverAInicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVolverAInicio.setForeground(new java.awt.Color(51, 153, 0));
        btnVolverAInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolverAInicio.setText("Volver a Inicio");
        btnVolverAInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverAInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverAInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverAInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverAInicioMousePressed(evt);
            }
        });
        pnlHeader.add(btnVolverAInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -50, 160, 30));

        btnIniciarSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(51, 153, 0));
        btnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMousePressed(evt);
            }
        });
        pnlHeader.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 10, 160, 30));

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
        pnlHeader.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 36, 36));

        background.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 1090, 50));
        background.add(SepararHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 53, 1098, 10));

        pnlDescripcionPrograma.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloInfo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTituloInfo.setForeground(new java.awt.Color(51, 153, 0));
        lblTituloInfo.setText("Sistema de Notas Grading System");

        lblLinea1Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea1Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea1Info.setText("Es una sofisticada herramienta que integra en un solo paquete la administración ");

        lblLinea2Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea2Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea2Info.setText("y consulta de calificaciones estudiantiles.");

        lblLinea3Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea3Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea3Info.setText("El sistema esta pensado para funcionar atravez de 2 perfiles:");

        lblLinea4Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea4Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea4Info.setText("-Docente");

        lblLinea5Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea5Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea5Info.setText("-Estudiante");

        lblLinea6Info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLinea6Info.setForeground(new java.awt.Color(51, 153, 0));
        lblLinea6Info.setText("Cada perfil tiene perfiles y funciones diferentes para su correcto funcionamiento.");

        javax.swing.GroupLayout pnlDescripcionProgramaLayout = new javax.swing.GroupLayout(pnlDescripcionPrograma);
        pnlDescripcionPrograma.setLayout(pnlDescripcionProgramaLayout);
        pnlDescripcionProgramaLayout.setHorizontalGroup(
            pnlDescripcionProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionProgramaLayout.createSequentialGroup()
                .addGroup(pnlDescripcionProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcionProgramaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLinea6Info))
                    .addGroup(pnlDescripcionProgramaLayout.createSequentialGroup()
                        .addGroup(pnlDescripcionProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLinea3Info)
                            .addComponent(lblLinea4Info)
                            .addComponent(lblLinea5Info)
                            .addComponent(lblLinea2Info)
                            .addComponent(lblLinea1Info)
                            .addComponent(lblTituloInfo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescripcionProgramaLayout.setVerticalGroup(
            pnlDescripcionProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcionProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea1Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea2Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea3Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea4Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea5Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinea6Info)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(pnlDescripcionPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 590, -1));

        logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good-mark-2.png"))); // NOI18N
        background.add(logoGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 110, -1, -1));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        pnlLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraseña.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 153, 0));
        lblContraseña.setText("Contraseña:");
        pnlLogin.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lblUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(51, 153, 0));
        lblUsuarios.setText("Usuario:");
        pnlLogin.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Introduzca su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        pnlLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, -1));

        separadorContra.setBackground(new java.awt.Color(51, 153, 0));
        separadorContra.setForeground(new java.awt.Color(51, 153, 0));
        pnlLogin.add(separadorContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 10));

        separadorUserA.setBackground(new java.awt.Color(51, 153, 0));
        separadorUserA.setForeground(new java.awt.Color(51, 153, 0));
        pnlLogin.add(separadorUserA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, -1));

        txtContra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(153, 153, 153));
        txtContra.setText("JPasword");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        pnlLogin.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 20));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 153, 0));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        lblEncabezadoLogin.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblEncabezadoLogin.setForeground(new java.awt.Color(51, 153, 0));
        lblEncabezadoLogin.setText("Inicio de sesión");
        pnlLogin.add(lblEncabezadoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        iconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrarse.png"))); // NOI18N
        pnlLogin.add(iconoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 45, -1, -1));

        iconoPasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/secure.png"))); // NOI18N
        pnlLogin.add(iconoPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 105, -1, -1));

        agruparbotones.add(alumno);
        alumno.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        alumno.setForeground(new java.awt.Color(51, 153, 0));
        alumno.setSelected(true);
        alumno.setText("Alumno");
        pnlLogin.add(alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        agruparbotones.add(maestro);
        maestro.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        maestro.setForeground(new java.awt.Color(51, 153, 0));
        maestro.setText("Maestro");
        pnlLogin.add(maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        background.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 440, 270));

        pnlAcercaDeNosotros.setBackground(new java.awt.Color(255, 255, 255));
        pnlAcercaDeNosotros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlAcercaDeNosotros.add(separadorAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 10));

        btnAcercaDeNosotros.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAcercaDeNosotros.setForeground(new java.awt.Color(51, 153, 0));
        btnAcercaDeNosotros.setText("Acerca de Nosotros");
        btnAcercaDeNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDeNosotros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcercaDeNosotrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcercaDeNosotrosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcercaDeNosotrosMousePressed(evt);
            }
        });
        pnlAcercaDeNosotros.add(btnAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        background.add(pnlAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 180, 60));

        pnlRedesDesarrollador.setBackground(new java.awt.Color(255, 255, 255));
        pnlRedesDesarrollador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), null));
        pnlRedesDesarrollador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenDesarrollador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yo.jpeg"))); // NOI18N
        imagenDesarrollador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 0), null));
        pnlRedesDesarrollador.add(imagenDesarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, 150));

        lblPiedefoto.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPiedefoto.setForeground(new java.awt.Color(51, 153, 0));
        lblPiedefoto.setText("Developed by Enoc Nehemías García Alcántara");
        pnlRedesDesarrollador.add(lblPiedefoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lblNumero.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(51, 153, 0));
        lblNumero.setText("Numero: +50587620936");
        pnlRedesDesarrollador.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 153, 0));
        lblEmail.setText("Email: Enocgarcia2005@gmail.com");
        pnlRedesDesarrollador.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        btnFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFacebookMousePressed(evt);
            }
        });
        pnlRedesDesarrollador.add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        btnTikTok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiktok.png"))); // NOI18N
        btnTikTok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTikTok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTikTokMousePressed(evt);
            }
        });
        pnlRedesDesarrollador.add(btnTikTok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        btnInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instagram-3.png"))); // NOI18N
        btnInstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInstagramMousePressed(evt);
            }
        });
        pnlRedesDesarrollador.add(btnInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        background.add(pnlRedesDesarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 570, 360));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        configurar.colorearEtiqueta(VERDE_CLARO, btnIniciarSesion);
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        configurar.colorearEtiqueta(VERDE_OSCURO, btnIniciarSesion);
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        configurar.confirmarSalir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAcercaDeNosotrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeNosotrosMouseEntered
        btnAcercaDeNosotros.setForeground(VERDE_CLARO);
    }//GEN-LAST:event_btnAcercaDeNosotrosMouseEntered

    private void btnAcercaDeNosotrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeNosotrosMouseExited
        btnAcercaDeNosotros.setForeground(VERDE_OSCURO);
    }//GEN-LAST:event_btnAcercaDeNosotrosMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        animarInicio.abrirVentana(pnlDescripcionPrograma, logoGrande);
    }//GEN-LAST:event_formWindowOpened

    private void btnIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMousePressed
        animacionBtnInicioS.quitarPantallaInicio(pnlDescripcionPrograma, logoGrande, pnlLogin,
                btnVolverAInicio, btnIniciarSesion);
        animacionBtnInicioS.quitarPantallaAcercaDeNosotros(pnlRedesDesarrollador, pnlAcercaDeNosotros, pnlLogin,
                btnVolverAInicio, btnIniciarSesion);
    }//GEN-LAST:event_btnIniciarSesionMousePressed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setForeground(VERDE_CLARO);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setForeground(VERDE_OSCURO);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnVolverAInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAInicioMouseEntered
        btnVolverAInicio.setForeground(VERDE_CLARO);
    }//GEN-LAST:event_btnVolverAInicioMouseEntered

    private void btnVolverAInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAInicioMouseExited
        btnVolverAInicio.setForeground(VERDE_OSCURO);
    }//GEN-LAST:event_btnVolverAInicioMouseExited

    private void btnVolverAInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAInicioMousePressed
        animarVolver.quitarLogin(pnlDescripcionPrograma, btnVolverAInicio, btnIniciarSesion,
                pnlLogin, logoGrande);
        animarVolver.quitarRedes(pnlDescripcionPrograma, btnVolverAInicio, btnIniciarSesion,
                pnlRedesDesarrollador, pnlAcercaDeNosotros, logoGrande);
    }//GEN-LAST:event_btnVolverAInicioMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        configurar.crearPlaceHolder(txtUsuario, txtContra, "Introduzca su usuario", "JPasword");
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        configurar.crearPlaceHolder(txtContra, txtUsuario, "JPasword", "Introduzca su usuario");
    }//GEN-LAST:event_txtContraMousePressed

    private void btnFacebookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebookMousePressed
        configurar.redirigir(FACEBOOK);
    }//GEN-LAST:event_btnFacebookMousePressed

    private void btnTikTokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTikTokMousePressed
        configurar.redirigir(TIKTOK);
    }//GEN-LAST:event_btnTikTokMousePressed

    private void btnAcercaDeNosotrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeNosotrosMousePressed
        animarInfoAutor.quitarPantallaPrincipal(pnlAcercaDeNosotros, pnlRedesDesarrollador,
                btnVolverAInicio, logoGrande, pnlDescripcionPrograma);
        animarInfoAutor.quitarPantallaLogin(pnlAcercaDeNosotros, pnlRedesDesarrollador,
                btnVolverAInicio, btnIniciarSesion, pnlLogin);
    }//GEN-LAST:event_btnAcercaDeNosotrosMousePressed

    private void btnInstagramMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstagramMousePressed
        configurar.redirigir(INSTAGRAM);
    }//GEN-LAST:event_btnInstagramMousePressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (alumno.isSelected()) {
            validar.autenticar("Alumnos", alumnosDatos, txtUsuario, txtContra);
        }

        if (maestro.isSelected()) {
            validar.autenticar("Maestros", maestrosDatos, txtUsuario, txtContra);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SepararHeader;
    private static javax.swing.ButtonGroup agruparbotones;
    private javax.swing.JRadioButton alumno;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnAcercaDeNosotros;
    private javax.swing.JLabel btnFacebook;
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnInstagram;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel btnTikTok;
    private javax.swing.JLabel btnVolverAInicio;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel iconoPasword;
    private javax.swing.JLabel iconoUser;
    private javax.swing.JLabel imagenDesarrollador;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEncabezadoLogin;
    private javax.swing.JLabel lblLinea1Info;
    private javax.swing.JLabel lblLinea2Info;
    private javax.swing.JLabel lblLinea3Info;
    private javax.swing.JLabel lblLinea4Info;
    private javax.swing.JLabel lblLinea5Info;
    private javax.swing.JLabel lblLinea6Info;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiedefoto;
    private javax.swing.JLabel lblTituloInfo;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel logoGrande;
    private javax.swing.JLabel logoPeque;
    private javax.swing.JRadioButton maestro;
    private javax.swing.JLabel nombreApp;
    private javax.swing.JPanel pnlAcercaDeNosotros;
    private javax.swing.JPanel pnlDescripcionPrograma;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRedesDesarrollador;
    private javax.swing.JSeparator separadorAcercaDeNosotros;
    private javax.swing.JSeparator separadorContra;
    private javax.swing.JSeparator separadorUserA;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
