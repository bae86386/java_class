package java2;

import java.util.Scanner;

public class ForEx03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("¹ÞÀº°ª: " + n1);
		
		for (int i = 1; i < 10; i++) {
			for (int j = n1 ; j < n1 + 1; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
			}
			System.out.println();
		}	
	}

}
