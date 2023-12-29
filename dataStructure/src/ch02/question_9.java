package ch02;

import java.util.Scanner;

public class question_9 {

	static int leftDayOfYear(int y, int m, int d) {
		int[][] days = {
				{31,28,31,30,31,30,31,31,30,31,30,31},
				{31,29,31,30,31,30,31,31,30,31,30,31},
				
		};
		int n =0;
		
		if(y%4==0) {
			n=1;
		}else {
			n=0;
		}
		int day = 0;
		for(int i =0;i<m-1;i++) {
			day+=days[n][i];
		}
		if(n==1) {
			return (366-day-d);
		}else {
			return (365-day-d);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하시오.");
		int year = scan.nextInt();
		
		System.out.println("월을 입력하시오.");
		int month = scan.nextInt();
		System.out.println("일을 입력하시오.");
		int day = scan.nextInt();
		
		int leftOfDay = leftDayOfYear(year, month, day);
		
		System.out.println(year+"년"+month+"월"+day+"일"+"의 그 해 남은 일수는 "+leftOfDay+"입니다.");
	}

}
