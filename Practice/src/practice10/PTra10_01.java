package practice10;
/*
 * PTra10_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_01 {

	/*
	 * ★ 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		User
	 * フィールド
	 * 		userId		:	int型
	 * 		userNm		：	String型
	 * 		mail		：	String型
	 * 		password	:	String型
	 * メソッド
	 * 		なし
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us = new User();


		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		us.userId = 6361;
		us.userNm = "竹内光子";
		us.mail = "e5mary49@gmail.com";
		us.password = "12345678";



		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		System.out.println("userIdは"+us.userId);
		System.out.println("userNmは"+us.userNm);
		System.out.println("mailは"+us.mail);
		System.out.println("passwordは"+us.password);
	}
}
