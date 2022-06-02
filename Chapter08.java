//確認問題
//問題
//「Chapter08.java」に以下のプログラムを作成してください。
//　1.「while」文
//　・1以上5未満の数の2乗を出力
//　2. 通常「for」文
//　・要素数が4の「int」配列を初期化
//　・配列のサイズ分ループして、要素を出力
//　　※ 配列のサイズは「変数名.length」で取得が可能
//　3. 拡張「for」文
//　・「2.」の配列をループ
//　・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力


public class Chapter08 {
	public static void main(String[] args) {
//		変数int1をwhile文のブロック内でインクリメントしながら、while文の条件
//		num < 5までループの処理を行います
		int int1 = 1;
		while (int1 < 5){
			System.out.println(int1 * int1);
			int1++;
		}
//		配列の変数arrayを初期化
		int[] array =  { 1, 4, 14, 25 };
//		変数numberを0で初期化してインクリメントしながら
//		変数arrayのサイズ分(array.length)、ループ処理を行います
		for (int number= 0; number < array.length; number++) {
			System.out.println(array[number]);
		}
		System.out.println("ーーーーーーーーーー");
		
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}

}
