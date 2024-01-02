package ch05;

public class EightQueen {

	static boolean[] flag_a = new boolean[5];  // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[9]; // 대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[9]; // 대각선 방향으로 퀸을 배치했는지 체크
	static int[] pos = new int[5]; 
	
	//각 열의 퀸의 위치 출력
	static void print() {
		for(int i = 0; i<5; i++) {
			System.out.printf("%2d",pos[i]);
		}
		System.out.println();
	}
	
	//i열에 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for(int j =0; j<5; j++) {
			if(flag_a[j]== false && flag_b[i+j]==false&&flag_c[i-j+4]==false) {
				pos[i]=j;
				if(i==4) {
					print();
				}else {
				flag_a[j]=flag_b[i+j]=flag_c[i-j+4]=true;
				set(i+1);
				flag_a[j]=flag_b[i+j]=flag_c[i-j+4]=false;
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
