package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		// Human04インスタンスを生成すると、コントラクタ内の処理がされる
		Human04 yamada = new Human04("山田");
		
		// 情的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();
		
		// staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
		// インスタンスメンバーは直接使用できない(コンパイルエラー)
		// Human04.instanceMethodPrint();
		// System.out.println(Human04.name);
		
		// インスタンスメンバーはインスタンスを生成してから使用する
		yamada.instanceMethodPrint();
		
	}

}
