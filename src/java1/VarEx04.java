package java1;

class People {
	String name ;
	int age;
	char gender;
	int height;
	int weight;
}

public class VarEx04 {

	public static void main(String[] args) {
		System.out.println("-------1967-------");
		People wk = new People();
		wk.name = "배우경";
		wk.age = 54;
		wk.gender = '남';
		wk.height =172;
		wk.weight = 95;
		
		System.out.println(wk.name);
		System.out.println(wk.age);
		System.out.println(wk.gender);
		System.out.println(wk.height);
		System.out.println(wk.weight);
	}

}
