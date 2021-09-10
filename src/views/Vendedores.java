package views;

import controllers.VendedoresController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.VendedoresModel;

public class Vendedores extends javax.swing.JPanel {
    
    private VendedoresController controller = null; 
    private DefaultTableModel modeloTabla;

    public Vendedores(VendedoresController controller) {
        initComponents();
        this.controller = controller;
        this.initVendedoresComboBox();
        
    }
    
    public void initTable(List<VendedoresModel> vendedores) {
        JTableHeader header = this.table.getTableHeader();
        header.setBackground(new Color(0,93,139));
        header.setForeground(Color.white);
        header.setFont(new Font("Roboto", Font.PLAIN, 14));
        header.setBorder(null);
        
        this.modeloTabla = new DefaultTableModel();
        this.modeloTabla.addColumn("ID");
        this.modeloTabla.addColumn("NOMBRE");
        this.table.setModel(modeloTabla);
        for(VendedoresModel vendedor: vendedores) {
            String [] row = new String[2];
            row[0] = vendedor.getCodigo();
            row[1] = vendedor.getNombre();
            this.modeloTabla.addRow(row);
        }
    }
    
    public void initVendedoresComboBox() {
        List<VendedoresModel> vendedores = this.controller.getListaVendedores();
        
        for(VendedoresModel vendedor: vendedores){
            this.idComboBox.addItem(vendedor.toString());
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();
        tablePanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tableSeparator = new javax.swing.JSeparator();
        agregarVendedorLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        idSeparator = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        nombreSeparator = new javax.swing.JSeparator();
        agregarButton = new javax.swing.JPanel();
        agregarButtonLabel = new javax.swing.JLabel();
        eliminarVendedorLabel = new javax.swing.JLabel();
        eliminarLabel = new javax.swing.JLabel();
        eliminarTextField = new javax.swing.JTextField();
        eliminarSeparator = new javax.swing.JSeparator();
        eliminarButton = new javax.swing.JPanel();
        eliminarButtonLabel = new javax.swing.JLabel();
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
        actualizarVendedorLabel = new javax.swing.JLabel();
        actualizarIdLabel = new javax.swing.JLabel();
        actualizarNombreLabel = new javax.swing.JLabel();
        actualizarNombreTextField = new javax.swing.JTextField();
        nombreSeparator1 = new javax.swing.JSeparator();
        actualizarButton = new javax.swing.JPanel();
        actualizarButtonLabel = new javax.swing.JLabel();
        idComboBox = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Vendedores");

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        table.setShowHorizontalLines(true);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        tablePanel.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        agregarVendedorLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        agregarVendedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        agregarVendedorLabel.setText("AGREGAR VENDEDOR");

        idLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID");

        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idTextField.setBorder(null);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreLabel.setText("NOMBRE");

        nombreTextField.setBackground(new java.awt.Color(255, 255, 255));
        nombreTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreTextField.setBorder(null);
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        agregarButton.setBackground(new java.awt.Color(0, 93, 139));
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarButtonMouseClicked(evt);
            }
        });

        agregarButtonLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        agregarButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        agregarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarButtonLabel.setText("+");

        javax.swing.GroupLayout agregarButtonLayout = new javax.swing.GroupLayout(agregarButton);
        agregarButton.setLayout(agregarButtonLayout);
        agregarButtonLayout.setHorizontalGroup(
            agregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        agregarButtonLayout.setVerticalGroup(
            agregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        eliminarVendedorLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        eliminarVendedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        eliminarVendedorLabel.setText("ELIMINAR VENDEDOR");

        eliminarLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        eliminarLabel.setForeground(new java.awt.Color(0, 0, 0));
        eliminarLabel.setText("ID");

        eliminarTextField.setBackground(new java.awt.Color(255, 255, 255));
        eliminarTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        eliminarTextField.setBorder(null);

        eliminarButton.setBackground(new java.awt.Color(255, 51, 51));
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseClicked(evt);
            }
        });

        eliminarButtonLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        eliminarButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarButtonLabel.setText("-");

        javax.swing.GroupLayout eliminarButtonLayout = new javax.swing.GroupLayout(eliminarButton);
        eliminarButton.setLayout(eliminarButtonLayout);
        eliminarButtonLayout.setHorizontalGroup(
            eliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eliminarButtonLayout.setVerticalGroup(
            eliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        actualizarVendedorLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        actualizarVendedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        actualizarVendedorLabel.setText("ACTUALIZAR VENDEDOR");

        actualizarIdLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        actualizarIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        actualizarIdLabel.setText("ID");

        actualizarNombreLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        actualizarNombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        actualizarNombreLabel.setText("NOMBRE");

        actualizarNombreTextField.setBackground(new java.awt.Color(255, 255, 255));
        actualizarNombreTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        actualizarNombreTextField.setBorder(null);
        actualizarNombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarNombreTextFieldActionPerformed(evt);
            }
        });

        actualizarButton.setBackground(new java.awt.Color(0, 93, 139));
        actualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        actualizarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarButtonMouseClicked(evt);
            }
        });

        actualizarButtonLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        actualizarButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        actualizarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarButtonLabel.setText(">");

        javax.swing.GroupLayout actualizarButtonLayout = new javax.swing.GroupLayout(actualizarButton);
        actualizarButton.setLayout(actualizarButtonLayout);
        actualizarButtonLayout.setHorizontalGroup(
            actualizarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(actualizarButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        actualizarButtonLayout.setVerticalGroup(
            actualizarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        idComboBox.setBackground(new java.awt.Color(255, 255, 255));
        idComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idComboBox.setForeground(new java.awt.Color(0, 0, 0));
        idComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione id" }));
        idComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idLabel)
                                        .addComponent(idSeparator)
                                        .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombreLabel)
                                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(42, 42, 42)
                                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agregarVendedorLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(actualizarIdLabel)
                                        .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(actualizarNombreLabel)
                                        .addComponent(actualizarNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(actualizarVendedorLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                            .addComponent(eliminarLabel)
                                            .addGap(586, 586, 586))
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(eliminarVendedorLabel)
                                                .addComponent(eliminarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(eliminarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregarVendedorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(nombreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizarVendedorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(actualizarIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(actualizarNombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(actualizarNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(eliminarVendedorLabel)
                        .addGap(12, 12, 12)
                        .addComponent(eliminarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void agregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarButtonMouseClicked
        String id = idTextField.getText();
        String nombre = nombreTextField.getText();
        this.controller.setId(id);
        this.controller.setNombre(nombre);
        controller.agregarButtonClicked();
        idTextField.setText("");
        nombreTextField.setText("");
    }//GEN-LAST:event_agregarButtonMouseClicked

    private void eliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseClicked
        String id = eliminarTextField.getText();
        this.controller.eliminarButtonClicked(id);
        eliminarTextField.setText("");
    }//GEN-LAST:event_eliminarButtonMouseClicked

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

    private void actualizarNombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarNombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarNombreTextFieldActionPerformed

    private void actualizarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseClicked
        String nombre = actualizarNombreTextField.getText();
        this.controller.actualizarButtonClicked(nombre);
        actualizarNombreTextField.setText("");
        idComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_actualizarButtonMouseClicked

    private void idComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idComboBoxItemStateChanged
        this.controller.setVendedor((String) idComboBox.getSelectedItem());
    }//GEN-LAST:event_idComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acercaButton;
    private javax.swing.JLabel acercaLabel;
    private javax.swing.JSeparator acercaSeparator;
    private javax.swing.JPanel actualizarButton;
    private javax.swing.JLabel actualizarButtonLabel;
    private javax.swing.JLabel actualizarIdLabel;
    private javax.swing.JLabel actualizarNombreLabel;
    private javax.swing.JTextField actualizarNombreTextField;
    private javax.swing.JLabel actualizarVendedorLabel;
    private javax.swing.JPanel agregarButton;
    private javax.swing.JLabel agregarButtonLabel;
    private javax.swing.JLabel agregarVendedorLabel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel cerrarButton;
    private javax.swing.JLabel cerrarLabel;
    private javax.swing.JSeparator cerrarSeparator;
    private javax.swing.JPanel eliminarButton;
    private javax.swing.JLabel eliminarButtonLabel;
    private javax.swing.JLabel eliminarLabel;
    private javax.swing.JSeparator eliminarSeparator;
    private javax.swing.JTextField eliminarTextField;
    private javax.swing.JLabel eliminarVendedorLabel;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JLabel idLabel;
    private javax.swing.JSeparator idSeparator;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JSeparator nombreSeparator;
    private javax.swing.JSeparator nombreSeparator1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPanel productosButton;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JSeparator productosSeparator;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JSeparator tableSeparator;
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
