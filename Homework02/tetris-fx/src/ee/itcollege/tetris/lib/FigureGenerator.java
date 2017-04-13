package ee.itcollege.tetris.lib;

import java.util.Random;

import ee.itcollege.tetris.parts.Block;
import ee.itcollege.tetris.parts.Figure;

public class FigureGenerator {

	public Figure createFigure() {

		Figure figure = new Figure();
		int x1 = (int) Math.round(Math.random());
		Random r = new Random();
		int x2a = r.nextInt(4) +1;  //random number 1-4 
		int x2b = r.nextInt(3) +1;

		figure.add(new Block(0, 0));  //block 00
		figure.add(new Block(0, 1));

		if (x1 == 1) {
			figure.add(new Block(1, 1)); //a.1
			if (x2a == 1){
				figure.add(new Block(0, 2)); //a.1.1 "T"
			}
			else if (x2a == 2){
				figure.add(new Block(1, 0)); //a.1.2 "O"
			}
			else if (x2a == 3){
				figure.add(new Block(1, 2));  //a.1.3 "S"
			}
			else if (x2a == 4){
				figure.add(new Block(-1, 0));  //a.1.3 "Z"
			}
		}

		else {
			figure.add(new Block(0, 2)); //b.1
			if (x2b == 1) {
				figure.add(new Block(1, 2)); //b.1.1 "L"
			}
			else if (x2b == 2){
				figure.add(new Block(0, 3)); //b.1.2 "I"
			}
			else if (x2b == 3){
				figure.add(new Block(-1, 2)); //b.1.2 "J"
			}
		}

		return figure;
	}

}
