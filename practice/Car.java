package practice;

public class Car {
	private double fuelCost;
	
	private double fuelAmount;
	
	// コンストラクタを作成	
	// コンストラクタは「燃費」「残量」の引数を「double」型で定義します。
	// 引数をフィールドに代入
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	// moveメソッド
//	「int」型を引数にして定義
	public void move(int km) {
//		"km走ります"を出力
		System.out.println(km + "km走ります");
//		残量を計算
		this.fuelAmount -= (km / fuelCost);
	}
//	fuelAmountを取得するメソッドを作成
//	フィールドのfuelAmountをreturnする
	public double getFuelAmount() {
		return this.fuelAmount;
	}


}
