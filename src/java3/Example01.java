package java3;

public class Example01 {

	//�ʸ� ����->��,�� ,�ʷ� ��ȯ�ؼ� ���� !!
	static String changeTime(int sec) {
		String result = null;

		int date = 0;
		int min  = sec/60 ;
		int hour = min/60;
		int remainSec = sec%60;
		
		min = min%60;
		
		if (hour > 24) {
			date = hour/24;
		}	
		
		hour = hour%24;


		result = date + "�� " + hour + "�� " + min + "�� " + remainSec + "��";
		return result;
	}
	public static void main(String[] args) {
		String time = changeTime(1000000);
		System.out.println(time);
	}

}
