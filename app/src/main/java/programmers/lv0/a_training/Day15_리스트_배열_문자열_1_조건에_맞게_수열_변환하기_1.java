package programmers.lv0.a_training;

public class Day15_리스트_배열_문자열_1_조건에_맞게_수열_변환하기_1 {

  public static int[] solution(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // 짝수고, 50 이상일 때 -> / 2
      if (arr[i] % 2 == 0 && arr[i] >= 50) {
        arr[i] /= 2;

        // 홀수고, 50 미만일 때 -> * 2
      } else if (arr[i] % 2 != 0 && arr[i] < 50) {
        arr[i] *= 2;
      }
    }

    return arr;
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 100, 99, 98};

    System.out.println(solution(arr));

  }

}
