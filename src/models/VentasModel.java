package models;

public class VentasModel {
    private int id;
    private String numeroFactura;
    private String fechaVenta;
    private String codigoVendedor;
    private String nombreVendedor;
    private String codigoProducto;
    private String descripcionProducto;
    private int precioProducto;

    public VentasModel(int id, String numeroFactura, String fechaVenta, String codigoVendedor, String nombreVendedor, String codigoProducto, String descripcionProducto, int precioProducto) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.fechaVenta = fechaVenta;
        this.codigoVendedor = codigoVendedor;
        this.nombreVendedor = nombreVendedor;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }
    
    public VentasModel(String numeroFactura, String fechaVenta, String codigoVendedor, String codigoProducto) {
        this.numeroFactura = numeroFactura;
        this.fechaVenta = fechaVenta;
        this.codigoVendedor = codigoVendedor;
        this.codigoProducto = codigoProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return ("Codigo venta: " + this.getId() + " - " + "Codigo producto: " + this.getCodigoProducto() + " - " + "Codigo vendedor: " + this.getCodigoVendedor());
    }
 
}
