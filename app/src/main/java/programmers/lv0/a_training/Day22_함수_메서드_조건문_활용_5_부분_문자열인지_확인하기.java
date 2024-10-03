package programmers.lv0.a_training;

public class Day22_함수_메서드_조건문_활용_5_부분_문자열인지_확인하기 {

  public static int solution(String my_string, String target) {
    return my_string.indexOf(target) > -1 ? 1 : 0;

    /*
     * int answer = my_string.contains(target) ? 1 : 0;
     * */
  }

  public static void main(String[] args) {

    String my_string = "banana";
    String target = "ana";

    System.out.println(solution(my_string, target));

  }

}
