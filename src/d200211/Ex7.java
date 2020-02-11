package d200211;

public class Ex7 {
	public static void main(String[] args) {
		Test7 tt = new Test7();
		int result;
		result = tt.sum(20);
		System.out.println("결과:" + result);
		System.out.println("4는 짝수? " + tt.isEven(4));
		char c = 'g';
		System.out.println(c + "를 대문자로 고치면? " + tt.upper(c));
		System.out.println(c + "는 대문자? " + tt.isUpper(c));
		int a=1,b=10;
		result = tt.sum2(a,b);
		System.out.printf("%d에서 %d까지의 합은 %d입니다.%n",a,b,result);
	}
}

class Test7 {
	public int sum(int n) {// n: 매개변수(파라미터)
		// 매개변수도 지역변수의 일종이라고 보면 된다.
		// ★매개변수는 지역변수와 동일하게 스택 영역에 저장된다
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += n;
		}
		return s;
	}

	// 매개변수로 전달된 정수가 짝수인지 판별하는 메서드
	public boolean isEven(int n) {
		return (n & 1) == 0;
	}

	// 매개변수로 전달 받은 문자 중 소문자를 대문자로 변환하는 메서드
	public char upper(char ch) {
		return (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
	}

	// 매개변수로 전달된 문자가 대문자인지 판별
	public boolean isUpper(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// 두 정수를 매개변수로 전달받아 작은 수에서 큰 수까지 합 구하기
	public int sum2(int a, int b) {
		int t, s=0;
		//a가 작은 수가 되도록 정렬하기
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		for (int i = a; i <= b; i++) {
			s+=i;
		}
		return s;
	}

}