package FanSheDemo;

import java.lang.reflect.*;

public class HuoQuClass {
	private static final long serialVersionUID = -2862585049955236662l;
	public static void main(String[] args) throws Exception{
		HuoQuClass hqc = new HuoQuClass();
		//通过对象获取完整的包名和类名
		System.out.println(hqc.getClass().getName());
		
		//实例化class
		Class<?>  c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		c1 = Class.forName("FanSheDemo.HuoQuClass");
		c2 = new HuoQuClass().getClass();
		c3 = HuoQuClass.class;
		System.out.print(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println("============本类属性===========");
		//取得本类的全部属性
		Field[] field = c1.getDeclaredFields();
		for(int i = 0;i<field.length;i++){
			//权限修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//属性类型
			Class<?> type = field[i].getType();
			System.out.println(priv+""+type.getName()+""+field[i].getName()+";");
			
		}
		System.out.println("========实现接口后或者父类的属性=======");
		//取得实现的接口或者父类的属性
		Field[] field1 = c1.getFields();
 		for(int j = 0;j< field1.length;j++){
 			//权限下修饰符
 			int mo = field1[j].getModifiers();
 			String priv = Modifier.toString(mo);
 			//属性类型
 			Class<?> type = field1[j].getType();
 			System.out.println(priv +""+type.getName()+""+field1[j].getName()+";bb");
 		}
		//一丶通过反射机制实例化对象
		/*Class<?> clazz = null;
		clazz = Class.forName("FanSheDemo.User");
		User user = (User) clazz.newInstance();
		user.setAge(15);
		user.setName("刘凡");
		System.out.println(user);*/
		//二丶 取得全部的构造函数 使用构造函数赋值
		//Constructor<?> cons[] = clazz.getConstructors();
		// 查看每个构造方法需要的参数
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
		//user = (User)cons[1].newInstance(18,"刘凡二");
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
