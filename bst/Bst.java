package bst;

import collection.Collection;

public class Bst<E extends Comparable<E>> implements Collection<E> {
    private Node<E> eNode;
    @Override
    public int size() {
        return size();
    }

    @Override
    public void clear() {
        this.eNode = null;
    }

    @Override
    public boolean isEmpty() {
        return this.eNode == null;
    }

    @Override
    public boolean contains(E var) {
        return false;
    }

    public void add(E var){

    }

    public E getMinElement(){
        Node minimum ;
        if (this.eNode == null){
            return null;
        }else {
            minimum = eNode;
            while (minimum.getLeft() != null)
                minimum = minimum.getLeft();
        }
        return (E) minimum;
    }

    public E getMaxElement(){
        Node maximum ;
        if (this.eNode == null){
            return null;
        }else {
            maximum = eNode;
            while (maximum.getRight() != null){
                maximum = maximum.getRight();
            }
        }
        return (E) maximum;
    }
}
