package programmers.training;

public class Day8_조건문_반복문_1_간단한_논리_연산 {

  public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    boolean answer = true;

    // (x1 ∨ x2) ∧ (x3 ∨ x4)
    // v : 첫번째
    // ^ : 두번째

    return answer;
  }

  public static void main(String[] args) {

    //    boolean x1 = false;
    //    boolean x2 = true;
    //    boolean x3 = true;
    //    boolean x4 = true;
    boolean x1 = true;
    boolean x2 = false;
    boolean x3 = false;
    boolean x4 = false;

    System.out.println(solution(x1, x2, x3, x4));

  }

}
