package cp120.assignments.geo_shape;

import java.awt.*;

/**
 * @author jcrowley
 */

public class GeoRectangle extends GeoShape{
    private double width = 0;
    private double height = 0;

    public void draw(Graphics2D gtx){
        System.out.println("Drawing rectangle");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
