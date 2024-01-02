package ch04;


/*
 * 큐(Queue): 데이터를 일시적으로 쌓아 두기 위한 자료구조
 * -선입선출 구초
 * 
 * [1]용어
 *  1) 프런트 : 데이터를 꺼내는 쪽(첫 번째 요소 커서)
 *  2) 리어 : 데이터를 넣는 쪽(마지막 요소 커서)
 *  
 * [2]사용 메서드
 *  1) Enque : 데이터를 넣는 작업
 *  2) Deque : 데이터를 꺼내는 작업
 *  3) peek : 마지막에 들어간 데이터를 보는 작업
 *  4) IndexOf : 해당 자료를 찾기 위한 작업
 *  5) clear : 현재 큐의 모든 데이터를 삭제
 *  6) capacity : 큐의 최대 용량을 반환
 *  7) size : 데이터 수를 확인하는 메서드
 *  8) isEmpty : 큐가 비어 있는지 확인
 *  9) isFull : 큐가 가득 찼는지 확인
 *  10) dump : 모든 데이터를 출력
 *  
 * 예제로 만들 큐는 링버퍼형으로 배열 요소를 앞으로 옮기지 않는 큐이다.
 */
public class IntQueue {

	private int max;
	private int front;
	private int rear;
	private int num; //현재 데이터의 수
	private int[] que;
	
	//실행 시 예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public IntQueue(int capacity) {
		num=front=rear=0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	
	//인큐
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		que[rear++]=x;
		num++;
		if(rear== max)
			rear = 0;
		/*
		 * ex) max=12; front=7일 때
		 * 데이터를 넣었는데 rear의 번호가 12이면,
		 * 다음 번호는 0이 되어야 링형 구조로 데이터를 넣을 수 있기 때문에 
		 * rear == max 일 경우 , rear=0 이 된다.
		 */
	
		return x;
	}
	
	//디큐
	public int deque() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front==max) {
			front=0;
		}
		return x;
	}
	
	//peek
	//출력될 맨 앞의 데이터를 가르쳐준다.
	public int peek( ) throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	//검색
	//큐에 찾고자 하는 데이터가 없을 경우, -1로 반환
	public int indexOf(int x) {
		for(int i = 0; i <num;i++) {
			int idx=(i+front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	/*
	 * ex) max=9, front=7이고
	 * que[7]=1;
	 * que[8]=2;
	 * que[0]=3;
	 * 일 때 
	 * 3을 찾으면
	 * idx= (i+front)%max;
	 * 		i: 2, front : 7 == 9
	 * 		9 나누기 9의 나머지 이므로 idx=0 
	 * 
	 * 2를 찾을 경우
	 * idx = (i+front)%max == (1+7)%9 == 8이므로
	 * idx = 8이 출력된다.
	 */
	
	//clear
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//큐에 쌓여있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	//큐가 비어 있나요?
	public boolean isEmpty() {
		return num<=0;
	}
	
	//큐가 가득 찼나요?
	public boolean isFull() {
		return num>=max;
		
	}
	
	//큐 안의 모든 데이터를 출력
	public void dump() {
		if(num<=0) {
			System.out.println("큐가 비어 있습니다.");
		}else {
			for(int i = 0; i<num;i++) {
				System.out.println(que[(i+front)%max]+" ");
				System.out.println(); 				
			}
		}
		
		
	}
	
}
