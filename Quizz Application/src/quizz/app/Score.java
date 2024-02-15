package quizz.app;



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{

	Score(String name,int score){
		
		setBounds(300,150,600,550);//left,top,length,width
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		//image
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,200,300,250);//left,from top,length,width
		add(image);
		
	
		JLabel heading=new JLabel("Thank You "+name+" for playing Simple Minds");
		heading.setBounds(45,30,500,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel lblscore=new JLabel("Your score is "+score);
		lblscore.setBounds(350,200,300,30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lblscore);
		
		
		 JButton submit=new JButton("Play Again");
	     submit.setBounds(380,270,120,30);
	     submit.setFont(new Font("Tahoma",Font.PLAIN,16));
	     submit.setBackground(new Color(30,144,255));
	     submit.setForeground(Color.WHITE);
	     submit.addActionListener(this);
	     add(submit);
		
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		setVisible(false);
		new Login();
	}
	
	public static void main(String[] args) {
		
		new Score("user",0);
	}



	

}
