package ch03;
/*
 * 복잡도
 * 복잡도란? 알고리즘의 성능을 객관적으로 평가하는 기준
 * 종류
 * 1)시간 복잡도(time complexity)  : 실행에 필요한 시간을 평가한 것
 * 2)공간 복잡도(space complexity) : 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것
 * 
 * 1)시간 복잡도
 * 한 번만 실행될 경우 복잡도는 O(1)
 * n번 실행될 경우 복잡도는 O(n)으로 표시합니다.
 * 
 * 2개 이상의 복잡도로 구성된 알고리즘의 전체 복잡도는 차원이 더 높은 쪽의 복잡도를 우선시 합니다(큰 것을 우선으로 한다.)
 * 
 * 
 * 복잡도의 대소 관계
 * 1<log n < n < n log n < n^2 < n^3 etc
 */
public class practice_3_5 {

	static int seqSearch(int[] a, int n , int key) {
		int i = 0; //한 번만 실행되므로 O(1)
		while(i<n) { //n번 실행되므로 o(n)
			if(a[i]==key) {// o(n)
				return i; //o(1)
			}else {
				i++; //o(n)
			}
		}
		return -1; //o(1)
		//선형 검색일 경우 o(1,n,n,1,n,1) -> 복잡도는 o(n)이다.
	}
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //O(1)
		int pr = n-1; //O(1)
		
		do {
			int pc = (pl+pr)/2; //O(log n) 
			if(a[pc]==key) { //O(log n)
				return pc; //O(1)
			}else if(a[pc]<key) { //O(log n)
				pl=pc+1; //O(log n)
			}else { //O(log n)
				pr=pc-1; //O(log n)
			}
		}while(pl<=pr); //O(log n)
		
		return -1; //O(1)
		
		//이진 검색일 경우 복잡도는 log n이다.
	}
}
