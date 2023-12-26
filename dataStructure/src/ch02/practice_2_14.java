package ch02;

public class practice_2_14 {

	static class PhyscData{
		String name;
		int height;
		
		PhyscData(String name, int height) {
		//생성자 생성	
			this.name = name;
			this.height = height;
		}
	}
	
	//평균키 구하기
	static double avgHeight(PhyscData[] data) {
		double sum = 0;
		for(int i = 0; i<data.length;i++) {
			sum+=data[i].height;
		}
		
		return sum/data.length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.26
		// 클래스의 배열
		// 신체검사 데이터용 클래스 배열에서 평균 키를 구함
		
		PhyscData[] data = {
			new PhyscData("비아", 100),	
			new PhyscData("보리", 70),	
			new PhyscData("희지", 166),	
			new PhyscData("동일", 180),	
		};
		
		System.out.println("신체검사 리스트");
		System.out.println("이름       키");
		for(int i = 0; i<data.length;i++) {
			System.out.printf("%-8s%3d\n",data[i].name,data[i].height);
		}
		System.out.printf("평균 키 : %5.1fcm\n",avgHeight(data));
	}

}
