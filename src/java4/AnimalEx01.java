package java4;

//�������̽��� ���� ��� ������ �Լ��� public�� ����!!
interface Animal{

	public abstract void sound() ;
	
}

class Dog implements Animal{	
	//��ȿȭ ��Ű��.
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}

class Bird implements Animal{
	@Override
	public void sound() {
		System.out.println("����");
	}
}

class Tiger implements Animal{
	@Override
	public void sound() {
		System.out.println("����");
	}
}

class Cow implements Animal{
	@Override
	public void sound() {
		System.out.println("����");
	}
}

class Pig implements Animal{
	@Override
	public void sound() {
		System.out.println("�ܲ�");
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
