package zuoye0509_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test01 {
	JFrame jf = null;//����
	JLabel jl1 = null;//��ǩ1
	JLabel jl2 = null;//��ǩ2
	JTextField jtf = null;//�û��������
	JPasswordField jpf = null;//���������
	JButton jb1 = null;//��½��ť
	JButton jb2 = null;//ע�ᰴť
	File f = null;
	public Test01(){
		//�����ļ�
		f = new File("a.properties");
		//��������ھʹ���
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		jf = new JFrame("��½");
		jf.setLayout(null);
		
		jl1 = new JLabel("�˺ţ�");
		jtf = new JTextField();
		jl2 = new JLabel("����:");
		jpf = new JPasswordField();
		jb1 = new JButton("��½");
		jb2 = new JButton("ע��");
		jl1.setBounds(50, 50, 60, 20);
		jtf.setBounds(110, 50, 150, 20);
		jl2.setBounds(50, 90, 150, 20);
		jpf.setBounds(110, 90, 150, 20);
		jb1.setBounds(55, 130, 70, 25);
		jb2.setBounds(185, 130, 70, 25);
		jf.add(jl1);
		jf.add(jtf);
		jf.add(jl2);
		jf.add(jpf);
		jf.add(jb1);
		jf.add(jb2);
		//��½
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��½����
				String password = new String(jpf.getPassword());
				enter(jtf.getText(),password);
			}
		};
		jb1.addActionListener(al);
		
		//ע��
		ActionListener al2 = new ActionListener() {
			JFrame jf = null;//����
			JLabel jl1 = null;//��ǩ1
			JLabel jl2 = null;//��ǩ2
			JTextField jtf = null;//�û��������
			JPasswordField jpf = null;//���������
			JButton jb1 = null;//��½��ť
			JButton jb2 = null;//ע�ᰴť
			File f = null;
			public void actionPerformed(ActionEvent e) {
				jf = new JFrame("ע��");
				jf.setLayout(null);
				jl1 = new JLabel("�������˺ţ�");
				jtf = new JTextField();
				jl2 = new JLabel("����������:");
				jpf = new JPasswordField();
				jb1 = new JButton("ȷ��ע��");
				jb2 = new JButton("ȡ��ע��");
				jl1.setBounds(50, 50, 80, 20);
				jtf.setBounds(130, 50, 150, 20);
				jl2.setBounds(50, 90, 80, 20);
				jpf.setBounds(130, 90, 150, 20);
				jb1.setBounds(55, 130, 90, 25);
				jb2.setBounds(185, 130, 90, 25);
				jf.add(jl1);
				jf.add(jtf);
				jf.add(jl2);
				jf.add(jpf);
				jf.add(jb1);
				jf.add(jb2);
				jf.setBounds(0, 0, 350, 280);
				jf.setVisible(true);
				
				//ȷ��
				ActionListener al = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String key = jtf.getText();
						String value = new String(jpf.getPassword());
						if(key.equals("")||key.equals(null)){
							JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�", "����", JOptionPane.ERROR_MESSAGE);
						}else if(value.equals("")||value.equals(null)){
							JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�", "����", JOptionPane.ERROR_MESSAGE);
						}else{
							//ע�᷽��
							login(key,value);
							//�رյ�ǰ����
							jf.dispose();
						}
					}
				};
				jb1.addActionListener(al);
				
				//ȡ��
				ActionListener al2 = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//�رյ�ǰ����
						jf.dispose();
					}
				};
				jb2.addActionListener(al2);
			}
		};
		jb2.addActionListener(al2);
		jf.setBounds(0, 0, 350, 280);
		jf.setVisible(true);
		//�رմ��ڽ�����������
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	
	//��¼
	public void enter(String key,String value){
		//
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);//����������Դ�.properties�����ļ���Ӧ���ļ��������У����������б�Properties�����
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//����һ���������������ж��û���(Ҳ����prop��key)�Ƿ����
		Iterator<String> it=prop.stringPropertyNames().iterator();
		//boolean b �������b=true�����������b=false
		boolean b = false;
		while(it.hasNext()){
			if(it.next().equals(key)){
				b = true;
				break;
			}
		}
		if(b){//������ڸ��û�����ô�жϸ��û��������Ƿ�������ȡ
			if(prop.getProperty(key).equals(value)){
				JOptionPane.showMessageDialog(null, "��½�ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "����������������룡", "����", JOptionPane.ERROR_MESSAGE);
			}
		}else if(!b){//��������ڸ��û�����ʾû�д��û�
			JOptionPane.showMessageDialog(null, "û�д��û�����ע�ᣡ", "����", JOptionPane.ERROR_MESSAGE);
		}
	}
	//ע��
	public void login(String key,String value){
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(f,"rw");
			raf.seek(raf.length());
			raf.write((key+"="+value+"\r").getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "ע��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
			
		}
	}
}
