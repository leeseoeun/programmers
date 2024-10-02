package programmers.lv0.a_training;

public class Day20_함수_메서드_1_배열의_길이를_2의_거듭제곱으로_만들기 {

  public static int[] solution(int[] arr) {
    int num = arr.length;
    int len = 0;
    while (num > 1) {
      num /= 2;
      len++;
    }

    if (Math.pow(2, len) == arr.length) {
      return arr;
    } else {
      int[] answer = new int[(int) Math.pow(2, len + 1)];

      for (int i = 0; i < arr.length; i++) {
        answer[i] = arr[i];
      }

      return answer;
    }

    /*
     * int length = 1;
     * 
     * while (length < arr.length) {
     *  length *= 2;
     * }
     * 
     * return Arrays.copyOf(arr, length);
     * */
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6};

    System.out.println(solution(arr));

  }

}
