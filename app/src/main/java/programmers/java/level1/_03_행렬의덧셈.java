package programmers.java.level1;

public class _03_행렬의덧셈 {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr1[0].length];  //'열'은 첫번째 배열의 길이

    for (int i = 0; i < arr1.length ; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return answer;
  }
}

/* 2차원 배열 */
//int[][] array4 = new int[3][4];
//3개의 배열, 정수를 4개씩 담을 수 있는