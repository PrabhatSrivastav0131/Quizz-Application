package quizz.app;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,600,500);//left,from top,length,width
		add(image);
		//label1
		JLabel heading=new JLabel("Simple Minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));//font_name,font_type,font_size
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		
		//label2
		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(810,150,345,20);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));//font_name,font_type,font_size
		name.setForeground(new Color(30,144,254));
		add(name);
		
		//creating text field for name
		tfname=new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New roman",Font.BOLD,20));
		add(tfname);
		
		//Rules Button Globally declared
		rules=new JButton("Rules");
		rules.setBounds(735,270,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		//BackButton Globally declared
		back=new JButton("Back");
		back.setBounds(915,270,120,25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		
		add(back);
		
		
		setSize(1200,500);//length,breadth
		setLocation(100,100);//left,from top
		setVisible(true);//to show frame
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);//close current frame
			new Rules(name);//open new frame by creating object of it
			
		}
		else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
