package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Live_at_11 implements ActionListener {
	public static void main(String[] args) {
		JFrame Firstframe = new JFrame();
		JFrame Secondframe = new JFrame();
		JFrame Thirdframe = new JFrame();
        Firstframe.setVisible(true);
        Secondframe.setVisible(true);
        Thirdframe.setVisible(true);
        JButton Firstbutton = new JButton();
        JButton Secondbutton = new JButton();
        JButton Thirdbutton = new JButton();
        Firstbutton.setText("I have a cute video!");
        Secondbutton.setText("I also have a cute video!");
        Thirdbutton.setText("Me three!");
        Firstframe.add(Firstbutton);
        Secondframe.add(Secondbutton);
        Thirdframe.add(Thirdbutton);
        Firstframe.pack();
        Secondframe.pack();
        Thirdframe.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
