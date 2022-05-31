//・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
//・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
//・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
 
public class Chapter05 {
	public static void main(String[] args) {
	long long1 = 123456789011111111L;
	System.out.println(long1);
	double double1 = 25.5;
	System.out.println(double1);
	boolean boolean1 = 10 < 5;
	System.out.println(boolean1);
	
	Float float1 = 30.5f;
	System.out.println(float1);
	Integer integer1 = 32;
	System.out.println(integer1);
	Character c = 'う';
	System.out.println(c);
	
	int[] array5 = {10, 20, 30, 40, 50};
	System.out.print(array5[2]);
	
	}
}
