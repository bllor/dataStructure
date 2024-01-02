package ch05;

import java.util.Scanner;

import ch04.IntStack;

/*
 * 재귀 알고리즘의 비재귀적 표현
 */
public class Recur2 {
	
	
//	static void recur(int n ) {
//		if(n>0) {
//			recur(n-1);
//			System.out.print(n+" ");
//			recur(n-2); <--꼬리 재귀
//		}
//	}

	/*
	 * 꼬리 재귀의 제거
	 * 메서드의 꼬리에서 재귀 호출하는 매서드 recur(n-2)는 n의 값을 n-2로 업데이트하고 메서드 시작지점으로 돌아간다는 뜻
	 */
//	static void recur(int n ) {
//		while(n>0) {
//			recur(n-1);
//			System.out.print(n+" ");
//			n=n-2; // == recur(n-2)와 같다.
//		}
//	}
	
	/*
	 * 재귀의 제거
	 * 앞에 호출한 재귀 메서드 recur(n-1)을 비재귀적 함수로 변경
	 * 이 경우 recur(n-1)의 처리가 완료되지 않으면 n의 값을 다른 곳에 저장해주어야 한다.
	 * ->   n을 저장해두고 recur(n-1)의 작업이 모두 끝난 후 n을 출력한다.
	 *		저장해두기 위해서 stack을 사용한다
	 * 		why? 출력될 n은 4,3,2,1 순서로 저장이 될 것인데, 가장 나중에 저장된 것이 제일 먼저 출력되어야 하기 때문
	 * 
	 */
	
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			//스택에 n~1까지 저장
			if(n>0) {
				s.push(n);
				n=n-1;
				continue;
			}
			if(s.inEmpty() != true) {
				n=s.pop();
				System.out.print(n+" ");
				n=n-2;
				continue;
			}
			break;
		}
	}
/*
 * 1) stack에는 4,3,2,1 이 저장된다.
 * 2) 1,2가 출력된다.
 * 3) n=3일 경우, 3이 출력되며, 1이 다시 스택으로 들어간다. (스택 상태 : 4,1)
 * 4) n=1이 출력된다.
 * 5) n=4가 출력되며, 스택에는 2,1가 들어간다.
 * 6) n=1 출력
 * 7) n=2 출력
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int x = scan.nextInt();
		recur(x);
		
		
	}
}
