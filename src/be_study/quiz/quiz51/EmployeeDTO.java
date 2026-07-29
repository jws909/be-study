package be_study.quiz.quiz51;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
	int id;
	String name;
	String position;
	int salary;
	List<String> skills = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void addSkill(String skill) {
		this.skills.add(skill);
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ ", skills=" + skills + "]";
	}
	
}
