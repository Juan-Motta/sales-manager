package views;

import controllers.AcercaController;
import java.awt.Color;

public class About extends javax.swing.JPanel {

    AcercaController controller = null;
    
    public About(AcercaController controller) {
        this.controller = controller;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(185, Short.MAX_VALUE))
        );

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Acerca del programa");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Shopy App");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Creado por: Juan Andres Lopez Motta");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Github: /Juan-Motta");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Reto 5 Ciclo de Java Mision TIC 2022");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleMain, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_homeLabelMouseExited

    private void homeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMousePressed
        this.controller.homeClicked();
    }//GEN-LAST:event_homeLabelMousePressed

    private void vendedoresLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMouseEntered
        vendedoresSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_vendedoresLabelMouseEntered

    private void vendedoresLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMouseExited
        vendedoresSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_vendedoresLabelMouseExited

    private void vendedoresLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedoresLabelMousePressed
        this.controller.vendedoresClicked();
    }//GEN-LAST:event_vendedoresLabelMousePressed

    private void productosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMouseEntered
        productosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_productosLabelMouseEntered

    private void productosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMouseExited
        productosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_productosLabelMouseExited

    private void productosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMousePressed
        this.controller.productosClicked();
    }//GEN-LAST:event_productosLabelMousePressed

    private void ventasLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMouseEntered
        ventasSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ventasLabelMouseEntered

    private void ventasLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMouseExited
        ventasSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_ventasLabelMouseExited

    private void ventasLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasLabelMousePressed
        this.controller.ventasClicked();
    }//GEN-LAST:event_ventasLabelMousePressed

    private void acercaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMouseEntered
        acercaSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_acercaLabelMouseEntered

    private void acercaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMouseExited
        acercaSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_acercaLabelMouseExited

    private void acercaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaLabelMousePressed
        this.controller.acercaClicked();
    }//GEN-LAST:event_acercaLabelMousePressed

    private void cerrarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMouseEntered
        cerrarSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cerrarLabelMouseEntered

    private void cerrarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMouseExited
        cerrarSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_cerrarLabelMouseExited

    private void cerrarLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLabelMousePressed
        this.controller.cerrarClicked();
    }//GEN-LAST:event_cerrarLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acercaButton;
    private javax.swing.JLabel acercaLabel;
    private javax.swing.JSeparator acercaSeparator;
    private javax.swing.JPanel cerrarButton;
    private javax.swing.JLabel cerrarLabel;
    private javax.swing.JSeparator cerrarSeparator;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel productosButton;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JSeparator productosSeparator;
    private javax.swing.JPanel sideBar;
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
}
