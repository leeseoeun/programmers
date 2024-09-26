package programmers.lv0.a_training;

public class Day18_문자열_4_문자열_바꿔서_찾기 {

  public static int solution(String myString, String pat) {
    myString = myString.replace("A", "-");
    myString = myString.replace("B", "A");
    myString = myString.replace("-", "B");

    return myString.indexOf(pat) > -1 ? 1 : 0;

    /*
     * myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
     * return myString.contains(pat) ? 1 : 0;
     * */
  }

  public static void main(String[] args) {

    String myString = "ABBAA";
    String pat = "AABB";

    System.out.println(solution(myString, pat));

  }

}
