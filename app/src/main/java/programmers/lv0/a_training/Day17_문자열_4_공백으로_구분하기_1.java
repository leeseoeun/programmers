package programmers.lv0.a_training;

public class Day17_문자열_4_공백으로_구분하기_1 {

  public static String[] solution(String my_string) {
    return my_string.split(" ");
  }

  public static void main(String[] args) {

    String my_string = "banana";

    System.out.println(solution(my_string));

  }

}
