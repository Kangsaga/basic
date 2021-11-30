import java.util.Scanner;

public class Exam13스캐너삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
	    System.out.print(a);
		System.out.println(a % 2 == 0 ? " (은) 짝수" : " (은) 홀수");
		
		
		
	}

}
