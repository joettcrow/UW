package cp120.assignments.geo_shape;

import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Encapsulates a rectangle drawn on a plane. Properties include
 * <ul>
 * <li>The origin (x- and y-coordinates of the upper left corner) of the rectangle</li>
 * <li>The width of the rectangle</li>
 * <li>The height of the rectangle</li>
 * <li>The color of the rectangle</li>
 * </ul>
 * @author jcrowley
 */
public class GeoRectangle extends GeoShape{
    private double width = 0;
    private double height = 0;

    /**
     * Constructs a rectangle when passed two values
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public GeoRectangle( double width, double height ){
        this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
    }

    /**
     * Constructs a rectangle when passed three values
     * @param origin the origin of the shape as a GeoPoint
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public GeoRectangle( GeoPoint origin, double width, double height ){
        this( origin, DEFAULT_COLOR, width, height );
    }

    /**
     * Constructs a rectangle when passed four values
     * @param origin the origin of the shape as a GeoPoint
     * @param color the color of the shape
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public GeoRectangle(
            GeoPoint origin,
            Color color,
            double width,
            double height
    ) throws IllegalArgumentException{

        super(origin,color);
        this.setWidth(width);
        this.setHeight(height);
    }

    /**
     * Draws this rectangle on a plane.
     * @param gtx the graphics context to use for drawing
     */
    public void draw(Graphics2D gtx){
        System.out.println("Drawing rectangle: " + toString());
    }

    /**
     * Gets the width of the rectangle.
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle
     * @param width the new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the rectangle
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle
     * @param height the new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the given rectang'e
     * @return the rectangle's area as a double
     */
    public double area(){
        return width * height;
    }

    /**
     * Calculates the perimiter of the given rectangle
     * @return the rectangle's perimeter as a double
     */
    public double perimiter(){
        return height + height + width + width;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.0000");
        df.setRoundingMode(RoundingMode.HALF_UP);

        builder.append(super.toString());
        builder.append(",width=" + df.format(width) + ",height=" + df.format(height));

        return builder.toString();
    }

    public static void main(String[] args) {
        GeoPoint origin = new GeoPoint(10,10);
        GeoRectangle rect = new GeoRectangle(origin, Color.BLACK, 20, 30);
        System.out.println(rect.toString());
        System.out.println(rect.area());
        System.out.println(rect.perimiter());
        rect.draw(null);
    }
}
