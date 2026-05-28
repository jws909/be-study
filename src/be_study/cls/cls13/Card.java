package be_study.cls.cls13;

public class Card {
	int id; 		//카드 고유 아이디
	String type; 	//무슨 카드
	String owner; 	//소유주
	String brand; 	//어디 브랜드 카드
	
	public Card(int id, String type, String owner, String brand) {
		this.id = id;
		this.type = type;
		this.owner = owner;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
