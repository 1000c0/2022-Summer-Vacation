package assignment_2;
import java.util.Scanner;
import java.util.Arrays;

public class like_dictionary {
	public static void main(String[] args) {
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바","행복", "미래"};
		Scanner word = new Scanner(System.in);
		System.out.print("영어 단어를 입력하세요 >>");
		
		
		while (true) {
			String key = word.next();
			if (key.equals("student")){
				System.out.println(kor[0]);
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
			if (key.equals("love")){
				System.out.println(kor[1]);
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
			if (key.equals("java")){
				System.out.println(kor[2]);
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
			if (key.equals("happy")){
				System.out.println(kor[3]);
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
			if (key.equals("future")){
				System.out.println(kor[4]);
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
			if (key.equals("exit")){
				break;
			}
			if (Arrays.asList(eng).contains(key) != true) {
				System.out.println("그런 영어단어가 없습니다.");
				System.out.print("영어 단어를 입력하세요 >>");
				continue;
			}
		}
		}
	}

