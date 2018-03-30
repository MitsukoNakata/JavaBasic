package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		//
		// carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		/*


	 	Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 10001;
		car2.color = "Blue";
		car2.gasoline = 100;

		Car car3 = new Car();
		car3.serialNo = 10002;
		car3.color = "Green";
		car3.gasoline = 150;

		Car[] car = {car1,car2,car3};
		 *どっちでもOKか？？/
		//*/
		/*;

		// * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		//*/
		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 10001;
		car2.color = "Blue";
		car2.gasoline = 100;

		Car car3 = new Car();
		car3.serialNo = 10002;
		car3.color = "Green";
		car3.gasoline = 150;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		for(int i=0; i<car.length;i++) {
			final int distance = 300;
			int sum = 0 ;
			int n = 0;
			while(true) {
				int run = car[i].run();
				n++;
				if( run <= -1) {
					System.out.println(car[i].serialNo+"の車は"+"目的地に到達できませんでした");
				break;
				}

				sum +=run;
				if (distance <=sum){


					System.out.println(car[i].serialNo+"の車は"+"目的地まで"+ n +"時間かかりました。残りのガソリンは" + car[i].gasoline +"リットルです");
				break;
				}
			}
		}
	}
}
