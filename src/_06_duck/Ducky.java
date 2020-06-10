package _06_duck;

public class Ducky {
	String favoriteFood;
	int numberOfFriends;
			
	Ducky(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}


	void quack() {
System.out.println("quack");
	}

	void waddle() {
System.out.println("waddle");
	}
	void bite() {
System.out.println("chomp");
	}
}
