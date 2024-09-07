package programmers.lv0.a_training;

public class Day14_리스트_배열_4_n보다_커질_때까지_더하기 {

  public static int solution(int[] numbers, int n) {
    int answer = 0;

    // for(int i = 0; answer <= n; i++) {
    for (int i = 0; i < numbers.length; i++) {
      answer += numbers[i];

      if (answer > n) {
        return answer;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] numbers = {34, 5, 71, 29, 100, 34};
    int n = 123;

    System.out.println(solution(numbers, n));

  }

}
