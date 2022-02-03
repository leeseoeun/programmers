package programmers.level1;

public class 하샤드_수 {
  public boolean solution(int x) {
    boolean answer = true;

    int i = x;
    int total = 0;

    while (i != 0) {
      total += i % 10;
      i = i / 10;
    }

    if (x % total != 0) {
      answer = false;
    }

    return answer;
  }
}

/* 다른 풀이 */
class Solution2 {
  public boolean solution(int x){
    String[] temp = String.valueOf(x).split("");

    int sum = 0;

    for (String s : temp) {
      sum += Integer.parseInt(s);
    }

    if (x % sum == 0) {
      return true;
    } else {
      return false;
    }
  }
}

/* split */
//문자열 자르기

//사용법
//문자열배열 = 자를문자열.split("기준문자");

//예제
//String str = "동해물과 백두산이 마르고 닳도록 하나님이 보우하사 우리나라 만세";
//String[] arr = str.split(" "); => arr[0] = "동해물과", arr[1] = "백두산이", ...