import java.util.*;
public class DemoMap{
	public static void main(String[] args){
		Map<String,String> m = new HashMap<String,String>();
		m.put("1","����");
		m.put("2","����");
		m.put("3","����");
		m.put("4","����");
		System.out.println(m);
		m.remove("4");
		System.out.println(m);
	}
}