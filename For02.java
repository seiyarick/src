//基本構文
//拡張for文の基本構文は以下になります。
//
//for (型 変数名：配列やコレクションの変数) {
//    ブロック(繰り返し処理)
//}

public class For02 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
//		拡張for文
//		配列の要素を順番にnumberに代入し、要素文繰り返す
		for(int number : array) {
//			ブロック：numberを出力
			System.out.println("For02 =" + number);
		}
	}

}
