package views;

import controllers.BienvenidaController;
import java.awt.Color;

public class Bienvenida extends javax.swing.JPanel {

    private BienvenidaController controller = null;
    
    public Bienvenida(BienvenidaController controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        titleSideBar = new javax.swing.JLabel();
        titleSideBarSeparator = new javax.swing.JSeparator();
        homeButton = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeSeparator = new javax.swing.JSeparator();
        vendedoresButton = new javax.swing.JPanel();
        vendedoresLabel = new javax.swing.JLabel();
        vendedoresSeparator = new javax.swing.JSeparator();
        productosButton = new javax.swing.JPanel();
        productosLabel = new javax.swing.JLabel();
        productosSeparator = new javax.swing.JSeparator();
        ventasButton = new javax.swing.JPanel();
        ventasLabel = new javax.swing.JLabel();
        ventasSeparator = new javax.swing.JSeparator();
        acercaButton = new javax.swing.JPanel();
        acercaLabel = new javax.swing.JLabel();
        acercaSeparator = new javax.swing.JSeparator();
        cerrarButton = new javax.swing.JPanel();
        cerrarLabel = new javax.swing.JLabel();
        cerrarSeparator = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        descriptionLabel1 = new javax.swing.JLabel();
        descriptionLabel2 = new javax.swing.JLabel();
        descriptionLabel3 = new javax.swing.JLabel();
        descriptionLabel4 = new javax.swing.JLabel();
        descriptionLabel5 = new javax.swing.JLabel();
        descriptionLabel6 = new javax.swing.JLabel();
        descriptionLabel7 = new javax.swing.JLabel();
        descriptionLabel8 = new javax.swing.JLabel();
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        sideBar.setBackground(new java.awt.Color(0, 93, 139));
        sideBar.setPreferredSize(new java.awt.Dimension(337, 700));

        titleSideBar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleSideBar.setForeground(new java.awt.Color(255, 255, 255));
        titleSideBar.setText("Shopy App");

        titleSideBarSeparator.setForeground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(0, 93, 139));
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        homeLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        homeSeparator.setBackground(new java.awt.Color(0, 93, 139));
        homeSeparator.setForeground(new java.awt.Color(0, 93, 139));

        vendedoresButton.setBackground(new java.awt.Color(0, 93, 139));
        vendedoresButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        vendedoresLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        vendedoresLabel.setForeground(new java.awt.Color(255, 255, 255));
        vendedoresLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        vendedoresLabel.setText("Vendedores");
        vendedoresLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vendedoresLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vendedoresLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vendedoresLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vendedoresButtonLayout = new javax.swing.GroupLayout(vendedoresButton);
        vendedoresButton.setLayout(vendedoresButtonLayout);
        vendedoresButtonLayout.setHorizontalGroup(
            vendedoresButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedoresButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vendedoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        vendedoresButtonLayout.setVerticalGroup(
            vendedoresButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        vendedoresSeparator.setBackground(new java.awt.Color(0, 93, 139));
        vendedoresSeparator.setForeground(new java.awt.Color(0, 93, 139));

        productosButton.setBackground(new java.awt.Color(0, 93, 139));
        productosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        productosLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productosLabel.setForeground(new java.awt.Color(255, 255, 255));
        productosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        productosLabel.setText("Productos");
        productosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productosLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productosLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productosLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout productosButtonLayout = new javax.swing.GroupLayout(productosButton);
        productosButton.setLayout(productosButtonLayout);
        productosButtonLayout.setHorizontalGroup(
            productosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productosButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        productosButtonLayout.setVerticalGroup(
            productosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        productosSeparator.setBackground(new java.awt.Color(0, 93, 139));
        productosSeparator.setForeground(new java.awt.Color(0, 93, 139));

        ventasButton.setBackground(new java.awt.Color(0, 93, 139));
        ventasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ventasLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ventasLabel.setForeground(new java.awt.Color(255, 255, 255));
        ventasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso.png"))); // NOI18N
        ventasLabel.setText("Ventas");
        ventasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventasLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventasLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ventasButtonLayout = new javax.swing.GroupLayout(ventasButton);
        ventasButton.setLayout(ventasButtonLayout);
        ventasButtonLayout.setHorizontalGroup(
            ventasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventasButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        ventasButtonLayout.setVerticalGroup(
            ventasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        ventasSeparator.setBackground(new java.awt.Color(0, 93, 139));
        ventasSeparator.setForeground(new java.awt.Color(0, 93, 139));

        acercaButton.setBackground(new java.awt.Color(0, 93, 139));
        acercaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        acercaLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        acercaLabel.setForeground(new java.awt.Color(255, 255, 255));
        acercaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acerca.png"))); // NOI18N
        acercaLabel.setText("Acerca de");
        acercaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acercaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acercaLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acercaLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout acercaButtonLayout = new javax.swing.GroupLayout(acercaButton);
        acercaButton.setLayout(acercaButtonLayout);
        acercaButtonLayout.setHorizontalGroup(
            acercaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acercaButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acercaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        acercaButtonLayout.setVerticalGroup(
            acercaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acercaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        acercaSeparator.setBackground(new java.awt.Color(0, 93, 139));
        acercaSeparator.setForeground(new java.awt.Color(0, 93, 139));

        cerrarButton.setBackground(new java.awt.Color(0, 93, 139));
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cerrarLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cerrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        cerrarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        cerrarLabel.setText("Cerrar Sesion");
        cerrarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout cerrarButtonLayout = new javax.swing.GroupLayout(cerrarButton);
        cerrarButton.setLayout(cerrarButtonLayout);
        cerrarButtonLayout.setHorizontalGroup(
            cerrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        cerrarButtonLayout.setVerticalGroup(
            cerrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        cerrarSeparator.setBackground(new java.awt.Color(0, 93, 139));
        cerrarSeparator.setForeground(new java.awt.Color(0, 93, 139));

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(titleSideBarSeparator)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vendedoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acercaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sideBarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendedoresSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ventasSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acercaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cerrarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleSideBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSideBarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendedoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(vendedoresSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productosButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ventasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acercaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acercaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("Bienvenido Juan");

        descriptionLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel1.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel1.setText("Bienvenido a la aplicacion de ventas, para continuar por favor selecciones el menu ");

        descriptionLabel2.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel2.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel2.setText("correspondiente en la barra lateral.");

        descriptionLabel3.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel3.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel3.setText("Vendedores");

        descriptionLabel4.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel4.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel4.setText("Menu para obtener y modificar la informacion relacionada con los vendedores.");

        descriptionLabel5.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel5.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel5.setText("Productos");

        descriptionLabel6.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel6.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel6.setText("Menu para obtener y modificar la informacion relacionada con los productos.");

        descriptionLabel7.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel7.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel7.setText("Ventas");

        descriptionLabel8.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel8.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel8.setText("Menu para obtener y modificar la informacion relacionada con las ventas.");

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Home");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(descriptionLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel2)
                .addGap(59, 59, 59)
                .addComponent(descriptionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel4)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel6)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel8)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void ventasLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMouseEntered
        ventasSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ventasLabelMouseEntered

    private void ventasLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMouseExited
        ventasSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_ventasLabelMouseExited

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_homeLabelMouseExited

    private void vendedoresLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMouseEntered
        vendedoresSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_vendedoresLabelMouseEntered

    private void vendedoresLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMouseExited
        vendedoresSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_vendedoresLabelMouseExited

    private void productosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMouseEntered
        productosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_productosLabelMouseEntered

    private void productosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMouseExited
        productosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_productosLabelMouseExited

    private void acercaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMouseEntered
        acercaSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_acercaLabelMouseEntered

    private void acercaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMouseExited
        acercaSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_acercaLabelMouseExited

    private void cerrarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMouseEntered
        cerrarSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cerrarLabelMouseEntered

    private void cerrarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMouseExited
        cerrarSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_cerrarLabelMouseExited

    private void homeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMousePressed
        this.controller.homeClicked();
    }//GEN-LAST:event_homeLabelMousePressed

    private void vendedoresLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMousePressed
        this.controller.vendedoresClicked();
    }//GEN-LAST:event_vendedoresLabelMousePressed

    private void productosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMousePressed
        this.controller.productosClicked();
    }//GEN-LAST:event_productosLabelMousePressed

    private void ventasLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMousePressed
        this.controller.ventasClicked();
    }//GEN-LAST:event_ventasLabelMousePressed

    private void cerrarLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMousePressed
        this.controller.cerrarClicked();
    }//GEN-LAST:event_cerrarLabelMousePressed

    private void acercaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMousePressed
        this.controller.acercaClicked();
    }//GEN-LAST:event_acercaLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acercaButton;
    private javax.swing.JLabel acercaLabel;
    private javax.swing.JSeparator acercaSeparator;
    private javax.swing.JPanel background;
    private javax.swing.JPanel cerrarButton;
    private javax.swing.JLabel cerrarLabel;
    private javax.swing.JSeparator cerrarSeparator;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JLabel descriptionLabel2;
    private javax.swing.JLabel descriptionLabel3;
    private javax.swing.JLabel descriptionLabel4;
    private javax.swing.JLabel descriptionLabel5;
    private javax.swing.JLabel descriptionLabel6;
    private javax.swing.JLabel descriptionLabel7;
    private javax.swing.JLabel descriptionLabel8;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JPanel productosButton;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JSeparator productosSeparator;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleMain;
    private javax.swing.JSeparator titleMainSeparator;
    private javax.swing.JLabel titleSideBar;
    private javax.swing.JSeparator titleSideBarSeparator;
    private javax.swing.JPanel vendedoresButton;
    private javax.swing.JLabel vendedoresLabel;
    private javax.swing.JSeparator vendedoresSeparator;
    private javax.swing.JPanel ventasButton;
    private javax.swing.JLabel ventasLabel;
    private javax.swing.JSeparator ventasSeparator;
    // End of variables declaration//GEN-END:variables

    public void setTitleLabel(String text) {
        titleLabel.setText(text);
    }
}
