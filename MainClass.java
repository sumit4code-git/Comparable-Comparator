package comparableComparator;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		List<Student> ss=new ArrayList<>();
		ss.add(new Student(23,"Ram"));
		ss.add(new Student(26,"sumit"));
		ss.add(new Student(26,"sayan"));
		ss.add(new Student(75,"satyam"));
		Comparator<Student> cc=new Comparator<Student>()//for better  watch telusko video of comparable vs comparator
		{

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.marks>o2.marks)return -1;
				else if(o1.marks<o2.marks)return 1;
				else {
					 return o1.name.compareTo(o2.name);
				}
			}	
		};
		Collections.sort(ss,cc);
//		Collections.sort(ss,Comparator.comparing(Student::getMarks).thenComparing(Student::getName).reversed());
		ss.forEach(System.out::println);/*lambda method used to shorten code*/
//		System.out.println(ss);
	}

}
