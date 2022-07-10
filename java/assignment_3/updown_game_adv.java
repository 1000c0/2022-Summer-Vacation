package assignment_3;
import java.util.Scanner;


public class updown_game_adv {
	public static void main(String[] args) {
	int fixed = (int)(Math.random()*100+1);
	
	int min = 0;
	int max = 99;
	int count = 1;
	int game_count = 0;
	
	
	System.out.println("수를 결정하였습니다. 맞추어 보세요. (0~99)");
	System.out.println(count + ">>");
	count++;

	
	Scanner scan = new Scanner(System.in);
	Scanner re = new Scanner(System.in);
	
	
	while(true) {
		if(game_count == 1) {
			System.out.println("수를 결정하였습니다. 맞추어 보세요. (0~99)");
			System.out.println(count + ">>");
			count++;
		}
		
		int input = scan.nextInt();
		if(input > fixed) {
			if(input > 99) {
				System.out.println("다시 입력하세요");
				System.out.println(count + ">>");
				count++;
				game_count = 0;
				continue;
			}
			if(input < max) {
				max = input;
				}
			System.out.println("더 낮게("+ min + "~" + max + ")");
			System.out.println(count + ">>");
			count++;
			game_count = 0;
			}
		if(input < fixed) {
			if(input < 0) {
				System.out.println("다시 입력하세요");
				System.out.println(count + ">>");
				count++;
				game_count = 0;
				continue;
			}
			if(input > min) {
				min = input;
				}
			System.out.println("더 높게(" + min + "~" + max + ")");
			System.out.println(count + ">>");
			count++;
			game_count = 0;
			}
		if(input == fixed) {
			System.out.print("맞았습니다. 다시 하시겠습니까?");
			String replay = re.next();
			if(replay.equals("y")) {
				count = 1;
				game_count = 1;
				continue;
			}else {
				break;
			}
			}
			}
		}
	}
