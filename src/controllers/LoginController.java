package controllers;

import java.util.ArrayList;
import java.util.List;

import views.Login;
import models.UsuariosModel;
import access.UsuarioDAO;

public class LoginController {
    
    private String usuario;
    private String password;
    
    private MainWindowController mainWindowController = null;
    private Login loginView = null;
    
    public LoginController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.loginView = new Login(this);
        this.mainWindowController.getMainWindow().setView(this.loginView);
    }
    
    public void loginButtonClicked() {
        List<UsuariosModel> usuario = new ArrayList<>();
        UsuarioDAO access = new UsuarioDAO();
        
        usuario = access.obtenerUsuario(this.usuario);
        
        if(usuario.isEmpty()) {
            this.loginView.getInfoLabel().setText("Usuario o contraseña incorrectos");
        } else {
            if(usuario.get(0).getPassword().equals(password)){
                this.mainWindowController.setUsuario(usuario.get(0));
                this.mainWindowController.initBienvenidaController();;
            } else {
                this.loginView.getInfoLabel().setText("Usuario o contraseña incorrectos");
            }
        }  
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
    
}
