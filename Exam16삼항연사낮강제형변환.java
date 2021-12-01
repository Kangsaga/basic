import java.util.Scanner;

public class Exam16삼항연사낮강제형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("노동시간을 입력하세요 : ");
		 int time = sc.nextInt();
		 int money = time <= 8 ? time *5000 : 8*5000 + (int)(time%8*5000*1.5);
		 // int money = time <= 8 ? time *5000 : 8*5000 + (time-8)*7500);
		 System.out.println("총 임금은 " + money + "입니다");
		
		// 연산자의 우선순위가 있다
		//증감 > 산술 > 비교 > 논리 > 삼항 > 대입 순이다.
		 
		
	}

}
