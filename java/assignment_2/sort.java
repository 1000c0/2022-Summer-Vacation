package assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public abstract class sort {
	public static void main(String[] args) {
		Scanner total = new Scanner(System.in);
		int []num_list = new int[10];
		System.out.print("정수 10개 입력 >>");
		for(int i = 0; i < 10; i++) {
			num_list[i] = total.nextInt();
		}
		Arrays.sort(num_list);
		for (int i : num_list) {
            System.out.print(" "+i+"");
        }
		}
	}
