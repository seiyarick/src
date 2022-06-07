package capusule.human;

public class HumanNoCapsule {
	// public修飾子のため外部(Capusule01)からアクセス可能
	public String name;
	public int age;
	
	public HumanNoCapsule(String name, int age) {
		this.name = name;
		this.age = age; 
	}

}
