# Scanner
```java
 import java.util.scanner              // import

 Scanner sc = new Scanner(System.in)   //변수 선언

 Scanner.close()                       // 객체 닫기
 ```

- 파이썬의 input()과 동일한 역할
- System.in
  - 키 입력을 받는 표준 입력 스트림 객체
  - 사용자가 원하는 타입으로 변환 필요

- 예제
  ```java
  import java.util.Scanner;
  public class ScannerEx {
    public static void main(String args[]) {
        System.out.println("이름, 도시, 나이, 독신 여부");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.print("이름은 " + name + ", ");
        
        String city = sc.next();
        System.out.print("도시는 " + city + ", ");
        
        int age = sc.next();
        System.out.print("나이는 " + age + ", ");

        boolean isSingle = sc.next();
        System.out.print("독신여부는 " + isSingle + ", ");

        scanner.close();                    //객체 닫기
    }
  }
  ```

#
# Array
```java
int [] intArray;        //배열 선언 방법1
int intarray [];        //배열 선언 방법2

int intArray[] = new int[5];  // 공간 할당
intArray[0] = 5;              // 원소 추가

int intArray[] = {1, 2, 3, 4, 0};              //초기화된 배열 선언
double doubleArray[] = {0.01, 0.02, 0.03};
```
- list와의 차이점
  - Array : 공간 크기 고정
  - list : 동적인 크기

#
# 조건문

## if문 
```java
if(int i > 0){
  System.out.print("i는 0보다 크다.");
}
else if(i == 0){
  System.out.print("i는 0이다");
}else{
  System.out.print("i는 0보다 작다");
}
```
## switch/case
```java
switch (input){
  case "apple":
      System.out.print("사과");
      break;

  case ("lemon"):
      System.out.print("레몬");
      break;

  default:
      System.out.print("다른 과일을 입력해주세요")
}
```