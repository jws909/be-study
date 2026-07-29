package be_study.quiz.quiz51;

import java.util.ArrayList;
import java.util.List;

public class ProjectDTO {
	String title;
	int budget;
	List<Integer> team = new ArrayList<>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public List<Integer> getTeam() {
		return team;
	}
	public void addTeam(int employee) {
		this.team.add(employee);
	}
	@Override
	public String toString() {
		return "ProjectDTO [title=" + title + ", budget=" + budget + ", team=" + team + "]";
	}
	
}
