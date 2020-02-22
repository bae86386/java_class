package java1;

class Car{
	String name;
	int price;
	String color;
	int power;
}
public class VarEx05 {

	public static void main(String[] args) {
		Car morning = new Car();
		morning.name = "Moning";
		morning.price  = 1500;
		morning.color  = "Red";
		morning.power = 200;

		System.out.println(morning.name);
		System.out.println(morning.price);
		System.out.println(morning.color);
		System.out.println(morning.power);
		
	}

}
