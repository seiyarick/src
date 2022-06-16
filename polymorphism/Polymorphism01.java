package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism01 {
	public static void main(String[] args) {
		// Studentクラスのコンストラクタを生成してHumanクラスの変数に代入
		Human human1 = new Student("佐藤", 17, 70);
		// オーバーライドしているので、Studentクラスのメソッドが実行される
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します" + human1.getProfile());
		//Employeeクラスのコンストラクタを生成し、Humanクラスの変数に代入
		Human human2 = new Employee("田中", 28, "システム部");
		// オーバーライドしているので、Employeeクラスのメソッドが実行される
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します" + human2.getProfile());
		
		Human human3 = new Human("太郎", 18);
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します" + human3.getProfile());
//		System.out.println(human3.getName());
//		System.out.println(human3.getAge());
//		System.out.println(human1.getName());
	}

}
