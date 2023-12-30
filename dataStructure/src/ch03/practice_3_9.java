package ch03;

/*
 * 제네릭 
 * - 처리해야 할 대상의 자료형에 의존하지 않는 클래스
 * 
 * 파라미터 작성방법
 * - 1개의 대문자를 사용한다.
 * - 컬렉션의 자료형은 element의 앞글자인 E를 사용한다.
 * - 맵의 key, value은 앞글자인 k,y로 쓴다.
 * - 일반적으로는 T를 사용한다.
 */
public class practice_3_9 {

	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){
			this.xyz = t;
		}
		
		T getXyz() {
			return xyz;
		}
	}
	
	
	public static void main(String[] args) {
		GenericClass<String> str = new GenericClass<String>("hello");
		GenericClass<Integer> i  = new GenericClass<Integer>(16);
		
		System.out.println(str.getXyz());
		System.out.println(i.getXyz());
		
		/*
		 * str과 i의 타입이 다르지만 같은 클래스를 사용할 수 있고, 같은 매서드를 사용해서 다른 값을 출력할 수 있다.
		 */
		
	}
}
