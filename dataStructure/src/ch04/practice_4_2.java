package ch04;

import java.util.Scanner;

/*
 * 스택 
 * - 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
 * - 데이터의 입력과 출력 순서는 후입선출(last in, first out)
 * 
 *[1] 사용되는 용어
 * 1) max : 스택 용량(크기)
 * 2) ptr : 스택 포인터 == 스택에 쌓여 있는 데이터 수
 * 
 *[2] 스택에 사용되는 메서드
 * 1) push : 스텍에 데이터를 넣은 매서드
 * 2) pop : 스텍에서 데이터를 지우는 메서드
 * 3) peak : 스택의 꼭대기(가장 최근에 들어온 데이터)의 데이터를 보는 메서드
 * 4) indexOf : 검색 메서드 (꼭대기에서부터 선형검색)
 * 5) clear : 스택의 모든 요소들을 삭제하는 메서드 
 * 			  (ptr값을 0으로 만들면 된다.)
 * 6) dump : 스택 안에 있는 모든 데이터를 표시하는 메서드
 * 
 *    
 */
public class practice_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(64); //IntStack 클래스를 정의함
		
		
		while(true) {
			System.out.println("///////////////////////////");
			System.out.println("현재 데이터 수  : "+s.size()+" / "+s.capacity());
			System.out.println("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료  " );
			System.out.println("///////////////////////////");
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x ;
			switch(menu) {
			case 1:
				//push
				System.out.print("데이터 :");
				x = scan.nextInt();
				try {
					s.push(x);
				}catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				//pop
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 3:
				//peek
				try {
					x = s.peek();
					System.out.println("가장 최근에 들어온 데이터는 "+x+" 입니다.");
				}catch(IntStack.EmptyIntStackException e){
					System.out.println("스택이 비었습니다.");
				}
				break;
			case 4:
				//dump
				s.dump();
				break;
				
			}
		}
	}

}
