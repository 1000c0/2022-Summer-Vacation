## 변수 선언
```java
int a;
int a = 0;

String b;
String b = "";

int a, b, c;

int myAge;
```
- 마음대로 선언 가능
- 여러 변수 선언은 콤마로
- _ 와 $ 제외한 특수문자 사용 불가능
- 숫자로 시작 불가능
- 첫단어는 소문자로, 이후 각 단어의 첫번째 문자만 대문자로 표기

  
#
## 자료형

|자료형|데이터|크기|
|------|---|---|
|int|정수|2바이트|
|float|실수|4바이트|
|double|실수|8바이트|
|char|문자|2바이트|

*더 많은 자료형이 있으나 주로 쓰는 것만 기입함

*string은 java에서 기본 타입에 속하지 아니함.

- int (4바이트) -> double (8바이트) 가능, double -> int는 불가능
 - 소수점 절사 
   ```java
   int a;
   double pi = 3.141592;
   
   a = pi;
   ```
   ```java
   int a;
   double pi = 3.141592;

   a = (int) pi;

   System.out.println(a);
   ```
- string과 char의 차이
  ```java
  char a = 'a';
  char b = 'ㄱ';
  
  // char c = 'aㄱ';  는 불가능
  String d = 'aㄱ';   //는 가능
  ```
  ```java
  char a = 'b';
  System.out.println(a+1);  //b의 아스키 코드 값이 98 -> 99 출력 
  ```
  ```java
  char a = 'b';
  System.out.println((char)(a+1)); // b출력
  ```

## 연산자

- 증감 연산자
  |연산자|설명|
  |------|:---:|
  |x++|먼저 해당 연산을 수행 후, 피연산자의 값을 1 증가|
  |++x|먼저 피연산자의 값을 1 증가 시키고, 해당 연산을 수행|
  |x--|먼저 해당 연산을 수행 후, 피연산자의 값을 1 감소|
  |--x|먼저 피연산자의 값을 1 감소 시키고, 해당 연산을 수행|

  ```java
  int x = 10, y = 10;
  
  System.out.println(y);         // 10
  System.out.println(x+(y++));   // 20
  System.out.println(y);         // 11
  ```
    ```java
  int x = 10, y = 10;
  
  System.out.println(y);         // 10
  System.out.println(x+(--y));   // 19
  System.out.println(y);         // 9
  ```

- 논리 연산자
  |연산자|의미|
  |------|:---:|
  |&|and|
  |\||or|
  |!|not|
  
  ```java
  int x = 15;
  int y = 10;
  System.out.println(x==y | x >= 10); // false
  ```


- 조건이 많을 때 처리 속도 및 효율을 향상시키기 위한 논리 연산자
  |연산자|설명|
  |------|:---:|
  |&&|선조건이 ture일 때만 후조건 실행|
  |\|\||선조건이 false일 때만 후조건 실행|

#
## print와 println
- print : 줄을 바꾸지 않고 출력
- println : 줄을 바꾸어 출력