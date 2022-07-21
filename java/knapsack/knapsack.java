import java.util.ArrayList;

/* 멸망한 코드
 * 논리적 문제 있음
 * 10일 때 -1을 하면 안되지만 해버리는 치명적인 문제
 * 폐기 하겠음
*/

public class knapsack {

	public static void main(String[] args) {
		String item[] = { "휴대폰", "라면", "쌀", "빵", "우의", "커피", "생수", "오이", "침낭", "라디오", "손전등" };
		long flag[] = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 1000000000L };
		int value_array[] = { 16, 35, 36, 20, 21, 10, 12, 16, 46, 12, 18 };
		int value = 0;
		int high_value = 0;
		int weight_array[] = { 1, 11, 12, 5, 6, 3, 7, 4, 16, 2, 2 };
		int weight = 0;
		long mid_num = 0;
		ArrayList<Long> high_value_list = new ArrayList<Long>();
		high_value_list.add(0, (long) 0);

		for (int i = 0; i <= 2047; ++i) {
			weight = 0;
			value = 0;
			long binary = Long.parseLong(Long.toBinaryString(i));
			mid_num = binary;
			if (mid_num - 1 >= 0) {
				weight += 1;
				value += 16;
				mid_num -= 1;
			}
			if (mid_num - 10 >= 0) {
				weight += 11;
				value += 35;
				mid_num -= 10;
			}
			if (mid_num - 100 >= 0) {
				weight += 12;
				value += 36;
				mid_num -= 100;
			}
			if (mid_num - 1000 >= 0) {
				weight += 5;
				value += 20;
				mid_num -= 1000;
			}
			if (mid_num - 10000 >= 0) {
				weight += 6;
				value += 21;
				mid_num -= 10000;
			}
			if (mid_num - 100000 >= 0) {
				weight += 3;
				value += 10;
				mid_num -= 100000;
			}
			if (mid_num - 1000000 >= 0) {
				weight += 7;
				value += 12;
				mid_num -= 1000000;
			}
			if (mid_num - 10000000 >= 0) {
				weight += 4;
				value += 16;
				mid_num -= 10000000;
			}
			if (mid_num - 100000000 >= 0) {
				weight += 16;
				value += 46;
				mid_num -= 100000000;
			}
			if (mid_num - 1000000000 >= 0) {
				weight += 2;
				value += 12;
				mid_num -= 1000000000;
			}
			if (mid_num - 10000000000L >= 0) {
				weight += 2;
				value += 18;
				mid_num -= 10000000000L;
			}
			if (weight > 40) {
				continue;
			}
			if (value > high_value) {
				high_value_list.set(0, (long) binary);
				high_value = value;
				System.out.println("bi" + binary);
				System.out.println("we" + weight);
				System.out.println("va" + value);
			} else if (value == high_value) {
				high_value_list.add((long) binary);
				System.out.println("bi" + binary);
				System.out.println("we" + weight);
				System.out.println("va" + value);
			}

		}
		System.out.println(high_value_list);
	}
}
