package Opgave2;

import java.awt.Color;
import java.awt.Point;

public abstract class Tree {
	
	public Tree(Point position, double size) {
		
		this.position = position;
		this.size= size;
		
	}
	
	protected Point position;
	
	protected double size;
	
	public abstract Color getColor();
	
	public abstract Point getPosition();
	
	public abstract double getSize();
	
	public abstract void grow();
}


