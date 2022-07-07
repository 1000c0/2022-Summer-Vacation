package assignment_1;
import java.util.Scanner;

public class money_seperate {
	public static void main(String[] args) {
		int input = 0;
		Scanner total = new Scanner(System.in);
		input = total.nextInt();
		int mother = 0;
		int king = 0;
		int blue = 0;
		int bird = 0;
		int general = 0;
		int tower = 0;
		int ten = 0;
		
		mother = input / 50000;
		king = (input % 50000) / 10000;
		blue = (input % 5000) / 1000;
		bird = (input % 1000) / 500;
		general = (input % 500) / 100;
		tower = (input % 100) / 50;
		ten = (input % 50) / 10;
		
		if ((input % 10) > 0) {
			System.out.print("잘못 입력하셨습니다.");
		}else {
			System.out.print("오만원권" + mother + "매," + "만원권" + king + "매," + "천원권" + blue + "매," + "오백원" + bird + "매," + "백원" + general +"매," + "오십원" + tower + "매," + "십원" + ten + "");
		}
				
	}

}
