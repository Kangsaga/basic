import java.util.Scanner;

public class Exam08스캐너초입력시시간으로변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("초입력 : ");
		int totalSecond = sc.nextInt();
		//int a = totalSecond;
		//System.out.print(a / 3600 + "시 ");
		//System.out.print(a % 3600 / 60 + "분 ");
		//System.out.println(a % 3600 % 60 + "초");
		
		
		int hour = totalSecond / 3600;
		totalSecond = totalSecond % 3600;
		int min = totalSecond / 60;
		int sec = totalSecond % 60;
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		
	}

}
