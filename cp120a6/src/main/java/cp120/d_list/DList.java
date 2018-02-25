package cp120.d_list;

/**
 * @author jcrowley
 */

public class DList extends DNode{
    public void addHead(DNode node){
        addAfter(node);
    }

    public void addTail(DNode node){
        addBefore(node);
    }

    public DNode removeHead(){
        DNode head = getNext();
        return head.remove();
    }

    public DNode removeTail(){
        DNode tail = getPrevious();
        return tail.remove();
    }

    public DNode getHead(){
        return getNext();
    }

    public DNode getTail(){
        return getPrevious();
    }

    public void removeAll(){
        DNode node;
        while ((node = getNext()) != this) {
            node.remove();
        }
    }

    public boolean isEmpty(){
        return (getNext() == this) && (getPrevious() != this);
    }

    public int size(){
        int count = 0;
        DNode node = getHead();
        while (node!=this){
            ++count;
            node = node.getNext();
        }
        return count;
    }

}
