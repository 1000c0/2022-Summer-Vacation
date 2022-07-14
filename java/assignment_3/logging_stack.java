package assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class logging_stack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bottom = 0;
		int top = 0;
		int mid = 0;
		try {
			System.out.print("쌓을 통나무 개수를 선택하세요. :");
			int total_log = scan.nextInt();
			for (int n = 0; total_log >= n; n++) {
				if (total_log > n * (n + 1) / 2) { // 자연수의 합 공식으로 구간별 바닥의 개수를 구합니다.
					bottom += 1;
				} else {
					System.out.println("바닥의 개수는 " + bottom + "개");
					break;
				}
			}
			int semi_bottom = bottom;
			while (true) {
				int semi_total = total_log - semi_bottom;
				total_log = total_log - semi_bottom;
				semi_bottom --;
				if (total_log <= 0) {
					top = semi_bottom;
					System.out.print("꼭대기" + (top+1));
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.print("자연수를 입력해주세요.");
			scan = new Scanner(System.in);
		}
	}
}