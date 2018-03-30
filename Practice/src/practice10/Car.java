package practice10;

public class Car {

	public int serialNo;
	public String color;
	public int gasoline;


	public int run() {
		this.gasoline--; //ガソリンを1つずつ減らす
		int runDistance = new java.util.Random().nextInt(15) + 1;
		if(this.gasoline <= -1) {
			return -1;

		}
		return runDistance;



	}

}
