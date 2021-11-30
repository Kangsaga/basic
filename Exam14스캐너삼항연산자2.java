import java.util.Scanner;

public class Exam14스캐너삼항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("두 수의 차 : ");
		System.out.println(num1 < num2 ? num2-num1 : num1-num2);
		
		
		
	}

}
