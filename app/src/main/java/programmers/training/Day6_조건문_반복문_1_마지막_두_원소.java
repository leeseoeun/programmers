package programmers.training;

import java.util.Scanner;

public class Day6_조건문_반복문_1_마지막_두_원소 {

  public static int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length + 1];

    for (int i = 0; i < num_list.length; i++) {
      answer[i] = num_list[i];
    }
    if (answer[num_list.length - 1] - answer[num_list.length - 2] > 0) {
      answer[num_list.length] = answer[num_list.length - 1] - answer[num_list.length - 2];
    } else {
      answer[num_list.length] = (answer[num_list.length - 1] * 2);
    }

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int[] num_list = {num1, num2, num3};

    System.out.println(solution(num_list));

  }

}
