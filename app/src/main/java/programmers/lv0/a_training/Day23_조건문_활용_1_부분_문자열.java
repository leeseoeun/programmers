package programmers.lv0.a_training;

public class Day23_조건문_활용_1_부분_문자열 {

  public static int solution(String str1, String str2) {
    return str2.contains(str1) ? 1 : 0;

    /*
     * public boolean contains(CharSequence var1) {
     *  return this.indexOf(var1.toString()) > -1;
     * }
     * 
     * -> contains는 indexOf를 예쁘게 포장한 method
     * 
     * => 가독성 : contains
     * => 속도 : indexOf
     * */
  }

  public static void main(String[] args) {

    String str1 = "abc";
    String str2 = "aabcc";

    System.out.println(solution(str1, str2));

  }

}
