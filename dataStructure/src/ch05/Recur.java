package ch05;

import java.util.Scanner;

/*
 * 재귀 알고리즘 분석
 * 재귀 알고리즘 분석 방법으로는 하향식, 상향식 방법으로 나뉜다.
 */
public class Recur {

	static void recur(int n ) {
		if(n>0) {
			recur(n-1);
			System.out.print(n+" ");
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int x = scan.nextInt();
		recur(x);
		
		
	}

}
/*
 * recur(4)를 할 경우, 
 * 1 2 3 1 4 1 2가 출력이 된다.

 * [1]하향식 분석
 * recur(4)일 때부터 순차적으로 내려오면서 분석하는 것
 * - 이렇게 분석할 경우 같은 매서드가 여러번 사용될 수 있으므로 반드시 효율적이라고 할 수 없다.
 * 
 * 
 * recur(4)일 경우
 * 1)      										recur(3)          				   || 출력(4) ||       					       recur(2)
 * 2)						 recur(2)			||출력(3)|| 		   recur(1) 	   || 출력(4) ||		      recur(1) 		      ||출력(2)|| recur(0)
 * 3)		   recur(1) 	||출력(2)|| recure(0) ||출력(3)|| recur(0) 출력(1) recur(-1)||출력(4)  ||recur(0)  ||출력(1)||  recur(-1) ||출력(2)|| 
 * 4)recur(0) ||출력(1)|| recur(-1)
 * 
 * 
 * [2]상향식 분석
 * 아래쪽부터 쌓아 올리는 방식
 * n이 양수일 때만 작용하므로 recur(1)부터 시작
 * recur(1) == recur(0) 출력(1) recur(-1) -> 1
 * recure(2) == recure(1) 출력(2) recur(0) -> 1 || 2
 * recure(3) == recure(1) 출력(3) recur(1) -> 1,2 || 3 || 1
 * recure(4) == recure(3) 출력(4) recur(2) -> 1,2,3,1 || 4 || 1,2
 * 
 */ 
