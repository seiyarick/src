//例外処理
//try-catch文（try-catch-finally文）
//try-catch文は、例外処理を記述するために使用します。

package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 % 0は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		}catch (ArithmeticException e) {
			System.out.println("例外が発生");
		}finally {
			System.out.println("プログラム終了");
		}
	}

}
