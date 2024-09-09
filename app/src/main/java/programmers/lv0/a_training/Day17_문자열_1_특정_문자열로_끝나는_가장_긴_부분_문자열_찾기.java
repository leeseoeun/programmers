package programmers.lv0.a_training;

public class Day17_문자열_1_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

  public static String solution(String myString, String pat) {
    return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
  }

  public static void main(String[] args) {

    String myString = "AbCdEFG";
    String pat = "dE";

    System.out.println(solution(myString, pat));

  }

}
