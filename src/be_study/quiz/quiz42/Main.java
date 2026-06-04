package be_study.quiz.quiz42;

public class Main {

	public static void main(String[] args) {
		FoodTruck foodTruck = new FoodTruck("분식집");
		Food f1 = new Food("튀김", 8000, 5);
		Food f2 = new Food("떡볶이", 6000, 5);
		Food f3 = new Food("순대", 4000, 5);
		
		foodTruck.addMenu(f1);
		foodTruck.addMenu(f2);
		foodTruck.addMenu(f3);
		foodTruck.addMenu("김밥", 3000, 5);
		
		foodTruck.startSales();
	}
}
