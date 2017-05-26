package FanSheDemo;

import java.lang.reflect.*;

public class HuoQuClass {
	private static final long serialVersionUID = -2862585049955236662l;
	public static void main(String[] args) throws Exception{
		HuoQuClass hqc = new HuoQuClass();
		//ͨ�������ȡ�����İ���������
		System.out.println(hqc.getClass().getName());
		
		//ʵ����class
		Class<?>  c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		c1 = Class.forName("FanSheDemo.HuoQuClass");
		c2 = new HuoQuClass().getClass();
		c3 = HuoQuClass.class;
		System.out.print(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println("============��������===========");
		//ȡ�ñ����ȫ������
		Field[] field = c1.getDeclaredFields();
		for(int i = 0;i<field.length;i++){
			//Ȩ�����η�
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//��������
			Class<?> type = field[i].getType();
			System.out.println(priv+""+type.getName()+""+field[i].getName()+";");
			
		}
		System.out.println("========ʵ�ֽӿں���߸��������=======");
		//ȡ��ʵ�ֵĽӿڻ��߸��������
		Field[] field1 = c1.getFields();
 		for(int j = 0;j< field1.length;j++){
 			//Ȩ�������η�
 			int mo = field1[j].getModifiers();
 			String priv = Modifier.toString(mo);
 			//��������
 			Class<?> type = field1[j].getType();
 			System.out.println(priv +""+type.getName()+""+field1[j].getName()+";bb");
 		}
		//һؼͨ���������ʵ��������
		/*Class<?> clazz = null;
		clazz = Class.forName("FanSheDemo.User");
		User user = (User) clazz.newInstance();
		user.setAge(15);
		user.setName("����");
		System.out.println(user);*/
		//��ؼ ȡ��ȫ���Ĺ��캯�� ʹ�ù��캯����ֵ
		//Constructor<?> cons[] = clazz.getConstructors();
		// �鿴ÿ�����췽����Ҫ�Ĳ���
		 /*for (int i = 0; i < cons.length; i++) {
	            Class<?> clazzs[] = cons[i].getParameterTypes();
	            System.out.print("cons[" + i + "] (");
	            for (int j = 0; j < clazzs.length; j++) {
	                if (j == clazzs.length - 1){
	                    System.out.print(clazzs[j].getName());
	                } else{
	                    System.out.print(clazzs[j].getName() + ",");
	                }
	               
	            System.out.println(")");
	        }*/
		//user = (User)cons[1].newInstance(18,"������");
		//System.out.println(user);
	}
}
class User{
	private int age;
	private String name;
	public User(){
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
	        return "User [age=" + age + ", name=" + name + "]";
	}
}
