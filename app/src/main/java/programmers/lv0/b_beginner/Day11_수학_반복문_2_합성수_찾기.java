package programmers.lv0.b_beginner;

public class Day11_수학_반복문_2_합성수_찾기 {

  public static int solution(int n) {
    int answer = 0;

    for (int i = 0; i < n + 1; i++) {
      int cnt = 0;
      for (int j = 1; j < i + 1; j++) {
        if (i % j == 0) {
          cnt++;
        }
      }

      if (cnt > 2) {
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int n = 10;

    System.out.println(solution(n));

  }

}
