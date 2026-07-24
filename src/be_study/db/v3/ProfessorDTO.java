package be_study.db.v3;

//import java.time.LocalDateTime;

// DTO : Data Transfer Object	포장박스역할
public class ProfessorDTO {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	
	//java.sql.Date hiredate;
//	LocalDateTime hiredate;	//날짜
	String hiredate; //날짜를 문자형으로
	
	int bonus;
	int deptno;
	String email;
	String hpage;
	
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHpage() {
		return hpage;
	}
	public void setHpage(String hpage) {
		this.hpage = hpage;
	}
	
	@Override
	public String toString() {
		return "ProfessorDTO [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", hiredate=" + hiredate + ", bonus=" + bonus + ", deptno=" + deptno + ", email=" + email
				+ ", hpage=" + hpage + "]";
	}
	
}
