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

    public boolean removeShape(GeoShape shape){
        boolean found = false;
        if (list.isEmpty()){
            return found;
        }

        DNode node = list.getHead();

        do {
            if (node.getData() == shape){
                node.remove();
                found = true;
            }
        }while (!found && (node.getNext() != node.getData()));
        return found;
    }

    public void redraw() {
        GeoShape shape;
        DNode node = list.getTail();
        if (list.isEmpty()){

        }
        else {
            do {
                node = node.getPrevious();
                shape = (GeoShape) node.getData();
                shape.draw(null);
            } while (node.getPrevious() != node);
        }
    }
}
