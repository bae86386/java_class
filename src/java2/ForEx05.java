package java2;

public class ForEx05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			//1���� 100������ ���߿� 4�� ���
			if(i%4 == 0) {
				System.out.println(" 4�� ���:"+i);
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			//1���� 100������ ���߿� 4�� ���
			if(i%4 == 0) {
				sum = sum + i;			
			}
			
		}
		System.out.println(" 4�� ����� ��:"+ sum);
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			//1���� 100������ ���߿� 4�� ���
			result = result + i;	
			System.out.println("10������ �� :" + (result -1) + " + " + i + " = "+ result);
			
		}
		
	}

}
