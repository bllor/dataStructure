package ch01;

import java.util.Scanner;

public class practice_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do~while을 이용하여 n의 값이 정수일 때 만 1부터 n까지의 합을 구하는 프로그래밍
		
		Scanner scan = new Scanner(System.in);
		int n ;
		int sum =0;
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값: ");
			n = scan.nextInt();
		}while(n<=0);
		//do ~while문을 사용하여 n<=0이 아닌 조건이 될 때까지 do가 실행된다.
		
		
		for(int i = 0; i<=n;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"이다.");
	}

}
