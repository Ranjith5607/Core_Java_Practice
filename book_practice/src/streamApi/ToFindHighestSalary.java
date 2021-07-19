package streamApi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToFindHighestSalary {

	public static void main(String[] args) {
		List<Employee> listEmployee = new LinkedList<Employee>();

		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("ranjith");
		emp1.setEmpSalary(1000.00);

		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("sandeep");
		emp2.setEmpSalary(2000.00);

		Employee emp3 = new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("ramesh");
		emp3.setEmpSalary(3000.00);

		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);

		System.out.println(listEmployee);

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the salary for search : ");
		double salary = scanner.nextDouble();

		List<Employee> collect = listEmployee.stream().filter(p -> p.getEmpSalary() >= salary)
				.collect(Collectors.toList());

		if (collect.isEmpty())
			System.out.println("Employee is not found");

		else
			System.out.println("highest salary employes are : " + collect);

	}

}

class Employee {

	private long empId;
	private String empName;
	private double empSalary;

	public Employee() {
		super();
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
