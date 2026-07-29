package be_study.quiz.quiz51;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {
	String name;
	List<Integer> employees = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getEmployees() {
		return employees;
	}
	public void addEmployee(int employee) {
		this.employees.add(employee);
	}
	
	@Override
	public String toString() {
		return "DepartmentDTO [name=" + name + ", employees=" + employees + "]";
	}
	
}
