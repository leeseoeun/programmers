package programmers.lv0.a_training;

public class Day15_리스트_배열_문자열_3_1로_만들기 {

  public static int solution(int[] num_list) {
    int answer = 0;
    boolean flag = false;

    while (true) {
      flag = false;

      for (int i = 0; i < num_list.length; i++) {
        // 짝수일 때 -> / 2
        if (num_list[i] % 2 == 0) {
          answer++;
          flag = true;

          num_list[i] /= 2;

          // 홀수일 때 -> (- 1) / 2
        } else if (num_list[i] != 1 && num_list[i] % 2 != 0) {
          answer++;
          flag = true;

          num_list[i] = (num_list[i] - 1) / 2;
        }
      }

      if (!flag) {
        break;
      }
    }

    return answer;

    /*
     * for(int i = 0;num_list.length>i;i++){
     *  while(num_list[i]!=1){
     *      num_list[i]/=2;
     *      answer++;
     *  }
     * }
     * */
  }

  public static void main(String[] args) {

    int[] num_list = {12, 4, 15, 1, 14};

    System.out.println(solution(num_list));

  }

}
