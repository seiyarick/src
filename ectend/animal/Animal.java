package ectend.animal;

public abstract class Animal {
	protected String name;
	
	public void eat(){
		System.out.println(name + "が食事をしました！");
	}
	
	public abstract void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}
