package programmers.lv0.a_training;

public class Day20_함수_메서드_4_배열의_길이에_따라_다른_연산하기 {

  public static int[] solution(int[] arr, int n) {
    int evenOrOdd = arr.length % 2 == 0 ? 1 : 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == evenOrOdd) {
        arr[i] += n;
      }
    }

    return arr;

    /*
     * for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
     *  arr[idx]+=n;
     * }
     * */
  }

  public static void main(String[] args) {

    int[] arr = {49, 12, 100, 276, 33};
    int n = 27;

    System.out.println(solution(arr, n));

  }

}
