import java.util.ArrayList;
import java.util.Arrays;

public class knapsack_2 {
	public static void main(String[] args) {
		String item[] = { "휴대폰", "라면", "쌀", "빵", "우의", "커피", "생수", "오이", "침낭", "라디오", "손전등" };
		int value_array[] = { 16, 35, 36, 20, 21, 10, 12, 16, 46, 12, 18 };
		int value = 0;
		int high_value = 0;
		int weight_array[] = { 1, 11, 12, 5, 6, 3, 7, 4, 16, 2, 2 };
		int weight = 0;
		long mid_num = 0;
		int good_weight = 0;
		ArrayList high_value_list = new ArrayList();
		ArrayList high_value_list_2 = new ArrayList();
		String[] element;
		String[] BinaryArray = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i <= 2047; ++i) {
			value = 0;
			weight = 0;
			String binaryString = Long.toBinaryString(i);
			for (int j = 0; j < binaryString.length(); j++) {
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
			if (weight > 40) {
				continue;
			}
			if (value > high_value) {
				high_value_list.clear();
				high_value_list_2.clear();
				high_value = value;
				high_value_list.add(binaryString);
				good_weight = weight;
				continue;

			} else if (value == high_value) {
				high_value_list_2.add(binaryString);
				good_weight = weight;
				continue;
			}
		}
		for (int k = 0; k < BinaryArray.length; k++) {
			if (BinaryArray[k].equals("1") && k != 10) {
				System.out.print(item[k] + ", ");
			}
			if (k == 10) {
				System.out.println(item[k] + " 을(를) 넣으면 됩니다.");
				System.out.println("무게 : " + good_weight + "kg");
				System.out.println("만족도 : " + high_value);
			}
		}
	}
}
