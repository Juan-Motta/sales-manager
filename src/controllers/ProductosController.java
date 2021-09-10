package controllers;

import access.ProductosDAO;
import java.util.ArrayList;
import java.util.List;
import models.ProductosModel;
import views.Productos;

public class ProductosController {
    
    private List<ProductosModel> listaProductos = new ArrayList<>();
    
    private String productoSeleccionado;
    private String id;
    private String nombre;
    private String descripcion;
    private int precio;
    
    private MainWindowController mainWindowController = null;
    private Productos productosView = null;
    
    public ProductosController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaProductos();
        this.productosView = new Productos(this);
        this.mainWindowController.getMainWindow().setView(this.productosView);
        this.setTable();
    }
    
    public void obtenerListaProductos() {
        ProductosDAO access = new ProductosDAO();
        this.listaProductos = access.obtenerProducto();
    }
    
    public void setTable() {
        List<ProductosModel> productos = new ArrayList<>();
        ProductosDAO access = new ProductosDAO();
        
        productos = access.obtenerProducto();
        
        productosView.initTable(productos);
    }
    
    
    public void agregarButtonClicked() {
        ProductosDAO access = new ProductosDAO();
        ProductosModel producto = new ProductosModel(this.id, this.nombre, this.descripcion, this.precio);
        access.agregarProducto(producto);
        this.setTable();
        
    }
    
    public void eliminarButtonClicked(String id) {
        ProductosDAO access = new ProductosDAO();
        access.eliminarProducto(id);
        this.setTable();
    }
    
    public void actualizarButtonClicked(String nombre, String descripcion, String precio){
        String id = this.productoSeleccionado.split(" - ")[0];
        ProductosModel producto = new ProductosModel(id, nombre, descripcion, Integer.parseInt(precio));
        ProductosDAO access = new ProductosDAO();
        access.actualizarProducto(producto);
        this.setTable();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setProductoSeleccionado(String productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
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
