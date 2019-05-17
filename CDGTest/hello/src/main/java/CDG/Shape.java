package CDG;

public interface Shape {
	int getArea();

}

class Rectangle implements Shape {

	@Override
	public int getArea() {
		int area;
		int r = 0;
		int hight = 0;
		area = r * hight;
		return area;

	}

}

// class Square implements Shape {
//
// @Override
// public int getArea() {
// int area;
// area = r * hight;
// return area;
//
// }
//
// }