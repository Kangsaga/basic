import java.util.Scanner;

public class Exam06��ĳ�ʳֱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ű����κ��� ������ �Է¹ޱ�
		// ���콺 �÷��� import �ϴ� ���
		// ctrl + shift + O import�� �־��ִ�Ű
		// ctrl + shift + F ������
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� >>");
		int input = sc.nextInt();
		// System.out.println("��� : " + input);

		// ��Ѱ��� �Է��ϵ��� �����ڸ� �Ʒ����� ������ ����Ͻÿ�
		// ��) 456 �Է� -> ��� : 400
		// int result = input / 100 * 100;
		String result = input / 100 + "00";
		System.out.println("��� : " + result);

	}

}
