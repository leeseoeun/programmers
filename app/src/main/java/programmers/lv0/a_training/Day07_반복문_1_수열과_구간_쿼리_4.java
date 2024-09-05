package programmers.lv0.a_training;

public class Day07_반복문_1_수열과_구간_쿼리_4 {

  public static int[] solution(int[] arr, int[][] queries) {
    int[] answer = arr;

    for (int i = 0; i < queries.length; i++) {
      int[] query = queries[i];
      for (int j = query[0]; j < query[1] + 1; j++) {
        if (j % query[2] == 0) {
          answer[j] += 1;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

    System.out.println(solution(arr, queries));

  }

}
