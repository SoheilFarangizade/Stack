package collection;

public class Deque<E> implements Collection<E> {
    private Node<E> head, tail;
    private Node<E> curr = head;
    private int size ;
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(E var) {
        return false;
    }

    public void checkValue() {
        assert size >= 0;
        assert size > 0 || (head == null && tail == null);
        assert (head == null && tail == null) || (head != null && tail != null);
    }

    public void pushFront(E var){
        Node<E> prevHead = head;
        Node<E> newHead = new Node<E>(var);
        if (prevHead != null) {
            newHead.connectRight(prevHead);
        } else {
            tail = newHead;
        }
        head = newHead;
        size++;
        checkValue();
    }

    public void pushBack(E var) {
        Node<E> newTail = new Node<>(var);
        Node<E> prevTail = tail;
        if (prevTail != null) {
            prevTail.connectRight(newTail);
        } else {
            head = newTail;
        }
        tail = newTail;
        size++;
        checkValue();
    }

    public E popFront(){
        if (isEmpty()) throw new Exception.UnderflowException();
        size--;
        Node<E> prevHead = head;
        head = prevHead.right;
        prevHead.right = null;
        if (head != null) {
            head.left = null;
        }
        checkValue();
        return prevHead.item;
    }

    public E popBack(){
        if (isEmpty()) throw new Exception.UnderflowException();
        size--;
        Node<E> prevTail = tail;
        tail = prevTail.left;
        prevTail.left = null;
        if (tail != null) tail.right = null;
        checkValue();
        return prevTail.item;
    }

    public E getElemtn(int i) {
        if (i >= size()) { throw new IndexOutOfBoundsException(); }
        E item = curr.item;
        curr = curr.right;
        return item;
    }
}
