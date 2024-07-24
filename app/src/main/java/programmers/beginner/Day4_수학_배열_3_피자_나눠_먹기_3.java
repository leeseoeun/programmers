package programmers.beginner;

import java.util.Scanner;

public class Day4_수학_배열_3_피자_나눠_먹기_3 {

  public static int solution(int slice, int n) {
    int answer = 0;

    answer = (n % slice == 0 ? (n / slice) : (n / slice + 1));

    return answer;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int slice = sc.nextInt();
    int n = sc.nextInt();

    System.out.println(solution(slice, n));

  }

}
