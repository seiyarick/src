
public class Chapter08 {
	public static void main(String[] args) {
//		int int1 = 1;
//		while (int1 < 5){
//			System.out.println(int1 * int1);
//			int1++;
//		}
		int[] array = {1, 4, 14, 25};
		for (int number= 0; number < array.length; number++) {
			System.out.println(array[number]);
		}
		System.out.println("ーーーーーーーーーー");
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}

}
