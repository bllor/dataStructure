package ch05;

import java.util.Scanner;

/*
 * 하노이의 탑
 * 작은 원반이 위에, 큰 원반이 아래에 위치할 수 있도록 원반을 3개의 기둥 사이에서 옮기는 문제.
 * 원반은 1개씩만 옮길 수 있으며, 큰 원반을 작은 원반 위에 쌓을 수 없다.
 */
public class Hanoi {

	static void move(int no, int x, int y) {
		// no: 원반의 개수, x,y 기둥
		if(no>1) {
			move(no -1,x,6-x-y); //6==기둥 번호의합, 기둥은 3개 밖에 없음
		}
		System.out.println("원반["+no+"]을 "+x+"기둥에서 "+y+"기둥으로 옮김");
		
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}
	/*
	 * 기둥이 1번,2번,3번 기둥이 있음
	 * no=3;
	 * 1) move(3,1,3);
	 * 1번 if -> move(2,1,2);
	 * 2번 if -> move(2,2,3);
	 * 
	 * 1-2) move(2,1,2)
	 * 1번 if -> move (1,1,3) -> (1,1 -> 3) 출력
	 * sysout(2,1,2)			(2,1 -> 2) 출력
	 * 2번 if -> move (1,3,2) -> (1,3 -> 2) 출력
	 *
	 * sysout(3,1,3)			(3,1->3)출력
	 * 
	 * 2-2) move(2,2,3);
	 * 1번 if -> move (1,2,1) -> (1,2->1)
	 * sysout(2,2,3)			(2,2->3)
	 * 2번 if -> move (1,1,3) -> (1,1->3)
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = scan.nextInt();
		
		move(n,1,3);
		/*
		 * 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
		 * 기둥은 1,2,3번 3개 밖에 없음
		 */
		
		scan.close();
	}

}
