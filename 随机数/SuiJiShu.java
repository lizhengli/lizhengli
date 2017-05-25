package Liqq.Com;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SuiJiShu extends Frame{
	static boolean flag = true;
	public SuiJiShu(){
		this.setLayout(null);
		JPasswordField jl = new JPasswordField();
		jl.setText("");
		jl.setBounds(100,100,60,25);
		this.add(jl);
		JLabel jl2 = new JLabel();
		jl2.setText("");
		jl2.setBounds(200,250,60,25);
		this.add(jl2);
		JLabel jl3 = new JLabel();
		jl3.setText("");
		jl3.setBounds(180,280,100,25);
		this.add(jl3);
		JTextArea jta = new JTextArea();
		jta.setText("请输入1-10");
		jta.setBounds(400,100,120,35);
		jta.getBorder();
		this.add(jta);
		//按钮
		JButton jb = new JButton();
		jb.setText("开始");
		jb.setBounds(200,100,80,25);
		//随机数
		jb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){
						if(jb.getText().equals("开始")){
							flag = true;
						}else if(jb.getText().equals("停止")){
							flag = false;
						}
						if(jb.getText().equals("开始")){
							jb.setText("停止");
						}else if(jb.getText().equals("停止")){
							jb.setText("开始");
						}
						while(flag){
							try {
								Thread.sleep(0);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							jl.setText((int)(Math.random()*10+1)+"");
						}
						if(jl.getText().equals(jta.getText())){
							jl2.setText("相同");
							jl3.setText("随机数为"+jl.getText());
							
						}else if(!jl.getText().equals(jta.getText())){
							jl2.setText("不同");
							jl3.setText("随机数为"+jl.getText());
						}
					}
				}).start();
			}
		});
		this.add(jb);
		this.setBounds(500,100,600,500);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new SuiJiShu();
	}
}
