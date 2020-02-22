package java3;

//클래스 = 설계도
//상태 (변수)
//행위(매서드)
//생성자(Constructor)
class Person{
	private String name;
	private int age = 1;
	private String mind;
	private int height;
	private int weight;

	//없어도 존재함 = 생략가능함.
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
			System.out.println("넌 성격못바꾼다.");
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
		 Person 배우경 = new Person("배우경",1,50,4);
		 System.out.println(배우경.getName());
		 System.out.println(배우경.getAge());
		 System.out.println(배우경.getHeight());
		 System.out.println(배우경.getWeight());
		 
		 //5년이 흐르다 
		 배우경.setAge(5);
		 배우경.setMind("활발");

		 System.out.println("5년 경과 ~~~~~~~~~~~~");
		 System.out.println(배우경.getAge());
		 System.out.println(배우경.getMind());

		 System.out.println("7년 경과 ~~~~~~~~~~~~");
		 배우경.setAge(7);
	}

}
