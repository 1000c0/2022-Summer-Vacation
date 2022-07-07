package assignment_1;
import java.util.Scanner;

public class socre {
	public static void main(String[] args) {
		Scanner soc = new Scanner(System.in);
		double ko = 0;
		double en = 0;
		double ma = 0;
		
		
		System.out.print("국어 점수를 넣어주세요 : ");
		ko = soc.nextInt();
		System.out.print("영어 점수를 넣어주세요 : ");
		en = soc.nextInt();
		System.out.print("수학 점수를 넣어주세요 : ");
		ma = soc.nextInt();
		
		double avg = (ko+en+ma) / 3;   // 평균점수 구하기
		
		
		if(avg >= 90) {
			System.out.print("A, 평균 성적은 ");
			System.out.printf("%.2f", avg);
			System.out.print("입니다.");
		}else if(avg >= 80) {
			System.out.print("B, 평균 성적은 ");
			System.out.printf("%.2f", avg);
			System.out.print("입니다.");
		}else if(avg >= 70) {
			System.out.print("C, 평균 성적은 ");
			System.out.printf("%.2f", avg);
			System.out.print("입니다.");
		}else if(avg >= 60) {
			System.out.print("D, 평균 성적은 ");
			System.out.printf("%.2f", avg);
			System.out.print("입니다.");
		}else {
			System.out.print("F, 평균 성적은 ");
			System.out.printf("%.2f", avg);
			System.out.print("입니다.");
		}	
	}

}
