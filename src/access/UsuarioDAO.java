package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.UsuariosModel;
import utils.ConnectionDB;

public class UsuarioDAO {
    private Connection connection = null;
    
    public List<UsuariosModel> obtenerUsuario(String id) {
        List<UsuariosModel> usuarios = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT cod_usuario, " +
                         "nombre_usuario," +
                         "id_usuario, " +
                         "CONVERT(AES_DECRYPT(clave_usuario, 'uDim4jqfaw9Nrwiz4qyGXkZUwpMHdz4w8WxPwahtK') USING utf8) AS clave_usuario " +
                         "FROM t_usuarios WHERE id_usuario = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                UsuariosModel usuario = new UsuariosModel(result.getString(1), result.getString(2), result.getString(3), result.getString(4));
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException e) {
            return null;
        }
    }
}