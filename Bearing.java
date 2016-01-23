/*
Bearing:
In general, your current heading will vary as you follow a great circle path (orthodrome); the final heading will differ from the initial heading by varying degrees according to distance and latitude (if you were to go from say 35°N,45°E (≈ Baghdad) to 35°N,135°E (≈ Osaka), you would start on a heading of 60° and end up on a heading of 120°!).
This formula is for the initial bearing (sometimes referred to as forward azimuth) and the final bearing which if followed in a straight line along a great-circle arc will take you from the start point to the end point:1
Formula:	θ = atan2( sin Δλ ⋅ cos φ2 , cos φ1 ⋅ sin φ2 − sin φ1 ⋅ cos φ2 ⋅ cos Δλ )
JavaScript:
(all angles in radians)
var y = Math.sin(λ2-λ1) * Math.cos(φ2);
var x = Math.cos(φ1)*Math.sin(φ2) - Math.sin(φ1)*Math.cos(φ2)*Math.cos(λ2-λ1);
var brng = Math.atan2(y, x).toDegrees();
Excel:
(all angles in radians)
= ATAN2(COS(lat1)*SIN(lat2)-SIN(lat1)*COS(lat2)*COS(lon2-lon1), SIN(lon2-lon1)*COS(lat2))
*note that Excel reverses the arguments to ATAN2 – see notes below
Since atan2 returns values in the range -π ... +π (that is, -180° ... +180°), to normalise the result to a compass bearing (in the range 0° ... 360°, with −ve values transformed into the range 180° ... 360°), convert to degrees and then use (θ+360) % 360, where % is (floating point) modulo.
For final bearing, simply take the initial bearing from the end point to the start point and reverse it (using θ = (θ+180) % 360).
*/
public class Bearing{
	/*
	//define a initial method that takes in 4 parameters and caters for the initial bearing
	static public String initial(double lat1, double long1, double lat2, double long2){
		return (_bearing(lat1, long1, lat2, long2) + 360.0) % 360;
	}
	//define a finalBrng method that takes in 4 parameters and caters for the final bearing
	static public String finalBrng(double lat1, double long1, double lat2, double long2){
		return (_bearing(lat2, long2, lat1, long1) + 180.0) % 360;
	}
	*/
	//define a _bearing helper method that takes in 4 parameters and calculates the bearing (initial or final)
	static private String _bearing(double lat1, double long1, double lat2, double long2){
		double decValue;
		//degrees to radians converter
		double degToRad = Math.PI / 180.0;
		double phi1 = lat1 * degToRad;
		double phi2 = lat2 * degToRad;
		double lam1 = long1 * degToRad;
		double lam2 = long2 * degToRad;
		//calculate the decimal value
		decValue = Math.atan2(Math.sin(lam2-lam1)*Math.cos(phi2),
						  Math.cos(phi1)*Math.sin(phi2) - Math.sin(phi1)*Math.cos(phi2)*Math.cos(lam2-lam1)) * 180/Math.PI;
		return decimalToDMS(decValue);
	}
	// Input a double latitude or longitude in the decimal format e.g. -79.982195
	static private String decimalToDMS(double coord) {
		String output, degrees, minutes, seconds;
		// gets the modulus the coordinate divided by one (MOD1). In other words gets all the numbers after the decimal point. e.g. mod :=
		//-79.982195 % 1 == 0.982195. Next get the integer part of the coord. On other words the whole number part. e.g. intPart := -79
		double mod = coord % 1;
		int intPart = (int)coord;
		//set degrees to the value of intPart e.g. degrees := "-79"
		degrees = String.valueOf(intPart);
		// next times the MOD1 of degrees by 60 so we can find the integer part for minutes. get the MOD1 of the new coord to find the
		//numbers after the decimal point. e.g. coord :=  0.982195 * 60 == 58.9317 mod   := 58.9317 % 1    == 0.9317
		// next get the value of the integer part of the coord. e.g. intPart := 58
		coord = mod * 60;
		mod = coord % 1;
		intPart = (int)coord;
		if (intPart < 0) {// Convert number to positive if it's negative.
			intPart *= -1;
		}
		// set minutes to the value of intPart. e.g. minutes = "58"
		minutes = String.valueOf(intPart);
		//do the same again for minutes e.g. coord := 0.9317 * 60 == 55.902 e.g. intPart := 55
		coord = mod * 60;
		intPart = (int)coord;
		if (intPart < 0) {// Convert number to positive if it's negative.
			intPart *= -1;
		}
		// set seconds to the value of intPart. e.g. seconds = "55"
		seconds = String.valueOf(intPart);
		// I used this format for android but you can change it to return in whatever format you like
		output = degrees + "°" + minutes + "'" + seconds + "″";
		//Standard output of D°M′S″
		//output = degrees + "°" + minutes + "′" + seconds + "\"";
		return output;
	}

	 /*
	* Conversion DMS to decimal
	*
	* Input: latitude or longitude in the DMS format ( example: W 79° 58' 55.903")
	* Return: latitude or longitude in decimal format
	* hemisphereOUmeridien => {W,E,S,N}
	*
	public double DMSToDecimal(String hemisphereOUmeridien, double degres, double minutes, double secondes){
		double LatOrLon=0;
		double signe=1.0;
		if((hemisphereOUmeridien.equals("W"))||(hemisphereOUmeridien.equals("S"))) {signe=-1.0;}
		LatOrLon = signe*(Math.floor(degres) + Math.floor(minutes)/60.0 + secondes/3600.0);
		return(LatOrLon);
	}
	*/
	//define the main method
	public static void main(String[] args){
		//System.out.println("Initial bearing: "+initial(41, .1212, 11, .2323)+"\n"+"Final bearing: "+finalBrng(41, .1212, 11, .2323));
		System.out.println("Initial bearing: "+_bearing(41, .1212, 11, .2323));
	}
}
