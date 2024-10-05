package programmers.lv0.a_training;

public class Day24_조건문_활용_반복문_활용_이차원_리스트_배열_5_특별한_이차원_배열_1 {

  public static int[][] solution(int n) {
    int[][] answer = new int[n][n];

    for (int i = 0; i < answer.length; i++) {
      answer[i][i] = 1;
    }

    return answer;
  }

  public static void main(String[] args) {

    int n = 3;

    System.out.println(solution(n));

  }

}
