package ch03;

import java.util.Scanner;

/*
 * 이진 검색(binary search)
 * 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘으로,
 * 데이터의 값이 정렬되어 있다는 전제조건이 있다.
 * 
 * 검색 범위의 맨 앞 인덱스를 pl,
 * 중간 인덱스를 pc,
 * 마지막 인덱스를 pr이라고 지정한다.
 * 
 * 선형 검색은 범위가 1~n까지 일때 ,1부터 n번 반복수행하지만,
 * 이진 검색은 log n번 수행한다.
 */
public class practice_3_4 {

	static int binSearch(int[] a, int n , int key) {
		
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key) {
				//검색 조건에 key값이 존재할 경우 배열의 위치가 출력된다.
				return pc;
			}else if(a[pc]<key) {
				//배열의 중앙값이 key보다 작은 경우, 0~배열의 중간인덱스 안에 키 값이 없다는 것.
				//그러므로 배열의 시작인덱스 값을 변경한다.
				/*
				 * ex) 배열의 크기가 10일 때 중간 값은 6이다.
				 * 키값이 6보다 클경우, 0~6번 인덱스 내에는 키 값이 존재하지 않는다.
				 * 그러므로 배열의 시작 인덱스를 7로 변경하여, 다시 검색을 실시한다.
				 */
				
				pl=pc+1;
			}else {
				//배열의 중간값이 키값보다 큰 경우에 해당하며,
				//이 경우 배열의 끝 값을 중간값보다 작은 값으로 변경한다.
				
				pr=pc-1;
			}
		}while (pl<=pr);
		//배열에 해당 값이 없을 경우 -1이 출력 된다.
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수 :");
		int num = stdIn.nextInt();
		int[] x  = new int[num];
		
		System.out.println("오름차순으로 입력하시오.");
		System.out.print("x[0]:");
		x[0]= stdIn.nextInt();
		
		for(int i = 1; i< num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);
			//바로 앞 요소보다 작으면 다시 입력하라는 로직.
			//작을 경우 do가 실행된다.
		}
		
		System.out.print("검색할 값");
		int key = stdIn.nextInt();
		
		int idx = binSearch(x, num, key);
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("인덱스 번호  :"+idx);
		}
		
	}

}
