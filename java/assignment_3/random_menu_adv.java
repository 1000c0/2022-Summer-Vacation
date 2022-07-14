package assignment_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class random_menu_adv {
	public static void main(String[] args) {
		int random_num_list[] = new int[10]; // 각

		String type[] = { "한식", "중식", "양식", "일식" };
		String kor[] = { "알밥", "짜글이", "불고기", "냉면", "쭈꾸미", "불고기", "찜닭", "떡볶이", "비빔밥" };
		String chi[] = { "짜장면", "짬뽕", "마라탕", "마라상궈", "중식냉면", "탕수육", "깐풍기", "볶음밥", "유산슬" };
		String jap[] = { "초밥", "돈까스", "우동", "문어빵", "야끼소바", "오꼬노미야끼", "라멘", "카츠동", "회", "튀김덮밥" };
		String wst[] = { "스테이크", "치킨", "스파게티", "오믈렛", "오므라이스", "리조또", "BBQ", "햄버거", "감자튀김", "피자" };

		Scanner scan = new Scanner(System.in);
		int flag = 0;
		int menu_flag = 0;

		try {
			while (true) {
				for (int i = 0; i < random_num_list.length; i++) {
					random_num_list[i] = (int) (Math.random() * 10) + 1;

					for (int j = 0; j < i; j++) {
						if (random_num_list[i] == random_num_list[j]) {
							i--;
							break;
						}

					}
				}
				if (flag == 0) {
					System.out.print("원하는 종류를 선택하세요.(한식/일식/중식/양식)");
					String menu = scan.next();
					if (!Arrays.asList(type).contains(menu)) {
						System.out.print("다시 입력하세요");
						continue;
					}
					if (menu.equals("한식")) {
						menu_flag = 0;

						break;
					}
					if (menu.equals("일식")) {
						menu_flag = 1;
						break;
					}
					if (menu.equals("중식")) {
						menu_flag = 2;
						break;
					}
					if (menu.equals("양식")) {
						menu_flag = 3;
						break;
					}
				}
			}

			int i = 0;

			while (menu_flag == 0) {
				System.out.println(kor[random_num_list[i]]);
				System.out.println("다시 선택하시겠습니까?(Y/N)");
				String choice = scan.next();
				if (choice.equals("Y")) {
					i += i + 1;
					continue;
				}
				if (choice.equals(choice)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			while (menu_flag == 1) {
				System.out.println(jap[random_num_list[i]]);
				i += i + 1;
				System.out.println("다시 선택하시겠습니까?(Y/N)");
				String choice = scan.next();

				if (choice.equals("Y")) {
					continue;
				}
				if (choice.equals(choice)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			while (menu_flag == 2) {
				System.out.println(chi[random_num_list[i]]);
				i += i + 1;
				System.out.println("다시 선택하시겠습니까?(Y/N)");
				String choice = scan.next();

				if (choice.equals("Y")) {
					continue;
				}
				if (choice.equals(choice)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			while (menu_flag == 3) {
				System.out.println(wst[random_num_list[i]]);
				i += i + 1;
				System.out.println("다시 선택하시겠습니까?(Y/N)");
				String choice = scan.next();

				if (choice.equals("Y")) {
					continue;
				}
				if (choice.equals(choice)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("출력에 오류가 있었습니다.");
		}
		scan.close();

	}
}
