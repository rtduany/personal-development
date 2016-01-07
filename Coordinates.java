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

}
