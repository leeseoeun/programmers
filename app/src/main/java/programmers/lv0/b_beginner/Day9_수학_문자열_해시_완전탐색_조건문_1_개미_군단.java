package programmers.lv0.b_beginner;

public class Day9_수학_문자열_해시_완전탐색_조건문_1_개미_군단 {

  public static int solution(int hp) {
    int answer = 0;

    int num = hp;
    while (num > 0) {
      if (num >= 5) {
        answer += num / 5;
        num %= 5;
      } else if (num >= 3) {
        answer += num / 3;
        num %= 3;
      } else {
        answer += num / 1;
        num %= 1;
      }
    }

    return answer;

    /*
     * return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
     * */
  }

  public static void main(String[] args) {

    int hp = 23;

    System.out.println(solution(hp));

  }

}
