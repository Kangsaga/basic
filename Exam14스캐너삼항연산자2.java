import java.util.Scanner;

public class Exam14��ĳ�ʻ��׿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�� ���� �� : ");
		System.out.println(num1 < num2 ? num2-num1 : num1-num2);
		
		
		
	}

}
