package cp120.assignments.geo_shape;

import org.junit.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @author jcrowley
 */



public class GeoShapeTest extends GeoShape{
    private GeoShapeTest(GeoPoint origin, Color color) throws IllegalArgumentException {
        super(origin, color);
    }
    public void draw(Graphics2D gtx){
        System.out.println("Dummy Value");
    }

    @Test
    public void getColorTest() {
        GeoPoint point = new GeoPoint(1,1);
        GeoShapeTest shape = new GeoShapeTest(point,null);
        shape.setColor(Color.RED);
        assertEquals(Color.RED, shape.getColor());

    }

    @Test
    public void getOriginTest() {
        GeoPoint point = new GeoPoint(1,1);
        GeoShapeTest shape = new GeoShapeTest(point,null);
        GeoPoint origin = new GeoPoint(5,10);
        shape.setOrigin(origin);
        assertEquals(origin, shape.getOrigin());
    }

    @Test
    public void drawShapeTest(){
        GeoPoint point = new GeoPoint(1,1);
        GeoShapeTest shape = new GeoShapeTest(point,null);
        shape.draw(null);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        shape.draw(null);
        assertEquals(baos.toString(), "Dummy Value\n");
    }

}