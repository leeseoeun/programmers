package programmers.lv0.b_beginner;

public class Day07_문자열_조건문_수학_반복문_4_짝수의_합 {

  public static int solution(int n) {
    int answer = 0;

    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        answer += i;
      }
    }

    return answer;

    /*
     * for (int i = 2; i <= n; i += 2) {
     *  answer += i;
     * }
     * */
  }

  public static void main(String[] args) {

    int n = 10;

    System.out.println(solution(n));

  }

}
