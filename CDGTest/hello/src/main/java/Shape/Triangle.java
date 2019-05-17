package Shape;

import CDG.Shape;

public class Triangle implements Shape {

	int x = 0;
	int y = 0;

	public Triangle(int base, int height) {
		this.x = base;
		this.y = height;
	}

	@Override
	public int getArea() {
		x = (int) (0.5 * (x * y));
		return x;
	}
}
