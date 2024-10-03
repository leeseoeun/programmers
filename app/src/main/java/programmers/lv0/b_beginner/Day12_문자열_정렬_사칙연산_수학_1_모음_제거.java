package programmers.lv0.b_beginner;

public class Day12_문자열_정렬_사칙연산_수학_1_모음_제거 {

  public static String solution(String my_string) {
    return my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");

    /*
     * answer = my_string.replaceAll("[aeiou]", "");
     * */
  }

  public static void main(String[] args) {

    String my_string = "bus";

    System.out.println(solution(my_string));

  }

}
