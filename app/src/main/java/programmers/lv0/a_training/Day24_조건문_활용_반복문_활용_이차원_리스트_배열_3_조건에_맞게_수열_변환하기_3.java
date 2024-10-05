package programmers.lv0.a_training;

public class Day24_조건문_활용_반복문_활용_이차원_리스트_배열_3_조건에_맞게_수열_변환하기_3 {

  public static int[] solution(int[] arr, int k) {
    if (k % 2 == 1) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] *= k;
      }
    } else {
      for (int i = 0; i < arr.length; i++) {
        arr[i] += k;
      }
    }

    return arr;
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 100, 99, 98};
    int k = 0;

    System.out.println(solution(arr, k));

  }

}
