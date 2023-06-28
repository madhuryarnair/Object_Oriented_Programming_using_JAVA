//Calculator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception.*;

class Calculator extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4, b5, b6;
     
    Calculator()
    {
        super("Calculator");
          
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        l4 = new JLabel("Operation");
        
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        t4 = new JTextField(16);
          
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
          
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b5 = new JButton("RESET");
        b6 = new JButton("CLOSE");
          
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
          
        setSize(270, 400);
        setLayout(new FlowLayout());
        setVisible(true);
          
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }         
    public void actionPerformed(ActionEvent ae) throws ArithmeticException
    {
        String s1 = t1.getText();
        String s2 = t2.getText();
               
        double x = 0, y = 0, z = 0;
               
        try
        {
            if (ae.getSource() == b1)
            {
				x = Double.parseDouble(s1);
                y = Double.parseDouble(s2);
			
                z = x + y;
                         
                t3.setText(String.valueOf(z));
                t4.setText("Addition");
            }
                    
            else if (ae.getSource() == b2)
            {
                x = Double.parseDouble(s1);
                y = Double.parseDouble(s2);
                         
                z = x - y;
                         
                t3.setText(String.valueOf(z));
                t4.setText("Subtraction");
            }
                    
            else if (ae.getSource() == b3)
            {
                x = Double.parseDouble(s1);
                y = Double.parseDouble(s2);
                         
                z = x * y;
                         
                t3.setText(String.valueOf(z));
                t4.setText("Multiplication");
            }
                    
            else if (ae.getSource() == b4)
            {
                x = Double.parseDouble(s1);
                y = Double.parseDouble(s2);
					
				if (y == 0)
				{
					t3.setText("Error");
					t4.setText("Division by Zero");
				}
					
                else
				{						
					z = x / y;
                         
					t3.setText(String.valueOf(z));
					t4.setText("Division");
				}
            }
                    
            else if (ae.getSource() == b5)
            {
                t1.setText("0");
                t2.setText("0");
                t3.setText("0");
                t4.setText("0");
            }
                    
            else if (ae.getSource() == b6)
				System.exit(0);
               
        }
               
        catch(Exception e)
        {
            System.out.println("The following exception occurred during execution");
            System.out.println(e);   
        }   
    }
     
    public static void main(String args[])
    {
        new Calculator();
    }
}
                   
                 
                    