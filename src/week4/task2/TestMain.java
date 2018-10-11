package week4.shape;

public class TestMain{
	public static void main(String[] args){

	Circle c = new Circle(2);
	System.out.println("Thong so : " + c.toString());
	System.out.println("Dien tich : " + c.getArea() + "Chu vi : " + c.getPerimeter());

	Rectangle r = new Rectangle(3,2);
	System.out.println("Thong so : " + c.toString());
	System.out.println("Dien tich : " + c.getArea() + "Chu vi : " + c.getPerimeter());

	Square s = new Square(6);
	System.out.println("Thong so : " + c.toString());
	System.out.println("Dien tich : " + c.getArea() + "Chu vi : " + c.getPerimeter());
}
