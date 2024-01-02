package ch04;

import java.util.Scanner;

public class LastNElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 링 버퍼를 오래된 데이터를 버리는 용도로 사용할 때
		
		Scanner scan = new Scanner(System.in);
		final int n = 3;
		int[] a = new int[n]; // queue의 크기
		int cnt = 0; //입력 받은 개수
		int retry;	 //다시 한 번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 :",cnt+1);
			a[cnt++%n]=scan.nextInt();
			/*
			 *cnt이 n보다 커지면 0부터 시작한다.
			 *
			 * ex) n=3, cnt =3(4번째로 입력된 값) 일 때,
			 * ctn%n = 3%3 = 0
			 * a[0]에 ctn에 해당되는 수가 입력된다.
			 */
			
			
			System.out.println("계속할까요? (예.1 / 아니오.0) :");
			retry= scan.nextInt();
		}while(retry==1);
		
		int i = cnt - n;
		if(i<0)i=0;
		
		for( ; i < cnt ; i++) {
			System.out.printf("%2d번째 정수=%d\n",i+1,a[i%n]);
		}
		
		//배열에 저장된 수 출력
		System.out.println("배열에 저장된 수 출력");
		for(int j = 0; j<a.length;j++) {
			System.out.println(a[j]);
		}
		
	}

}
