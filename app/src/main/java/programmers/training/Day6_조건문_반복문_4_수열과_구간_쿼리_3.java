package programmers.training;

public class Day6_조건문_반복문_4_수열과_구간_쿼리_3 {

  public static int[] solution(int[] arr, int[][] queries) {
    int[] answer = {};

    answer = arr;
    for (int i = 0; i < queries.length; i++) {
      int num = arr[queries[i][0]];
      arr[queries[i][0]] = arr[queries[i][1]];
      arr[queries[i][1]] = num;
    }

    return answer;

    /*
     * int[] answer = Arrays.copyOf(arr, arr.length);
     * 
     * for (int[] query : queries) {
     *  int i = query[0];
     *  int j = query[1];
     *  
     *  int temp = answer[i];
     *  answer[i] = answer[j];
     *  answer[j] = temp;
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr = {0, 1, 2, 3, 4};
    int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

    System.out.println(solution(arr, queries));

  }

}
