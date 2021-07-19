package lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaSorting {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "ranjith");
		hashMap.put(2, "Ramesh");
		hashMap.put(3, "Sandeep");
		hashMap.put(4, "Bharathi");
		
		// This is not sorting order
		System.out.println("this is non sorting order :" + hashMap);

		LinkedHashMap<Integer, String> collect = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue, (old, newValue) -> old, LinkedHashMap::new));
		/*
		 * Map<Integer, String> result = hashMap.entrySet().stream()
		 * .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(
		 * Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue)
		 * -> oldvalue, LinkedHashMap::new));
		 */
		System.out.println(collect);

	}

}

class Employee {

	private int empId;
	private String Name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		Name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + "]";
	}

}
