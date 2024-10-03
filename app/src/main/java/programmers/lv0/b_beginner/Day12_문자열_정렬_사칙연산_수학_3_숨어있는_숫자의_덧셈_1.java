package programmers.lv0.b_beginner;

public class Day12_문자열_정렬_사칙연산_수학_3_숨어있는_숫자의_덧셈_1 {

  public static int solution(String my_string) {
    int answer = 0;

    my_string = my_string.toLowerCase().replaceAll("[a-z]", "");

    for (int i = 0; i < my_string.length(); i++) {
      answer += my_string.charAt(i) - '0';
    }

    return answer;

    /*
     * // 캐럿(^)은 반대를 의미
     * // => 0-9(숫자가 들어간 Text)를 제외한 문자열 의미
     * String str = my_string.replaceAll("[^0-9]","");
     * 
     * for(char ch : str.toCharArray()) {
     *  answer += Character.getNumericValue(ch);
     * }
     * */
  }

  public static void main(String[] args) {

    String my_string = "aAb1B2cC34oOp";

    System.out.println(solution(my_string));

  }

}
