package org.banco.app.repository;

import org.banco.app.models.Usuario;
import org.banco.app.util.ConexionBaseDatos;

import java.sql.*;

public class UsuarioRepositorio implements Repositorio<Usuario>{
    @Override
    public Usuario findOne(Integer NumCuenta) {
        Usuario u = null;
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE NumCuenta = ?")){
            stmt.setInt(1,NumCuenta);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                u = new Usuario();
                u.setCuenta(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setPrimerApellido(rs.getString(3));
                u.setSegundoApellido(rs.getString(4));
                u.setContraseña(rs.getString(5));
                u.setSaldo(rs.getFloat(6));
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return u;
    }

    @Override
    public void update(Usuario usuario) {
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("UPDATE usuarios SET saldo = ? WHERE NumCuenta = ?")){
            stmt.setFloat(1,usuario.getSaldo());
            stmt.setInt(2,usuario.getCuenta());
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
