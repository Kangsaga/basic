import java.util.Scanner;

public class Exam16���׿��糷��������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		 int time = sc.nextInt();
		 int money = time <= 8 ? time *5000 : 8*5000 + (int)(time%8*5000*1.5);
		 // int money = time <= 8 ? time *5000 : 8*5000 + (time-8)*7500);
		 System.out.println("�� �ӱ��� " + money + "�Դϴ�");
		
		// �������� �켱������ �ִ�
		//���� > ��� > �� > �� > ���� > ���� ���̴�.
		 
		
	}

}
