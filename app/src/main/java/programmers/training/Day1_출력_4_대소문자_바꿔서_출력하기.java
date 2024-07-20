package programmers.training;

import java.util.Scanner;

public class Day1_출력_4_대소문자_바꿔서_출력하기 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    // toCharArray() : string을 char 배열로 변경
    char[] str = a.toCharArray();
    for (int i = 0; i < str.length; i++) {
      // Character.isUpper/LowerCase : 대소문자 여부
      if (Character.isUpperCase(str[i])) {
        // Character.toUpper/LowerCase : 대소문자로 변경
        System.out.print(Character.toLowerCase(str[i]));

      } else if (Character.isLowerCase(str[i])) {
        System.out.print(Character.toUpperCase(str[i]));
      }
    }

    /*
     * string answer = "";
     * char[] str = a.toCharArray();
     * for (int i = 0; i < str.length; i++) {
     *  if (Character.isUpperCase(str[i])) {
     *      answer += Character.toLowerCase(str[i]);
     *      
     *  } else if (Character.isLowerCase(str[i])) {
     *      answer += Character.toUpperCase(str[i]);
     *  }
     * }
     * 
     * System.out.print(answer);
     * */

  }

}
