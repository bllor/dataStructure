package ch05;

public class QueenB {

	static int[] pos = new int[2];
	
	static void print() {
		for(int i = 0; i<2; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	//i열에 퀸을 놓습니다.
	static void set(int i) {
		for(int j = 0; j<2;j++) {
			pos[i]=j;
			if(i==11) {
				print();
			}else {
				set(i+1);
			}
		}
	}
	/*
	 * set(0);
	 * 1) pos[0]=0;
	 * 2) i!=1 -> set(1)
	 * 3) set(1);
	 * 4) pos[1]=0;
	 * 5) i==1 -> print();
	 * print pos[0] = 0, pos[1]= 0; 출력
	 * ---------
	 * j=1;
	 * 1~5 반복
	 * print pos[0]= 1 , pos[1]= 1;출력
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
