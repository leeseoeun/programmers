package programmers.training;

public class Day8_조건문_반복문_2_주사위_게임_3 {

  public static int solution(int a, int b, int c, int d) {
    int[] arr = {a, b, c, d};
    int cnt = 0;            // 같은 숫자 개수

    int sameNum1 = 0;       // 같은 숫자 1
    int sameNum2 = 0;       // 같은 숫자 2
    int minNum = arr[0];    // 작은 숫자

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          cnt++;

          if (sameNum1 == 0) {
            sameNum1 = arr[i];
          } else {
            sameNum2 = arr[i];
          }
        }
      }

      minNum = Math.min(minNum, arr[i]);
    }

    int differentNum1 = 0;  // 다른 숫자 1
    int differentNum2 = 0;  // 다른 숫자 2

    for (int i = 0; i < arr.length; i++) {
      if (sameNum1 != arr[i]) {
        if (differentNum1 == 0) {
          differentNum1 = arr[i];
        } else {
          differentNum2 = arr[i];
        }
      }
    }

    switch (cnt) {
      // 네 숫자가 모두 같을 때
      case 6:
        return 1111 * sameNum1;

        // 세 숫자만 같을 때
      case 3:
        return (int) Math.pow(10 * sameNum1 + differentNum1, 2);

        // 두 숫자씩 같을 때
      case 2:
        return (sameNum1 + sameNum2) * Math.abs(sameNum1 - sameNum2);

        // 두 숫자만 같을 때
      case 1:
        return differentNum1 * differentNum2;
      default:
        return minNum;
    }
  }

  public static void main(String[] args) {

    //    int[][] arr = {{2, 2, 2, 2}, {4, 1, 4, 4}, {6, 3, 3, 6}, {2, 5, 2, 6}, {6, 4, 2, 5}};
    int[][] arr = {{1, 2, 3, 4}};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(solution(arr[i][0], arr[i][1], arr[i][2], arr[i][3]));
    }


  }

}
