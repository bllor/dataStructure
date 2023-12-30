package ch03;

/*
 * 클래스 메서드와 인스턴스 메서드
 * 
 * 클래스 메서드는 클래스 전체에 대한 처리를 담당한다.
 * 인스턴스 메서드는 개별인스턴스를 처리할 때 사용
 */

public class practice_3_7 {

	public static void main(String[] args) {
		
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 아이디 : "+a.getId());
		System.out.println("b의 아이디 : "+b.getId());
		System.out.println("회원가입 수 :" +Id.getCounter());
	}

}

class Id{
	private static int counter = 0;
	private int id;
	
	public Id() {
		counter++;
	}
	
	public int getId() {return id;}
	
	public static int getCounter() {return counter;}
	
}
