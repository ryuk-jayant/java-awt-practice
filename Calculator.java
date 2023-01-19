//write a java awt progem to develop calculator.

import java.awt.*;
import java.awt.event.*;
 
public class Calculator extends Frame implements ActionListener
{
	//Declaration
	TextField TF1,TF2,TF3;
	Button B1,B2,B3,B4,B5;
	Label L1,L2,L3;
	int num1,num2,res;
	
	Calculator()
	{
		//TextField 
		TF1 = new TextField();
		TF1.setBounds(50,50,150,20);
		TF2 = new TextField();
		TF2.setBounds(50,100,150,20);
		TF3 =new TextField("Result:");
		TF3.setBounds(50,270,150,20);
		//Button
		B1 = new Button("+");
		B1.setBounds(50,150,50,50);
		B2 = new Button("-");
		B2.setBounds(120,150,50,50);
		B3 = new Button("*");
		B3.setBounds(50,210,50,50);
		B4 = new Button("/");
		B4.setBounds(120,210,50,50);

		B5 = new Button("cls");
		B5.setBounds(180,150,50,50);
		
		//Label
		L1 = new Label("Number1:");
		L1.setBounds(50,25, 150,20);
		L2 = new Label("Number2:");
		L2.setBounds(50,75, 150,20);
		L3 = new Label("REsult:");
		L3.setBounds(50,270,150,20);
		//Adding Components
		add(TF1);add(TF2);add(TF3);
		add(B1);add(B2);add(B3);add(B4);add(B5);
		add(L1);add(L2);add(L3);
		
		//Action Listeners
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		//Frame Properties
		setSize(250,320);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		num1 = Integer.parseInt(TF1.getText());
		num2 = Integer.parseInt(TF2.getText());
		
		if(e.getSource() == B1)
			res = num1 + num2;
		else if(e.getSource() == B2)
			res = num1 - num2;
		else if(e.getSource() == B3)
			res = num1 * num2;
		else if(e.getSource() == B4)
			res = num1 / num2;
		else if(e.getSource() == B5){
			TF1.setText("");
			TF2.setText("");
			TF3.setText("");
		}
		//Displaying Result
		String result = String.valueOf(res);
		TF3.setText(result);
	}
	
	public static void main(String args[])
	{
		new Calculator();
	}
}