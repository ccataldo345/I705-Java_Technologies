package homework01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import javax.swing.JFrame;

public class TheGreatHelloGraphic {

	public static void main(String[] args) {

		System.out.println("Please enter a text: ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		input.close();

		final BufferedImage image = new BufferedImage(1200, 500, BufferedImage.TYPE_BYTE_BINARY);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, 1200, 500);
		graphics.setColor(Color.red);
		Font myFont = new Font ("Courier New", 1, 100);  ///last number set font size
		graphics.setFont (myFont);
		graphics.drawString(text.toUpperCase(), 20, 300);

		JFrame window = new JFrame() {
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				super.paint(g);
				g.drawImage(image, 0, 0, null);
			}
		};

		window.setSize(1200, 500);
		window.setVisible(true);

		//image.getGraphics().setColor(Color.red);
		window.repaint();

	}
}

