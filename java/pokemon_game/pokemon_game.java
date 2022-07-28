package pokemon_game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pokemon_game {

	public static void main(String[] args) {
		String[] all_mon = { "파이어", "프리져", "썬더", "아르세우스", "레쿠자", "뮤", "칠색조", "나인테일", "그란돈", "레시라무", "히드런", "얼음귀신",
				"눈설왕", "펄기아", "큐레무", "갸라도스", "루기아", "가이오가", "스이쿤" };

		String[][] all_skill = { { "불꽃세례", "불태우기", "폭풍", "불새" }, { "얼음뭉치", "프리즈드라이", "냉동빔", "폭풍" },
				{ "전기쇼크", "원시의힘", "번개", "방전" }, { "전기쇼크", "원시의힘", "번개", "방전" }, { "심판의뭉치", "신속", "화염방사", "용성군" },
				{ "화룡점정", "신속", "냉동빔", "화염방사" }, { "사이코키네시스", "파동탄", "막치기", "냉동펀치" },
				{ "성스러운불꽃", "불대문자", "바람 일으키기", "원시의힘" }, { "불대문자", "화염방사", "불꽃세례", "전광석화" },
				{ "단에의칼", "불대문자", "원시의 힘", "솔라빔" }, { "푸른불꽃", "크로스플레임", "역린", "용의숨결" },
				{ "대지의힘", "스톤에지", "마그마스톤", "아이언헤드" }, { "눈보라", "깨물어부수기", "프리즈드라이", "얼음숨결" },
				{ "눈보라", "우드헤머", "냉동펀치", "나뭇잎" }, { "공간절단", "하이드로펌프", "드래곤크루", "용의숨결" },
				{ "프리즈드라이", "냉동빔", "크로스썬더", "크로스플레임" }, { "파괴광선", "하이드로펌프", "난동부리기", "물기" },
				{ "에어로블라스트", "불새", "미래예지", "드래곤다이브" }, { "근원의파동", "해수스파우팅", "하이드로펌프", "아쿠아테일" },
				{ "눈보라", "하이드로펌프", "깨물어부수기", "신속" } };

		/*
		 * String[] skill_dic = { "불꽃세례", "불태우기", "폭풍", "불새", "얼음뭉치", "프리즈드라이", "냉동빔",
		 * "전기쇼크", "원시의힘", "번개", "방전", "심판의뭉치", "신속", "화염방사", "용선군", "성스로운불꽃", "불대문자",
		 * "바람일으키기", "불꽃세례", "전광석화", "단애의칼", "솔라빔", "푸른불꽃", "크로스플레임", "역린", "용의수결",
		 * "대지의힘", "스톤에지", "마그마스톤", "아이언헤드", "눈보라", "깨물어부수기", "우드해머", "냉동펀치", "나뭇잎",
		 * "공간절단", "하이드로펌프", "드래곤크루", "크로스썬더", "파괴광선", "난동부리기", "물기", "에어로블라스트", "미래예지",
		 * "드래곤다이브", "근원의파동", "해수스파우팅", "아쿠아테일" };
		 */

		String[] skill_dic = { "불꽃세례", "불태우기", "폭풍", "불새", "얼음뭉치", "프리즈드라이", "냉동빔", "폭풍", "전기쇼크", "원시의힘", "번개", "방전",
				"전기쇼크", "원시의힘", "번개", "방전", "심판의뭉치", "신속", "화염방사", "용성군", "화룡점정", "신속", "냉동빔", "화염방사", "사이코키네시스", "파동탄",
				"막치기", "냉동펀치", "성스러운불꽃", "불대문자", "바람 일으키기", "원시의힘", "불대문자", "화염방사", "불꽃세례", "전광석화", "단에의칼", "불대문자",
				"원시의 힘", "솔라빔", "푸른불꽃", "크로스플레임", "역린", "용의숨결", "대지의힘", "스톤에지", "마그마스톤", "아이언헤드", "눈보라", "깨물어부수기",
				"프리즈드라이", "얼음숨결", "눈보라", "우드헤머", "냉동펀치", "나뭇잎", "공간절단", "하이드로펌프", "드래곤크루", "용의숨결", "프리즈드라이", "냉동빔",
				"크로스썬더", "크로스플레임", "파괴광선", "하이드로펌프", "난동부리기", "물기", "에어로블라스트", "불새", "미래예지", "드래곤다이브", "근원의파동",
				"해수스파우팅", "하이드로펌프", "아쿠아테일", "눈보라", "하이드로펌프", "깨물어부수기", "신속" };

		int[] skill_p_dic = { 20, 30, 55, 70, 20, 35, 45, 55, 20, 30, 55, 40, 50, 40, 45, 65, 60, 40, 45, 45, 45, 40,
				20, 40, 50, 55, 20, 30, 55, 45, 20, 20, 60, 55, 30, 60, 65, 50, 60, 30, 45, 50, 50, 40, 55, 40, 35, 30,
				55, 60, 40, 20, 50, 55, 40, 30, 35, 45, 50, 50, 75, 60, 45, 30, 50, 70, 60, 50, 55, 75, 55, 45, 55, 55,
				40, 40 };

		int[] all_hp = { 180, 180, 180, 240, 210, 200, 212, 146, 200, 200, 182, 160, 180, 180, 250, 190, 212, 200,
				200 };

		int[][] all_skill_power = { { 20, 30, 55, 70 }, { 20, 35, 45, 55 }, { 20, 30, 55, 40 }, { 50, 40, 45, 65 },
				{ 60, 40, 45, 45 }, { 45, 40, 20, 40 }, { 50, 55, 20, 30 }, { 55, 45, 20, 20 }, { 60, 55, 30, 60 },
				{ 65, 50, 60, 30 }, { 45, 50, 50, 40 }, { 55, 40, 35, 30 }, { 55, 60, 40, 20 }, { 50, 55, 40, 30 },
				{ 35, 45, 50, 50 }, { 75, 60, 45, 30 }, { 50, 70, 60, 50 }, { 55, 75, 55, 45 }, { 55, 55, 40, 40 } };

		ArrayList<String> inven_mon = new ArrayList<>();
		ArrayList<Integer> inven_hp = new ArrayList<>();
		ArrayList<ArrayList<String>> inven_skill = new ArrayList<>();

		String[] start = { "파이어", "프리져", "썬더" };
		int[] start_hp = { 180, 180, 180 };

		ArrayList<String> fire_skill = new ArrayList<>(Arrays.asList("불꽃세례", "불태우기", "폭풍", "불새"));
		int[] fire_skillp = { 20, 30, 55, 70 };
		ArrayList<String> free_skill = new ArrayList<>(Arrays.asList("얼음뭉치", "프리즈드라이", "냉동빔", "폭풍"));
		int[] free_skillp = { 20, 35, 45, 55 };
		ArrayList<String> thunder_skill = new ArrayList<>(Arrays.asList("전기쇼크", "원시의힘", "번개", "방전"));
		int[] thunder_skillp = { 20, 30, 55, 40 };

		String[] grass = { "아르세우스", "레쿠자", "뮤", "칠색조" };
		int[] grass_hp = { 240, 210, 200, 212 };

		String[] fire = { "나인테일", "그란돈", "레시라무", "히드런" };
		int[] fire_hp = { 146, 200, 200, 182 };

		String[] snow = { "얼음귀신", "눈설왕", "펄기아", "큐레무" };
		int[] snow_hp = { 160, 180, 180, 250 };

		String[] water = { "갸라도스", "루기아", "가이오가", "스이쿤" };
		int[] water_hp = { 190, 212, 200, 200 };

		int monsterball = 10;
		int potion = 10;
		int x_hp = 0;
		String hit;

		String mon = "";
		String name = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("choi 박사: 나는 포켓몬을 연구하는 최 박사라네.\n         만나서 반갑네^^");
		System.out.println("choi 박사: 당신의 이름이 궁금하군.. 이름이 무엇인가? \n");
		System.out.println("당신의 이름을 입력해주세요:");
		name = sc.next();
		System.out.println("choi 박사: " + name + "!! 좋은 이름이군~");

		while (true) {
			System.out.println(Arrays.toString(start));
			System.out.print("choi 박사: 자네와 함께 여행할 포켓몬을 선택해주게!!:");

			mon = sc.next();

			switch (mon) {
			case "썬더":
				inven_mon.add(mon);
				inven_hp.add(180);
				inven_skill.add(thunder_skill);
				break;
			case "프리져":
				inven_mon.add(mon);
				inven_hp.add(180);
				inven_skill.add(free_skill);
				break;
			case "파이어":
				inven_mon.add(mon);
				inven_hp.add(180);
				inven_skill.add(fire_skill);
				break;
			default:
				System.out.println("choi 박사: 첫 포켓몬은 위에 있는 세마리 중 하나를 선택해야하네..");
				continue;
			}
			break;
		}

		System.out.println(
				"choi 박사: 첫 포켓몬 " + mon + " 얻을 것을 축하하네!! 첫 모험이니 몬스터 볼과 포션을 10개씩 주겠네 ㅎㅎ \n" + name + "! 건투를 비네^^");
		System.out.println(" .\n .\n ");
		System.out.println(name + ": 여라가지 길이 있군, 어디로 갈까?");

		while (true) {
			System.out.println("[초원 / 화산 / 설원 / 바다]");
			System.out.print("가고 싶은 지역을 입력해주세요: ");
			String where = sc.next();

			if (where.equals("초원")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + grass[i] + "가 나타났다!\n");
				for (int u = 0; u < grass.length; u++) {
					if (grass[u].equals(grass[i])) {
						x_hp = grass_hp[u];
					}
				}

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				while (true) {
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구");
					System.out.println(grass[i] + " : " + x_hp);
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						for (int j = 0; j <= all_mon.length; ++j) {
							if (grass[i] == all_mon[j]) {
								System.out.println(inven_skill.get(0));
								System.out.print("어떤 공격을 할까: ");
								hit = sc.next();
								for (int k = 0; k < skill_dic.length; k++) {
									if (skill_dic[k].equals(hit)) {
										x_hp -= skill_p_dic[k];
										System.out.println(x_hp);
										break;
									}
								}
								break;
							}
						}

					} else if (choice.equals("도망간다") | choice.equals("2")) {
						System.out.println("휴ㅠ 무사히 도망쳤다...");
						break;
					} else if (choice.equals("도구") | choice.equals("3")) {
						System.out.println("1) 몬스터볼: " + monsterball + "개");
						System.out.println("2) 회복약: " + potion + "개");
						String use = sc.next();
						if (use.equals("1") | use.equals("몬스터볼")) {
							if (x_hp <= 50) {
								System.out.println("가랏!! 몬스터볼");
								System.out.println(grass[i] + "를 잡았습니다.");
								inven_mon.add(grass[i]);
								monsterball -= 1;
								break;
							} else if (x_hp > 50) {
								System.out.println("지금은 몬스터볼을 사용할수없습니다.");
								continue;
							}
						} else if (use.equals("2") | use.equals("회복약")) {
							potion -= 1;
						}
					}
				}
			}

			if (where.equals("화산")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + grass[i] + "가 나타났다!\n");

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				while (true) {
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						switch (grass[i]) {
						case "나인테일":
							String[] skill_1 = { "불대문자", "화염방사", "불꽃세례", "전광석화" };
							int[] skillp_1 = { 55, 45, 20, 20 };
							break;
						case "그란돈":
							String[] skill_2 = { "단에의칼", "불대문자", "원시의 힘", "솔라빔" };
							int[] skillp_2 = { 60, 55, 30, 60 };
							break;
						case "레시라무":
							String[] skill_3 = { "푸른불꽃", "크로스플레임", "역린", "용의숨결" };
							int[] skillp_3 = { 65, 50, 60, 30 };
							break;
						case "히드런":
							String[] skill_4 = { "대지의힘", "스톤에지", "마그마스톤", "아이언헤드" };
							int[] skillp_4 = { 45, 50, 50, 40 };
							break;
						}
					} else if (choice.equals("도망간다") | choice.equals("2")) {
						System.out.println("휴ㅠ 무사히 도망쳤다...");
						break;
					} else if (choice.equals("도구") | choice.equals("3")) {
						System.out.println("1) 몬스터볼: " + monsterball + "개");
						System.out.println("2) 회복약: " + potion + "개");
						String use = sc.next();
						if (use.equals("1") | use.equals("몬스터볼")) {
							monsterball -= 1;
						} else if (use.equals("2") | use.equals("회복약")) {
							potion -= 1;
						}
					}
				}
			}

			if (where.equals("설원")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + grass[i] + "가 나타났다!\n");

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				while (true) {
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						switch (grass[i]) {
						case "얼음귀신":
							String[] skill_1 = { "눈보라", "깨물어부수기", "프리즈드라이", "얼음숨결" };
							int[] skillp_1 = { 55, 40, 35, 30 };
							break;
						case "눈설왕":
							String[] skill_2 = { "눈보라", "우드헤머", "냉동펀치", "나뭇잎" };
							int[] skillp_2 = { 55, 60, 40, 20 };
							break;
						case "펄기아":
							String[] skill_3 = { "공간절단", "하이드로펌프", "드래곤크루", "용의숨결" };
							int[] skillp_3 = { 50, 55, 40, 30 };
							break;
						case "큐레무":
							String[] skill_4 = { "프리즈드라이", "냉동빔", "크로스썬더", "크로스플레임" };
							int[] skillp_4 = { 35, 45, 50, 50 };
							break;
						}
					} else if (choice.equals("도망간다") | choice.equals("2")) {
						System.out.println("휴ㅠ 무사히 도망쳤다...");
						break;
					} else if (choice.equals("도구") | choice.equals("3")) {
						System.out.println("1) 몬스터볼: " + monsterball + "개");
						System.out.println("2) 회복약: " + potion + "개");
						String use = sc.next();
						if (use.equals("1") | use.equals("몬스터볼")) {
							monsterball -= 1;
						} else if (use.equals("2") | use.equals("회복약")) {
							potion -= 1;
						}
					}
				}
			}

			if (where.equals("바다")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + grass[i] + "가 나타났다!\n");

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				while (true) {
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						switch (grass[i]) {
						case "갸라도스":
							String[] skill_1 = { "파괴광선", "하이드로펌프", "난동부리기", "물기" };
							int[] skillp_1 = { 75, 60, 45, 30 };
							break;
						case "루기아":
							String[] skill_2 = { "에어로블라스트", "불새", "미래예지", "드래곤다이브" };
							int[] skillp_2 = { 50, 70, 60, 50 };
							break;
						case "가이오가":
							String[] skill_3 = { "근원의파도", "해수스파우팅", "하이드로펌프", "아쿠아테일" };
							int[] skillp_3 = { 55, 75, 55, 45 };
							break;
						case "스이쿤":
							String[] skill_4 = { "눈보라", "하이드로펌프", "깨물어부수기", "신속" };
							int[] skillp_4 = { 55, 55, 40, 40 };
							break;
						}
					} else if (choice.equals("도망간다") | choice.equals("2")) {
						System.out.println("휴ㅠ 무사히 도망쳤다…");
						break;
					} else if (choice.equals("도구") | choice.equals("3")) {
						System.out.println("1) 몬스터볼: " + monsterball + "개");
						System.out.println("2) 회복약: " + potion + "개");
						String use = sc.next();
						if (use.equals("1") | use.equals("몬스터볼")) {
							monsterball -= 1;
						} else if (use.equals("2") | use.equals("회복약")) {
							potion -= 1;
						}
					}
				}
			}

		}

	}
}