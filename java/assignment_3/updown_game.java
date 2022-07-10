package assignment_3;
import java.util.Scanner;


public class updown_game {
	public static void main(String[] args) {
	int fixed = (int)(Math.random()*100+1);
	
	int min = 0;
	int max = 99;
	int count = 1;
	
	System.out.println("수를 결정하였습니다. 맞추어 보세요. (0~99)");
	System.out.printf("%d >>", count);
	count++;
	Scanner scan = new Scanner(System.in);	
		
	while(true) {
		int input = scan.nextInt();
		if(input > fixed) {
			if(input < max) {
				max = input;
				}
			System.out.println("더 낮게("+ min + "~" + max + ")");
			System.out.print(count + ">>");
			count++;
			
			}
		if(input < fixed) {
			if(input > min) {
				min = input;
				}
			System.out.println("더 높게(" + min + "~" + max + ")");
			System.out.print(count + ">>");
			count++;
			
			}
		if(input == fixed) {
			System.out.print("맞았습니다.");
			break;
			}
			}
		}
	}
