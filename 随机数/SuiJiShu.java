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
		jta.setText("������1-10");
		jta.setBounds(400,100,120,35);
		jta.getBorder();
		this.add(jta);
		//��ť
		JButton jb = new JButton();
		jb.setText("��ʼ");
		jb.setBounds(200,100,80,25);
		//�����
		jb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable(){
					public void run(){
						if(jb.getText().equals("��ʼ")){
							flag = true;
						}else if(jb.getText().equals("ֹͣ")){
							flag = false;
						}
						if(jb.getText().equals("��ʼ")){
							jb.setText("ֹͣ");
						}else if(jb.getText().equals("ֹͣ")){
							jb.setText("��ʼ");
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
							jl2.setText("��ͬ");
							jl3.setText("�����Ϊ"+jl.getText());
							
						}else if(!jl.getText().equals(jta.getText())){
							jl2.setText("��ͬ");
							jl3.setText("�����Ϊ"+jl.getText());
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
