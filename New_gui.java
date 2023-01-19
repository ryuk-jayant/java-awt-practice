//idea from yatharth tyagi 
import java.awt.*;
import java.awt.event.*;

class demo extends Frame implements ActionListener{
	Label l1,l2;
	TextField t1,t2;
	TextArea Ta1;
	Button b1,b2;
	demo(){
		super("halo Gqmees");
		setFont(new Font("Verdana",Font.BOLD,22));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		l1=new Label("this is a Label");
		

		t1=new TextField(8);
		
		t1.setText("jayant");
		
		t2=new TextField(8);
		t2.setEchoChar('^');

		Ta1=new TextArea();	

		b2 =new Button("Print name");
		b2.addActionListener(this);

		b1 =new Button("Reset");
		b1.addActionListener(this);

		t1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				String s=t1.getText().toString();
				t1.setText("");
				
				Ta1.setText(s);
			}
		});
		add(l1);
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(Ta1);
		

	}
	public void paint(Graphics g){

	}
	public void actionPerformed(ActionEvent ae){
		//System.out.println("Click!!");
		int no1=Integer.parseInt(t1.getText().toString());
		int no2=Integer.parseInt(t2.getText().toString());
		System.out.println(no1+no2);
	}
}

class New_gui{
	public static void main(String[] args) {
		demo d1=new demo();
		d1.setBounds(100,250,800,900);
		d1.setVisible(true);
		d1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent jkj){
				System.exit(0);
			}
		});
	}
}