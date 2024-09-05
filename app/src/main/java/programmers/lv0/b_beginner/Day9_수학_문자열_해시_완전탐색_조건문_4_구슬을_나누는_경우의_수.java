package programmers.lv0.b_beginner;

public class Day9_수학_문자열_해시_완전탐색_조건문_4_구슬을_나누는_경우의_수 {

  private static int cnt = 0;

  public static int solution(int balls, int share) {
    // 서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다.
    //      n!
    // -----------
    // (n-m)! x m!
    // 
    // => 조합

    int arr[] = new int[balls];
    combine(arr, 0, share);

    return cnt;
  }

  private static void combine(int[] arr, int idx, int r) {
    // r개의 원소(share)를 다 선택한 경우
    if (r == 0) {
      cnt++;
      return;
    }

    for (int i = idx; i < arr.length; i++) {
      combine(arr, i + 1, r - 1);
    }
  }

  public static void main(String[] args) {

    int balls = 3;
    int share = 2;

    System.out.println(solution(balls, share));

  }

}
