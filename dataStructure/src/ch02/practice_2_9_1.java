package ch02;

public class practice_2_9_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,000이하의 소수를 출력(2)
		
		int ptr = 0;//소수의 수
		int[] prime = new int[500];//소수를 저장할 배열
		
		prime[ptr++]=2;
		//2는 소수이므로 배열에 저장하고, 후연산을 하므로 ptr은 1이된다.
	
		
		for(int i = 3; i<=1000;i+=2) {
			//짝수는 소수일 수 없으므로 제외한다.
			int n;
			for(n=1;n<ptr;n++) {
				if(n%prime[n]==0) {
					//이미 찾은 소수로 나누어 봄
					break;
				}
			}
			if(ptr==n) {//마지막까지 나누어지지 않는 경우,
				prime[ptr++]=i;//소수라고 배열에 저장
			}
		}
		
		for(int i = 0; i<ptr;i++) {
			System.out.println(prime[i]);
		}
	}
	
}
