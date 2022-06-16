package practice;

public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 971;
		int b = 427;
		
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a,b) + "です");
	}
	// ユークリッドの互除法で最大公約数を計算するメソッド
	static int gcd(int a, int b) {
		// b(余り)が0になった時のaが最大公約数
		if (b == 0) {
			return a;
		}
		// 再帰呼び出し
		return gcd(b, a % b);
	}
	// 自分の解答
//	static int gcd(int a, int b) {
//		int x;
//		x = a % b;
//		x = b % x;
//		return x;
//	}

}
