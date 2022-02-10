package programmers.level1;

public class j09_짝수와홀수 {
  public String solution(int num) {
    String answer = "";
    return answer;
  }
}

/* 최대공약수 반복문 방식 */
//int gcd(int a, int b) {
//  while(b != 0) {
//    int r = a % b;  // 나머지를 구해준다.
//
//    // GCD(a, b) = GCD(b, r)이므로 변환한다.
//    a = b;      
//    b = r;
//  }
//  return a;
//}

/* 최대공약수 재귀 방식 */
//int gcd(int a, int b) {
//  if(b == 0) return a;
//  // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
//  return gcd(b, a % b);
//}

/* 최소공배수 */
//int lcm(int a, int b) {
//  return a * b / gcd(a, b);
//}
