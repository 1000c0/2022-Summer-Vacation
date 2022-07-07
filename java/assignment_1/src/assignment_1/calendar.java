package assignment_1;
import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		System.out.print("요일을 알고 싶은 날짜를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt(); 
		
		if(day >= 1 & day <= 31) {     // 입력값 범위를 제
		
		switch(day % 7) {              //7로 나눈 나머지가 같은 숫자는 같은 요일임을 이
		case 1:
			System.out.print("금요일");
			break;
		case 2:
			System.out.print("토요일");
			break;
		case 3:
			System.out.print("일요일");
			break;
		case 4:
			System.out.print("월요일");
			break;
		case 5:
			System.out.print("화요일");
			break;
		case 6:
			System.out.print("수요일");
			break;
		case 0:
			System.out.print("목요일");
			break;
		default:
			System.out.print("1~31 사이의 값을 입력하세요.");
		}
		}else {
			System.out.print("1~31 사이의 값을 입력하세요.");
		}
	}
}


