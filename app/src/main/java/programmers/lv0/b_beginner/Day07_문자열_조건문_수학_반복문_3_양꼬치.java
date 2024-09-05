package programmers.lv0.b_beginner;

public class Day07_문자열_조건문_수학_반복문_3_양꼬치 {

  public static int solution(int n, int k) {
    return n * 12000 + (k - n / 10) * 2000;
  }

  public static void main(String[] args) {

    int n = 10;
    int k = 3;

    System.out.println(solution(n, k));

  }

}
