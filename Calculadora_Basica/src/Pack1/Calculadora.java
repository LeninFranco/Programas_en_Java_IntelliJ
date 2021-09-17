package Pack1;

import javax.swing.*;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JLabel();
        bttn_c = new javax.swing.JButton();
        bttn_div = new javax.swing.JButton();
        bttn_mult = new javax.swing.JButton();
        bttn_rest = new javax.swing.JButton();
        bttn_7 = new javax.swing.JButton();
        bttn_8 = new javax.swing.JButton();
        bttn_9 = new javax.swing.JButton();
        bttn_sum = new javax.swing.JButton();
        bttn_4 = new javax.swing.JButton();
        bttn_5 = new javax.swing.JButton();
        bttn_6 = new javax.swing.JButton();
        bttn_1 = new javax.swing.JButton();
        bttn_2 = new javax.swing.JButton();
        bttn_3 = new javax.swing.JButton();
        bttn_0 = new javax.swing.JButton();
        bttn_punt = new javax.swing.JButton();
        bttn_eq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);


        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setForeground(new java.awt.Color(0, 0, 0));
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        pantalla.setOpaque(true);
        pantalla.setHorizontalAlignment(JLabel.RIGHT);

        bttn_c.setBackground(new java.awt.Color(255, 255, 255));
        bttn_c.setForeground(new java.awt.Color(0, 0, 0));
        bttn_c.setText("C");
        bttn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_cActionPerformed(evt);
            }
        });

        bttn_div.setBackground(new java.awt.Color(255, 255, 255));
        bttn_div.setForeground(new java.awt.Color(0, 0, 0));
        bttn_div.setText("÷");
        bttn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_divActionPerformed(evt);
            }
        });

        bttn_mult.setBackground(new java.awt.Color(255, 255, 255));
        bttn_mult.setForeground(new java.awt.Color(0, 0, 0));
        bttn_mult.setText("x");
        bttn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_multActionPerformed(evt);
            }
        });

        bttn_rest.setBackground(new java.awt.Color(255, 255, 255));
        bttn_rest.setForeground(new java.awt.Color(0, 0, 0));
        bttn_rest.setText("-");
        bttn_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_restActionPerformed(evt);
            }
        });

        bttn_7.setBackground(new java.awt.Color(255, 255, 255));
        bttn_7.setForeground(new java.awt.Color(0, 0, 0));
        bttn_7.setText("7");
        bttn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_7ActionPerformed(evt);
            }
        });

        bttn_8.setBackground(new java.awt.Color(255, 255, 255));
        bttn_8.setForeground(new java.awt.Color(0, 0, 0));
        bttn_8.setText("8");
        bttn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_8ActionPerformed(evt);
            }
        });

        bttn_9.setBackground(new java.awt.Color(255, 255, 255));
        bttn_9.setForeground(new java.awt.Color(0, 0, 0));
        bttn_9.setText("9");
        bttn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_9ActionPerformed(evt);
            }
        });

        bttn_sum.setBackground(new java.awt.Color(255, 255, 255));
        bttn_sum.setForeground(new java.awt.Color(0, 0, 0));
        bttn_sum.setText("+");
        bttn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_sumActionPerformed(evt);
            }
        });

        bttn_4.setBackground(new java.awt.Color(255, 255, 255));
        bttn_4.setForeground(new java.awt.Color(0, 0, 0));
        bttn_4.setText("4");
        bttn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_4ActionPerformed(evt);
            }
        });

        bttn_5.setBackground(new java.awt.Color(255, 255, 255));
        bttn_5.setForeground(new java.awt.Color(0, 0, 0));
        bttn_5.setText("5");
        bttn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_5ActionPerformed(evt);
            }
        });

        bttn_6.setBackground(new java.awt.Color(255, 255, 255));
        bttn_6.setForeground(new java.awt.Color(0, 0, 0));
        bttn_6.setText("6");
        bttn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_6ActionPerformed(evt);
            }
        });

        bttn_1.setBackground(new java.awt.Color(255, 255, 255));
        bttn_1.setForeground(new java.awt.Color(0, 0, 0));
        bttn_1.setText("1");
        bttn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_1ActionPerformed(evt);
            }
        });

        bttn_2.setBackground(new java.awt.Color(255, 255, 255));
        bttn_2.setForeground(new java.awt.Color(0, 0, 0));
        bttn_2.setText("2");
        bttn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_2ActionPerformed(evt);
            }
        });

        bttn_3.setBackground(new java.awt.Color(255, 255, 255));
        bttn_3.setForeground(new java.awt.Color(0, 0, 0));
        bttn_3.setText("3");
        bttn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_3ActionPerformed(evt);
            }
        });

        bttn_0.setBackground(new java.awt.Color(255, 255, 255));
        bttn_0.setForeground(new java.awt.Color(0, 0, 0));
        bttn_0.setText("0");
        bttn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_0ActionPerformed(evt);
            }
        });

        bttn_punt.setBackground(new java.awt.Color(255, 255, 255));
        bttn_punt.setForeground(new java.awt.Color(0, 0, 0));
        bttn_punt.setText(".");
        bttn_punt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_puntActionPerformed(evt);
            }
        });

        bttn_eq.setBackground(new java.awt.Color(255, 255, 255));
        bttn_eq.setForeground(new java.awt.Color(0, 0, 0));
        bttn_eq.setText("=");
        bttn_eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(bttn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(bttn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(bttn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(bttn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(bttn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(bttn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(bttn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(bttn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(bttn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bttn_punt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bttn_eq, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bttn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttn_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttn_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bttn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bttn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(bttn_sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bttn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bttn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bttn_punt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(bttn_eq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void bttn_cActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText("");
    }

    private void bttn_divActionPerformed(java.awt.event.ActionEvent evt) {
        this.num1 = Float.parseFloat(pantalla.getText());
        this.operador = "/";
        this.pantalla.setText("");
    }

    private void bttn_multActionPerformed(java.awt.event.ActionEvent evt) {
        this.num1 = Float.parseFloat(pantalla.getText());
        this.operador = "*";
        this.pantalla.setText("");
    }

    private void bttn_restActionPerformed(java.awt.event.ActionEvent evt) {
        this.num1 = Float.parseFloat(pantalla.getText());
        this.operador = "-";
        this.pantalla.setText("");
    }

    private void bttn_7ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "7");
    }

    private void bttn_8ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "8");
    }

    private void bttn_9ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "9");
    }

    private void bttn_sumActionPerformed(java.awt.event.ActionEvent evt) {
        this.num1 = Float.parseFloat(pantalla.getText());
        this.operador = "+";
        this.pantalla.setText("");
    }

    private void bttn_4ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "4");
    }

    private void bttn_5ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "5");
    }

    private void bttn_6ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "6");
    }

    private void bttn_1ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "1");
    }

    private void bttn_2ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "2");
    }

    private void bttn_3ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "3");
    }

    private void bttn_eqActionPerformed(java.awt.event.ActionEvent evt) {
        if(pantalla.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese el numero faltante en la ecuacion","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.num2 = Float.parseFloat(pantalla.getText());
            switch (this.operador) {
                case "+" -> pantalla.setText(String.valueOf(this.num1 + this.num2));
                case "-" -> pantalla.setText(String.valueOf(this.num1 - this.num2));
                case "*" -> pantalla.setText(String.valueOf(this.num1 * this.num2));
                case "/" -> pantalla.setText(String.valueOf(this.num1 / this.num2));
            }
        }
    }

    private void bttn_0ActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + "0");
    }

    private void bttn_puntActionPerformed(java.awt.event.ActionEvent evt) {
        pantalla.setText(pantalla.getText() + ".");
    }

    public static void main(String [] args) {
        new Calculadora();
    }

    private javax.swing.JButton bttn_0;
    private javax.swing.JButton bttn_1;
    private javax.swing.JButton bttn_2;
    private javax.swing.JButton bttn_3;
    private javax.swing.JButton bttn_4;
    private javax.swing.JButton bttn_5;
    private javax.swing.JButton bttn_6;
    private javax.swing.JButton bttn_7;
    private javax.swing.JButton bttn_8;
    private javax.swing.JButton bttn_9;
    private javax.swing.JButton bttn_c;
    private javax.swing.JButton bttn_div;
    private javax.swing.JButton bttn_eq;
    private javax.swing.JButton bttn_mult;
    private javax.swing.JButton bttn_punt;
    private javax.swing.JButton bttn_rest;
    private javax.swing.JButton bttn_sum;
    private javax.swing.JLabel pantalla;
    private javax.swing.JPanel jPanel1;
    private double num1, num2;
    private String operador;
}
