package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.VendedoresModel;
import utils.ConnectionDB;

public class VendedoresDAO {
    private Connection connection = null;
    
    public List<VendedoresModel> obtenerVendedor(String codigo) {
        List<VendedoresModel> vendedores = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM t_vendedores WHERE cod_vendedor = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, codigo);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                VendedoresModel vendedor = new VendedoresModel(result.getString(1), result.getString(2));
                vendedores.add(vendedor);
            }
            return vendedores;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<VendedoresModel> obtenerVendedor() {
        List<VendedoresModel> vendedores = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM t_vendedores;";
            Statement statement = this.connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                VendedoresModel vendedor = new VendedoresModel(result.getString(1), result.getString(2));
                vendedores.add(vendedor);
            }
            return vendedores;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void agregarVendedor(VendedoresModel vendedor) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "INSERT INTO t_vendedores (cod_vendedor, nombre_vendedor)"
                       + "VALUES(?, ?);";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, vendedor.getCodigo());
            statement.setString(2, vendedor.getNombre());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se inserto");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
        
    }
    
    public void actualizarVendedor(VendedoresModel vendedor) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "UPDATE t_vendedores SET nombre_vendedor = ?"
                       + "WHERE cod_vendedor = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, vendedor.getNombre());
            statement.setString(2, vendedor.getCodigo());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se actualizo");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
        
    }
    
    public void eliminarVendedor(String codigo) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "DELETE FROM t_vendedores WHERE cod_vendedor = ?;";
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
