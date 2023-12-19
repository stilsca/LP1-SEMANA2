package Ejer02;

import javax.swing.*;
/**
 *
 * @author Stilver Scavone Caceres
 */
public class Form02 extends JFrame{
    public Form02() {
        setLayout(null);
    }

    public static void main(String[] ar) {
        Form02 formulario1=new Form02();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
