package programmers.lv0.a_training;

public class Day15_리스트_배열_문자열_2_조건에_맞게_수열_변환하기_2 {

  public static int solution(int[] arr) {
    int answer = 0;
    int flagCnt = 0;
    boolean initial = true;

    while (flagCnt < arr.length) {
      answer++;
      flagCnt = 0;

      for (int i = 0; i < arr.length; i++) {
        // 짝수고, 50 이상일 때 -> / 2
        if (arr[i] % 2 == 0 && arr[i] >= 50) {
          arr[i] /= 2;

          initial = false;

          // 홀수고, 50 미만일 때 -> * 2 + 1
        } else if (arr[i] % 2 != 0 && arr[i] < 50) {
          arr[i] *= 2 + 1;

          initial = false;

        } else {
          flagCnt++;
        }
      }
    }

    return initial ? 0 : answer;

    /*
     * int count = 0;
     * while (true) {
     *  int[] copied = Arrays.copyOf(arr, arr.length);
     *  for (int i = 0 ; i < copied.length ; i++) {
     *      if (copied[i] >= 50 && copied[i] % 2 == 0) {
     *          copied[i] /= 2;
     *      } else if (copied[i] < 50 && copied[i] % 2 == 1) {
     *          copied[i] = copied[i] * 2 + 1;
     *      }
     *  }
     *  if (Arrays.equals(arr, copied)) {
     *      return count;
     *  }
     *  arr = copied;
     *  count++;
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 100, 99, 98};

    System.out.println(solution(arr));

  }

}
