import java.util.Scanner;

public class Exam06스캐너넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로부터 데이터 입력받기
		// 마우스 올려서 import 하는 방법
		// ctrl + shift + O import값 넣어주는키
		// ctrl + shift + F 줄정리
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >>");
		int input = sc.nextInt();
		// System.out.println("결과 : " + input);

		// 어떠한값을 입력하든지 백의자리 아랫값을 버리고 출력하시오
		// 예) 456 입력 -> 결과 : 400
		// int result = input / 100 * 100;
		String result = input / 100 + "00";
		System.out.println("결과 : " + result);

	}

}
