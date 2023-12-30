package ch03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Arrays.binarySearch에 의한 이진 검색
 * 
 * Arrays.binarySearch은 이진 검색 표준 라이브러리의 메서드
 * 검색에 성공할 경우 해당 요소의 인덱스를 반환하며,
 * 
 * 
 * 검색에 실패할 경우 반환값은 삽입 포인트를 x라고 할 때 -x-1이다.
 * 삽입 포인트는 key값보다 큰 요소 중 첫번 째 인덱스이거나 배열의 모든 요소가 key보다 작은 경우 배열의 길이를 삽입 포인트로 정한다.
 * 
 * ex)
 * key: 4이고,
 * a ={1,3,5,7}; 일경우 반환 값은 -3이다. 삽입되는 인덱스 번호는 2이고, -2-1=-3이다. 
 */
public class practice_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소수 값");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.print("첫번 째 요소");
		x[0] = scan.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"] :");
				x[i]=scan.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값");
		int key = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		if(idx < 0) {
			System.out.println("X");
		}else{
			System.out.println(idx);
		}
	}

}
