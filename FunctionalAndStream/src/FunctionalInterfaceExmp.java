import java.util.ArrayList;
import java.util.function.Predicate;

class Student{
	int id;
	String name;
	float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
public class FunctionalInterfaceExmp {
public static void main(String[] args) {
	ArrayList <Student> arrayList = new ArrayList <Student> ();
	arrayList.add(new Student(101,"Anu",98f));
	arrayList.add(new Student(105,"Racchu",80f));
	arrayList.add(new Student(101,"Buff",99f));
	arrayList.add(new Student(107,"Netty",23f));
	arrayList.add(new Student(106,"Acchu",56f));
	arrayList.add(new Student(108,"Radhu",67f));
	arrayList.add(new Student(103,"Meghu",75f));
	arrayList.add(new Student(104,"Likki",45f));
	arrayList.add(new Student(102,"Vidya",35f));
	arrayList.add(new Student(110,"Kala",71f));
	arrayList.add(new Student(109,"Chandru",19f));
	Predicate<Student> con1 = m->m.marks>80;
	Predicate<Student> con2 = (m)->(m.marks<=80) && (m.marks>60);
	Predicate<Student> con3 = (m)->(m.marks<=60) && (m.marks>50);
	Predicate<Student> con4 = (m)->(m.marks<=50) && (m.marks>=35);
	Predicate<Student> con5 = m->m.marks<35;
	
	for(Student s : arrayList) {
		if(con1.test(s)) {
			System.out.println(s.marks+" "+s.name);	
			System.out.println("Distinction");
			System.out.println(" ");
		} 
		else if(con2.test(s)) {
    		System.out.println(s.marks+" "+s.name);	
    		System.out.println("First Class");
    		System.out.println(" ");
    	}
		else if(con3.test(s)) {
    		System.out.println(s.marks+" "+s.name);	
    		System.out.println("Second Class");
    		System.out.println(" ");
   		}
		else if(con4.test(s)) {
			System.out.println(s.marks+" "+s.name);	
   			System.out.println("Third Class");
   			System.out.println(" ");
   		}
		else if(con5.test(s)) {
			System.out.println(s.marks+" "+s.name);	
			System.out.println("Fail");
			System.out.println(" ");
    		}
		}
	}
}
