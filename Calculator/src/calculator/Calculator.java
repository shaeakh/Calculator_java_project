/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Shaeakh
 */


public class Calculator implements ActionListener {

    // all the initialization
    JFrame frame; //bg
    JTextField txtfield; //display 
    JButton[] num_buttons = new JButton[10]; //0,1,2,3,4,5,6,7,8,9
    JButton[] func_buttons = new JButton[8]; //
    JButton add,sub,multi,div;
    JButton dec,equ,del,clr;
    JPanel panel;
    
    
    Calculator(){
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         Calculator calc = new Calculator();
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
