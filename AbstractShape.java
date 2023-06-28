//Abstract Class

import java.io.*;

abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides of Rectangle = 4");
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides of Triangle = 3");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides of Hexagon = 6");
	}
}

class AbstractShape
{
	public static void main(String args[])
	{
		Rectangle R = new Rectangle();
		Triangle T = new Triangle();
		Hexagon H = new Hexagon();
		
		System.out.print("\n");
		R.numberOfSides();
		T.numberOfSides();
		H.numberOfSides();
	}
}
