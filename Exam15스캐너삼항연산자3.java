import java.util.Scanner;

public class Exam15��ĳ�ʻ��׿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		int result = num1 % 5 == 0 ? num1/5 :num1/5 +1;
		System.out.println("�ʿ��� ������ �� :"+ result);
		
		
		
	}

}
