import java.awt.*;
import java.awt.event.*;

class myapp extends Frame implements ActionListener{
Label l1;
	TextField t1;
	Button b1;
	float total=0.00f;
	float rate=82.73f;
	myapp(){
		super("Area Of Circle");
		setFont(new Font("Verdana",Font.BOLD,32));
		setLayout(null);
		l1=new Label("Enter the Radius");
		l1.setBounds(30,100,500,40);
		

		t1=new TextField(8);
		t1.setBounds(100,150,210,40);
		

		b1 =new Button("Area=");
		b1.setBounds(100,250,200,50);
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(b1);

	}
	public void paint(Graphics g){
		g.drawString("Circle's Area",100,70);
		g.drawString("Area="+total+"m^2",150,400);
	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println("Click!!");
		int no1=Integer.parseInt(t1.getText().toString());
		total=no1*no1*rate;
		System.out.println(total);
		repaint();
	}
}
class AreaofCircle{

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
