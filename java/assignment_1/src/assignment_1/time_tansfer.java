package assignment_1;
import java.util.Scanner;


public class time_tansfer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
		String se[] = x.split(":");     // :을 기준으로 시와 분을 분
		int hour = Integer.parseInt(se[0]);
		int min = Integer.parseInt(se[1]);
		int se2 = (hour - 12);    // 24시간제를 12시간제 시로 바꾸
		

		if (hour <12) {
			System.out.print("오전 " + hour + "시 " + min + "분 입니다.");
		}
		if(hour >= 12 & hour < 24){
			System.out.print("오후 " + se2 + "시 " + min + "분 입니다.");
		}
		if(hour == 24) {
			System.out.print("오전" + se2 + "시 " + min + "분 입니다.");
		}
		
	}

}
