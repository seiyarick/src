package practice;

// クラス名もCapusuleManになる
public class CapsuleMan {
	// privateにして隠蔽
	private String name;
	private int age;
	
	public CapsuleMan(String name , int age) {
		this.name = name;
		this.age = age;
	}
    // nameのgetter
	public String getName() {
		return name;
	}

    // ageのgetter
	public int getAge() {
		return age;
	}
    // ageのsetter
	public void setAge(int age) {
		this.age = age;
	}

}
