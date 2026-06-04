package be_study.quiz.quiz42;

public class Food {
	protected String name;
	protected int price;
	protected int stock;
	protected int soldNum;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %d원 (잔여재고:%d)", name, price, stock);
	}
	
	public void sold(int num) {
		soldNum += num;
		stock -= num;
	}
	
	public void addStock(int addNum) {
		stock += addNum;
	}
	
	public int getLoss() {
		return (int)(price * 0.3)*stock;
	}
	
	public int getSalesCost() {
		return price * soldNum;
	}
}
