package java2;

/**
 * ���׸���
 * �ۿ��ִ� for���� ���ǰ���
 * �ȿ��ִ� for���� ���� ����
 * @author bee83
 *
 */
public class StarEx01 {

	static void star(String star) {
		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				System.out.print(star);
				break;
			}
			System.out.print(" ");

		}
		System.out.println();
	}
	public static void main(String[] args) {

		star("*");
		System.out.println();
		System.out.println("   *");
		System.out.println(" ***");
		System.out.println("*****");
	}

}
