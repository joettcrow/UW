package cp120.assignments.geo_shape;

import java.awt.*;

/**
 * The class extended by all those classes that represent shapes to be drawn on a GeoPlane.
 * @author jcrowley
 */
public abstract class GeoShape {
    private GeoPoint origin;
    private Color color;

    public static final GeoPoint DEFAULT_ORIGIN  = new GeoPoint( 0, 0 );
    public static final Color DEFAULT_COLOR = Color.BLUE;

    public GeoShape( GeoPoint origin, Color color) throws IllegalArgumentException{
        if (color != null){
            this.setColor(color);
        }
        try {
            this.setOrigin(origin);
        } catch (IllegalArgumentException exc){}
    }

    /**
     * Gets the origin of the shape.
     * @return the origin
     */
    public GeoPoint getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of the shape.
     * @param origin the new origin
     * @throws IllegalArgumentException if the new origin is null
     */
    public void setOrigin(GeoPoint origin) throws IllegalArgumentException {
        this.origin = origin;
    }

    /**
     * Gets the color of the shape.
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color.
     * @param color the new color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Draw a shape on a GeoPlane.
     * This is required to be implemented by every subclass of GeoShape.
     * @param gtx the graphics context to use for drawing
     */
    public abstract void draw(Graphics2D gtx);

    /**
     * Overides the default tostring.
     * Formats the origin using GeoPoint to string
     * Formats the color to be in 6 digit hex notation
     * @return the origin and color for the shape.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String colorHex;

        builder.append("origin="+ this.origin.toString() + ",color=");

        if (color != null) {
            colorHex = Integer.toHexString(color.getRGB() & 0xffffff);
            if(colorHex.length() < 6)
            {
                if(colorHex.length()==5)
                    colorHex = "0" + colorHex;
                if(colorHex.length()==4)
                    colorHex = "00" + colorHex;
                if(colorHex.length()==3)
                    colorHex = "000" + colorHex;
                if(colorHex.length()==2)
                    colorHex = "0000" + colorHex;
                if(colorHex.length()==1)
                    colorHex = "00000" + colorHex;
            }
            colorHex = "#" + colorHex;
        }
        else {
            colorHex = "null";
        }
        builder.append(colorHex);
        return builder.toString();

    }

    public static void main(String[] args) {
        GeoPoint origin = new GeoPoint(10,10);
        GeoShape shape1;
        shape1 = new GeoShape(origin, Color.RED) {
            @Override
            public void draw(Graphics2D gtx) {

            }
        };
        GeoShape shape2;
        shape2 = new GeoShape(origin, Color.MAGENTA) {
            @Override
            public void draw(Graphics2D gtx) {

            }
        };
        GeoShape shape3;
        shape3 = new GeoShape(origin, Color.YELLOW) {
            @Override
            public void draw(Graphics2D gtx) {

            }
        };
        GeoShape shape4;
        shape4 = new GeoShape(origin, null) {
            @Override
            public void draw(Graphics2D gtx) {

            }
        };
        GeoShape shape5;
        shape5 = new GeoShape(origin, Color.BLUE) {
            @Override
            public void draw(Graphics2D gtx) {

            }
        };
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
        System.out.println(shape4.toString());
        System.out.println(shape5.toString());
    }
}
