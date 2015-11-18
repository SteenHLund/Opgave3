package Opgave2;

import java.awt.Color;
import java.awt.Point;

public class MagicTree extends Tree {
	
	Color black = Color.BLACK;
	
	public MagicTree(Point position, double size) {
		super(position, size);
	}

	@Override
	public Color getColor() {
		return black;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public double getSize() {
		return size;
	}

	@Override
	public void grow() {
		int counter = 0;
		
		if(counter >= 0) {
			size+=0.5;
		}
		
		if(Math.random()== 20){
			//move some where else
		}
						
	}

}
