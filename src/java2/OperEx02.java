package java2;

public class OperEx02 {
	
	//void는 인출이 없다.
	static double send(double money) {
		
		return money%3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = OperEx02.send(10000);
		System.out.println(result);
		double result2 = OperEx02.send(5000);
		System.out.println(result2);
		
		System.out.println("검증: " +(result2%3));
	}

}
