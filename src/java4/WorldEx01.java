package java4;

class Jiguin{
	String name = "지구인";
}
class Asiain extends Jiguin{
	
}
class Hangukin extends Asiain {
	
}
class Packbogum extends Hangukin{
	String name = "박보금";
}
public class WorldEx01 {

	public static void main(String[] args) {
		new Asiain();
		Jiguin j = new Jiguin();
		System.out.println(j.name);
		Packbogum p = new Packbogum();
		System.out.println(p.name);
		
		Asiain a = new Packbogum();
		System.out.println(a.name);
		Asiain a1 = new Hangukin();
		System.out.println(a.name);
		
		Jiguin k = new Packbogum();
		System.out.println(((Packbogum)k).name);
	}

}
