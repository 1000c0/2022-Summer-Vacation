import java.util.ArrayList;
import java.util.Arrays;

public class knapsack_2 {
	public static void main(String[] args) {
		String item[] = { "휴대폰", "라면", "쌀", "빵", "우의", "커피", "생수", "오이", "침낭", "라디오", "손전등" };
		int value_array[] = { 16, 35, 36, 20, 21, 10, 12, 16, 46, 12, 18 };
		int high_value = 0; // 최적 만족도를 저장할 변수
		int weight_array[] = { 1, 11, 12, 5, 6, 3, 7, 4, 16, 2, 2 };
		int good_weight = 0; // 최적 무게를 저장할 변수

		String[] element; // 이진수를 쪼갠 것을 받아 넘길 곳
		String[] BinaryArray = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" }; // 이진수들을 계속 바꿔 담을 곳
		String[] high_array = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" }; // 최적해를 따로 저장할 곳

		for (int i = 0; i <= 2047; ++i) {
			int value = 0; // 실행마다 만족도 초기화
			int weight = 0; // 실행마다 무게 초기화
			String binaryString = Long.toBinaryString(i); // Long으로 받은 이진수를 문자열로 바꿈
			for (int j = 0; j < binaryString.length(); j++) { // 각 자리별 대조를 위해, 문자열 이진수를 하나하나 쪼갬
				element = binaryString.split("");
				BinaryArray[j] = element[j];
			}
			if (BinaryArray[0].equals("1")) { // 휴대폰
				value += 16;
				weight += 1;
			}
			if (BinaryArray[1].equals("1")) { // 라면
				value += 35;
				weight += 11;
			}
			if (BinaryArray[2].equals("1")) { // 쌀
				value += 36;
				weight += 12;
			}
			if (BinaryArray[3].equals("1")) { // 빵
				value += 20;
				weight += 5;
			}
			if (BinaryArray[4].equals("1")) { // 우의
				value += 21;
				weight += 6;
			}
			if (BinaryArray[5].equals("1")) { // 커피
				value += 10;
				weight += 3;
			}
			if (BinaryArray[6].equals("1")) { // 생수
				value += 12;
				weight += 7;
			}
			if (BinaryArray[7].equals("1")) { // 오이
				value += 16;
				weight += 4;
			}
			if (BinaryArray[8].equals("1")) { // 침낭
				value += 46;
				weight += 16;
			}
			if (BinaryArray[9].equals("1")) { // 라디오
				value += 12;
				weight += 2;
			}
			if (BinaryArray[10].equals("1")) { // 손전등
				value += 28;
				weight += 2;
			}
			if (weight > 40) { // 무게가 40kg 초과하면 다시 처음으로
				continue;
			}

			if (value > high_value) { // 무게 조건에 맞는 더 높은 만족도가 나올시 기존 최적 무게와 만족도, 담을 물품들의 목록을 갱신하고, 따로 저장함.
				high_value = value;
				good_weight = weight;
				for (int m = 0; m < binaryString.length(); m++) {
					high_array[m] = BinaryArray[m];
				}
				continue;
			}
		}

		for (int k = 0; k < 11; k++) {
			if (high_array[k].equals("1") & k != 10) { // 각 자리별 수에 따라, 0이면 넣지 않고 1이면 넣음
				System.out.print(item[k] + ", ");
			}
			if (k == 10 & high_array[k].equals("1")) {
				System.out.println(item[k] + " 을(를) 넣으면 됩니다.");
				System.out.println("무게 : " + good_weight + "kg");
				System.out.println("만족도 : " + high_value);

			} else if (k == 10 & high_array[k].equals("0")) {
				System.out.println(" 을(를) 넣으면 됩니다.");
				System.out.println("무게 : " + good_weight + "kg");
				System.out.println("만족도 : " + high_value);
			}
		}
	}
}