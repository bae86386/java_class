package java2;

public class OperEx04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		//비교연산자는 Boolean을 리턴한다.
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(!(a==b));
		System.out.println(a<=b);
		//논리연산자는 조건이 2개이상일때
		System.out.println((a==b) || (a < b));
		System.out.println(false && true);
	}

}
