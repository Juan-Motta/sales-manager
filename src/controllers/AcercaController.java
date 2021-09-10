
package controllers;

import views.About;

public class AcercaController {
    
    private MainWindowController mainWindowController = null;
    private About about = null;
    
    public AcercaController(MainWindowController mainWindowController){
        this.mainWindowController = mainWindowController;
    }
    
    public void initView(){
        this.about = new About(this);
        this.mainWindowController.getMainWindow().setView(this.about);
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
