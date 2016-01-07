/* Write a simple function that takes polar coordinates (an angle in degrees and a radius) and returns the equivalent cartesian coordinates (rouded to 10 places).
For example:
coordinates(90,1)
=> (0.0, 1.0)
coordinates(45, 1)
=> (0.7071067812, 0.7071067812)
*/
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.lang.Math.*;
import java.lang.StringBuilder;

public class Coordinates extends Point2D.Double{
	private double x;
	private double y;
	private final Point2D.Double point2D;
	//define a no-argument constructor
	public Coordinates(){
		this.point2D = new Point2D.Double(x, y);
	}
	public Coordinates(double x, double y){
		super(x, y);
		this.point2D = new Point2D.Double(x, y);
	}
	//define 2 Point2D getter methods
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	//define a Point2D toString method
	public String toString(){
		StringBuilder builder = new StringBuilder();
        builder.append('(').append(point2D.getX()).append(", ").append(point2D.getY()).append(')');
        return builder.toString();
	}
	//define a coordinates method that takes in 2 parameters
	public Point2D coordinates(double degrees, double radius) {
		//degrees = Double.parseDouble(args[0]);
		double radians = Math.toRadians(degrees);
		//calculate x and y cartesian coordinates
		x = radius * Math.cos(radians);
		y = radius * Math.sin(radians);
		//round to 10 decimal places
		x = (double) Math.round(x * 10000000000d) / 10000000000d;
		y = (double) Math.round(y * 10000000000d) / 10000000000d;
		//return the calculated coordinates
		return new Coordinates(x, y);
	}
	//define main method
	public static void main(String[] args){
		//create a Coordinates object
		Coordinates coord = new Coordinates(45, 1);
		System.out.println(coord.coordinates(45, 1));
		//instantiate a second object
		Coordinates coord2 = new Coordinates();
		System.out.println(coord2.coordinates(90, 1));
	}
}
