import java.util.*;
public class DemoMap{
	public static void main(String[] args){
		Map<String,String> m = new HashMap<String,String>();
		m.put("1","¡ı∑≤");
		m.put("2","¡ı∑≤");
		m.put("3","¡ı∑≤");
		m.put("4","¡ı∑≤");
		System.out.println(m);
		m.remove("4");
		System.out.println(m);
	}
}