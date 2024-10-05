package programmers.lv0.a_training;

public class Day24_조건문_활용_반복문_활용_이차원_리스트_배열_1_커피_심부름 {

  public static int solution(String[] order) {
    int americanoCnt = 0;
    int cafelatteCnt = 0;

    for (int i = 0; i < order.length; i++) {
      if (order[i].indexOf("americano") > -1 || order[i].indexOf("anything") > -1) {
        americanoCnt++;
      } else {
        cafelatteCnt++;
      }
    }

    return americanoCnt * 4500 + cafelatteCnt * 5000;
  }

  public static void main(String[] args) {

    String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

    System.out.println(solution(order));

  }

}
