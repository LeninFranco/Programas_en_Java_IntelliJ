package org.java.crud.jdbc.repository;

import org.java.crud.jdbc.models.Cancion;
import org.java.crud.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CancionRepositorio implements Repositorio<Cancion> {
    @Override
    public List<Cancion> findall() {
        List<Cancion> canciones = new ArrayList<>();
        try (Connection conn = ConexionBaseDatos.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM canciones")){
            while(rs.next()){
                Cancion c = new Cancion();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setAlbum(rs.getString(3));
                c.setArtista(rs.getString(4));
                c.setAnio(rs.getInt(5));
                c.setDuracion(rs.getString(6));
                canciones.add(c);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return canciones;
    }

    @Override
    public Cancion findone(int id) {
        Cancion c = null;
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM canciones WHERE idCancion = ?")){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                c = new Cancion();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setAlbum(rs.getString(3));
                c.setArtista(rs.getString(4));
                c.setAnio(rs.getInt(5));
                c.setDuracion(rs.getString(6));
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return c;
    }

    @Override
    public void create(Cancion cancion) {
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO canciones(idCancion,nombre,album,artista,año,duracion) VALUES(?,?,?,?,?,?)")){
            stmt.setInt(1,cancion.getId());
            stmt.setString(2,cancion.getNombre());
            stmt.setString(3,cancion.getAlbum());
            stmt.setString(4,cancion.getArtista());
            stmt.setInt(5,cancion.getAnio());
            stmt.setString(6,cancion.getDuracion());
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Cancion cancion) {
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("UPDATE canciones SET nombre=?, album=?, artista=?, año=?,duracion=? WHERE idCancion=?")){
            stmt.setString(1,cancion.getNombre());
            stmt.setString(2,cancion.getAlbum());
            stmt.setString(3,cancion.getArtista());
            stmt.setInt(4,cancion.getAnio());
            stmt.setString(5,cancion.getDuracion());
            stmt.setInt(6,cancion.getId());
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try(Connection conn = ConexionBaseDatos.getInstance();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM canciones WHERE idCancion = ?")){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
