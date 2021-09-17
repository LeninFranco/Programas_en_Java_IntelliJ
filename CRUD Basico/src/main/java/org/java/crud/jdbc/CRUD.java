package org.java.crud.jdbc;

import org.java.crud.jdbc.models.Cancion;
import org.java.crud.jdbc.repository.CancionRepositorio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CRUD extends javax.swing.JFrame{
    private javax.swing.JTextField AlbumEntry;
    private javax.swing.JTextField ArtistaEntry;
    private javax.swing.JTextField AñoEntry;
    private javax.swing.JTextField CancionEntry;
    private javax.swing.JTextField DuracionEntry;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField IDEntry;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private CancionRepositorio repositorio;
    private DefaultTableModel model;

    public CRUD(){
        initComponents();
        setLocationRelativeTo(null);
        repositorio = new CancionRepositorio();
        fillTable();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DuracionEntry = new javax.swing.JTextField();
        AñoEntry = new javax.swing.JTextField();
        ArtistaEntry = new javax.swing.JTextField();
        AlbumEntry = new javax.swing.JTextField();
        CancionEntry = new javax.swing.JTextField();
        IDEntry = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD de Canciones");
        setResizable(false);

        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("ID");
        model.addColumn("Cancion");
        model.addColumn("Album");
        model.addColumn("Artista");
        model.addColumn("Año");
        model.addColumn("Duracion");
        Table1.setModel(model);

        Table1.getColumnModel().getColumn(0).setPreferredWidth(15);
        Table1.getColumnModel().getColumn(1).setPreferredWidth(140);
        Table1.getColumnModel().getColumn(2).setPreferredWidth(140);
        Table1.getColumnModel().getColumn(3).setPreferredWidth(80);
        Table1.getColumnModel().getColumn(4).setPreferredWidth(20);
        Table1.getColumnModel().getColumn(5).setPreferredWidth(40);
        Table1.getTableHeader().setResizingAllowed(false);


        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        jLabel1.setText("ID");

        jLabel2.setText("Cancion");

        jLabel3.setText("Album");

        jLabel4.setText("Artista");

        jLabel5.setText("Año");

        jLabel6.setText("Duracion");

        Guardar.setText("Guardar");
        Guardar.addActionListener(this::GuardarActionPerformed);

        Modificar.setText("Modificar");
        Modificar.addActionListener(this::ModificarActionPerformed);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(this::EliminarActionPerformed);

        Salir.setText("Salir");
        Salir.addActionListener(this::SalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Guardar)
                                                .addGap(18, 18, 18)
                                                .addComponent(Modificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(Eliminar)
                                                .addGap(0, 2, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DuracionEntry))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(IDEntry))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CancionEntry))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AlbumEntry))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ArtistaEntry))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AñoEntry)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(IDEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(CancionEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(AlbumEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(ArtistaEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(AñoEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(DuracionEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Guardar)
                                        .addComponent(Modificar)
                                        .addComponent(Eliminar))
                                .addGap(18, 18, 18)
                                .addComponent(Salir)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {
        if(!EntryEmpty()){
            Cancion c = new Cancion();
            c.setId(Integer.parseInt(IDEntry.getText()));
            c.setNombre(CancionEntry.getText());
            c.setAlbum(AlbumEntry.getText());
            c.setArtista(ArtistaEntry.getText());
            c.setAnio(Integer.parseInt(AñoEntry.getText()));
            c.setDuracion(DuracionEntry.getText());
            repositorio.create(c);
            JOptionPane.showMessageDialog(null,"Se ha almacenado la cancion correctamente","Guardado Exitoso",JOptionPane.INFORMATION_MESSAGE);
            clearTable();
            fillTable();
            clearEntry();
        }
        else{
            JOptionPane.showMessageDialog(null,"Ha ingresado datos no validos","ERROR",JOptionPane.ERROR_MESSAGE);
            clearEntry();
        }
    }

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {
        if(!EntryEmpty()){
            Cancion c = new Cancion();
            c.setNombre(CancionEntry.getText());
            c.setAlbum(AlbumEntry.getText());
            c.setArtista(ArtistaEntry.getText());
            c.setAnio(Integer.parseInt(AñoEntry.getText()));
            c.setDuracion(DuracionEntry.getText());
            repositorio.update(c);
            JOptionPane.showMessageDialog(null,"Se ha actualizado la cancion correctamente","Guardado Exitoso",JOptionPane.INFORMATION_MESSAGE);
            clearTable();
            fillTable();
            clearEntry();
        }
        else{
            JOptionPane.showMessageDialog(null,"Ha ingresado datos no validos","ERROR",JOptionPane.ERROR_MESSAGE);
            clearEntry();
        }
    }

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if(!EntryEmpty()){
            repositorio.delete(Integer.parseInt(IDEntry.getText()));
            JOptionPane.showMessageDialog(null,"Se ha eliminado la cancion correctamente","Guardado Exitoso",JOptionPane.INFORMATION_MESSAGE);
            clearTable();
            fillTable();
            clearEntry();
        }
        else{
            JOptionPane.showMessageDialog(null,"Ha ingresado datos no validos","ERROR",JOptionPane.ERROR_MESSAGE);
            clearEntry();
        }
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        int opc = JOptionPane.showConfirmDialog(null,"¿Esta seguro de salir de la aplicacion","¿Desea salir?",JOptionPane.YES_NO_OPTION);
        if(opc == 0){
            System.exit(0);
        }
    }

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {
        int Fila = Table1.getSelectedRow();
        String id = Table1.getValueAt(Fila,0).toString();
        Cancion c = repositorio.findone(Integer.parseInt(id));
        IDEntry.setText(String.valueOf(c.getId()));
        CancionEntry.setText(c.getNombre());
        AlbumEntry.setText(c.getAlbum());
        ArtistaEntry.setText(c.getArtista());
        AñoEntry.setText(String.valueOf(c.getAnio()));
        DuracionEntry.setText(c.getDuracion());
    }

    private void clearTable(){
        for (int i = model.getRowCount() -1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
    }

    private void fillTable(){
        List<Cancion> canciones = repositorio.findall();
        for(Cancion c: canciones){
            Object[] filas = new Object[6];
            filas[0] = c.getId();
            filas[1] = c.getNombre();
            filas[2] = c.getAlbum();
            filas[3] = c.getArtista();
            filas[4] = c.getAnio();
            filas[5] = c.getDuracion();
            model.addRow(filas);
        }
    }

    private void clearEntry(){
        IDEntry.setText("");
        CancionEntry.setText("");
        AlbumEntry.setText("");
        ArtistaEntry.setText("");
        AñoEntry.setText("");
        DuracionEntry.setText("");
    }

    private boolean EntryEmpty(){
        return IDEntry.getText().equals("") || CancionEntry.getText().equals("") || AlbumEntry.getText().equals("") || ArtistaEntry.getText().equals("") || AñoEntry.getText().equals("") || DuracionEntry.getText().equals("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new CRUD().setVisible(true));
    }
}
