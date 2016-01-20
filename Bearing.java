/*
Bearing:
In general, your current heading will vary as you follow a great circle path (orthodrome); the final heading will differ from the initial heading by varying degrees according to distance and latitude (if you were to go from say 35°N,45°E (≈ Baghdad) to 35°N,135°E (≈ Osaka), you would start on a heading of 60° and end up on a heading of 120°!).
This formula is for the initial bearing (sometimes referred to as forward azimuth) and the final bearing which if followed in a straight line along a great-circle arc will take you from the start point to the end point:1
Formula:	θ = atan2( sin Δλ ⋅ cos φ2 , cos φ1 ⋅ sin φ2 − sin φ1 ⋅ cos φ2 ⋅ cos Δλ )
JavaScript:
(all angles in radians)
var y = Math.sin(λ2-λ1) * Math.cos(φ2);
var x = Math.cos(φ1)*Math.sin(φ2) -
        Math.sin(φ1)*Math.cos(φ2)*Math.cos(λ2-λ1);
var brng = Math.atan2(y, x).toDegrees();
Excel:
(all angles in radians)
=ATAN2(COS(lat1)*SIN(lat2)-SIN(lat1)*COS(lat2)*COS(lon2-lon1), SIN(lon2-lon1)*COS(lat2))
*note that Excel reverses the arguments to ATAN2 – see notes below
Since atan2 returns values in the range -π ... +π (that is, -180° ... +180°), to normalise the result to a compass bearing (in the range 0° ... 360°, with −ve values transformed into the range 180° ... 360°), convert to degrees and then use (θ+360) % 360, where % is (floating point) modulo.
For final bearing, simply take the initial bearing from the end point to the start point and reverse it (using θ = (θ+180) % 360).
*/
public class Bearing{

}
