package programmers.lv0.a_training;

public class Day15_리스트_배열_문자열_5_원하는_문자열_찾기 {

  public static int solution(String myString, String pat) {
    return myString.toLowerCase().indexOf(pat.toLowerCase()) > -1 ? 1 : 0;
  }

  public static void main(String[] args) {

    String myString = "AbCdEfG";
    String pat = "aBc";

    System.out.println(solution(myString, pat));

  }

}
