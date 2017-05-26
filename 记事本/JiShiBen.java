package Liqq.Com;


import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class JiShiBen extends JFrame{
	public JiShiBen(){
		this.setLayout(null);
		this.setTitle("¼ÇÊÂ±¾");
		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(0,0,50,25);
		JMenuBar jmb2 = new JMenuBar();
		jmb2.setBounds(50,0,50,25);
		JMenuBar jmb3 = new JMenuBar();
		jmb3.setBounds(100,0,400,25);
		JMenu jm = new JMenu();
		jm.setText("ÎÄ¼þ");
		jm.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,18));
		
		jm.setBounds(0,0,45,15);
		
		JMenu jm2 = new JMenu();
		
		jm2.setText("±à¼­");
		jm2.setBounds(100,0,45,15);
		jm2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,18));
		
		JMenu jm3 = new JMenu();
		
		jm3.setText("¸ñÊ½");
		jm3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,18));
		
		JMenuItem jmt = new JMenuItem();
		
		jmt.setText("ÐÂ½¨");
		jmt.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,14));
		jmt.setBounds(0,0,50,22);
		
		JMenuItem jmt2 = new JMenuItem();
		
		jmt2.setText("É¾³ý");
		jmt2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,14));
		jmt2.setBounds(0,0,50,22);
		
		JMenuItem jmt3 = new JMenuItem();
		jmt3.setText("×ÖÌå");
		jmt3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,14));
		jmt3.setBounds(0,0,50,22);
		
		JTextArea jta = new JTextArea();
		jta.setBounds(0,21,500,550);
		jta.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,15));
		this.add(jta);
		
		JMenuItem jb = new JMenuItem();
		jb.setBounds(0,22,50,22);
		jb.setText("±£´æ");
		jb.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,14));
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String test  = jta.getText();
			File f = new File("f:/java/liufan.txt");
			FileWriter fw = null;
			try {
				if(!f.exists()){
					f.createNewFile();
				}
				fw = new FileWriter(f,true);
				fw.write(test);
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally{
				if(fw!=null){
					try {
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
			
			}
		});
		this.add(jb);		
		jmb.add(jm);
		
		jmb2.add(jm2);
		
		jmb3.add(jm3);
		
		jm.add(jmt);
		jm.add(jb);
		
		jm2.add(jmt2);
		
		jm3.add(jmt3);
		
		this.add(jmb);
		
		this.add(jmb2);
		
		this.add(jmb3);
		
		this.setBounds(400,400,500,600);
		
		this.setVisible(true);
	}
	public static void main(String[] args){
		new JiShiBen();
	}
	
}
