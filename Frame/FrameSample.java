package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	

public class FrameSample extends JFrame
{
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JTextField tf1;
	private JPasswordField pf1;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private JCheckBox cb1, cb2;
	private JComboBox cbox1;
	private JTextArea ta1;
	private ImageIcon img1;
	private JButton bt1; 
	
	public FrameSample()
	{
		super("My First GUI");
		super.setBounds(600,300,800,400);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label1 = new JLabel("Hellow OOP1");
		label1.setBounds(350,0,200,20);
		panel.add(label1);
		
		label2 = new JLabel("Your Name");
		label2.setBounds(0,30,200,20);
		panel.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(80,30,100,20);
		panel.add(tf1);
		
		label3 = new JLabel("Your CGPA");
		label3.setBounds(0,60,200,20);
		panel.add(label3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(80,60,100,20);
		panel.add(pf1);
		
		label4 = new JLabel("Gender");
		label4.setBounds(0,90,200,20);
		panel.add(label4);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(80,90,100,20);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(180,90,100,20);
		panel.add(rb2);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		label5 = new JLabel("Courses");
		label5.setBounds(0,120,200,20);
		panel.add(label5);
		
		cb1 = new JCheckBox("DS");
		cb1.setBounds(80,120,100,20);
		panel.add(cb1);
		
		cb2 = new JCheckBox("DB");
		cb2.setBounds(80,150,100,20);
		panel.add(cb2);
		
		label6 = new JLabel("Topic");
		label6.setBounds(0,180,200,20);
		panel.add(label6);
		
		String items[] = new String[]{"", "Abstraction", "Polymorphism", "GUI"};
		
		cbox1 = new JComboBox(items);
		cbox1.setBounds(80,180,200,20);
		panel.add(cbox1);
		
		ta1 = new JTextArea("Write your coment here");
		ta1.setBounds(350,180,200,50);
		panel.add(ta1);
		
		img1 = new ImageIcon("AIUB.png");
		
		label7 = new JLabel(img1);
		label7.setBounds(500,30,200,50);
		panel.add(label7);
		
		bt1 = new JButton("Save");
		bt1.setBounds(350,300,100,20);
		panel.add(bt1);
		
		
		super.add(panel);
		
		
	}
}