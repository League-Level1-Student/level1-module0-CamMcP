package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String image = "https://images.law.com/contrib/content/uploads/sites/292/2019/12/Button-No-Article-201912181709.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component url = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(url);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String no = JOptionPane.showInputDialog("Is this yes");
		// 7. print "CORRECT" if the user gave the right answer
if (no.equals("no")) {
	JOptionPane.showMessageDialog(null, "Yes");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "No");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(url);
		// 10. find another image and create it (might take more than one line
		// of code)
String Image = "https://lh3.googleusercontent.com/proxy/zFL3EbjEIpI9jCszqECwHBtM5dvUowIXh14j4ZTjvtmrdDYHg9cEs0lUVlxoKioGRbXphZFsZx93hYFAsf_i6Ctv3lUbrDNDQhU8nLo29YyHnRsaq0YUnf2wWenA9Acm";
Component Url = createImage(Image);
		// 11. add the second image to the quiz window
quizWindow.add(Url);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String yes = JOptionPane.showInputDialog("Is this yes?");
		// 14+ check answer, say if correct or incorrect, etc.
if (yes.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Yes");
}
else {
	JOptionPane.showMessageDialog(null, "No");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
