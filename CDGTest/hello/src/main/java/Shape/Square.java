package Shape;

import CDG.Shape;

public class Square implements Shape {
	int x = 0;

	public Square(int width) {
		this.x = width;

	}

	@Override
	public int getArea() {
		x = x * x;
		return x;
	}
}
