import java.awt.*;
import java.awt.event.*;
class Widget extends Frame implements ActionListener, TextListener, ItemListener{
	String msg="He is Male";
	String msg1="TV is false";
	String msg2="Freez is false";
	String msg3="Car is false";
	String msg4="";
	Label lbl;
	Button b1,b2;
	TextField t1,t2;
	TextArea ta;
	List l1, l2;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cbg;
	Choice ch;
	MenuBar mbar;
	Menu filemenu, editmenu;
	MenuItem newitem, openitem, saveitem, exititem;
	Widget(){
		super("Component Demo");
		setFont(new Font("Times New Roman",Font.BOLD,20));
		setLayout(new FlowLayout(FlowLayout.LEFT));		
		//setBackground(Color.RED);
		lbl = new Label("This is my Label");
		b1 = new Button("Print Name");
		b2 = new Button("RESET");
		t1 = new TextField(8);
		t2 = new TextField(8);
		t2.setEchoChar('*');
		ta = new TextArea();

		l1 = new List(5,true);
		l1.add("Java");
		l1.add("SQL");
		l1.add("Python");
		l1.add("PHP");

		l2 = new List(5);
		l2.add("B.Tech. CSIR");
		l2.add("M.Sc. D.F.I.S.");
		l2.add("M.Sc. C.S.");
		l2.add("M.Tech. CSIR");
		l2.select(0);

		cb1 = new Checkbox("TV");
		cb2 = new Checkbox("FREEZ");
		cb3 = new Checkbox("CAR");
		cbg = new CheckboxGroup();
		cb4 = new Checkbox("Male",cbg,true);
		cb5 = new Checkbox("Female",cbg,false);

		ch = new Choice();
		ch.add("RED");
		ch.add("GREEN");
		ch.add("BLUE");		

		add(lbl);	
		add(b1);
		add(b2);	
		add(t1);
		add(t2);
		add(ta);
		add(l1);
		add(l2);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(ch);

		mbar = new MenuBar();
		setMenuBar(mbar);
		filemenu = new Menu("File");
		editmenu = new Menu("Edit");
		mbar.add(filemenu);
		mbar.add(editmenu);
		newitem = new MenuItem("New");
		openitem = new MenuItem("Open");
		saveitem = new MenuItem("Save");
		exititem = new MenuItem("Exit");
		filemenu.add(newitem);
		filemenu.add(openitem);
		filemenu.add(saveitem);
		filemenu.add(exititem);
		exititem.addActionListener(this);

		b1.addActionListener(this);
		b2.addActionListener(this);
		t2.addActionListener(this);
		t2.addTextListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		l2.addItemListener(this);
		ch.addItemListener(this);

		addComponentListener(new ComponentAdapter(){
			public void componentResized(ComponentEvent ce){
				System.out.println("Component resized");
			}
		});
		t2.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent fe){
				System.out.println("Text Field got the focus");
			}
			public void focusLost(FocusEvent fe){
				System.out.println("Text Field lost the focus");
			}
		});

		lbl.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				System.out.println("You clicked on Label");
			}
		});
		ta.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent ke){
				System.out.println("Key is pressed in Text Area");
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});



	}
	public void itemStateChanged(ItemEvent ie){
		msg4 = l2.getSelectedItem();
		//ta.setText(l2.getSelectedItem());
		
		if(cb4.getState()){
			msg="He is Male";
		}else{
			msg="She is Female";
		}

		if(cb1.getState())
			msg1 = "TV is True";
		else
			msg1 = "TV is False";

		if(cb2.getState())
			msg2 = "Freez is True";
		else
			msg2 = "Freez is False";

		if(cb3.getState())
			msg3 = "Car is True";
		else
			msg3 = "Car is False";
		
		if(ch.getSelectedItem().equals("RED"))
			setBackground(Color.RED);
		else if(ch.getSelectedItem().equals("GREEN"))
			setBackground(Color.GREEN);
		else if(ch.getSelectedItem().equals("BLUE"))
			setBackground(Color.BLUE);

		repaint();
	}
	public void textValueChanged(TextEvent te){
				repaint();
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1)
			t1.setText("NFSU");
		else if(ae.getSource() == b2){
			t1.setText("");
			t2.setText("");
		}
		else if(ae.getSource()==t2){
			ta.setText(t2.getText());
		}

		if(ae.getSource()==exititem)
			System.exit(0);
	}

	public void paint(Graphics g){
		g.drawString(t2.getText(),100,500);
		g.drawString(msg,100,530);
		g.drawString(msg1,100,560);
		g.drawString(msg2,100,590);
		g.drawString(msg3,100,620);
		g.drawString(msg4,100,650);		
		ta.setText(msg4);	
	}

}
public class WidgetDemo{
	public static void main(String[] args) {
		Widget w = new Widget();
		w.setBounds(100,100,950,700);
		w.setVisible(true);
	}
}