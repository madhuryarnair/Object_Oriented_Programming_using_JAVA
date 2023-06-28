//Traffic Light

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ActionListener
{
    JTextField t;
    JRadioButton r1, r2, r3;
    JButton b;
     
    private Container c;
     
    TrafficLight()
    {
        super("Traffic Lights");
          
        c = getContentPane();
          
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("YELLOW");
        r3 = new JRadioButton("GREEN");
          
        t = new JTextField(15);
          
        b = new JButton("CLOSE");
          
        ButtonGroup bg = new ButtonGroup();
          
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
          
        add(r1);          
        add(r2);         
        add(r3);
        add(t);
        add(b);
          
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);
          
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        b.addActionListener(this);
    }
     
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();
        if (msg.equals("RED"))
        {
            c.setBackground(Color.RED);
            t.setText("STOP");
        }             
          
        else if (msg.equals("YELLOW"))
        {
            c.setBackground(Color.YELLOW);
            t.setText("READY");
        }   
          
        else if (msg.equals("GREEN"))
        {
            c.setBackground(Color.GREEN);
            t.setText("GO");
        }   
          
        else if (ae.getSource() == b)
            System.exit(0);    
    }
     
    public static void main(String args[])
    {
        new TrafficLight();
    }
}       