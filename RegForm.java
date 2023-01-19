import java.awt.*;
import java.awt.event.*;
import java.io.*;

class RegForm extends Frame implements ActionListener{
    Label l1, l2, l3, l4, l5;
    TextField tf1, tf2, tf3, tf4;
    Choice c1;
    Button b,b2;
    RegForm(){
        setVisible(true);
        setSize(400, 600);
        setLayout(null);
        setTitle("Student Registration Form");
    
        l1 = new Label("Name:");
        l1.setBounds(50, 50, 100, 20);
        add(l1);
    
        tf1 = new TextField();
        tf1.setBounds(200, 50, 150, 20);
        add(tf1);
    
        l2 = new Label("Email:");
        l2.setBounds(50, 100, 100, 20);
        add(l2);
    
        tf2 = new TextField();
        tf2.setBounds(200, 100, 150, 20);
        add(tf2);
    
        l3 = new Label("Gender:");
        l3.setBounds(50, 150, 100, 20);
        add(l3);
    
        c1 = new Choice();
        c1.setBounds(200, 150, 150, 20);
        c1.add("Male");
        c1.add("Female");
        add(c1);
    
        l4 = new Label("Password:");
        l4.setBounds(50, 200, 100, 20);
        add(l4);
    
        tf3 = new TextField();
        tf3.setBounds(200, 200, 150, 20);
        tf3.setEchoChar('*');
        add(tf3);
    
        l5 = new Label("Age:");
        l5.setBounds(50, 250, 100, 20);
        add(l5);
    
        tf4 = new TextField();
        tf4.setBounds(200, 250, 150, 20);
        add(tf4);
    
        b = new Button("Submit");
        b.setBounds(50, 300, 100, 20);
        add(b);
        b.addActionListener(this);
        
         b2 = new Button("Clear");
        b2.setBounds(170,300,100,20);
        b2.addActionListener(this);
        add(b2);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
     if(e.getSource()==b)
     {   FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw;
        try{
            fw = new FileWriter("Registration.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println("Student Name: "+tf1.getText());
            pw.println("Email: "+tf2.getText());
            pw.println("Gender: "+c1.getSelectedItem());
            pw.println("Password: "+tf3.getText());
            pw.println("Age: "+tf4.getText());
            pw.println("-------------------------");
            pw.flush();
            pw.close();
            System.out.println("Data is written successfully..");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    else if(e.getSource()==b2){
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
    }
    }
    public static void main(String[] args){
        RegForm rf = new RegForm();
    }
}