package be_study.quiz.quiz50;

import java.util.ArrayList;
import java.util.List;

public class BookDTO {
	String title;
	String author;
	int yearOfPublication;
	int price;
	Boolean canBorrowing;
	List<String> category = new ArrayList<>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getCanBorrowing() {
		return canBorrowing;
	}
	public void setCanBorrowing(Boolean canBorrowing) {
		this.canBorrowing = canBorrowing;
	}
	public List<String> getCategory() {
		return category;
	}
	public void addCategory(String cat) {
		this.category.add(cat);
	}
	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication
				+ ", price=" + price + ", canBorrowing=" + canBorrowing + ", category=" + category + "]";
	}
	
	
}
