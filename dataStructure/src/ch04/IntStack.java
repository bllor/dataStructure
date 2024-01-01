package ch04;

public class IntStack {

		
		private int max; // 스택 용량
		private int ptr; // 스택 포인터
		private int[] stk; // 스택 본체	
		
		
		//실행 시 예외 : 스택이 비어있음
		public class EmptyIntStackException extends RuntimeException {
			public EmptyIntStackException ( ) {}
		}
		
		//실행 시 예외 : 스택이 가득 차 있음
		public class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException ( ) {}
		}
		
		//생성자
		public IntStack(int capacity) {
			ptr = 0;
			max = capacity;
			try {
				stk = new int[max]; //스택 본체용 배열을 생성
			}catch(OutOfMemoryError e) { // 생성할 수 없음
				max =0;
			}
		}
		
		//push
		public int push(int x) throws OverflowIntStackException {
			//스택 포인터가 max보다 크거가 같을 경우
			if(ptr>=max) {
			/*
			 * ptr==max로 하는 이유는
			 * ptr값이 잘못 입력되면 max를 초과할 수도 있는데 위와 같이 부등호로 입력하게 되면
			 * 스택 본체 배열의 상한과 하한을 벗어나서 접근하는 것을 막을 수 있다.	
			 */
				
				throw new OverflowIntStackException();
			}
			// 스택 포인터가 max보다 작을 경우,
			// 스택에 저장한다.
			return stk[ptr++]=x;
		}
		
		//pop
		public int pop() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[--ptr];
			/*
			 * ex) 현재 ptr은 4인데, pop을 할 경우 3에 해당되는 값이 출력되어야 하므로
			 * [--ptr]을 하여 이전 값을 출력한다.
			 */
		}
		
		
		//peek
		public int peek() throws EmptyIntStackException{
			if(ptr<=0)
				throw new EmptyIntStackException();
			return stk[ptr-1];
		}

		//indexOf(검색)
		public int indexOf(int x) {
			for(int i= ptr-1; i>=0; i--) {
				if(stk[i]==x) {
					return i;
				}
			}
			//검색 실패 시 -1 출력
			return -1;
		}
		
		//clear
		public void clear() {
			ptr=0;
		}
		
		//capacity(스택의 용량을 반환)
		public int capacity() {
			return max;
		}
		
		//스택에 쌓여 있는 데이터의 수 반환
		public int size() {
			return ptr;
		}
		
		//스택이 비어있는가?
		public boolean inEmpty() {
			return ptr<=0;
			//ptr<=0일 경우 true가 반환된다.
		}
		
		//스택이 가득차있는가?
		public boolean isFull() {
			return ptr==max;
		}
		
		//스택 안의 모든 데이터를 출력
		public void dump() {
			if(ptr<=0) {
				System.out.println("스택이 비었습니다.");
			}else {
				for(int i = 0;i<ptr;i++) {
					System.out.print(stk[i]+ " ");
					System.out.println();
				}
			}
		}
		
		
		
}
