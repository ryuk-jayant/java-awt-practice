import java.awt.*;
import java.awt.event.*;

class myapp extends Frame implements ActionListener{
Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	int total=0;
	myapp(){
		super("Simple Intrest calci");
		setFont(new Font("Verdana",Font.BOLD,32));
		setLayout(null);
		l1=new Label("Enter Rate");
		l1.setBounds(30,100,180,40);
		

		t1=new TextField(8);
		t1.setBounds(230,100,210,40);
	

		l2=new Label("Enter Principle");
		l2.setBounds(30,150,250,40);
		

		t2=new TextField(8);
		t2.setBounds(300,150,200,40);
		
		l3=new Label("Enter Time");
		l3.setBounds(30,200,180,40);
		

		t3=new TextField(8);
		t3.setBounds(230,200,230,40);
		

		b1 =new Button("=");
		b1.setBounds(40,250,100,50);
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);

	}
	public void paint(Graphics g){
		g.drawString("Simple Intrest",100,70);
		g.drawString("simple Intrest="+total,150,400);
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println("Click!!");
		int no1=Integer.parseInt(t1.getText().toString());
		int no2=Integer.parseInt(t2.getText().toString());
		int no3=Integer.parseInt(t3.getText().toString());
		total=no1*no2*no3/100;
		System.out.println(total);
		repaint();
	}
}
class SimpleIntrest{

	public static void main(String[] args) {
		myapp app=new myapp();
		app.setBounds(1000,250,600,500);
		app.setVisible(true);
		app.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent jkj){
				System.exit(0);
			}
		});
	}
}
