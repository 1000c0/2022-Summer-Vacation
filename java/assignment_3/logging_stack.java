package assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class logging_stack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bottom = 0;
		int top = 0;
		int mid = 0;
		int level = 0;
		while (true) {
			try {
				System.out.print("쌓을 통나무 개수를 선택하세요. :");
				int total_log = scan.nextInt();
				if(total_log <= 0) {
					System.out.println("자연수를 입력해주세요.");
					scan = new Scanner(System.in);
					continue;
				}
				level++;                               //입력을 제대로 받으면 단계 1 증가
				for (int n = 0; total_log >= n; n++) {
					if (total_log > n * (n + 1) / 2) { // 자연수의 합 공식으로 구간별 바닥의 개수를 구합니다.
						bottom += 1;
					} else {
						System.out.println("바닥의 개수는 " + bottom + "개");
						break;
					}
				}
				level++;                               //바닥의 개수를 제대로 구하면 단계 1 증가
				int semi_bottom = bottom;
				while (true) {
					int semi_total = total_log - semi_bottom; // 전체 통나무 개수에서 바닥의 개수를 빼 대체할 총 개수를 저장한다.
					total_log = total_log - semi_bottom; // 계산에 필요한 총 개수를 임시 총 개수를빼서 저장한다.
					if (total_log <= 0) { //
						top = semi_bottom;
						System.out.println("꼭대기의 개수는 " + top + "개");
						break;
					}
					semi_bottom--; // 윗층으로 갈수록 최대 개수가 1개씩 줄어드는 것을 표현
				}
				if(level == 2) {                          //모든 과정을 정확히 수행하면 종료
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("자연수를 입력해주세요.");
				scan = new Scanner(System.in);
			}
		}
	}
}