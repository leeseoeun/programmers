package programmers.lv0.a_training;

public class Day23_조건문_활용_4_주사위_게임_1 {

  public static int solution(int a, int b) {
    if (a % 2 == 1 && b % 2 == 1) {
      return (int) (Math.pow(a, 2) + Math.pow(b, 2));

    } else if (a % 2 == 0 && b % 2 == 0) {
      return Math.abs(a - b);

    } else {
      return 2 * (a + b);
    }
  }

  public static void main(String[] args) {

    int a = 3;
    int b = 5;

    System.out.println(solution(a, b));

  }

}
