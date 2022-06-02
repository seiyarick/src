//パッケージ
//パッケージ名を指定したサンプルプログラムを作成して、実行してみましょう。
//
//基本構文
//パッケージを宣言する基本構文です。必ずクラスファイルの先頭に記述する必要があります。
//
//package パッケージ名;
//関連して、インポートを宣言する基本構文も紹介します。パッケージの宣言の直後に記述します。
//
//import パッケージ名.クラス名;
//また、次のように*を用いて書くと、指定したパッケージ下のすべてのクラスがインポートされます。
//
//import パッケージ名.*;

package classMethod.human;

public class Human02 {
	public String name;
	public int age;
	
	public Human02(){
		name = "山田";
		age = 25;
	}
	public Human02(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
