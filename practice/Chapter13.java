package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
	public static void main(String[] args) {
		// MobilePhoneインスタンスを生成
		MobilePhone mobilephone = new MobilePhone("000-1111-2222");
		mobilephone.takePicture();
		Chapter13.staticCall(mobilephone, "99-8888-7777");
		mobilephone.powerOff();
		
		// flyingPhoneインスタンスを生成
		FlyingPhone flyingPhone = new FlyingPhone(5);
		flyingPhone.fly();
		Chapter13.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();
	}
	
	public static void staticCall(Phone phone, String number) {
		phone.call(number);
	}

}
