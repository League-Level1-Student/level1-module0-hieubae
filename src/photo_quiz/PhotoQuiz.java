package photo_quiz;
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
		// â€œCopy Image Addressâ€�)
		String cherry = "https://upload.wikimedia.org/wikipedia/commons/4/4d/Tyler%2C_The_Creator_%288048745695%29_%28cropped%29.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component tyler;
		// 3. use the "createImage()" method below to initialize your Component
		tyler = createImage(cherry);
		// 4. add the image to the quiz window
		quizWindow.add(tyler);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("Who is this guy?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equals("Tyler the Creator")) {
		System.out.println("CORRECT");
		} 
		// 8. print "INCORRECT" if the answer is wrong
		else {
		System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(tyler);
		// 10. find another image and create it (might take more than one line
		// of code)
		String rex = "https://www.coupdemainmagazine.com/sites/default/files/styles/full_width/public/article/14253/hero-14253-644466311.jpg?itok=e8lYksEo";
		Component orange;
		
		// 11. add the second image to the quiz window
		
		// 12. pack the quiz window

		// 13. ask another question
		String apr = JOptionPane.showInputDialog("");
		// 14+ check answer, say if correct or incorrect, etc.

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
