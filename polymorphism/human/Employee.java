package polymorphism.human;

public class Employee extends Human{ // Employee...社員
	private String department; // department...部署
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getProfile() {
		String profile = "年齢は" + this.age + "です";
		profile += "サラリーマンで、部署は" + this.department + "です";
		return profile;
	}

}
