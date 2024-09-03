package programmers.training;

public class Day8_조건문_반복문_1_간단한_논리_연산 {

  public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    // (x1 ∨ x2) ∧ (x3 ∨ x4)
    // v : 둘 다 f일 때만 f, 이외는 t => || 연산자 이용
    // ^ : 둘 다 t일 때만 t, 이외는 f => && 연산자 이용
    // return (x1 || x2) && (x3 || x4)

    boolean expression1 = !x1 && !x2 ? false : true;
    boolean expression2 = !x3 && !x4 ? false : true;

    return expression1 && expression2 ? true : false;
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
