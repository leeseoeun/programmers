package programmers.lv0.a_training;

public class Day16_문자열_5_특정한_문자를_대문자로_바꾸기 {

  public static String solution(String my_string, String alp) {
    return my_string.replaceAll(alp, alp.toUpperCase());
  }

  public static void main(String[] args) {

    String my_string = "programmers";
    String alp = "p";

    System.out.println(solution(my_string, alp));

  }

}
