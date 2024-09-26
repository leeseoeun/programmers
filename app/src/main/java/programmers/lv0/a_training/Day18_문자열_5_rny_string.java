package programmers.lv0.a_training;

public class Day18_문자열_5_rny_string {

  public static String solution(String rny_string) {
    return rny_string.replace("m", "rn");
  }

  public static void main(String[] args) {

    String rny_string = "masterpiece";

    System.out.println(solution(rny_string));

  }

}
