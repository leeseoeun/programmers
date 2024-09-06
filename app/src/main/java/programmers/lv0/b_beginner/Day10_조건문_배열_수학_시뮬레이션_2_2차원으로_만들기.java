package programmers.lv0.b_beginner;

public class Day10_조건문_배열_수학_시뮬레이션_2_2차원으로_만들기 {

  public static int[][] solution(int[] num_list, int n) {
    int[][] answer = new int[num_list.length / n][n];

    int idx = 0;
    for (int i = 0; i < num_list.length / n; i++) {
      for (int j = 0; j < n; j++) {
        answer[i][j] = num_list[idx++];
      }
    }

    return answer;

    /*
     * int length = num_list.length;
     * 
     * answer = new int[length/n][n];
     * 
     * for(int i=0; i<length; i++){
     *  answer[i/n][i%n]=num_list[i];
     * }
     * */
  }

  public static void main(String[] args) {

    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
    int n = 2;

    System.out.println(solution(num_list, n));

  }

}
