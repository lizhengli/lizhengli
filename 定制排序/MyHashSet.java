package SetComparable;
import java.util.*;
public class MyHashSet {

	public static void main(String[] args) {
		Set<Student> h = new TreeSet<Student>(new MyComparactor());
		h.add(new Student("Áõ·²",15,66));
		h.add(new Student("Æëºé±¦",15,60));
		h.add(new Student("Æëºì°ü",14,60));
		Iterator<Student> iterator = h.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			//Student s = (Student)iterator.next();
			//System.out.println(s.getName()+s.getAge()+s.getScore());
		}
	}

}
