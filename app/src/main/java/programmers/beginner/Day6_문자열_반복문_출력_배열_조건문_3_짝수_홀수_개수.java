package programmers.beginner;

import java.util.Scanner;

public class Day6_문자열_반복문_출력_배열_조건문_3_짝수_홀수_개수 {

  public static int[] solution(int[] num_list) {
    int[] answer = {0, 0};

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        answer[0]++;
      } else if (num_list[i] % 2 == 1) {
        answer[1]++;
      }
    }

    return answer;

    /*
     * int[] answer = new int[2];
     * 
     * for(int i = 0; i < num_list.length; i++)
     *  answer[num_list[i] % 2]++;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println(solution(new int[] {1, 2, 3, 4, 5}));

  }

}
