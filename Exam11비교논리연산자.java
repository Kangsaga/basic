
public class Exam11비교논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비교연산자 - 두 항의 값을 비교하는 연산자
		//결과값은 언제나 true or false
		//비교연산자의 기준은 항상 왼쪽이 기준이다.
		
		System.out.println(8 > 3);
		System.out.println(3 >= 3);
		System.out.println(7 < 9 );
		System.out.println(8 <= 9);
		System.out.println(10 == 10);//같다
		System.out.println(11 != 15);//같지않다
		
		// 문자열 비교(문자열이 같은지 비교할때는 equals를 사용한다)
		String name1 = "강범수";
		String name2 = "강범수";
		System.out.println(name1.equals(name2));
		
		//논리연산자(Not, And, Or)
		// And -> &&
		System.out.println(8 > 7 && 3 < 6);
		
		// Or -> ||
		System.out.println(7 > 5 || 12 < 3);
		
		// Not 연산자
		System.out.println( !(10 < 3));
		
		// 삼항 연산자 - 코드에 흐름을 제어한다.
		
		
		
	}

}
