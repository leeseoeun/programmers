package programmers.training;

import java.util.Scanner;

public class Day5_조건문_4_원소들의_곱과_합 {

  public static int solution(int[] num_list) {
    int answer = 0;

    int multiply = 1;
    int plusPow = 0;
    for (int i = 0; i < num_list.length; i++) {
      multiply *= num_list[i];
      plusPow += num_list[i];
    }
    plusPow *= plusPow;

    answer = (multiply > plusPow ? 0 : 1);

    return answer;

    /*
     * int sum  = 0;
     * int mult = 1;
     * 
     * for(int i : num_list) {
     *  sum += i;
     *  mult *= i;
     * }
     * 
     * answer = Math.pow(sum,2) > mult ? 1 : 0;
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
