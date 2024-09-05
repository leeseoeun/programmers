package programmers.lv0.a_training;

public class Day08_조건문_반복문_3_글자_이어_붙여_문자열_만들기 {

  public static String solution(String my_string, int[] index_list) {
    String answer = "";

    String[] arr = my_string.split("");

    for (int i = 0; i < index_list.length; i++) {
      answer += arr[index_list[i]];
    }

    return answer;
  }

  public static void main(String[] args) {

    String my_string = "cvsgiorszzzmrpaqpe";
    int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

    System.out.println(solution(my_string, index_list));

  }

}
