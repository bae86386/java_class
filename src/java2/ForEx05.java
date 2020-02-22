package java2;

public class ForEx05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			//1부터 100까지의 수중에 4의 배수
			if(i%4 == 0) {
				System.out.println(" 4의 배수:"+i);
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			//1부터 100까지의 수중에 4의 배수
			if(i%4 == 0) {
				sum = sum + i;			
			}
			
		}
		System.out.println(" 4의 배수의 합:"+ sum);
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			//1부터 100까지의 수중에 4의 배수
			result = result + i;	
			System.out.println("10까지의 합 :" + (result -1) + " + " + i + " = "+ result);
			
		}
		
	}

}
