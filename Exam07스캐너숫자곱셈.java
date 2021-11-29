import java.util.Scanner;

public class Exam07스캐너숫자곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("숫자입력 : ");
		int result = input /10 *10 + 1;
		System.out.println("결과 확인 : " + (input /10 + "1"));
		System.out.println("결과 확인 : " + result);
		
	}

}
