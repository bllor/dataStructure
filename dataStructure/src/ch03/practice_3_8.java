package ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


/*
 * 
 * test1, test2, test100으로 있을 때
 * 문자열 정렬인 경우 -> test1, test100, test2로 정렬되는데,
 * 자연 정렬인 경우 -> test1,test2, test100으로 정렬이 된다.
 */
public class practice_3_8 {

	static class PhyscData{
		private String name;
		private int height;
		
		//생성자
		public PhyscData(String name, int height) {
		//this.name = name;은
		//생성자로 인해서 입력된 name을 정의한다는 것?
		//암튼 두 개의 순서가 바뀌면 저장되지 않는다.
			this.name = name;
			this.height = height;
		};
		
		//정보확인용 문자 반환 메서드
		
		public String toString() {
			return name+ " "+ height;
		}
		
		//오름차순으로 정렬하기 위한 comparator
		
		public static final Comparator<PhyscData>Height_Order  = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				//d1이 d2보다 클 경우 1, 작을 경우 -1, 같을 경우 0을 반환
				return (d1.height> d2.height)? 1: 
					(d1.height<d2.height)? -1 : 0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PhyscData[] data = {
				new PhyscData("보리",66),
				new PhyscData("비아",80),
				new PhyscData("김희지",166),
				new PhyscData("최동일",180),
		};
		
		System.out.print("몇 cm인 사람을 찾고 있나요?");
		int height = scan.nextInt();
		int idx = Arrays.binarySearch(data, new PhyscData("", height), PhyscData.Height_Order);
		
		if(idx<0) {
			System.out.println("X");
		}else {
			System.out.println(idx);
		}
		
	}

}

