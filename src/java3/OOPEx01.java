package java3;

//Ŭ���� = ���赵
//���� (����)
//����(�ż���)
//������(Constructor)
class Person{
	private String name;
	private int age = 1;
	private String mind;
	private int height;
	private int weight;

	//��� ������ = ����������.
	public Person(String name1,int age1,int height1,int weight1) {
		System.out.println(name1);
		System.out.println(age1);
		System.out.println(height1);
		System.out.println(weight1);
		name = name1;
		age = age1;
		height = height1;
		weight = weight1;
	}
	
	public void setName(String name1) {
		name = name1;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age1) {
		age = age1;
	}
	public int getAge() {
		return age;
	}
	public void setMind(String mind1) {
		mind = mind1;	if(age< 6) {
			mind = mind1;
		}else {
			System.out.println("�� ���ݸ��ٲ۴�.");
		}
		
	}
	public String getMind() {
		return mind;
	}
	public void setHeight(int height1) {
		height = height1;
	}
	public int getHeight() {
		return height;
	}
	public void setWeight(int weight1) {
		weight = weight1;
	}
	public int getWeight() {
		return weight;
	}
	
}
public class OOPEx01 {

	public static void main(String[] args) {
		 Person ���� = new Person("����",1,50,4);
		 System.out.println(����.getName());
		 System.out.println(����.getAge());
		 System.out.println(����.getHeight());
		 System.out.println(����.getWeight());
		 
		 //5���� �帣�� 
		 ����.setAge(5);
		 ����.setMind("Ȱ��");

		 System.out.println("5�� ��� ~~~~~~~~~~~~");
		 System.out.println(����.getAge());
		 System.out.println(����.getMind());

		 System.out.println("7�� ��� ~~~~~~~~~~~~");
		 ����.setAge(7);
	}

}
