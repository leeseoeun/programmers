package programmers.lv0.a_training;

public class Day13_리스트_배열_2_순서_바꾸기 {

  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length];

    for (int i = n, j = 0; i < num_list.length; i++, j++) {
      answer[j] = num_list[i];
    }

    for (int i = 0, j = num_list.length - n; i < n; i++, j++) {
      answer[j] = num_list[i];
    }

    return answer;

    /*
     * int idx = 0;
     * int[] answer = new int[num_list.length];
     * for (int i = n;i < num_list.length;i++)
     *  answer[idx++] = num_list[i];
     * for (int i = 0;i < n;i++)
     *  answer[idx++] = num_list[i];
     * */
  }

  public static void main(String[] args) {

    int[] num_list = {2, 1, 6};
    int n = 1;

    System.out.println(solution(num_list, n));

  }

}
