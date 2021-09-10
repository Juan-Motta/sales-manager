
package controllers;

import access.ProductosDAO;
import access.VendedoresDAO;
import access.VentasDAO;
import java.util.ArrayList;
import java.util.List;
import models.ProductosModel;
import models.VendedoresModel;
import models.VentasModel;
import views.Ventas;

public class VentasController {
    private List<VendedoresModel> listaVendedores = new ArrayList<>();
    private List<ProductosModel> listaProductos = new ArrayList<>();
    
    private String idFactura;
    private String fechaVenta;
    private String vendedor;
    private String producto;
    
    
    private MainWindowController mainWindowController = null;
    private Ventas ventasView = null;
    
    public VentasController(MainWindowController mainWindowController){
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaVendedores();
        this.obtenerListaProductos();
        this.ventasView = new Ventas(this);
        this.mainWindowController.getMainWindow().setView(this.ventasView);
        this.setTable();
    }
    
    public void setTable() {
        List<VentasModel> ventas = new ArrayList<>();
        VentasDAO access = new VentasDAO();
        
        ventas = access.obtenerVenta();
        
        this.ventasView.initTable(ventas);
    }
    
    public void obtenerListaVendedores() {
        VendedoresDAO access = new VendedoresDAO();
        this.listaVendedores = access.obtenerVendedor();
    }
    
    public void obtenerListaProductos() {
        ProductosDAO access = new ProductosDAO();
        this.listaProductos = access.obtenerProducto();
    }
    
    public void agregarButtonClicked() {
        String codigoVendedor = this.vendedor.split(" - ")[0];
        String codigoProducto = this.producto.split(" - ")[0];
        
        VentasDAO access = new VentasDAO();
        
        VentasModel venta = new VentasModel(this.idFactura, this.fechaVenta, codigoVendedor, codigoProducto);
        
        access.agregarVenta(venta);
        
        this.setTable();
    }
    
    public void eliminarButtonClicked(String codigo){
        VentasDAO access = new VentasDAO();
        access.eliminarVenta(codigo);
        this.setTable();
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public List<VendedoresModel> getListaVendedores() {
        return listaVendedores;
    }

    public List<ProductosModel> getListaProductos() {
        return listaProductos;
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
