package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.VentasModel;
import utils.ConnectionDB;

public class VentasDAO {
    private Connection connection = null;
    
    public List<VentasModel> obtenerVenta(int codigo) {
        List<VentasModel> ventas = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT id_ventas," +
                           "numero_factura," +
                           "fecha_venta," +
                           "nombre_vendedor," +
                           "nombre_producto," +
                           "precio_producto " +
                           "FROM t_ventas ventas " +
                           "INNER JOIN t_productos productos ON ventas.codigo_producto = productos.cod_producto " +
                           "INNER JOIN t_vendedores vendedores ON ventas.codigo_vendedor = vendedores.cod_vendedor WHERE id_ventas = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, codigo);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                VentasModel venta = new VentasModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getInt(8));
                ventas.add(venta);
            }
            return ventas;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<VentasModel> obtenerVenta() {
        List<VentasModel> ventas = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT id_ventas," +
                           "numero_factura," +
                           "fecha_venta," +
                           "codigo_vendedor," +
                           "nombre_vendedor," +
                           "codigo_producto," +
                           "nombre_producto," +
                           "precio_producto " +
                           "FROM t_ventas ventas " +
                           "INNER JOIN t_productos productos ON ventas.codigo_producto = productos.cod_producto " +
                           "INNER JOIN t_vendedores vendedores ON ventas.codigo_vendedor = vendedores.cod_vendedor;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                VentasModel venta = new VentasModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getInt(8));
                ventas.add(venta);
            }
            return ventas;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void agregarVenta(VentasModel venta) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "INSERT INTO t_ventas (numero_factura, codigo_producto, fecha_venta, codigo_vendedor)"
                       + "VALUES(?, ?, ?, ?);";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, venta.getNumeroFactura());
            statement.setString(2, venta.getCodigoProducto());
            statement.setString(3, venta.getFechaVenta());
            statement.setString(4, venta.getCodigoVendedor());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se inserto");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
    }
    
    public void eliminarVenta(String codigo){
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "DELETE FROM t_ventas WHERE id_ventas = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, codigo);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se borro");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
    }
    
}
