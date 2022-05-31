
public class If01 {
	public static void main(String[] args) {
		int number = 7;
//		if文
//		numberが5未満の場合、ブロックの処理を実行
		if (number < 5) {
//			ブロック:「◯は5未満です」を出力
			System.out.println(number + "は5未満です");
		}
//		if文
//		numberが10未満の場合、ブロックの処理を実行
		if (number < 10) {
//			ブロック：「◯は10未満です」を出力
			System.out.println(number + "は10未満です");
		}
//		if文
//		numberが15未満の場合ブロックの処理を実行
		if (number < 15) {
//			ブロック：「○は15未満です」を出力
			System.out.println(number + "は15未満です");
		}
	
	}

}

//public static void main(String[] args)の意味↓

//public	どこからでも参照可能
//static	インスタンス可(new)しなくても外部から使用可能
//void	戻り値なし
//main	メソッド名
//String[]	引数をString型の配列で受け取る
//args	引数名、argument（和訳：引数）の複数形でargumentsの略省

