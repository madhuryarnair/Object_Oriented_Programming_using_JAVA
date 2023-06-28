

import java.awt.*;
import java.awt.event.*;
class  EventHandle extends Frame implements ActionListener
{
	TextField textField;
	EventHandle()
	{
		textField = new TextField();
		textField.setBounds(60,50,170,20);
		Button button = new Button("Quote");
		button.setBounds(90,140,75,40);
		//1.Registration
		button.addActionListener(this);
		add(button);
		add(textField);
		setSize(250,250);
		setLayout(null);
		setVisible(true);
}
//2.Event Button click  calls action performed method
	
	public void actionPerformed(ActionEvent e)
	{
		textField.setText("Keep Learning");
	}
	public static void main(String args[])
	{
		new EventHandle();
	}
}