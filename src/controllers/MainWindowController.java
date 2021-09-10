package controllers;

import models.UsuariosModel;
import views.MainWindow;

public class MainWindowController {
    
    private MainWindow mainWindow = null;
    private LoginController loginController = null;
    private VendedoresController vendedoresController = null;
    private BienvenidaController bienvenidaController = null;
    private ProductosController productosController = null;
    private VentasController ventasController = null;
    private AcercaController acercaController = null;
    
    private UsuariosModel usuario = null;

    public MainWindowController() {
        this.mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

    public VendedoresController getVendedoresController() {
        return vendedoresController;
    }

    public void initLoginController() {
        this.loginController = new LoginController(this);
        this.loginController.initView();
    }
    
    public void initBienvenidaController() {
        this.bienvenidaController = new BienvenidaController(this);
        this.bienvenidaController.initView();
    }
    
    public void initVendedoresController() {
        this.vendedoresController = new VendedoresController(this);
        this.vendedoresController.initView();
    }
    
    public void initProductosController() {
        this.productosController = new ProductosController(this);
        this.productosController.initView();
    }
    
    public void initVentasController() {
        this.ventasController = new VentasController(this);
        this.ventasController.initView();
    }
    
    public void initAcercaController() {
        this.acercaController = new AcercaController(this);
        this.acercaController.initView();
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public LoginController getLoginController() {
        return loginController;
    }
    
    public UsuariosModel getUsuario() {
        return usuario;
    }
    
    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
    
}
