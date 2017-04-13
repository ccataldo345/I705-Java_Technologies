package ee.itcollege.tetris.lib;

import java.util.Random;

import ee.itcollege.tetris.parts.Block;
import ee.itcollege.tetris.parts.Figure;

public class FigureGenerator {

	public Figure createFigure() {

		Figure figure = new Figure();
		int x1 = (int) Math.round(Math.random());
		Random r = new Random();
		int x2a = r.nextInt(3) +1;  //random number 1-3 
		int x2b = (int) Math.round(Math.random());

		figure.add(new Block(0, 0));
		figure.add(new Block(0, 1));

		if (x1 == 1) {
			figure.add(new Block(1, 1)); //a.1
			if (x2a == 1){
				figure.add(new Block(0, 2)); //a.1.1
			}
			else if (x2a == 2){
				figure.add(new Block(1, 0)); //a.1.2
			}
			else if (x2a == 3){
				figure.add(new Block(1, 2));  //a.1.3
			}
		}

		else {
			figure.add(new Block(0, 2)); //b.1
			if (x2b == 1) {
				figure.add(new Block(1, 2)); //b.1.1
			}
			else {
				figure.add(new Block(0, 3)); //b.1.2
			}
		}

		return figure;
	}

}
