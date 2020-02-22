package java2;

import java.util.Scanner;

/**
 * 학점 구하기
 * @author bee83
 *
 */
public class MyGrade {

	public static void main(String[] args) {
		System.out.println("성적을 입력하세요.:");
		Scanner sc = new Scanner(System.in);
		
		int point  = sc.nextInt();//프로그램 입력대기중
		System.out.println("성적:"+ point);
		
		if(point>= 90) {
			System.out.println("A학점입니다.");
		}else if(point>= 80) {
			System.out.println("B학점입니다.");
		}else if(point>= 70) {
			System.out.println("C학점입니다.");
		}else if(point>= 60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}

}
