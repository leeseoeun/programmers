package programmers.lv0.a_training;

public class Day16_문자열_3_배열에서_문자열_대소문자_변환하기 {

  public static String[] solution(String[] strArr) {
    for (int i = 0; i < strArr.length; i++) {
      if (i % 2 == 0) {
        strArr[i] = strArr[i].toLowerCase();
      } else {
        strArr[i] = strArr[i].toUpperCase();
      }
    }

    return strArr;
  }

  public static void main(String[] args) {

    String[] strArr = {"AAA","BBB","CCC","DDD"};

    System.out.println(solution(strArr));

  }

}
