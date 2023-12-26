package ch02;

import java.util.Arrays;

public class practice_2_6 {
	
		
		static void reverseArray(int[] a, int idx1, int idx2) {
			//a[idx1]의 값을 t에 저장하고,
			//a[idx1]의 값에 a[idx2]의 값을 저장한 후,
			//a[idx2]에 t를 대입함으로써,
			//a[idx1]과 a[idx2]의 값을 변경한다.
			int t = a[idx1];
			a[idx1]=a[idx2];
			a[idx2]= t;
			
	}

		static void reverse(int[] a) {
			for(int i =0; i<a.length/2;i++) {
				reverseArray(a, i, a.length-i-1);
				/*
				 * a.length()=5일 때
				 * 1) reverseArray(a, 0, 4);
				 * 2) reverseArray(a, 1, 3);
				 * i=2일 때는 for문의 조건에 해당되므로 끝이 난다.
				 */
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 역순을 출력하시오.
		
		int[] a = {1,2,3,4,5};
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

}
