import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo extends Frame implements ActionListener{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	demo(){
		super("jayant's calculator");
		setFont(new Font("Verdana",Font.BOLD,32));
		setLayout(null);
		l1=new Label("enter no 1");
		l1.setBounds(40,100,200,30);
		add(l1);

		t1=new TextField("");
		t1.setBounds(100,100,300,30);
		add(t1);

		l2=new Label("enter no 2:");
		l2.setBounds(40,150,200,30);
		add(l2);

		t2=new TextField("");
		t2.setBounds(100,150,300,30);
		add(t2);
		b1 =new Button("+");
		b1.setBounds(40,250,100,200);
		b1.addActionListener(this);
		add(b1);

	}
	public void paint(Graphics g){
		g.drawString("calci",100,50);
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println("Click!!");
		int no1=Integer.parseInt(t1.getText().toString());
		int no2=Integer.parseInt(t2.getText().toString());
		System.out.println(no1+no2);
	}
}

class Gui{
	public static void main(String[] args) {
		demo d1=new demo();
		d1.setBounds(1000,250,450,300);
		d1.setVisible(true);
		d1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent jkj){
				System.exit(0);
			}
		});
	}
}