package assignment_1;
import java.util.Scanner;

public class class_num {
	public static void main(String[] args) {
		String SUB = "";
		Scanner sub = new Scanner(System.in);
		SUB = sub.nextLine();
		switch (SUB) {
		case "국어":
			System.out.println("701호");
			break;
		case "수학":
			System.out.println("702호");
			break;
		case "영어":
			System.out.println("703호");
			break;
		case "과학":
			System.out.println("704호");
			break;
		default:
			System.out.println("상담원에게 문의해주세요.");
		}
	}

}
