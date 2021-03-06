package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the default java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the default package, and change the names below.

	String firstImage = "src/_05_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_05_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_05_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_05_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(100, 125);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int score = new Integer(0);
		// 2. Set the size of the window in the initializeGui() method 

		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
if (guess.equals("Arnold")) {
	JOptionPane.showMessageDialog(null, "Your are winner of point 1");
	score = score + 1;
}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is
else {
	JOptionPane.showMessageDialog(null, "Your no win of point 1" + "                                                                                                                                                                                The name is Arnold");
}
		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....
String answer = JOptionPane.showInputDialog("who is this?");
if (answer.equals("Leonardo") && score == 1) {
	JOptionPane.showMessageDialog(null, "You're are winner of point 2");
	score = score + 1;
}

else if (answer.equals("Leonardo") && score == 0) {
	JOptionPane.showMessageDialog(null, "Your are winner of point 1");
}

else if (!(answer.equals("Leonardo")) && score == 1) {
	JOptionPane.showMessageDialog(null, "You're are no winner of point 2" + "                                                                                                                                                                       The name is Leonardo");
}
else {
	JOptionPane.showMessageDialog(null, "Your no win of point 1" + "                                                                                                                                                                       The name is Leonardo");
}
showNextImage();
String gus = JOptionPane.showInputDialog("who is this");
//this person is Morgan
if (gus.equals("Morgan") && score == 2) {
	JOptionPane.showMessageDialog(null, "You're is are deserving of a pont 3");
	score = score + 1; 
}
else if (gus.equals("Morgan") && score  == 1) {
	JOptionPane.showMessageDialog(null, "You're are winner of point 2");
	score = score + 1;
}
else if (gus.equals("Morgan") && score  == 0) {
	JOptionPane.showMessageDialog(null, "Your are winner of point 1");
	score = score +  1;
}
else if (!(gus.equals("Morgan")) && score == 2) {
	JOptionPane.showMessageDialog(null, "You're is are not deserving of pont 3" + "                                                                                                                                                                 The name is Morgan");
}
else if (!(gus.equals("Morgan")) && score == 1) {
	JOptionPane.showMessageDialog(null, "You're are not deserving of point 2" + "                                                                                                                                                                 The name is Morgan");
}
else {
	JOptionPane.showMessageDialog(null, "Your no win of point 1");
}
showNextImage();
String gu = JOptionPane.showInputDialog("Last question! Who is this?");
//this is jack
if (gu.equals("Jack") && score == 3){
	JOptionPane.showMessageDialog(null, "Congration, you done it. You got the all qs correct");
	}
else if (gu.equals("Jack") && score == 2){
	JOptionPane.showMessageDialog(null, "Congration, you done it. You got 3 the qs correct");
	}
else if (gu.equals("Jack") && score == 1){
	JOptionPane.showMessageDialog(null, "Congration, you done it. You got 2 pont");
	}
else if (gu.equals("Jack") && score == 0){
	JOptionPane.showMessageDialog(null, "Congration, you got 1 pont");
	}
else if (!(gu.equals("Jack")) && score == 3) {
	JOptionPane.showMessageDialog(null, "You finsh with 3 pont");
}
else if (!(gu.equals("Jack")) && score == 2) {
	JOptionPane.showMessageDialog(null, "You got 2 pont tutal");
}
else if (!(gu.equals("Jack")) && score == 1) {
	JOptionPane.showMessageDialog(null, "One pont. You is are not gud");
}
else {
	JOptionPane.showMessageDialog(null, "You are trash! Hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha");
}

// 9. Show them their current score
JOptionPane.showMessageDialog(null, score);
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
