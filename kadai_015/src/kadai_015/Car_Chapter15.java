package kadai_015;

public class Car_Chapter15 {

	/** 1速から5速のギアを表す */
	private int gear = 1;
	
	/** ギアチェンジ後の速度を表す */
	private int speed = 10;
	
	/**
	 * ギアの値により速度を変える
	 * @param afterGear
	 */
	public void gearChange(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
	}
	
	/**
	 * ギアチェンジ後の速度を表示する
	 */
	public void run() {
		System.out.println("速度は時速" + (gear * speed) + "kmです");
	}
}
