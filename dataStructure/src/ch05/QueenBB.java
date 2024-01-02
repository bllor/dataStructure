package ch05;

public class QueenBB {

	static boolean[] flag = new boolean[3]; //각 행에 퀸을 배치했는지 체크
	static int[] pos = new int[3]; // 각 열의 퀸의 위치
	
	//각 열의 퀸의 위치를 출력합니다.
	static void print() {
		for(int n = 0; n<3; n++) {
			System.out.printf("%2d",pos[n]);
		}
		System.out.println();
	}
	
	//i열에 알맞는 위치에 퀸을 배치 합니다.
	static void set(int n) {
		for(int j = 0; j<3; j++) {
			if(flag[j]==false) { //j행에 퀸을 아직 배치하지 않았다면
				pos[n]=j;		 //퀸을 j행에 배치합니다.
			
				if(n==2) {		 //모든 열에 배치한 경우
					print();
				}
				
				
				else {
					
				flag[j]= true;
				set(n+1); 
				flag[j]=false;
				}
			}	
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
//
//** 0 **
//	for j :0 i :0
//		start i :0, j: 0
//			** 1 **
//				for j :0 i :1
//				for j :1 i :1
//					start i :1, j: 1
//						** 2 **
//							for j :0 i :2
//							for j :1 i :2
//							for j :2 i :2
//											0 1 2
//					finish i :1, j: 1
//				for j :2 i :1
//					start i :1, j: 2
//						** 2 **
//							for j :0 i :2
//							for j :1 i :2
//											0 2 1
//							for j :2 i :2
//					finish i :1, j: 2
//		finish i :0, j: 0
//		
//	for j :1 i :0
//		start i :0, j: 1
//			** 1 **
//				for j :0 i :1
//					start i :1, j: 0
//						** 2 **
//							for j :0 i :2
//							for j :1 i :2
//							for j :2 i :2
//							 				1 0 2
//					finish i :1, j: 0
//				for j :1 i :1
//				for j :2 i :1
//					start i :1, j: 2
//						** 2 **
//							for j :0 i :2
//							 				1 2 0
//							for j :1 i :2
//							for j :2 i :2
//					finish i :1, j: 2
//		finish i :0, j: 1
//		
//	for j :2 i :0
//		start i :0, j: 2
//			** 1 **
//				for j :0 i :1
//					start i :1, j: 0
//						** 2 **
//							for j :0 i :2
//							for j :1 i :2
//											2 0 1
//							for j :2 i :2
//					finish i :1, j: 0
//				for j :1 i :1
//					start i :1, j: 1
//						** 2 **
//							for j :0 i :2
//											2 1 0
//							for j :1 i :2
//							for j :2 i :2
//					finish i :1, j: 1
//				for j :2 i :1
//		finish i :0, j: 2


