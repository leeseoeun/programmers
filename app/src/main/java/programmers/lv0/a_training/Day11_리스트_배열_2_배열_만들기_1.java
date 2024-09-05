package programmers.lv0.a_training;

public class Day11_리스트_배열_2_배열_만들기_1 {

  public static int[] solution(int n, int k) {
    int[] answer = new int[n / k];

    int idx = 0;
    for (int i = k; i < n + 1; i += k) {
      answer[idx++] = i; 
    }

    return answer;

    /*
     * int count = n / k;
     * 
     * int[] answer = new int[count];
     * 
     * for (int i = 1; i <= count; i++) {
     *  answer[i - 1] = k * i;
     * }
     * */
  }

  public static void main(String[] args) {

    int n = 10;
    int k = 3;

    System.out.println(solution(n, k));

  }

}
