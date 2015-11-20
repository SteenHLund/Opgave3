import java.awt.Color;
import java.awt.Point;

public class MagicTree extends Tree {
	
	Color black = Color.BLACK;
	private static int moved = 0;
	
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
		double counter = Math.random();
		
		if(counter >= .1) {
			size+=0.5;
		} else if (size>2) {
			size-=1.5;
		}
		
		double moveCounter = Math.random();
		
		ConstAndUtil temp = new ConstAndUtil();
		
		if(moveCounter<= .05 || moved == 20){
			moved = 0;
			position = temp.getLegalRandomPosition();
		}
		moved++;
	}
}
