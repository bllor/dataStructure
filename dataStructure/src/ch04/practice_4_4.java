package ch04;

import java.util.Scanner;


public class practice_4_4 {
	//int Queue의 사용 예
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		IntQueue s= new IntQueue(5);
		
		while(true) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("현재 데이터 수 :"+s.size()+" / "+s.capacity());
			System.out.println("(1)인큐  (2)디큐  (3)피크  (4)덤프  (0)종료");

			
			int menu  = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("데이터 :");
				x = scan.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e ) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			
			case 2:
				try {
					x=s.deque();
					System.out.println("디큐한 데이터는 "+x+"입니다."); 
					
				}catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				}catch( IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			
			case 4:
				s.dump();
				break;
			}
		}
	}

}
