package Liqq.Com;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RedLight extends JFrame {
	static boolean flag = true;
	public RedLight(){
		this.setLayout(null);
		//信号灯
		JButton jb = new JButton();
		jb.setBounds(200,150,70,25);
		jb.setText("开始");
		this.add(jb);
		JButton jb2 = new JButton();
		jb2.setBounds(200,250,60,60);
		this.add(jb2);
		JLabel jl = new JLabel();
		jl.setText("");
		jl.setBounds(170,350,150,25);
		this.add(jl);
		JLabel jl2 = new JLabel();
		jl2.setBounds(180,400,50,25);
		jl2.setText("");
		this.add(jl2);
		jb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Thread(new Runnable(){
					public void run(){
						while(flag){
							try {
									jl.setText("红灯亮了等一等");
									jb2.setBackground(Color.red);
									for(int i = 5;i>=0;i--){
										
										jb2.setText(i+"");
										Thread.sleep(1000);
									}
									
									jl.setText("黄灯，等一下");
									jb2.setBackground(Color.yellow);
									//Thread.sleep(2000);
									for(int k = 3;k>=0;k--){
										
										jb2.setText(k+"");
										Thread.sleep(1000);
									}
									jl.setText("绿灯行，前进");
									jb2.setBackground(Color.green);
									//Thread.sleep(4000);
									for(int j = 6;j>=0;j--){
										
										jb2.setText(j+"");
										Thread.sleep(1000);
									}
									
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							
							
						}
					}
				}).start();
			}
			
		});
		
		this.setBounds(300,100,500,600);
		this.setVisible(true);
		
	}
	 public static void main(String[] args){
		 new RedLight();
	 }
}
