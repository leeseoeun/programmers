package programmers.lv0.a_training;

public class Day20_함수_메서드_2_배열_비교하기 {

  public static int solution(int[] arr1, int[] arr2) {
    if (arr1.length > arr2.length) {
      return 1;
    } else if (arr1.length < arr2.length) {
      return -1;

    } else {
      int sum1 = 0;
      int sum2 = 0;

      for (int i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
        sum2 += arr2[i];
      }

      if (sum1 > sum2) {
        return 1;
      } else if (sum1 < sum2) {
        return -1;
      } else {
        return 0;
      }
    }

    /*
     * // Integer.compare(int x, int y)
     * // x가 크면 1, y가 크면 -1, 같으면 0
     * int answer = Integer.compare(arr1.length, arr2.length);
     * 
     * if(answer == 0) {
     *  answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr1 = {49, 13};
    int[] arr2 = {70, 11, 2};

    System.out.println(solution(arr1, arr2));

  }

}
