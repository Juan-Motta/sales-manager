
package controllers;

import access.VendedoresDAO;
import java.util.ArrayList;
import java.util.List;
import models.VendedoresModel;
import views.Vendedores;

public class VendedoresController {
    
    private List<VendedoresModel> listaVendedores = new ArrayList<>();
    
    private String id;
    private String nombre;
    private String vendedor;
    
    private MainWindowController mainWindowController = null;
    private Vendedores vendedoresView = null;
    
    public VendedoresController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaVendedores();
        this.vendedoresView = new Vendedores(this);
        this.mainWindowController.getMainWindow().setView(this.vendedoresView);
        this.setTable();
    }
    
    public void obtenerListaVendedores() {
        VendedoresDAO access = new VendedoresDAO();
        this.listaVendedores = access.obtenerVendedor();
    }
    
    public void setTable() {
        List<VendedoresModel> vendedores = new ArrayList<>();
        VendedoresDAO access = new VendedoresDAO();
        
        vendedores = access.obtenerVendedor();
        
        vendedoresView.initTable(vendedores);
    }
    
    public void agregarButtonClicked() {
        VendedoresDAO access = new VendedoresDAO();
        VendedoresModel vendedor = new VendedoresModel(this.id, this.nombre);
        
        access.agregarVendedor(vendedor);
        this.setTable();
    }
    
    public void eliminarButtonClicked(String id) {
        VendedoresDAO access = new VendedoresDAO();
        access.eliminarVendedor(id);
        this.setTable();
    }
    
    public void actualizarButtonClicked(String nombre){
        String id = this.vendedor.split(" - ")[0];
        VendedoresModel vendedor = new VendedoresModel(id, nombre);
        VendedoresDAO access = new VendedoresDAO();
        access.actualizarVendedor(vendedor);
        this.setTable();
    }
    
    public List<VendedoresModel> getListaVendedores() {
        return listaVendedores;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
