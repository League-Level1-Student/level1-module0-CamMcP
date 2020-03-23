package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Live_at_11 implements ActionListener {
    JButton Firstbutton = new JButton();
    JButton Secondbutton = new JButton();
    JButton Thirdbutton = new JButton();
	void run() {
		JFrame Firstframe = new JFrame();
		JFrame Secondframe = new JFrame();
		JFrame Thirdframe = new JFrame();
        Firstframe.setVisible(true);
        Secondframe.setVisible(true);
        Thirdframe.setVisible(true);
        Firstbutton.setText("I have a cute video!");
        Secondbutton.setText("I also have a cute video!");
        Thirdbutton.setText("Me three!");
        Firstframe.add(Firstbutton);
        Secondframe.add(Secondbutton);
        Thirdframe.add(Thirdbutton);
        Firstbutton.addActionListener(this);
        Secondbutton.addActionListener(this);
        Thirdbutton.addActionListener(this);
        Firstframe.pack();
        Secondframe.pack();
        Thirdframe.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton ButtonClicked = (JButton) e.getSource();
		if (ButtonClicked == Firstbutton) {
			showDucks();
		}
		else if (ButtonClicked == Secondbutton) {
			showFrog();
		}
		else if (ButtonClicked == Thirdbutton) {
			showFluffyUnicorns();
		}
	}
}
