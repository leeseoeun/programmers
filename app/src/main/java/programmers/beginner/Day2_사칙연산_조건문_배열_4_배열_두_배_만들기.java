package programmers.beginner;

import java.util.Scanner;

public class Day2_사칙연산_조건문_배열_4_배열_두_배_만들기 {

  public static int[] solution(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] *= 2;
    }

    return numbers;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int[] intArr = {num1, num2};

    System.out.println(solution(intArr));

  }

}
