package Shape;

import CDG.Shape;

public class Rectangle implements Shape {
	int x = 0 ;
	int y = 0;
	public Rectangle (int width, int height){
		this.x = width ;
		this.y = height ;
	}
	@Override
	public int getArea() {
		y = x*y ;
		return y;
	}

}
