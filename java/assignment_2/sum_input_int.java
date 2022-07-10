package assignment_2;
import java.util.Scanner;

public class sum_input_int {
	public static void main(String[] args) {
		
		Scanner total = new Scanner(System.in);
		float sum = 0;
		float []num_list = new float[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 넣어주세요 : ");
			num_list[i] = total.nextInt();
		}
		for(int i = 0; i <5; i++) {
			sum += num_list[i];
		}
		System.out.print("입력하신 숫자의 합은" + sum + "이고, " +"평균은" + sum / 5 + "입니다.");
	}

}
