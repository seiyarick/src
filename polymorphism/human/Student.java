package polymorphism.human;

// Humanクラスを継承
public class Student extends Human{
	private int score;
	
	public Student(String name, int age, int score) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}
	
	// オーバーライドしてStudentクラスように処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、テストの点数は" + this.score + "点です";
		return profile;
	}
	
	// Humanクラス(スーパークラス)でfinal修飾子が設定されているメソッドなのでエラー
//	public String getName() {
//		String a = super.getName();
//		return a;
//	}

}
