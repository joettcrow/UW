package cp120.assignments.geo_shape;

import cp120.d_list.DList;
import cp120.d_list.DNode;

/**
 * @author jcrowley
 */

public class GeoPlane {
    private DList list    = new DList();

    public void addShape( GeoShape shape){
        list.addHead(new DNode(shape));
    }

//    public boolean removeShape(GeoShape shape){
//        for (:
//             ) {
//
//        }
//    }
}
