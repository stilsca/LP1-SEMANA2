package Ejer02;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Stilver Scavone Caceres
 */
public class Form04 extends JFrame implements ActionListener{
    JButton boton1;
    public Form04() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        Form04 formulario1=new Form04();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
