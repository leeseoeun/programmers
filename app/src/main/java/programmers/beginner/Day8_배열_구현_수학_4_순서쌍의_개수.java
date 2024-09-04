package programmers.beginner;

public class Day8_배열_구현_수학_4_순서쌍의_개수 {

  public static int solution(int n) {
    int answer = 0;

    for (int i = 1; i < n + 1; i++) {
      if (n % i == 0) {
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int n = 20;

    System.out.println(solution(n));

  }

}
