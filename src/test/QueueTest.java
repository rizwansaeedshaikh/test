package test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		queue.add(34);
		System.out.println(queue);

		PriorityQueue<Employee> empQueue = new PriorityQueue<Employee>(22, new EmployeeComparator());
		System.out.println(empQueue.add(new Employee(1, "Rizwan", 50f)));
		System.out.println(empQueue.add(new Employee(1, "Rizwan", 50f)));
	}
}

class Employee {

	private int empId;
	private String empName;
	private float salary;

	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

class EmployeeComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpId() > e2.getEmpId()) {
			return 1;
		} else if(e1.getEmpId() < e2.getEmpId()){
			return -1;
		} else
			return 0;
	}
}
