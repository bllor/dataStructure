package ch03;

import java.util.Scanner;

public class practice_3_3 {
	/*
	 * 선형검색(보초법)
	 * 선형 검색은 반복할 때마다 다음의 종료조건을 모두 판단한다.
	 * 1.검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
	 * 2.검색할 값과 같은 요소를 발견할 경우
	 * 
	 * 보초(찾는 값)을 배열의 맨 마지막에 배치하면
	 * 조건 2가 성립된다. 이렇게 하면 종료 판단 횟수를 2회에서 1회로 줄일 수 있게 된다.
	 * 
	 * 
	 * while을 사용하여 
	 * if(i==n)의 조건을 하나 없엤으므로,
	 * 반복에 대한 판단 횟수를 절반으로 줄였다.
	 */
	static int seqSearchSen(int[] a, int n, int key) {
		//a: 배열
		//n: 요솟수
		//key: 찾는 값
		int i = 0;
		
		a[n]= key;//배열의 마지막에 key를 추가하여 보초를 세움
		
		while(true) {
			if(a[i]==key) {
				//배열에 key값이 있는 경우
				break;
			}
			i++;
		}
		return i==n ? -1: i;
		//배열에 key값이 있는 경우 i로, 
		//없는 경우 i==n이 되는데 -1을 출력한다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num+1]; //+1을 하는 이유는 보초를 놔둘 것이기 때문
		
		for(int i = 0; i< num; i++) {
			System.out.print("x["+i+"]:");
			x[i]=scan.nextInt();
		}
		System.out.println("검색할 값");
		int key = scan.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		if(idx==-1) {
			System.out.println("그 값의 요소는 없습니다.");
		}else {
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
		}
	}	

}
