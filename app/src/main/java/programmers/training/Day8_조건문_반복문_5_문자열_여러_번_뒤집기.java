package programmers.training;

public class Day8_조건문_반복문_5_문자열_여러_번_뒤집기 {

  public static String solution(String my_string, int[][] queries) {
    String answer = "";

    for (int i = 0; i < queries.length; i++) {
      answer = "";

      int[] query = queries[i];

      String str = my_string.substring(query[0], query[1] + 1);
      int strLen = str.length() - 1;

      for (int j = 0; j < my_string.length(); j++) {
        if (query[0] <= j && j <= query[1]) {
          answer += str.charAt(strLen--);
        } else {
          answer += my_string.charAt(j);
        }
      }

      my_string = answer;
    }

    return answer;

    /*
     * char[] arr;
     * 
     * public String solution(String my_string, int[][] queries) {
     *  arr = my_string.toCharArray();
     * 
     *  for (int[] query : queries) {
     *      reverse(query[0], query[1]);
     *  }
     * 
     *  return new String(arr);
     * }
     * 
     * private void reverse(int s, int e) {
     *  while (s < e) {
     *      char temp = arr[s];
     *      arr[s++] = arr[e];
     *      arr[e--] = temp;
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    String my_string = "rermgorpsam";
    int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

    System.out.println(solution(my_string, queries));

  }

}
