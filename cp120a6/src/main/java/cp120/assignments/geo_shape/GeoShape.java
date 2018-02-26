package cp120.assignments.geo_shape;

import java.awt.*;

/**
 * @author jcrowley
 */

public abstract class GeoShape {
    private GeoPoint origin;
    private Color color;

    public GeoPoint getOrigin() {
        return origin;
    }

    public void setOrigin(GeoPoint origin) throws IllegalArgumentException {
        this.origin = origin;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics2D gtx);
}
