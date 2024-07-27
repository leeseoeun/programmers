package programmers.beginner;

import java.util.Scanner;

/*
 * 배열 선언
 * 1. 데이터타입[] 변수명 = new 타입[개수];
 * 2. 데이터타입 변수명[] = new 타입[개수];
 * 
 * 배열 초기화
 * 1. 배열 선언 + 초기화
 *  데이터타입[] 변수명 = new 데이터타입[] {값, 값, 값};
 *  = 데이터타입[] 변수명 = {값, 값, 값};
 *      배열 메모리를 초기화시킬 때는 배열 개수를 지정해서는 안 됨
 * 
 * 2. 배열 선언 후 따로 배열 초기화 문장 실행
 *  데이터타입[] 변수명;
 *  변수명 = new 데이터타입[] {값, 값, 값};
 *      변수를 선언한 후 따로 배열을 초기화시킬 때는 new 명령어를 생략할 수 없음
 * */

public class Day5_수학_배열_2_아이스_아메리카노 {

  public static int[] solution(int money) {
    int[] answer = new int[2];

    answer[0] = money / 5500;
    answer[1] = money % 5500;

    return answer;

    /*
     * return new int[] { money / 5500, money % 5500 };
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    System.out.println(solution(money));

  }

}
