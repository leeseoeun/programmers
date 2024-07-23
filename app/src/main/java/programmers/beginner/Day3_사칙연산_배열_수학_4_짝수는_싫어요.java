package programmers.beginner;

import java.util.Scanner;

public class Day3_사칙연산_배열_수학_4_짝수는_싫어요 {

  public static int[] solution(int n) {
    int[] answer = new int[n % 2 == 0 ? n / 2 : (n / 2 + 1)];

    int index = 0;
    for (int i = 1; i < n + 1; i++) {
      if (i % 2 == 1) {
        answer[index] = i;
        index++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(solution(n));

  }

}
