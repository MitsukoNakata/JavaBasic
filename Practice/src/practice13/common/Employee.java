package practice13.common;

public class Employee extends Person {
	public String departmentNm;  //部署名
	public int departmentCnt;	 //部署人数

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm ;}
	public  String getDepartmentNm() {
			return departmentNm;}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt ;}
	public int getDepartmentCnt() {
		 	return departmentCnt;}



}
