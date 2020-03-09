package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
        if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Go to https://www.reddit.com/r/tf2/comments/5y8huj/happy_8th_of_march/");
		}
        else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "               ");
		}
        else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. The running speed starts slowly, but gets faster each minute after you hear this signal. [beep] A single lap should be completed each time you hear this sound. [ding] Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark, get ready, start." );
		}
        else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Tommorow is a good day for you, or is it?");
		}
        else {
			JOptionPane.showMessageDialog(null, "Error 404, fortune not found");
		}

	}
}

