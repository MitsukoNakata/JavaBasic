package practice13.common;

public class Item {
	/**アイテム名*/
	public String name ;

	/**与えられるダメージ*/
	public int additionalDamage ;

	/**アイテム名を取得します*/
	public void setName(String name) {
		this.name = name ;}
	public  String getName() {
			return name;}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage ;}
	public int getAdditionalDamage() {
		 	return additionalDamage;}

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}


}
