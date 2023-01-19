import java.awt.*;
import java.awt.event.*;

class myapp extends Frame implements ActionListener{
Label l1;
	TextField t1;
	Button b1;
	int total=0;
	float rate=82.73f;
	myapp(){
		super("Doller to rupee converter");
		setFont(new Font("Verdana",Font.BOLD,32));
		setLayout(null);
		l1=new Label("Enter amount of Doller");
		l1.setBounds(30,100,500,40);
		

		t1=new TextField(8);
		t1.setBounds(100,150,210,40);
		

		b1 =new Button("$2Rupee");
		b1.setBounds(100,250,200,50);
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(b1);

	}
	public void paint(Graphics g){
		g.drawString("To Rupee",100,70);
		g.drawString("TO Rupee="+total,150,400);
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println("Click!!");
		int no1=Integer.parseInt(t1.getText().toString());
		total=no1*(int )rate;
		System.out.println(total);
		repaint();
	}
}
class DollerRp{

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
