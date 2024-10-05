package programmers.lv0.a_training;

public class Day24_조건문_활용_반복문_활용_이차원_리스트_배열_2_그림_확대 {

  public static String[] solution(String[] picture, int k) {
    String[] answer = new String[picture.length * k];

    int idx = 0;
    for (int i = 0; i < picture.length; i++) {
      String[] arr = picture[i].split("");
      String str = "";

      for (int j = 0; j < arr.length; j++) {
        str += arr[j].repeat(k);
      }

      for (int l = 0; l < k; l++) {
        answer[idx++] = str;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

    String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
    int k = 2;

    System.out.println(solution(picture, k));

  }

}
