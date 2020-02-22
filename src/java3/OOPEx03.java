package java3;

public class OOPEx03 {

	static void output(int num) {
		System.out.println(num);
	}
	static void output(int num,String s) {
		System.out.println(num + s);
	}
	static void output(String s) {
		System.out.println(s);
	}
	static void output(double flt) {
		System.out.println(flt);
	}
	public static void main(String[] args) {
		output(10);
		output("¾È³ç");
		output(10.5);
		output(100 + "Á¡¼ö");
	}

}
