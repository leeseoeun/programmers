package programmers.lv0.a_training;

public class Day13_리스트_배열_5_n개_간격의_원소들 {

  public static int[] solution(int[] num_list, int n) {
    int len = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
    int[] answer = new int[num_list.length / n];

    for (int i = 0, j = 0; i < num_list.length; i += n, j++) {
      answer[j] = num_list[i];
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 2;

    System.out.println(solution(num_list, n));

  }

}
