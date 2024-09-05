package programmers.lv0.a_training;

public class Day09_문자열_2_부분_문자열_이어_붙여_문자열_만들기 {

  public static String solution(String[] my_strings, int[][] parts) {
    String answer = "";

    for (int i = 0; i < my_strings.length; i++) {
      answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
    }

    return answer;
  }

  public static void main(String[] args) {

    String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
    int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

    System.out.println(solution(my_strings, parts));

  }

}
