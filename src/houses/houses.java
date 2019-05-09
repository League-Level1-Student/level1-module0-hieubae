package houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot Hieu = new Robot();

	public static void main(String[] args) {
		Hieu.setX(50);
		Hieu.setY(530);
		for (int i = 1; i < 10; i++) {
			Random gen = new Random();
			int size = gen.nextInt(3);
			String height = "";
			if (size == 0) {
				height = "small";
			}
			if (size == 1) {
				height = "medium";
			}
			if (size == 2) {
				height = "large";
			}
			drawHouse(height, Color.red);
		}
	}

	static void drawHouse(String height, Color crayola) {
		Hieu.setPenColor(crayola);
		int size = 0;
		if (height.equals("small")) {
			size = 60;
		}
		if (height.equals("medium")) {
			size = 120;
		}
		if (height.equals("large")) {
			size = 250;
		}
		Hieu.setSpeed(500);
		Hieu.penDown();
		Hieu.move(size);
		Hieu.turn(90);
		Hieu.move(50);
		Hieu.turn(90);
		Hieu.move(size);
		Hieu.turn(-90);
		Hieu.move(30);
		Hieu.turn(-90);
	}

}
