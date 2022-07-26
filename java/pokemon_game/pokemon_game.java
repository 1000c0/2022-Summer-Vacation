package pokemon_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pokemon_game {

   public static void main(String[] args) {

      ArrayList<String> inven_mon = new ArrayList<>();

      String[] start = { "파이어", "프리져", "썬더" };
      int[] start_hp = { 180, 180, 180 };
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
      int x_hp;
      
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
            break;
         case "프리져":
            inven_mon.add(mon);
            break;
         case "파이어":
            inven_mon.add(mon);
            break;
         default:
            System.out.println("choi 박사: 첫 포켓몬은 위에 있는 세마리 중 하나를 선택해야하네..");
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

            System.out.println("가랏, " + inven_mon.get(0) + "!!!\n");

            while (true) {
               System.out.println(" 어떻게 할까? \n 1) 싸운다. \n 2) 도망간다. \n 3) 도구");
               String choice = sc.next();

               if (choice.equals("싸운다") | choice.equals("1")) {
                  switch (grass[i]) {
                  case "아르세우스":
                     String[] skill_1 = { "심판의뭉치", "신속", "화염방사", "용성군" };
                     int[] skillp_1 = { 50, 40, 45, 65 };
                     break;
                  case "레쿠자":
                     String[] skill_2 = { "화룡점정", "신속", "냉동빔", "화염방사" };
                     int[] skillp_2 = { 60, 40, 45, 45 };
                     break;
                  case "뮤":
                     String[] skill_3 = { "사이코키네시스", "파동탄", "막치기", "냉동펀치" };
                     int[] skillp_3 = { 45, 40, 20, 40 };
                     break;
                  case "칠색조":
                     String[] skill_4 = { "성스러운불꽃", "불대문자", "바람 일으키기", "원시의힘" };
                     int[] skillp_4 = { 50, 55, 20, 30 };
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

      }

   }
}