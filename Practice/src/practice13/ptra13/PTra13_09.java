/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		//Employee employee1 = new Employee();
		//Employee employee2 = new Employee();
		//Employee employee3 = new Employee();

		//employee[0],[1],[2]の生成
		//Employee[] employee = { new Employee(),
        //         new Employee(),
         //        new Employee(),
         //      };
		Employee[] employees = new Employee[NAMEDATA.length];
		Employee em = new Employee();
		for(int i=0; i<employees.length;i++) {

		em.setUserNm(NAMEDATA[i]);
		em.setMail(MAILDATA[i]);
		em.setPassword(PASSDATA[i]);
		em.setDepartmentNm(QUATERDATA[0][i]);
		em.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
		employees[i]=em;

		}

		for(int i=0;i<employees.length;i++) {
			employees[i]=em;
			System.out.println(i+1+"目の社員情報");
			System.out.println("名前："+em.getUserNm());
			System.out.println("メールアドレス："+em.getMail());
			System.out.println("パスワード："+em.getPassword());
			System.out.println("所属部署名："+em.getDepartmentNm());
			System.out.println("所属部署の人数："+em.getDepartmentCnt()+"\r\n");

		}

	}
}
