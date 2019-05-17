package Shape;

import CDG.Shape;

public class Circle implements Shape {
	int x = 0 ;
	public Circle (int radius){
		this.x = radius ;
	}
	@Override
	public int getArea() {
			x = (int) (Math.PI * (x * x));
			return x;
		}
	}


