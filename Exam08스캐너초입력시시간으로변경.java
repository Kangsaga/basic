import java.util.Scanner;

public class Exam08��ĳ�����Է½ýð����κ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("���Է� : ");
		int totalSecond = sc.nextInt();
		//int a = totalSecond;
		//System.out.print(a / 3600 + "�� ");
		//System.out.print(a % 3600 / 60 + "�� ");
		//System.out.println(a % 3600 % 60 + "��");
		
		
		int hour = totalSecond / 3600;
		totalSecond = totalSecond % 3600;
		int min = totalSecond / 60;
		int sec = totalSecond % 60;
		System.out.println(hour + "�� " + min + "�� " + sec + "��");
		
		
	}

}
