package assignment_3;
import java.util.Scanner;

public class exception_int {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("나뉨수를 입력하세요. :");
			int high = scan.nextInt();
			System.out.print("나눗수를 입력하세요. :");
			int low = scan.nextInt();
			int value = high / low;
			
			System.out.println(value);
			}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
