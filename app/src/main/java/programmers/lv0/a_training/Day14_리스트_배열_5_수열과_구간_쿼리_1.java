package programmers.lv0.a_training;

public class Day14_리스트_배열_5_수열과_구간_쿼리_1 {

  public static int[] solution(int[] arr, int[][] queries) {
    for (int i = 0; i < queries.length; i++) {
      int[] query = queries[i];

      for (int j = query[0]; j < query[1] + 1; j++) {
        arr[j]++;
      }
    }

    return arr;
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 2, 3, 4};
    int[][] queries = {{0, 1},{1, 2},{2, 3}};

    System.out.println(solution(arr, queries));

  }

}
