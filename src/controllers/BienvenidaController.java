package controllers;

import views.Bienvenida;
import models.UsuariosModel;

public class BienvenidaController {
    
    private MainWindowController mainWindowController = null;
    private Bienvenida bienvenida = null;
    
    private UsuariosModel usuario = null;
    
    public BienvenidaController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
        this.usuario = this.mainWindowController.getUsuario();
    }
    
    public void initView() {
        this.bienvenida = new Bienvenida(this);
        this.mainWindowController.getMainWindow().setView(this.bienvenida);
        this.bienvenida.setTitleLabel("Bienvenido " + this.usuario.getNombre());
    }
    
    public void homeClicked() {
        this.mainWindowController.initBienvenidaController();
    }
    
    public void vendedoresClicked() {
        this.mainWindowController.initVendedoresController();
    }
    
    public void productosClicked() {
        this.mainWindowController.initProductosController();
    }
    
    public void ventasClicked() {
        this.mainWindowController.initVentasController();
    } 
    
    public void acercaClicked() {
        this.mainWindowController.initAcercaController();
    }
    
    public void cerrarClicked() {
        this.mainWindowController.initLoginController();
    }
}
