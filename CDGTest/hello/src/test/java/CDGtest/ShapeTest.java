package CDGtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CDG.Shape;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;
import Shape.Triangle;

public class ShapeTest {

	@Test
	public void getCircleAreaShould314() {
		Shape circle = new Circle(10); // int radius
		assertEquals(314, circle.getArea());
	}

	@Test
	public void getCircleAreaShould706() {
		Shape circle = new Circle(15); // int radius
		assertEquals(706, circle.getArea());
	}

	@Test
	public void getRectangleAreaShould200() {
		Shape rectangle = new Rectangle(10, 20); // int width, int height
		assertEquals(200, rectangle.getArea());
	}

	@Test
	public void getRectangleAreaShould168() {
		Shape rectangle = new Rectangle(12, 14); // int width, int height
		assertEquals(168, rectangle.getArea());
	}

	@Test
	public void getSquareAreaShould100() {
		Shape square = new Square(10); // int width
		assertEquals(100, square.getArea());
	}

	@Test
	public void getSquareAreaShould169() {
		Shape square = new Square(13); // int width
		assertEquals(169, square.getArea());
	}

	@Test
	public void getTriangleAreaShould100() {
		Shape triangle = new Triangle(10, 20); // int base,int height
		assertEquals(100, triangle.getArea());
	}

	@Test
	public void getTriangleAreaShould121() {
		Shape triangle = new Triangle(11, 22); // int base,int height
		assertEquals(121, triangle.getArea());
	}

}