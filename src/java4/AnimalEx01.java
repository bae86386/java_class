package java4;

//인터페이스가 가진 모든 변수나 함수는 public이 내장!!
interface Animal{

	public abstract void sound() ;
	
}

class Dog implements Animal{	
	//무효화 시키다.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird implements Animal{
	@Override
	public void sound() {
		System.out.println("잭잭");
	}
}

class Tiger implements Animal{
	@Override
	public void sound() {
		System.out.println("어흥");
	}
}

class Cow implements Animal{
	@Override
	public void sound() {
		System.out.println("음매");
	}
}

class Pig implements Animal{
	@Override
	public void sound() {
		System.out.println("꿀꿀");
	}
}
public class AnimalEx01 {

	static void play(Animal b) {
		b.sound();
	}
	public static void main(String[] args) {
		play(new Bird());
		play(new Cat());
		play(new Dog()); 
		play(new Tiger()); 
		play(new Cow());
		play(new Pig());
	}

}
