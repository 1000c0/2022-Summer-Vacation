package assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcFutureValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int level = 0;                           // 각 값들을 받을 때마다 올라가서 잘못된 값을 넣었을 때 정확한 위치에 회귀하기 위
		double present_value = 0;
		double interest_value = 0;
		int time_of_future = 0;
		double future_value = 0;
		
		while (true) {
			try {
				if (level < 0) {                 // 제일 처음 값을 잘못 넣었을 때, 레벨이 0이 되지 않게 함.
					level = 0;
				}
				if (level == 0) {                // 현재가를 받아들임
					System.out.print("Input Present Value: ");
					present_value = scan.nextDouble();
					level++;                     // 레벨을 하나 올려서 catch후 현재가를 넣을 수 있개 
				} else if (level == 1) {         // 이자율을 받아들임
					System.out.print("Input Interest Rate (0 ~ 100): ");
					interest_value = scan.nextDouble();
					if(interest_value < 0 || interest_value > 100) {    // 100이상 또는 음수를 걸러줌
						System.out.println("Inavlid Value, Error!");
						continue;
					}
					level++;
				} else if (level == 2) {          // 시간이 몇년 흘렀는지 받아들
					System.out.print("Input Time of Future: ");
					time_of_future = scan.nextInt();
					level++;
				}
				for(int n = 0; n <= time_of_future; n++) {             // 받은 값들로 미래가를 계산함.
					future_value = present_value * Math.pow((1 + interest_value / 100), time_of_future);
				}
				if(level == 3) {                  //미래가를 출력함
				System.out.println(String.format("Future Value = %.2f", future_value));
				break;
				}
			} catch (InputMismatchException e) {  // 사용자가 입력되지 못하는 타입의 입력값을 입력했을 때 오류를 잡고 다시 입력하게 
				System.out.println("Invalid Value, Retry!");
				scan = new Scanner(System.in);
			}
		}
	}
}
