package assignment_2;

import java.util.Scanner;

public abstract class multiple_of_3 {
	public static void main(String[] args) {
		Scanner total = new Scanner(System.in);
		int []num_list = new int[10];
		System.out.print("정수 10개 입력 >>");
		for(int i = 0; i < 10; i++) {
			num_list[i] = total.nextInt();
		}
		for(int j = 0; j < 10; j++) {
			if(num_list[j] % 3 == 0) {
				System.out.println(num_list[j]);
			}
			}
		}
	}

