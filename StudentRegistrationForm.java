

import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField tf1,tf2,tf3,tf4,tf5;
    Choice c;
    Button b1,b2;
    
    StudentRegistrationForm()
    {
        setVisible(true);
        setSize(500,450);
        setLayout(null);
        setTitle("Student Registration Form");
        
        l1 = new Label("Name :");
        l1.setBounds(50,50,100,20);
        add(l1);
        
        tf1 = new TextField();
        tf1.setBounds(150,50,150,20);
        add(tf1);
        
        l2 = new Label("Roll No. :");
        l2.setBounds(50,100,100,20);
        add(l2);
        
        tf2 = new TextField();
        tf2.setBounds(150,100,150,20);
        add(tf2);
        
        l3 = new Label("Branch :");
        l3.setBounds(50,150,100,20);
        add(l3);
        
        c = new Choice();
        c.setBounds(150,150,150,20);
        c.add("CSE");
        c.add("IT");
        c.add("ECE");
        c.add("ME");
        add(c);
        
        l4 = new Label("Semester :");
        l4.setBounds(50,200,100,20);
        add(l4);
        
        tf3 = new TextField();
        tf3.setBounds(150,200,150,20);
        add(tf3);
        
        l5 = new Label("Phone No. :");
        l5.setBounds(50,250,100,20);
        add(l5);
        
        tf4 = new TextField();
        tf4.setBounds(150,250,150,20);
        add(tf4);
        
        l6 = new Label("Email Id :");
        l6.setBounds(50,300,100,20);
        add(l6);
        
        tf5 = new TextField();
        tf5.setBounds(150,300,150,20);
        add(tf5);
        
        b1 = new Button("Submit");
        b1.setBounds(100,350,50,20);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new Button("Cancel");
        b2.setBounds(170,350,50,20);
        b2.addActionListener(this);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            l7 = new Label("Student Registered Successfully");
            l7.setBounds(50,400,300,20);
            add(l7);
        }
        else if(e.getSource()==b2)
        {
            System.exit(0);
        }
    }
    
    public static void main(String args[])
    {
        new StudentRegistrationForm();
    }
}