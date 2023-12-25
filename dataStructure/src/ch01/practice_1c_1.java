package ch01;

public class practice_1c_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중간 값 구하기
		int a = 1;
		int b = 4;
		int c = 3;
		System.out.println(median(a, b, c));
	}


	public static int median(int a, int b, int c) {
		int median = 0;
		if(a>=b) {
			if(b>=c) {
				median =b;
			}else if(a<=c){
				median = a;
			}else {
				median = c;
				
			}
		}else if(a>c) {//a가 b보다 작고 c보다 큰 경우 
			median = c;
		}else if(b>c) {
			//a가 c보다 작고, b가 c보다 클 경우 중간 값은 c
			//위에서 걸러진다.
			median = c;
		}else {
			//a가 b보다 작고, c는 a,b보다 큰 경우에 해당된다.
			median = b;
		}
		return median;
	}
}

