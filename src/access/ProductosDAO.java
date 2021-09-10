package access;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.ProductosModel;
import utils.ConnectionDB;

public class ProductosDAO {
    
    private Connection connection = null;
    
    public List<ProductosModel> obtenerProducto(String codigo) {
        List<ProductosModel> productos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM t_productos WHERE cod_producto = ?";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, codigo);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                ProductosModel producto = new ProductosModel(result.getString(1), result.getString(2), result.getString(3), result.getInt(4));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<ProductosModel> obtenerProducto() {
        List<ProductosModel> productos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM t_productos;";
            Statement statement = this.connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                ProductosModel producto = new ProductosModel(result.getString(1), result.getString(2), result.getString(3), result.getInt(4));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void agregarProducto(ProductosModel producto) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "INSERT INTO t_productos (cod_producto, nombre_producto, descripcion_producto, precio_producto)"
                       + "VALUES(?, ?, ?, ?);";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, producto.getCodigo());
            statement.setString(2, producto.getNombre());
            statement.setString(3, producto.getDescripcion());
            statement.setInt(4, producto.getPrecio());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se inserto");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
        
    }
    
    public void actualizarProducto(ProductosModel producto) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "UPDATE t_productos SET nombre_producto = ?, descripcion_producto = ?, precio_producto = ? "
                       + "WHERE cod_producto = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getPrecio());
            statement.setString(4, producto.getCodigo());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se actualizo");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
        
    }
    
    public void eliminarProducto(String codigo) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "DELETE FROM t_productos WHERE cod_producto = ?;";
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
