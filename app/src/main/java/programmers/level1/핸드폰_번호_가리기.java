package programmers.level1;

public class 핸드폰_번호_가리기 {
  public String solution(String phone_number) {
    String answer = "";

    char[] arr = phone_number.toCharArray();

    for (int i = 0; i < arr.length - 4; i++) {
      arr[i] = '*';
    }

    answer = String.valueOf(arr);

    return answer;
  }
}

/* 다른 풀이 */
class Solution {
  public String solution(String phone_number) {
    String answer = "";

    for (int i = 0; i < phone_number.length() - 4; i++)
      answer += "*";

    answer += phone_number.substring(phone_number.length() - 4);

    return answer;
  }
}

/* subString */
//문자열 자르기

//사용법
//String.substring(start) start부터 끝까지
//String.substring(start, end) start부터 end 전까지

//예제
//String str = "ABCDEFG"; A=0, B=1, C=2, D=3, E=4, F=5, G=6의 index를 가진다
//str.substring(3); => DEFG
//str.substring(3, 6); => DEF
