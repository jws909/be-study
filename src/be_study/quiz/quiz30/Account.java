package be_study.quiz.quiz30;

public class Account {
	private String owner;
	private long balance;
	
	Account(){
		this(null, 0);
	}
	
	Account(String owner){
		this(owner, 0);
	}
	
	Account(long balance){
		this(balance, null);
	}
	
	Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	Account(long balance, String owner){
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	public long withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족하여 출금불가");
		} else {
			balance -= amount;
		}
		return balance;
	}
}
