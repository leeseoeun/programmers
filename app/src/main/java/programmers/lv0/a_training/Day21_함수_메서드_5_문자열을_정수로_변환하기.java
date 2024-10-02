package programmers.lv0.a_training;

public class Day21_함수_메서드_5_문자열을_정수로_변환하기 {

  public static int solution(String n_str) {
    return Integer.parseInt(n_str);
  }

  public static void main(String[] args) {

    String n_str = "10";

    System.out.println(solution(n_str));

  }

}
