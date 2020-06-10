package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn bag = new Popcorn("flavor");
	Microwave hi = new Microwave();
	hi.putInMicrowave(bag);
String flavors = JOptionPane.showInputDialog("What flavor popcorn would you like? How many minutes should we cook it");
	Popcorn pop = new Popcorn(flavors);
	hi.putInMicrowave(pop);
	hi.setTime(10);
	hi.startMicrowave();
}
}
