package assignment_1;
import java.util.Scanner;

public class id_password {
	public static void main(String[] args) {
		Scanner scan_id = new Scanner(System.in);
		Scanner scan_pw = new Scanner(System.in);
		String Id = "";
		String Pw = "";
		int a = 0;
		int b = 0;
		
		
		System.out.print("ID를 넣어주세요 : ");
		Id = scan_id.nextLine();
		if (Id.equals("cosmog")) {
			a = 1;
		}
		System.out.print("비밀번호를 넣어주세요 : ");
		Pw = scan_pw.nextLine();
		if(Pw.equals("00")) {
			b = 1;
		}
		
		if(a == 1 & b ==1 ) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
		
		
	}
}
