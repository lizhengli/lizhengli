package Liqq.Com;

import java.awt.Color;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class MainQQ extends JFrame {
	 static private String zhanghao ;//…Ë÷√’À∫≈
	 static private String mima; //…Ë÷√√‹¬Î
	public MainQQ(){
		this.setLayout(null);
		Icon ic = new ImageIcon("d:/tupian/qq.jpg");
		JLabel jp = new JLabel();
		 	jp.setBounds(100,0,427,177);
		 	jp.setIcon(ic);
		 	this.add(jp);
		
		JLabel jl = new JLabel();
			jl.setText("¿ÓQQ£¨µØ÷∏º‰£¨–ƒŒﬁº‰");
			jl.setBounds(200,180,180,40);
			jl.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",1,17));
			jl.setForeground(Color.red);
			this.add(jl);
		
		//’À∫≈
		JLabel jl2 = new JLabel();
			jl2.setText("’À∫≈");
			jl2.setFont(new java.awt.Font("Dialog",1,17));
			jl2.setForeground(Color.BLUE);
			jl2.setBounds(150,230,80, 35);
			this.add(jl2);
			
		JTextArea ja2 = new JTextArea();
			ja2.setBounds(200,230,200,35);
			this.add(ja2);
		//√‹¬Î
		JLabel jl3 = new JLabel();
			jl3.setText("√‹¬Î");
			jl3.setFont(new java.awt.Font("Dialog",1,17));
			jl3.setForeground(Color.BLUE);
			jl3.setBounds(150,290,80,35);
			this.add(jl3);
		
		JPasswordField ja3 = new JPasswordField();
			ja3.setBounds(200,290,200,35);
			this.add(ja3);
		
		//≈–∂œ
		JLabel jlb = new JLabel();
			jlb.setText("");
			jlb.setBounds(450,370,150,30);
			this.add(jlb);
	
		//µ«¬Ω
		JButton jb = new JButton();
			jb.setBounds(200,350,90,30);
			jb.setText("¡¢º¥µ«¬Ω");
			this.add(jb);
			jb.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if(ja2.getText().equals(zhanghao) && ja3.getText().equals(mima)){
						jlb.setText("µ«¬Ω≥…π¶");
					}else{
						jlb.setText("µ«¬º ß∞‹");
					}
					
				}
				
			});
		
		//◊¢≤·
		JLabel jl6 = new JLabel();
		this.add(jl6);
		JTextArea jl4 = new JTextArea();
		this.add(jl4);
		
		JPasswordField jl5 = new JPasswordField();
		this.add(jl5);
		
		JButton jb3 = new JButton(); 
		this.add(jb3);
		JButton jb2  = new JButton();
			jb2.setText("◊¢≤·’À∫≈");
			jb2.setBounds(300,350,90,30);
			this.add(jb2);
			jb2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					jl4.setBounds(250,400,120,25);
					jl4.setText("’À∫≈");
					
					jl5.setBounds(250,435,120,25);
					jl5.setText("√‹¬Î");
					
					jb3.setBounds(250,490,90,25);
					jb3.setText("◊¢≤·");
					jb3.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							zhanghao = jl4.getText();
							mima = jl5.getText();
							jl6.setText("◊¢≤·≥…π¶");
							jl6.setBounds(250,530,130,25);
							
						}
						
					});
					
				}
				
			});
		
		this.setBounds(400,0,700,600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainQQ();
	}

}
