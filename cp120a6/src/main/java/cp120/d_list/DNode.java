package cp120.d_list;

import javax.xml.soap.Node;

/**
 * @author jcrowley
 */

public class DNode {
    private DNode flink;
    private DNode blink;
    private Object data;

    public DNode(Object data) {
        flink = this;
        blink = this;
        this.data = data;
    }

    public DNode() {
        this(null);
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isEnqueued(){
        return this != this.flink;
    }

    public void addAfter (DNode node) throws java.lang.IllegalArgumentException{
        node.blink = this;
        node.flink = this.flink;
        this.flink = node;
        node.flink.blink = node;

    }

    public void addBefore (DNode node) throws java.lang.IllegalArgumentException {
        node.flink = this;
        node.blink = this.blink;
        this.blink = node;
        node.blink.flink = node;
    }

    public DNode remove(){
        blink.flink = flink;
        flink.blink = blink;
        flink = this;
        blink = this;

        return this;
    }

    public DNode getNext(){
        return flink;
    }

    public DNode getPrevious(){
        return blink;
    }

}
