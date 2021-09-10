package views;

import controllers.LoginController;
import javax.swing.JLabel;

public class Login extends javax.swing.JPanel {
    
    private LoginController controller = null;

    public Login(LoginController controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sideBar = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        pageTitleLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        usuarioSeparator = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        passwordSeparator = new javax.swing.JSeparator();
        entrarButton = new javax.swing.JPanel();
        entrarButtonLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        sideBar.setText("jLabel1");

        titleLabel.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon - small.png"))); // NOI18N
        titleLabel.setText("SHOPY APP");

        pageTitleLabel.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        pageTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        pageTitleLabel.setText("INICIAR SESIÓN");

        usuarioLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("USUARIO");

        usuarioTextField.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(0, 0, 0));
        usuarioTextField.setBorder(null);
        usuarioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioTextFieldKeyPressed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("CONSTRASEÑA");

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setBorder(null);
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyPressed(evt);
            }
        });

        entrarButton.setBackground(new java.awt.Color(0, 134, 190));
        entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entrarButtonMousePressed(evt);
            }
        });

        entrarButtonLabel.setBackground(new java.awt.Color(255, 255, 255));
        entrarButtonLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        entrarButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarButtonLabel.setText("ENTRAR");

        javax.swing.GroupLayout entrarButtonLayout = new javax.swing.GroupLayout(entrarButton);
        entrarButton.setLayout(entrarButtonLayout);
        entrarButtonLayout.setHorizontalGroup(
            entrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        entrarButtonLayout.setVerticalGroup(
            entrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        infoLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                    .addComponent(usuarioSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pageTitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuarioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entrarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuarioTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 92, Short.MAX_VALUE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(titleLabel)
                .addGap(50, 50, 50)
                .addComponent(pageTitleLabel)
                .addGap(72, 72, 72)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(passwordLabel)
                .addGap(11, 11, 11)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(infoLabel)
                .addGap(35, 35, 35)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtonMousePressed
        String usuario = usuarioTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());
        this.controller.setUsuario(usuario);
        this.controller.setPassword(password);
        controller.loginButtonClicked();
    }//GEN-LAST:event_entrarButtonMousePressed

    private void usuarioTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextFieldKeyPressed
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            String usuario = usuarioTextField.getText();
            String password = String.valueOf(passwordTextField.getPassword());
            this.controller.setUsuario(usuario);
            this.controller.setPassword(password);
            controller.loginButtonClicked();
        }
    }//GEN-LAST:event_usuarioTextFieldKeyPressed

    private void passwordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyPressed
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            String usuario = usuarioTextField.getText();
            String password = String.valueOf(passwordTextField.getPassword());
            this.controller.setUsuario(usuario);
            this.controller.setPassword(password);
            controller.loginButtonClicked();
        }
    }//GEN-LAST:event_passwordTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel entrarButton;
    private javax.swing.JLabel entrarButtonLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel sideBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JSeparator usuarioSeparator;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables

    public JLabel getInfoLabel() {
        return this.infoLabel;
    }
}
