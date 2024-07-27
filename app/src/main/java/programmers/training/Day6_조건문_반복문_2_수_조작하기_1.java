package programmers.training;

import java.util.Scanner;

public class Day6_조건문_반복문_2_수_조작하기_1 {

  public static int solution(int n, String control) {
    int answer = 0;

    answer = n;
    for (int i = 0; i < control.length(); i++) {
      switch (String.valueOf(control.charAt(i))) {  // String.valueOf를 사용하지 않고
        case "w" :  // "(쌍 따옴표)가 아닌 '(홑 따옴표)를 사용하면 됨
          answer++;
          break;
        case "s" :
          answer--;
          break;
        case "d" :
          answer += 10;
          break;
        case "a" :
          answer -= 10;
          break;
      }
    }

    return answer;

    /*
     * int answer = n;
     * 
     * for(char ch : control.toCharArray()) {
     *  switch(ch) {
     *      case 'w': answer += 1; break;
     *      case 's': answer -= 1; break;
     *      case 'd': answer += 10; break;
     *      case 'a': answer -= 10; break;
     *      default:break;
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String control = sc.next();

    System.out.println(solution(n, control));

  }

}
