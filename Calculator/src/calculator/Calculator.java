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
    JButton add,sub,multi,div; // +,-,*,/
    JButton dec,equ,del,clr;
    JPanel panel; 
    Font fnt = new Font("Calibri",Font.BOLD,30);
    double num1=0,num2=0,ans=0;
    char operator;
    
    Calculator(){
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        //text field formation
        txtfield = new JTextField();
        txtfield.setBounds(50, 25, 300, 50);
        txtfield.setFont(fnt);
        txtfield.setEditable(false);
        
        //initializing operational buttons
        add = new JButton("+");
        sub = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        
        dec = new JButton(".");
        equ = new JButton("=");
        del = new JButton("Delete");
        clr = new JButton("Clear");
        
        //adding functional buttons
        func_buttons[0] = add;
        func_buttons[1] = sub;
        func_buttons[2] = multi;
        func_buttons[3] = div;
        func_buttons[4] = dec;
        func_buttons[5] = equ;
        func_buttons[6] = del;
        func_buttons[7] = clr;
        
        //formating the operational buttons
        for(int i=0;i<8;i++){
            func_buttons[i].addActionListener(this);
            func_buttons[i].setFont(fnt);
            func_buttons[i].setFocusable(false);
        }
        
        //adding objects to the frame
        frame.add(txtfield);    
        frame.setVisible(true);
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
