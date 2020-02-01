package _01_houses;

import java.awt.Color;
import java.lang.ProcessBuilder.Redirect;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setX(50);
		rob.setY(550);
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(100);
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int size = rand.nextInt(3);
			if (size == 0) {
				house("small", Color.BLUE);
			} 
			else if (size == 1) {
				house("medium", Color.ORANGE);
			} 			
			else {
				house("large", Color.GRAY);
			}
		}
		}
	void house(int height, Color color) {
		rob.setPenColor(color);
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(new Color(2, 142, 0));
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		rob.penUp();
		rob.move(11);
		rob.penDown();
	}
	void house(String height, Color color) {
		if (height.equals("small")) {
			house(60, color);
		}
		else if (height.equals("medium")) {
			house(120, color);
		}
		else {
			house(250, color);
		}
	}
	}
	

