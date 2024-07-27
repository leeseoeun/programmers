package programmers.training;

import java.util.Arrays;

public class Day6_조건문_반복문_5_수열과_구간_쿼리_2 {

  public static int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      int[] tempArr = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
      Arrays.sort(tempArr);

      for (int j = 0; j < tempArr.length; j++) {
        if (tempArr[j] > queries[i][2]) {
          answer[i] = tempArr[j];
          break;
        }

        if (j == tempArr.length - 1) {
          answer[i] = -1;
        }
      }
    }

    return answer;

    /*
     * int[] answer = new int[queries.length];
     * Arrays.fill(answer, -1);
     * 
     * for (int idx = 0; idx < queries.length; idx++) {
     *  int[] query = queries[idx];
     *  int s = query[0], e = query[1], k = query[2];
     *  
     *  for (int i = s; i <= e; i++) {
     *      if (k < arr[i]) {
     *          answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
     *      }
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

    System.out.println(solution(arr, queries));

  }

}
