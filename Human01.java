//this変数
//thisというキーワードで自分自身のインスタンスを指す変数を扱うことができます。
//自分自身のインスタンスのフィールドやメソッドであることを明示的にする場合に使用します。

//ーーーーーーーーーーーーーーーーーーーーー

//修飾子 class クラス名 {
//    修飾子 コンストラクタ(引数) {
//        // 初期化処理
//    }
//}
// ーーーーーーーーーーーーーーーーーーーーーー

public class Human01 {
	public String name; //メンバー変数
	public int age;  //メンバー変数
	
	// 引数なしのコントラクタ
	public Human01() {
		name = "山田";
		age = 20;
//		System.out.println(name + age);   mainメソットではないので実行できない
	}
	// 引数2つのコントラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
