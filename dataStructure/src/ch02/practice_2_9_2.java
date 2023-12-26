package ch02;

public class practice_2_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1000 이하의 소수 출력(2)
		
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		for(int n = 5; n<=1000;n+=2) {//홀수만 계산
			boolean flag = false;
			
			for(int i = 1;prime[i]*prime[i]<=n;i++) {
				if(n%prime[i]==0) {//소수로 나뉘는지 확인
					flag = true;
					break;//소수로 나뉠 경우 다음 수로 넘어간다.
				}
			}
			if(!flag) {
				prime[ptr++]=n;
			}
		}
	}

}
