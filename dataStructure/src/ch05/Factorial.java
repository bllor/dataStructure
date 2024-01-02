package ch05;

import java.util.Scanner;

/*
 * ch05. 재귀 알고리즘
 * 재귀 : 어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의되는 것
 * 
 * [1]직접 재귀와 간접 재귀
 * 직업 재귀는 팩토리얼처럼 자신과 같은 매서드를 호출할 때
 * 간접 재귀는 매서드 a가 매서드 b를 호출하고, 매서드b가 다시 매서드a를 호출하는 구조
 */
public class Factorial {
	// 양의 정수 n의 팩토리얼을 반환한다.

	static int factorial(int n) {
		if(n>0) {
			return n*factorial(n-1);
		}else {
			return 1;
		}
	}
	
	/*
	 * factorial(4)일 경우
	 * 4*factorial(3)
	 * 4*3*factorial(2)
	 * 4*3*2*factorial(1)
	 * 4*3*2*1*factorial(0)
	 * 4*3*2*1*1= 24가 된다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int num = scan.nextInt();
		
		System.out.println(num+"의 팩토리얼은 "+factorial(num)+" 입니다.");
				
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		
		System.out.println("두 수의 최대 공약수를 구합니다.");
		System.out.println("첫 번째 정수를 입력하시오.");
		int x= scan.nextInt();
		
		System.out.println("두 번째 정수를 입력하시오.");
		int y= scan.nextInt();
		
		System.out.printf("최대 공약수는 %d입니다.",EuclidGCD.gcd(x, y));
		
		
		
	}

}

class EuclidGCD{
	/*
	 * 유클리드 호재법 : 두 정수의 최대 공약수를 재귀적으로 구하는 방법
	 */
	
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	/*
	 * gcd(12,18)일 경우
	 * 1)y!=0 
	 * 1-1)gcd(18, (12%18==12))이 되는데,
	 * 
	 * 2)gcd(18,12)
	 * 2-1)y!=0 -> gcd(12, 18%12==6)
	 * 
	 * 3)gcd(12,6)
	 * 3-1)y!=0, gcd(6,12%6==0)
	 * 
	 * 4)gcd(6,0)
	 * 4-1)y==0, gcd(12,18)=6으로 반환
	 */
	
	
	
}
