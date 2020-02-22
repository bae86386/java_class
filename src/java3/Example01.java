package java3;

public class Example01 {

	//초를 받음->시,분 ,초로 변환해서 리턴 !!
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


		result = date + "일 " + hour + "시 " + min + "분 " + remainSec + "초";
		return result;
	}
	public static void main(String[] args) {
		String time = changeTime(1000000);
		System.out.println(time);
	}

}
