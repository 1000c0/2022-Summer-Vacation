package assignment_3;
import java.util.Scanner;
import java.util.Arrays;


public class random_menu {
	public static void main(String[] args) {
		
		String type[] = {"한식", "중식", "양식", "일식"};
		String kor[] = {"알밥", "짜글이", "불고기", "냉면", "쭈꾸미", "불고기","찜닭", "떡볶이", "비빔밥"};
		String chi[] = {"짜장면", "짬뽕", "마라탕", "마라상궈", "중식냉면", "탕수육", "깐풍기", "볶음밥", "유산슬"};
		String jap[] = {"초밥", "돈까스", "우동", "문어빵", "야끼소바", "오꼬노미야끼", "라멘", "카츠동", "회", "튀김덮밥"};
		String wst[] = {"스테이크", "치킨", "스파게티", "오믈렛", "오므라이스", "리조또", "BBQ", "햄버거", "감자튀김", "피자"};
		
		Scanner scan = new Scanner(System.in);
		
		int flag = 0;
		try {
			while(true) {
				int ran = (int)(Math.random() * 10 + 1);
				if(flag == 0) {
					System.out.println("원하시는 갈래를 선택하세요(양식, 한식, 일식, 중식)>>>");
				    String menu = scan.next();
				if(! Arrays.asList(type).contains(menu)) {
					System.out.print("다시 입력하세요");
					continue;
				}
				if(menu.equals("한식")) {
					System.out.println(kor[ran]);
					flag = 1;
				}
				if(menu.equals("중식")) {
					System.out.println(chi[ran]);
					flag = 1;
				}
				if(menu.equals("일식")) {
					System.out.println(jap[ran]);
					flag = 1;
				}
				if(menu.equals("양식")) {
					System.out.println(wst[ran]);
					flag = 1;
				}
				}
				
				if(flag == 1) {
					System.out.println("다시 정하시겠습니까?(Y/N)");	
					flag = 2;
				}
				String choice = scan.next();

				if(choice.equals("Y")) {
					flag = 0; 
					continue;
				}
				if(choice.equals("N")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("출력에 오류가 있었습니다.");
		}
	}
}
