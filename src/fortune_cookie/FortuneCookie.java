package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {

	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		 frame.add(panel);
	     
		 frame.pack(); 
		 frame.setVisible(true);
		
		JButton button = new JButton();
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		
	     System.out.println("Button clicked");
	     
	     int rand = new Random().nextInt(5);
	    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	   }
		
		
		
		
		