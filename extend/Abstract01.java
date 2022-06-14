package extend;

import ectend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {
		// Dogクラスのインスタンスを作成
		Dog dog = new Dog();
		// 抽象クラス（Animalクラス）のメソッドを呼び出し
		dog.eat();
		//抽象メソッドを実装したメソッドを呼び出し
		dog.cry();
		
		// 抽象クラスはインスタンス生成するとコンパイルエラー
		// Animal animal = new Animal();
	}

}
