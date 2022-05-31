//基本構文
//for文の基本構文は以下になります。
//
//for (初期化式; 条件式; 変化式) {
//    ブロック(繰り返し処理)
//}

public class For01 {
	public static void main(String[] args) {
//		for文
//		初期化値：numberを1で初期化
//		条件式：numberが5未満の場合に、ブロックの処理を行う
//		変化式：ブロックの処理後に、numberをインクリメント
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 =" + number);
		}
	}

}
