package programmers.lv0.b_beginner;

import java.util.Arrays;

public class Day12_문자열_정렬_사칙연산_수학_2_문자열_정렬하기_1 {

  public static int[] solution(String my_string) {
    my_string = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");

    int[] answer = new int[my_string.length()];

    String[] arr = my_string.split("");
    for (int i = 0; i < arr.length; i++) {
      answer[i] = Integer.parseInt(arr[i]);
    }

    Arrays.sort(answer);

    return answer;

    /*
     * my_string = my_string.replaceAll("[a-z]","");
     * 
     * int[] answer = new int[my_string.length()];
     * 
     * for(int i =0; i<my_string.length(); i++){
     *  // char 타입을 숫자로 연산할 경우 char 타입에서 '0'을 빼줘야 의도한 정수 숫자가 나옴
     *  answer[i] = my_string.charAt(i) - '0';
     * }
     * 
     * Arrays.sort(answer);
     * */
  }

  public static void main(String[] args) {

    String my_string = "hi12392";

    System.out.println(solution(my_string));

  }

}
