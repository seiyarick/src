
public class Switch01 {
	public static void main(String[] args) {
		String str = "良い";
		switch(str) {
		case "良い":
			System.out.println("よくできました！");
			break;
		case "普通":
			System.out.println("普通でした！");
			break;
		default:
			System.out.println("頑張ろう！");
		}
	}
}

//基本構文
//switch (式 (変数や値)) {
//case 値:
//	ブロック(処理);
//	break;
//case 値:
//	ブロック(処理);
//	break;
//default:
//	ブロック(処理);
//}
