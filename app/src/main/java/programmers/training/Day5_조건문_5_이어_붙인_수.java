package programmers.training;

import java.util.Scanner;

public class Day5_조건문_5_이어_붙인_수 {

  public static int solution(int[] num_list) {
    int answer = 0;

    String even = "";
    String odd = "";
    for (int i : num_list) {
      if (i % 2 == 0) {
        even += ("" + i);
      } else {
        odd += ("" + i);
      }
    }

    answer = (Integer.parseInt(even) + Integer.parseInt(odd));

    return answer;

    /*
     * int even = 0;
     * int odd = 0;
     * 
     * for(int num : num_list) {
     *  if(num % 2 == 0) {
     *      even *= 10;
     *      even += num;
     *  } else {
     *      odd *= 10;
     *      odd += num;
     *  }
     * }
     * answer = even + odd;
     * */
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int[] num_list = {num1, num2, num3, num4, num5};

    System.out.println(solution(num_list));

  }

}
