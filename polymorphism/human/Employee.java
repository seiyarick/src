package polymorphism.human;

// Humanクラスを継承
public class Employee extends Human{ // Employee...社員
	private String department; // department...部署
	
	public Employee(String name, int age, String department) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.department = department;
	}
	
	// オーバーライドして、Employeeクラスように処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + this.age + "です";
		profile += "サラリーマンで、部署は" + this.department + "です";
		return profile;
	}

}
