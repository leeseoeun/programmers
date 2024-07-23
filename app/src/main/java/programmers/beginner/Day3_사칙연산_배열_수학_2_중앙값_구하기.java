package programmers.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Day3_사칙연산_배열_수학_2_중앙값_구하기 {

  public static int solution(int[] array) {
    int answer = 0;

    Arrays.sort(array);
    answer = array[array.length / 2];

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int[] numArr = {num1, num2, num3};

    System.out.println(solution(numArr));

  }

}
