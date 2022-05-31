//基本構文
//do-while文の基本構文は以下になります。
//
//do {
//    ブロック（繰り返し処理）
//} while (条件式);


public class DoWhile01 {
	public static void main(String[] args) {
//		整数型変数numberに1を代入
		int number=1;
//		do-while文のループ開始
		do {
//			ブロック
//			numberにnumber * 2を代入してnumberを出力
			number *= 2;
			System.out.println("DoWhile01 =" + number);
//			do-while文
//			numberが50未満の場合、ブロックの処理をループ実行する
		}while (number < 50);
	}

}
