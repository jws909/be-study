package be_study.quiz.quiz46;

public class Professor {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	int deptno;
	
	public Professor() {
		super();
	}

	public Professor(int profno, String name, String id, String position, int pay, int deptno) {
		super();
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.position = position;
		this.pay = pay;
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}

	
}
