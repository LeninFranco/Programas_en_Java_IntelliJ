package org.banco.app;

import org.banco.app.models.Usuario;
import org.banco.app.repository.UsuarioRepositorio;

import javax.swing.*;

public class AppBanco extends javax.swing.JFrame{

    private javax.swing.JButton BotonAcceder;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonDepositar;
    private javax.swing.JButton BotonRetirar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVerificar;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel LabelCuenta;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JCheckBox MostrarContraseña;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JPasswordField inputContraseña;
    private javax.swing.JTextField inputCuenta;
    private javax.swing.JTextField inputMonto;
    private javax.swing.JLayeredPane jLayeredPane1;
    private UsuarioRepositorio cursor;

    public AppBanco() {
        initComponents();
        cursor = new UsuarioRepositorio();
    }

    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        inputCuenta = new javax.swing.JTextField();
        inputContraseña = new javax.swing.JPasswordField();
        MostrarContraseña = new javax.swing.JCheckBox();
        BotonVerificar = new javax.swing.JButton();
        BotonAcceder = new javax.swing.JButton();
        Separador1 = new javax.swing.JSeparator();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        LabelCuenta = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelSaldo = new javax.swing.JLabel();
        Separador2 = new javax.swing.JSeparator();
        Label6 = new javax.swing.JLabel();
        inputMonto = new javax.swing.JTextField();
        BotonRetirar = new javax.swing.JButton();
        BotonDepositar = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BancoShido");
        setResizable(false);

        Label1.setText("Numero de Cuenta:");

        Label2.setText("Contraseña:");

        inputContraseña.setEnabled(false);

        MostrarContraseña.setText("Mostrar Contraseña");
        MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaActionPerformed(evt);
            }
        });

        BotonVerificar.setText("Verificar");
        BotonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerificarActionPerformed(evt);
            }
        });

        BotonAcceder.setText("Acceder");
        BotonAcceder.setEnabled(false);
        BotonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccederActionPerformed(evt);
            }
        });

        Label3.setText("Numero de Cuenta:");

        Label4.setText("Nombre Completo:\n");

        Label5.setText("Saldo Actual: $\n");

        LabelCuenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LabelCuenta.setText("Desconocido");

        LabelNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LabelNombre.setText("Desconocido");

        LabelSaldo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LabelSaldo.setText("0.00");

        Label6.setText("Monto: $");

        inputMonto.setText("0.00");
        inputMonto.setEnabled(false);

        BotonRetirar.setText("Retirar");
        BotonRetirar.setEnabled(false);
        BotonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRetirarActionPerformed(evt);
            }
        });

        BotonDepositar.setText("Depositar");
        BotonDepositar.setEnabled(false);
        BotonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDepositarActionPerformed(evt);
            }
        });

        BotonCerrar.setText("Cerrar Sesión");
        BotonCerrar.setEnabled(false);
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir de la Aplicación");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Label1)
                                        .addComponent(Label2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MostrarContraseña)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(inputCuenta)
                                                        .addComponent(inputContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(BotonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(BotonAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(12, 12, 12))
                        .addComponent(Separador1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Label3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LabelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Label4)
                                                                .addGap(21, 21, 21)
                                                                .addComponent(LabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(Label5)
                                                .addGap(10, 10, 10)
                                                .addComponent(LabelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Label6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(BotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                                        .addComponent(BotonDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(BotonRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(Separador2)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotonVerificar)
                                        .addComponent(Label1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputContraseña)
                                        .addComponent(Label2)
                                        .addComponent(BotonAcceder))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostrarContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelCuenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label4)
                                        .addComponent(LabelNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelSaldo))
                                .addGap(18, 18, 18)
                                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label6)
                                        .addComponent(inputMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BotonDepositar)
                                        .addComponent(BotonRetirar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BotonCerrar)
                                        .addComponent(BotonSalir))
                                .addGap(17, 17, 17))
        );

        pack();
    }

    private void MostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraseñaActionPerformed
        if(MostrarContraseña.isSelected() && inputContraseña.isEnabled()){
            inputContraseña.setEchoChar((char)0);
        }
        else{
            inputContraseña.setEchoChar('*');
        }
    }

    private void BotonVerificarActionPerformed(java.awt.event.ActionEvent evt) {
        if(isInteger(inputCuenta.getText())){
            Usuario u = cursor.findOne(Integer.parseInt(inputCuenta.getText()));
            if(u != null){
                JOptionPane.showMessageDialog(null,"Se encontro al usuario de la cuenta "+inputCuenta.getText(),"¡Usuario Validado!",JOptionPane.INFORMATION_MESSAGE);
                inputCuenta.setEnabled(false);
                BotonVerificar.setEnabled(false);
                inputContraseña.setEnabled(true);
                BotonAcceder.setEnabled(true);
            }
            else {
                JOptionPane.showMessageDialog(null,"No se encontro al usuario de la cuenta "+inputCuenta.getText(),"¡ERROR!",JOptionPane.ERROR_MESSAGE);
                inputCuenta.setText("");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Favor de ingresar datos validos","¡ERROR!",JOptionPane.ERROR_MESSAGE);
            inputCuenta.setText("");
        }
    }

    private void BotonAccederActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario u = cursor.findOne(Integer.parseInt(inputCuenta.getText()));
        String password = String.valueOf(inputContraseña.getPassword());
        if(password.equals(u.getContraseña())){
            JOptionPane.showMessageDialog(null,"Bienvenido "+u.getNombre(),"¡Contraseña Correcta!",JOptionPane.INFORMATION_MESSAGE);
            inputContraseña.setEnabled(false);
            BotonAcceder.setEnabled(false);
            inputMonto.setEnabled(true);
            BotonDepositar.setEnabled(true);
            BotonRetirar.setEnabled(true);
            BotonCerrar.setEnabled(true);
            BotonSalir.setEnabled(false);
            LabelCuenta.setText(String.valueOf(u.getCuenta()));
            LabelNombre.setText(u.getNombre() + " " + u.getPrimerApellido() + " " + u.getSegundoApellido());
            LabelSaldo.setText(String.valueOf(u.getSaldo()));
            inputMonto.setText("0.00");
        }
        else {
            JOptionPane.showMessageDialog(null,"Contraseña incorrecta vuelva a intentar","¡ERROR!",JOptionPane.ERROR_MESSAGE);
            inputContraseña.setText("");
        }
    }

    private void BotonDepositarActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario u = cursor.findOne(Integer.parseInt(inputCuenta.getText()));
        if(isFloat(inputMonto.getText())){
            u.depositarMonto(Float.parseFloat(inputMonto.getText()));
            LabelSaldo.setText(String.valueOf(u.getSaldo()));
            cursor.update(u);
            JOptionPane.showMessageDialog(null,"Deposito completado","¡Operacion Exitosa!",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Favor de ingresar datos validos","¡ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        inputMonto.setText("0.00");
    }

    private void BotonRetirarActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario u = cursor.findOne(Integer.parseInt(inputCuenta.getText()));
        if(isFloat(inputMonto.getText())){
            if(u.getSaldo() > Float.parseFloat(inputMonto.getText())){
                u.retirarMonto(Float.parseFloat(inputMonto.getText()));
                LabelSaldo.setText(String.valueOf(u.getSaldo()));
                cursor.update(u);
                JOptionPane.showMessageDialog(null,"Retiro completado","¡Operacion Exitosa!",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"No tiene el saldo suficiente para el retiro","¡ERROR!",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Favor de ingresar datos validos","¡ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        inputMonto.setText("0.00");
    }

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        int opc = JOptionPane.showConfirmDialog(null,"¿Esta seguro de cerrar sesión?","¿Desea cerrar?",JOptionPane.YES_NO_OPTION);
        if(opc == 0){
            LabelCuenta.setText("Desconocido");
            LabelNombre.setText("Desconocido");
            LabelSaldo.setText("0.00");
            inputMonto.setText("0.00");
            inputCuenta.setText("");
            inputContraseña.setText("");
            inputMonto.setEnabled(false);
            BotonCerrar.setEnabled(false);
            BotonDepositar.setEnabled(false);
            BotonRetirar.setEnabled(false);
            inputCuenta.setEnabled(true);
            BotonVerificar.setEnabled(true);
            inputContraseña.setEnabled(false);
            BotonAcceder.setEnabled(false);
            BotonSalir.setEnabled(true);
        }
    }

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {
        int opc = JOptionPane.showConfirmDialog(null,"¿Esta seguro de salir de la aplicación","¿Desea salir?",JOptionPane.YES_NO_OPTION);
        if(opc == 0){
            System.exit(0);
        }
    }

    private boolean isInteger(String num){
        try{
            Integer var = Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isFloat(String num){
        try{
            Float var = Float.parseFloat(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new AppBanco().setVisible(true));
    }
}
