package java2;

/**
 * 
 * @author bee83
 *             if(조건문){
 *             
 *             }
 */
public class ForEx04 {

	public static void main(String[] args) {

		int n1 = 100;
		if(n1>99) {
			System.out.println("참입니다.");
		}
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 1) {
				System.out.println("3으로 나누었을때 나머지가 1인 친구들:"+i);
			} else {
				System.out.println("3으로 나누었을때 나머지가 1이아닌 친구들:"+i);
			}
			
		}
	}

}
