package week4.shape;

public class Circle extends Shape {
	private double radius = 1.0;
	private double area;
	private final double PI = Math.PI;
	private double perimeter;

	public Circle(){}

	public double getRadius(){
	return radius;
	}

	public void setRadius(double radius){
        this.radius = radius;
	}

	public Circle( double radius, String color, Boolean filled)
	{
	this.radius = radius;
	this.setColor(color);
	this.setFilled(filled);
	}

	public double getArea(){
	return area = PI*this.radius*this.radius;}

	public double getPerimeter(){
	return perimeter = 2*PI*this.radius;}

	public String toString(){
	return this.getColor()+ "," + this.getFilled() +",'+this.radius;}

}
