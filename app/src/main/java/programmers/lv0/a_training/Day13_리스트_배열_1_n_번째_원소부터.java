package programmers.lv0.a_training;

public class Day13_리스트_배열_1_n_번째_원소부터 {

  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length - n + 1];

    for (int i = n - 1, j = 0; i < num_list.length; i++) {
      answer[j++] = num_list[i];
    }

    return answer;

    /*
     * int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
     * return a;
     * */
  }

  public static void main(String[] args) {

    int[] num_list = {2, 1, 6};
    int n = 3;

    System.out.println(solution(num_list, n));

  }

}
