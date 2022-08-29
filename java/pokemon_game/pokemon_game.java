package pokemon_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pokemon_game {

	public static void main(String[] args) throws InterruptedException {
		String[] all_mon = { "아르세우스", "레쿠자", "뮤", "칠색조", "나인테일", "그란돈", "레시라무", "히드런", "얼음귀신", "눈설왕", "펄기아", "큐레무",
				"갸라도스", "루기아", "가이오가", "스이쿤", "파이어", "프리져", "썬더" };

		ArrayList<String> skill_dic = new ArrayList<>(Arrays.asList("심판의뭉치", "신속", "화염방사", "용성군", "화룡점정", "신속", "냉동빔",
				"화염방사", "사이코키네시스", "파동탄", "막치기", "냉동펀치", "성스러운불꽃", "불대문자", "바람 일으키기", "원시의힘", "불대문자", "화염방사", "불꽃세례",
				"전광석화", "단에의칼", "불대문자", "원시의 힘", "솔라빔", "푸른불꽃", "크로스플레임", "역린", "용의숨결", "대지의힘", "스톤에지", "마그마스톤",
				"아이언헤드", "눈보라", "깨물어부수기", "프리즈드라이", "얼음숨결", "눈보라", "우드헤머", "냉동펀치", "나뭇잎", "공간절단", "하이드로펌프", "드래곤크루",
				"용의숨결", "프리즈드라이", "냉동빔", "크로스썬더", "크로스플레임", "파괴광선", "하이드로펌프", "난동부리기", "물기", "에어로블라스트", "불새", "미래예지",
				"드래곤다이브", "근원의파동", "해수스파우팅", "하이드로펌프", "아쿠아테일", "눈보라", "하이드로펌프", "깨물어부수기", "신속", "불꽃세례", "불태우기", "폭풍",
				"불새", "얼음뭉치", "프리즈드라이", "냉동빔", "폭풍", "전기쇼크", "원시의힘", "번개", "방전"));

		int[] skill_p_dic = { 50, 40, 45, 65, 60, 40, 45, 45, 45, 40, 20, 40, 50, 55, 20, 30, 55, 45, 20, 20, 60, 55,
				30, 60, 65, 50, 60, 30, 45, 50, 50, 40, 55, 40, 35, 30, 55, 60, 40, 20, 50, 55, 40, 30, 35, 45, 50, 50,
				75, 60, 45, 30, 50, 70, 60, 50, 55, 75, 55, 45, 55, 55, 40, 40, 20, 30, 55, 70, 20, 35, 45, 55, 20, 30,
				55, 40 };

		ArrayList<String> inven_mon = new ArrayList<>();
		ArrayList<Integer> inven_hp = new ArrayList<>();
		ArrayList<String> inven_skill = new ArrayList<>();

		String[] start = { "파이어", "프리져", "썬더" };

		ArrayList<String> fire_skill = new ArrayList<>(Arrays.asList("불꽃세례", "불태우기", "폭풍", "불새"));

		ArrayList<String> free_skill = new ArrayList<>(Arrays.asList("얼음뭉치", "프리즈드라이", "냉동빔", "폭풍"));

		ArrayList<String> thunder_skill = new ArrayList<>(Arrays.asList("전기쇼크", "원시의힘", "번개", "방전"));

		String[] grass = { "아르세우스", "레쿠자", "뮤", "칠색조" };
		int[] grass_hp = { 240, 210, 200, 212 };
		String[] grass_skill = { "심판의뭉치", "신속", "화염방사", "용성군", "화룡점정", "신속", "냉동빔", "화염방사", "사이코키네시스", "파동탄", "막치기",
				"냉동펀치", "성스러운불꽃", "불대문자", "바람 일으키기", "원시의힘" };

		String[] fire = { "나인테일", "그란돈", "레시라무", "히드런" };
		int[] fire_hp = { 146, 200, 200, 182 };
		String[] fire_skill2 = { "불대문자", "화염방사", "불꽃세례", "전광석화", "단에의칼", "불대문자", "원시의 힘", "솔라빔", "푸른불꽃", "크로스플레임", "역린",
				"용의숨결", "대지의힘", "스톤에지", "마그마스톤", "아이언헤드" };

		String[] snow = { "얼음귀신", "눈설왕", "펄기아", "큐레무" };
		int[] snow_hp = { 160, 180, 180, 250 };
		String[] snow_skill = { "눈보라", "깨물어부수기", "프리즈드라이", "얼음숨결", "눈보라", "우드헤머", "냉동펀치", "나뭇잎", "공간절단", "하이드로펌프",
				"드래곤크루", "용의숨결", "프리즈드라이", "냉동빔", "크로스썬더", "크로스플레임" };

		String[] water = { "갸라도스", "루기아", "가이오가", "스이쿤" };
		int[] water_hp = { 190, 212, 200, 200 };
		String[] water_skill = { "파괴광선", "하이드로펌프", "난동부리기", "물기", "에어로블라스트", "불새", "미래예지", "드래곤다이브", "근원의파동", "해수스파우팅",
				"하이드로펌프", "아쿠아테일", "눈보라", "하이드로펌프", "깨물어부수기", "신속" };

		String boss = "피카츄";
		int boss_hp = 500;
		String[] boss_skill = { "1000만볼트", "전광석화", "와일드볼트", "아이언테일" };
		int[] boss_skillp = { 80, 40, 70, 100 };

		int monsterball = 10;
		int potion = 10;
		int my_hp = 0;
		int x_hp = 0;
		int count = 0;

		String mon = "";
		String name = "";
		String hit;

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
					inven_skill.addAll(thunder_skill);
					break;
				case "프리져":
					inven_mon.add(mon);
					inven_hp.add(180);
					inven_skill.addAll(free_skill);
					break;
				case "파이어":
					inven_mon.add(mon);
					inven_hp.add(180);
					inven_skill.addAll(fire_skill);
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

		outerLoop_a: while (true) {
			System.out.println("[초원 / 화산 / 설원 / 바다/ BOSS]");
			System.out.print("가고 싶은 지역을 입력해주세요: ");
			String where = sc.next();

			if (where.equals("초원")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + grass[i] + "가 나타났다!\n");
				for (int u = 0; u < grass.length; u++) {
					if (grass[u].equals(grass[i])) {
						x_hp = grass_hp[u];
						my_hp = inven_hp.get(0);
					}
				}

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				outerLoop: while (true) {
					System.out.println(grass[i] + ": " + x_hp);
					System.out.println(inven_mon.get(0) + ": " + my_hp);
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구 \n 4) 포켓몬교체");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						for (int j = 0; j <= all_mon.length; ++j) {
							if (grass[i] == all_mon[j]) {
								System.out.print(inven_skill.get(0) + " ");
								System.out.print(inven_skill.get(1) + " ");
								System.out.print(inven_skill.get(2) + " ");
								System.out.println(inven_skill.get(3));
								System.out.print("어떤 공격을 할까: ");
								hit = sc.next();
								for (int k = 0; k < skill_dic.size(); k++) {
									if (skill_dic.get(k).equals(hit)) {
										int s = (int) (Math.random() * 4);
										x_hp -= skill_p_dic[k];
										my_hp -= skill_p_dic[(4 * j) + s];
										if (x_hp <= 0) {
											System.out.println(grass[i] + "를 처치했습니다.");
											break outerLoop;
										}
										if (my_hp <= 0) {
											System.out.println(inven_mon.get(0) + "가 쓰러졌습니다.");
											break outerLoop;
										}
										System.out.println(grass[i] + "의 " + skill_dic.get((4 * j) + s));
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
							if (monsterball < 0) {
								System.out.println("몬스터볼을 모두 사용하였습니다.");
								break;
							}
							if (x_hp <= 50) {
								System.out.println("가랏!! 몬스터볼");
								System.out.println(grass[i] + "를 잡았습니다.\n");
								inven_mon.add(grass[i]);
								inven_hp.add(grass_hp[i]);
								inven_skill.add(grass_skill[4 * i]);
								inven_skill.add(grass_skill[4 * i + 1]);
								inven_skill.add(grass_skill[4 * i + 2]);
								inven_skill.add(grass_skill[4 * i + 3]);
								monsterball -= 1;
								count += 1;
								break;
							} else if (x_hp > 50) {
								System.out.println("지금은 몬스터볼을 사용할수없습니다.");
								continue;
							}
						} else if (use.equals("2") | use.equals("회복약")) {
							if (my_hp == inven_hp.get(0)) {
								System.out.println("최대 체력입니다.");
							}
							if (my_hp < (inven_hp.get(0))) {
								my_hp += 50;
								potion -= 1;
							}
							if (my_hp > inven_hp.get(0)) {
								my_hp = inven_hp.get(0);
							}
							if (potion < 0) {
								System.out.println("회복약을 모두 사용하였습니다.");
							}
							continue;
						}
					} else if (choice.equals("포켓몬교체") | choice.equals("4")) {
						if (count == 0) {
							System.out.println("교체할 포켓몬이 없습니다.");
							continue;
						} else if (count > 0) {
							System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
							int change = sc.nextInt();
							if (change == 1) {
								System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
								continue;
							} else if (change >= 2) {
								Collections.swap(inven_mon, 0, change - 1);
								Collections.swap(inven_hp, 0, change - 1);
								Collections.swap(inven_skill, 0, 4 * (change - 1));
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
								my_hp = inven_hp.get(0);
								continue;
							}
						}
						break;
					}
				}
			}

			if (where.equals("화산")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + fire[i] + "가 나타났다!\n");
				for (int u = 0; u < fire.length; u++) {
					if (fire[u].equals(fire[i])) {
						x_hp = fire_hp[u];
						my_hp = inven_hp.get(0);
					}
				}

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				outerLoop: while (true) {
					System.out.println(fire[i] + ": " + x_hp);
					System.out.println(inven_mon.get(0) + ": " + my_hp);
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구 \n 4) 포켓몬교체");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						for (int j = 0; j <= all_mon.length; ++j) {
							if (fire[i] == all_mon[j]) {
								System.out.print(inven_skill.get(0) + " ");
								System.out.print(inven_skill.get(1) + " ");
								System.out.print(inven_skill.get(2) + " ");
								System.out.println(inven_skill.get(3));
								System.out.print("어떤 공격을 할까: ");
								hit = sc.next();
								for (int k = 0; k < skill_dic.size(); k++) {
									if (skill_dic.get(k).equals(hit)) {
										int s = (int) (Math.random() * 4);
										x_hp -= skill_p_dic[k];
										my_hp -= skill_p_dic[(4 * j) + s];
										if (x_hp <= 0) {
											System.out.println(fire[i] + "를 처치했습니다.");
											break outerLoop;
										}
										if (my_hp <= 0) {
											System.out.println(inven_mon.get(0) + "가 쓰러졌습니다.");
											break outerLoop;
										}
										System.out.println(fire[i] + "의 " + skill_dic.get((4 * j) + s));
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
							if (monsterball < 0) {
								System.out.println("몬스터볼을 모두 사용하였습니다.");
								break;
							}
							if (x_hp <= 50) {
								System.out.println("가랏!! 몬스터볼");
								System.out.println(fire[i] + "를 잡았습니다.\n");
								inven_mon.add(fire[i]);
								inven_hp.add(fire_hp[i]);
								inven_skill.add(fire_skill2[4 * i]);
								inven_skill.add(fire_skill2[4 * i + 1]);
								inven_skill.add(fire_skill2[4 * i + 2]);
								inven_skill.add(fire_skill2[4 * i + 3]);
								monsterball -= 1;
								count += 1;
								break;
							} else if (x_hp > 50) {
								System.out.println("지금은 몬스터볼을 사용할수없습니다.");
								continue;
							}
						} else if (use.equals("2") | use.equals("회복약")) {
							if (my_hp == inven_hp.get(0)) {
								System.out.println("최대 체력입니다.");
							}
							if (my_hp < (inven_hp.get(0))) {
								my_hp += 50;
								potion -= 1;
							}
							if (my_hp > inven_hp.get(0)) {
								my_hp = inven_hp.get(0);
							}
							if (potion < 0) {
								System.out.println("회복약을 모두 사용하였습니다.");
							}
							continue;
						}
					} else if (choice.equals("포켓몬교체") | choice.equals("4")) {
						if (count == 0) {
							System.out.println("교체할 포켓몬이 없습니다.");
							continue;
						} else if (count > 0) {
							System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
							int change = sc.nextInt();
							if (change == 1) {
								System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
								continue;
							} else if (change >= 2) {
								Collections.swap(inven_mon, 0, change - 1);
								Collections.swap(inven_hp, 0, change - 1);
								Collections.swap(inven_skill, 0, 4 * (change - 1));
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
								my_hp = inven_hp.get(0);
								continue;
							}
						}
						break;
					}
				}
			}

			if (where.equals("설원")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + snow[i] + "가 나타났다!\n");
				for (int u = 0; u < snow.length; u++) {
					if (snow[u].equals(snow[i])) {
						x_hp = snow_hp[u];
						my_hp = inven_hp.get(0);
					}
				}

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				outerLoop: while (true) {
					System.out.println(snow[i] + ": " + x_hp);
					System.out.println(inven_mon.get(0) + ": " + my_hp);
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구 \n 4) 포켓몬교체");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						for (int j = 0; j <= all_mon.length; ++j) {
							if (snow[i] == all_mon[j]) {
								System.out.print(inven_skill.get(0) + " ");
								System.out.print(inven_skill.get(1) + " ");
								System.out.print(inven_skill.get(2) + " ");
								System.out.println(inven_skill.get(3));
								System.out.print("어떤 공격을 할까: ");
								hit = sc.next();
								for (int k = 0; k < skill_dic.size(); k++) {
									if (skill_dic.get(k).equals(hit)) {
										int s = (int) (Math.random() * 4);
										x_hp -= skill_p_dic[k];
										my_hp -= skill_p_dic[(4 * j) + s];
										if (x_hp <= 0) {
											System.out.println(snow[i] + "를 처치했습니다.");
											break outerLoop;
										}
										if (my_hp <= 0) {
											System.out.println(inven_mon.get(0) + "가 쓰러졌습니다.");
											break outerLoop;
										}
										System.out.println(snow[i] + "의 " + skill_dic.get((4 * j) + s));
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
							if (monsterball < 0) {
								System.out.println("몬스터볼을 모두 사용하였습니다.");
								break;
							}
							if (x_hp <= 50) {
								System.out.println("가랏!! 몬스터볼");
								System.out.println(snow[i] + "를 잡았습니다.\n");
								inven_mon.add(snow[i]);
								inven_hp.add(snow_hp[i]);
								inven_skill.add(snow_skill[4 * i]);
								inven_skill.add(snow_skill[4 * i + 1]);
								inven_skill.add(snow_skill[4 * i + 2]);
								inven_skill.add(snow_skill[4 * i + 3]);
								monsterball -= 1;
								count += 1;
								break;
							} else if (x_hp > 50) {
								System.out.println("지금은 몬스터볼을 사용할수없습니다.");
								continue;
							}
						} else if (use.equals("2") | use.equals("회복약")) {
							if (my_hp == inven_hp.get(0)) {
								System.out.println("최대 체력입니다.");
							}
							if (my_hp < (inven_hp.get(0))) {
								my_hp += 50;
								potion -= 1;
							}
							if (my_hp > inven_hp.get(0)) {
								my_hp = inven_hp.get(0);
							}
							if (potion < 0) {
								System.out.println("회복약을 모두 사용하였습니다.");
							}
							continue;
						}
					} else if (choice.equals("포켓몬교체") | choice.equals("4")) {
						if (count == 0) {
							System.out.println("교체할 포켓몬이 없습니다.");
							continue;
						} else if (count > 0) {
							System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
							int change = sc.nextInt();
							if (change == 1) {
								System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
								continue;
							} else if (change >= 2) {
								Collections.swap(inven_mon, 0, change - 1);
								Collections.swap(inven_hp, 0, change - 1);
								Collections.swap(inven_skill, 0, 4 * (change - 1));
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
								my_hp = inven_hp.get(0);
								continue;
							}
						}
						break;
					}
				}
			}

			if (where.equals("바다")) {
				int i = (int) (Math.random() * 4);
				System.out.println("\n야생의 " + water[i] + "가 나타났다!\n");
				for (int u = 0; u < water.length; u++) {
					if (water[u].equals(water[i])) {
						x_hp = water_hp[u];
						my_hp = inven_hp.get(0);
					}
				}

				System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

				outerLoop: while (true) {
					System.out.println(water[i] + ": " + x_hp);
					System.out.println(inven_mon.get(0) + ": " + my_hp);
					System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구 \n 4) 포켓몬교체");
					String choice = sc.next();

					if (choice.equals("싸운다") | choice.equals("1")) {
						for (int j = 0; j <= all_mon.length; ++j) {
							if (water[i] == all_mon[j]) {
								System.out.print(inven_skill.get(0) + " ");
								System.out.print(inven_skill.get(1) + " ");
								System.out.print(inven_skill.get(2) + " ");
								System.out.println(inven_skill.get(3));
								System.out.print("어떤 공격을 할까: ");
								hit = sc.next();
								for (int k = 0; k < skill_dic.size(); k++) {
									if (skill_dic.get(k).equals(hit)) {
										int s = (int) (Math.random() * 4);
										x_hp -= skill_p_dic[k];
										my_hp -= skill_p_dic[(4 * j) + s];
										if (x_hp <= 0) {
											System.out.println(water[i] + "를 처치했습니다.");
											break outerLoop;
										}
										if (my_hp <= 0) {
											System.out.println(inven_mon.get(0) + "가 쓰러졌습니다.");
											break outerLoop;
										}
										System.out.println(water[i] + "의 " + skill_dic.get((4 * j) + s));
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
							if (monsterball < 0) {
								System.out.println("몬스터볼을 모두 사용하였습니다.");
								break;
							}
							if (x_hp <= 50) {
								System.out.println("가랏!! 몬스터볼");
								System.out.println(water[i] + "를 잡았습니다.\n");
								inven_mon.add(water[i]);
								inven_hp.add(water_hp[i]);
								inven_skill.add(water_skill[4 * i]);
								inven_skill.add(water_skill[4 * i + 1]);
								inven_skill.add(water_skill[4 * i + 2]);
								inven_skill.add(water_skill[4 * i + 3]);
								monsterball -= 1;
								count += 1;
								break;
							} else if (x_hp > 50) {
								System.out.println("지금은 몬스터볼을 사용할수없습니다.");
								continue;
							}
						} else if (use.equals("2") | use.equals("회복약")) {
							if (my_hp == inven_hp.get(0)) {
								System.out.println("최대 체력입니다.");
							}
							if (my_hp < (inven_hp.get(0))) {
								my_hp += 50;
								potion -= 1;
							}
							if (my_hp > inven_hp.get(0)) {
								my_hp = inven_hp.get(0);
							}
							if (potion < 0) {
								System.out.println("회복약을 모두 사용하였습니다.");
							}
							continue;
						}
					} else if (choice.equals("포켓몬교체") | choice.equals("4")) {
						if (count == 0) {
							System.out.println("교체할 포켓몬이 없습니다.");
							continue;
						} else if (count > 0) {
							System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
							int change = sc.nextInt();
							if (change == 1) {
								System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
								continue;
							} else if (change >= 2) {
								Collections.swap(inven_mon, 0, change - 1);
								Collections.swap(inven_hp, 0, change - 1);
								Collections.swap(inven_skill, 0, 4 * (change - 1));
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
								my_hp = inven_hp.get(0);
								continue;
							}
						}
						break;
					}
				}
			}

			if (where.toUpperCase().equals("BOSS")) {
				if (count < 4) {
					System.out.println("BOSS에 도전할 자격은 포켓몬 5마리 이상부터 입니다.");
					System.out.println("현재 포유 포켓몬: " + inven_mon);
				} else if (count >= 4) {
					System.out.println("---------------------------------");
					System.out.println("        ⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣀⠀ ⠀⠀");
					System.out.println("        ⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ⠀⠀");
					System.out.println("        ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿   ");
					System.out.println("        ⢹⣿⣿⠟⠛⠛⠋⠛⠋⠛⠛⠟⠻⠿⣿⣿⣿⡿   ");
					System.out.println("        ⢸⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⠇   ");
					System.out.println("       ⢀⡘⣿⠇⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⠀   ");
					System.out.println("       ⢸⣿⡏⣀⣉⡉⢛⢷⡄⠀⠀⢠⠶⠒⠒⠂⠈⡟⣄   ");
					System.out.println("       ⠘⢿⡟⡅⠉⠉⠛⠛⡯⠠⠔⠀⠶⠶⠖⠦⣠⢿⠏   ");
					System.out.println("        ⠸⣷⠑⠐⠀⠄⢠⠁⠀⠘⠀⠀⠀⠀⠠⠙⠡⠀ ⠀ ");
					System.out.println("          ⠆⠀⠀⠀⠸⡀⠀⡀⠀⠀⠀⠀⠀⠁⠀⠀   ");
					System.out.println("          ⠸⡄⠀⠀⢀⡀⠀⠀⠀⠀⠀⢀⠂⠀⠀⠀   ");
					System.out.println("          ⣠⣿⡄⠀⠉⠅⠀⠈⠀⠀⡀⢉⠀⠀⠀    ");
					System.out.println("       ⢀⠴⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⡸⡆⢄⠀⠀ ⠀  ");
					System.out.println("    ⢀⣀⡴⡿⢿⣿⠹⣿⣿⣷⣶⡶⠂⠀⠀⠔⠀⡇⠀⠁⢁ ⠀ ");
					System.out.println("⢀⣤⣴⣾⣿⢿⢞⡭⣵⣿⠀⠻⣿⣿⠟⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀  ");
					System.out.println("⣿⣿⣿⣿⣟⣻⠪⣵⣿⣾⣷⢀⠀⠈⠣⢀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀ ");
					System.out.println("⣿⣿⣿⣿⡷⢾⣯⢵⠖⠉⠈⡇⠀⠀⣰⠉⠷⣄⠀⠀⠀⣸⠁⠈⠂⢀ ");
					System.out.println("--------------------------------");
					System.out.println(boss + "가 나타났다!!");
					System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");
					my_hp = inven_hp.get(0);

					while (true) {
						System.out.println(boss + ": " + boss_hp);
						System.out.println(inven_mon.get(0) + ": " + my_hp);
						System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구 \n 4) 포켓몬교체");
						String choice = sc.next();

						if (choice.equals("싸운다") | choice.equals("1")) {
							System.out.print(inven_skill.get(0) + " ");
							System.out.print(inven_skill.get(1) + " ");
							System.out.print(inven_skill.get(2) + " ");
							System.out.println(inven_skill.get(3));
							System.out.print("어떤 공격을 할까: ");
							hit = sc.next();

							for (int k = 0; k < skill_dic.size(); k++) {
								if (skill_dic.get(k).equals(hit)) {
									int s = (int) (Math.random() * 4);
									boss_hp -= skill_p_dic[k];
									my_hp -= boss_skillp[s];
									if (boss_hp <= 0) {
										System.out.println("이제 발 뻗고 잘 수 있겠구만 ㅎㅎ 고맙네!!!");
										Thread.sleep(1000);
										System.out.println("");
										System.out.println("                The End");
										Thread.sleep(1000);
										System.out.println("---------------------------------------");
										System.out.println("⠸⣶⣶⠠⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⡀");
										System.out.println("⠀⠙⣿⡄⠀⠉⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠒⠉⢸⣿⡟⠀⠀⠀⠀");
										System.out.println("⠀⠀⠈⢣⠀⠀⠀⠈⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠀⠁⠀⠀⠀⡿⠋⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠑⠄⡀⠀⠀⠘⢄⠠⠀⠒⠒⠒⠒⠂⠠⠀⠀⠀⠀⠀⠀⡠⠊⠀⣀⠠⠄⠒⠂⠙");
										System.out.println("⠀⠀⠀⠀⠀⠀⠈⠂⢄⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠠⢒⡁⠄⠂⠉⠀⠀⠀⠀⠀⡆");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⠁");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⡇⢠⣶⠐⡄⠀⠀⠀⠀⠀⢠⠐⣶⡀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⢀⠈⠻⠟⠁⠀⠀⠀⠀⠀⠘⠻⠛⠀⠀⡄⠀⢀⡀⠤⠄⠒⠀⠉⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⠀⠀⠠⠄⠒⠠⠤⠀⠀⢠⣾⣿⡇⠀⠈⢄⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⠻⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⢿⡿⠣⡀⠀⠀⠑⢄⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⠈⠢⢄⠀⠀⠀⠀⠀⠀⠀⢀⠤⠊⠧⠐⠈⢀⠠⠐⠈⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⠆⠀⠀⠀⠀⠀⠒⠶⠒⠀⠁⠀⠀⠀⠘⣠⣾⡄⠀⠀⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠠⠂⠀⠀⠀⠀⠀⠀⡆⠀⠀⠆⠀⠀⠀⠀⠀⠘⡉⠀⠀⠀⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⡀⡀⠃⠀⡄⠀⠀⠀⠀⠀⠁⠀⢸⠀⠀⠀⠀⠀⡄⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠘⣢⣄⡑⠀⠰⡀⠀⠀⠀⠀⢸⣤⡌⠀⠀⠀⠀⠰⠀⢀⢔⣨⠒⠂⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠈⠻⣿⣦⣠⣵⡀⠀⠀⠀⢸⣿⣧⠀⠀⠀⣰⣥⣀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀");
										System.out.println("⠀⠀⠀⠀⠀⠀⠈⠻⠿⠛⠛⠦⠠⠤⠋⠉⠉⠄⢀⡔⠿⢿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
										System.out.println("---------------------------------------");
										Thread.sleep(1000);
										System.out.println("Producer   :   이유찬, 천시영");
										Thread.sleep(1000);
										System.out.println("Assist     :   Google");
										break outerLoop_a;
									}
									if (my_hp <= 0) {
										System.out.println(inven_mon.get(0) + "가 쓰러졌습니다.");
										System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
										int change = sc.nextInt();
										if (change == 1) {
											System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
											continue;
										} else if (change >= 2) {
											Collections.swap(inven_mon, 0, change - 1);
											Collections.swap(inven_hp, 0, change - 1);
											Collections.swap(inven_skill, 0, 4 * (change - 1));
											Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
											Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
											Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
											my_hp = inven_hp.get(0);
											continue;
										}
									}
									System.out.println(boss + "의 " + boss_skill[s]);
									break;
								}
							}
						} else if (choice.equals("도망간다") | choice.equals("2")) {
							System.out.println("휴ㅠ 무사히 도망쳤다...");
							break;
						} else if (choice.equals("도구") | choice.equals("3")) {
							System.out.println("회복약: " + potion + "개");
							System.out.println("회복약을 사용하시겠습니까?(y/n)");
							String use = sc.next();
							if (use.equals("y")) {
								if (my_hp == inven_hp.get(0)) {
									System.out.println("최대 체력입니다.");
								}
								if (my_hp < (inven_hp.get(0))) {
									my_hp += 50;
									potion -= 1;
								}
								if (my_hp > inven_hp.get(0)) {
									my_hp = inven_hp.get(0);
								}
								if (potion < 0) {
									System.out.println("회복약을 모두 사용하였습니다.");
								}
								continue;
							} else if (use.equals("n")) {
								continue;
							}
						} else if (choice.equals("포켓몬교체") | choice.equals("4")) {
							System.out.print(inven_mon + "몇번째 포켓몬으로 교체하겠습니까? (1~" + inven_mon.size() + ")");
							int change = sc.nextInt();
							if (change == 1) {
								System.out.println("똑같은 포켓몬으로 교체할 수 없습니다.");
								continue;
							} else if (change >= 2) {
								Collections.swap(inven_mon, 0, change - 1);
								Collections.swap(inven_hp, 0, change - 1);
								Collections.swap(inven_skill, 0, 4 * (change - 1));
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 1);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 2);
								Collections.swap(inven_skill, 1, 4 * (change - 1) + 3);
								my_hp = inven_hp.get(0);
								continue;
							}
						}
					}
				}
			}
		}
	}
}