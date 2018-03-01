package cp120.assignments.geo_shape;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Encapsulates the x- and y-coordinates of a point on a plane.
 * @author jcrowley
 */
public class GeoPoint {
    private double xco = 0;
    private double yco = 0;

    /**
     * Constructor for the GeoPoint
     * @param xco The x coordinate as a double value
     * @param yco The y coordinate as a double value
     */
    public GeoPoint(double xco, double yco){
        this.setXco(xco);
        this.setYco(yco);
    }

    /**
     * Gets the x-coordinate of this point.
     * @return the x-coordinate of this point.
     */
    public double getXco() {
        return xco;
    }

    /**
     * Sets the x-coordinate of this point.
     * @param xco the new x-coordinate of this point
     */
    public void setXco(double xco) {
        this.xco = xco;
    }

    /**
     * Gets the y-coordinate of this point.
     * @return the y-coordinate of this point.
     */
    public double getYco() {
        return yco;
    }

    /**
     * Sets the y-coordinate of this point.
     * @param yco the new y-coordinate of this point
     */
    public void setYco(double yco) {
        this.yco = yco;
    }

    /**
     * Overrides the base toString method
     * Returns xcor and ycor formatted to 4 decimal places with remainder rounding up
     * @return (xcor,yxor) rounded as described above
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        DecimalFormat df = new DecimalFormat("#.0000");
        df.setRoundingMode(RoundingMode.HALF_UP);

        builder.append("(" + df.format(xco) + "," + df.format(yco) + ")");

        return builder.toString();
    }

    /**
     * Creates an equals method to test GeopPint equalities
     * @param other The GeoPoint to compare against
     * @param epsilon The amount that the comparison can be off by
     * @return True if they are equal and false if they are now
     */
    public Boolean equals( GeoPoint other, double epsilon){
        Boolean eql = false;
        if (other == null){
            eql = false;
        }
        else if (this == other){
            eql = true;
        }
        else if (!(other instanceof GeoPoint)){
            eql = false;
        }
        else {
            double x = this.getXco();
            double y = this.getYco();
            double x1 = other.getXco();
            double y1 = other.getYco();
            if ((Math.abs(x-x1) < epsilon) && (Math.abs(y-y1) < epsilon)){
                eql = true;
            }
            else {
                eql = false;
            }
        }
        return eql;
    }
}