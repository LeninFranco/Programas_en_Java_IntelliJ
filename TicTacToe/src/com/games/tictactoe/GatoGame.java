package com.games.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GatoGame implements ActionListener {
    JFrame frame;
    JLabel lb;
    JPanel cabezera, panel1, panel2;
    JButton btnRestart;
    JButton[] btn;
    boolean turno = true;
    int cont = 0;


    public void  setCabezera(){
        cabezera = new JPanel();
        cabezera.setLayout(new FlowLayout());
        lb = new JLabel("Turno de X");
        lb.setFont(new Font("Arial Black", Font.BOLD,14));
        cabezera.add(lb);
    }

    public void setPanel1(){
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,3));
        btn = new JButton[9];
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton(" ");
            btn[i].setPreferredSize(new Dimension(100,100));
            btn[i].setBackground(Color.black);
            btn[i].setForeground(Color.white);
            btn[i].setFont(new Font("Arial Black",Font.BOLD,18));
            btn[i].addActionListener(this);
            panel1.add(btn[i]);
        }
    }


    public void setPanel2(){
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        btnRestart = new JButton("Reiniciar Partida");
        btnRestart.setPreferredSize(new Dimension(300,30));
        btnRestart.setBackground(Color.black);
        btnRestart.setForeground(Color.white);
        btnRestart.setFont(new Font("Arial",Font.BOLD,14));
        btnRestart.addActionListener(this);
        panel2.add(btnRestart);
    }

    public void setFrame(){
        frame = new JFrame("Tic-Tac-Toe");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        frame.add(cabezera);
        frame.add(panel1);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }

    public GatoGame(){
        setCabezera();
        setPanel1();
        setPanel2();
        setFrame();
    }

    public void disableButtons(){
        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
    }

    public void restartButtons(){
        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(true);
            btn[i].setBackground(Color.black);
            btn[i].setText(" ");
        }
    }

    public void winner(){
        if(btn[0].getText().equals("X") && btn[1].getText().equals("X") && btn[2].getText().equals("X")){
            btn[0].setBackground(Color.RED);
            btn[1].setBackground(Color.RED);
            btn[2].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[3].getText().equals("X") && btn[4].getText().equals("X") && btn[5].getText().equals("X")){
            btn[3].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[5].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[6].getText().equals("X") && btn[7].getText().equals("X") && btn[8].getText().equals("X")){
            btn[6].setBackground(Color.RED);
            btn[7].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[0].getText().equals("X") && btn[3].getText().equals("X") && btn[6].getText().equals("X")){
            btn[0].setBackground(Color.RED);
            btn[3].setBackground(Color.RED);
            btn[6].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[1].getText().equals("X") && btn[4].getText().equals("X") && btn[7].getText().equals("X")){
            btn[1].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[7].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[2].getText().equals("X") && btn[5].getText().equals("X") && btn[8].getText().equals("X")){
            btn[2].setBackground(Color.RED);
            btn[5].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[0].getText().equals("X") && btn[4].getText().equals("X") && btn[8].getText().equals("X")){
            btn[0].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[2].getText().equals("X") && btn[4].getText().equals("X") && btn[6].getText().equals("X")){
            btn[2].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[6].setBackground(Color.RED);
            lb.setText("¡GANADOR X!");
            disableButtons();
        }
        else if(btn[0].getText().equals("O") && btn[1].getText().equals("O") && btn[2].getText().equals("O")){
            btn[0].setBackground(Color.RED);
            btn[1].setBackground(Color.RED);
            btn[2].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[3].getText().equals("O") && btn[4].getText().equals("O") && btn[5].getText().equals("O")){
            btn[3].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[5].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[6].getText().equals("O") && btn[7].getText().equals("O") && btn[8].getText().equals("O")){
            btn[6].setBackground(Color.RED);
            btn[7].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[0].getText().equals("O") && btn[3].getText().equals("O") && btn[6].getText().equals("O")){
            btn[0].setBackground(Color.RED);
            btn[3].setBackground(Color.RED);
            btn[6].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[1].getText().equals("O") && btn[4].getText().equals("O") && btn[7].getText().equals("O")){
            btn[1].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[7].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[2].getText().equals("O") && btn[5].getText().equals("O") && btn[8].getText().equals("O")){
            btn[2].setBackground(Color.RED);
            btn[5].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[0].getText().equals("O") && btn[4].getText().equals("O") && btn[8].getText().equals("O")){
            btn[0].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[8].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(btn[2].getText().equals("O") && btn[4].getText().equals("O") && btn[6].getText().equals("O")){
            btn[2].setBackground(Color.RED);
            btn[4].setBackground(Color.RED);
            btn[6].setBackground(Color.RED);
            lb.setText("¡GANADOR O!");
            disableButtons();
        }
        else if(cont == 9){
            lb.setText("¡EMPATE!");
            disableButtons();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selected = (JButton) e.getSource();
        if(selected == btnRestart){
            lb.setText("Turno de X");
            restartButtons();
            turno = true;
            cont = 0;
        }
        else{
            if(selected.getText().equals(" ") && turno){
                selected.setText("X");
                turno = false;
                cont++;
                lb.setText("Turno de O");
                winner();
            }
            else if(selected.getText().equals(" ") && !turno){
                selected.setText("O");
                turno = true;
                cont++;
                lb.setText("Turno de X");
                winner();
            }
            else{
                JOptionPane.showMessageDialog(null,"Esta casilla ya fue seleccionada","¡Espera!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new GatoGame();
    }
}
