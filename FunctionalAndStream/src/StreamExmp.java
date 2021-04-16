import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExmp {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(6,"Anu",48));
		list.add(new Employee(2,"Racchu",56));
		list.add(new Employee(1,"Buff",35));
		list.add(new Employee(5,"Netty",58));
		list.add(new Employee(3,"Anu",24));
		list.add(new Employee(4,"Chandru",29));
		list.add(new Employee(7,"Kala",30));
		
		List<Integer> ageList=list.stream()
				.filter(e->e.empAge>50).map(e->e.empAge)
				.collect(Collectors.toList());
			System.out.println("Employee above 50 Years: "+ageList);

		Employee e1=list.stream().max((a,b)-> a.empAge > b.empAge ? 1 : -1).get();
		System.out.println("Maximum Age"+e1.empAge);
		
		Employee e2=list.stream().min((a,b)-> a.empAge > b.empAge ? 1 : -1).get();
		System.out.println("Minimum Age"+e2.empAge);
		
		
		Set<String> nameList=list.stream()
				.filter(e->e.empName.equals(e.empName))
				.map(e->e.empName)
				.collect(Collectors.toSet());
		System.out.println("After Removing Duplicate Names: "+nameList);			
	}
}

class Employee
{
	int empId;
	String empName;
	int empAge;
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
}
