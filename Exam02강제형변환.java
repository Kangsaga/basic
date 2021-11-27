
public class Exam02강제형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 형변환
		
		// 자동 형변환
		int num1 =30;
		long num2 = num1;
		
		//강제 형변환-큰 데이터값을 누실없이 하기위해서 강제형변환을 쓴다.
		//그래도 큰값을 넣으면 누실된다
		
		int num3 = 50;
 		byte num4 = (byte)num3;
		//System.out.println(num4);
		
		//정수와 실수-같은 바이트여도 실수를 정수보다 큰범위로 인식하기 때문에 에러가 발생한다
		int num5 = 50;
		float num6 = num5;
		int num7 = (int)num6;
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}

}
