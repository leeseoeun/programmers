package programmers.beginner;

import java.util.Scanner;

public class Day5_수학_배열_3_나이_출력 {

  public static int solution(int age) {
    int answer = 0;

    answer = (2022 - age + 1);

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    System.out.println(solution(age));

  }

}
