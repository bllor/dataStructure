package ch02;

import java.util.Scanner;

public class practice_2_13 {

	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
	};
	
	static int isLeap(int year) {
		//윤년일 경우, 1이 출력되고 그렇지 않을 경우 0이 출력된다.
		//윤년은 4로 나누어지고 100으로 나눴을 때 나머지가 0이 아니거나,
		//400으로 나눴을 때 나머지가 0인 해를 뜻한다.
		return (year%4==0 && year%100 !=0 || year % 400 ==0)?1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i = 1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		
		return days;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그 해 경과 일수를 구하기
		// 2019년 1월 10일 일 경우, 그 해가 시작한지 10일이 경과한 것이다.
		// 윤년을 고려하여 계산하자.
		
		Scanner scan = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.println("년 :"); int year = scan.nextInt();
			System.out.println("월 :"); int month = scan.nextInt();
			System.out.println("일 :"); int day = scan.nextInt();
			
			System.out.printf(" 그 해 %d일 째입니다.", dayOfYear(year, month, day));
		
			System.out.print("한 번 더 할까요?(1.예/0.아니오) :");
			retry = scan.nextInt();
		}while(retry==1);
		
	}

}
