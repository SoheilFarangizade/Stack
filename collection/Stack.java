package collection;


public class Stack<E> implements Collection<E> {

    private int size;
    private Object[] element;
    private E[] e;
    int data = 0;
    private int maxsize;

    public int indexOf(Object var1) {
        int var2;
        if (var1 == null) {
            for (var2 = 0; var2 < this.size; ++var2) {
                if (this.element[var2] == null) {
                    return var2;
                }
            }
        } else {
            for (var2 = 0; var2 < this.size; ++var2) {
                if (var1.equals(this.element[var2])) {
                    return var2;
                }
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public void clear() {
        ++this.data;
        for (int i = 0; i < this.size(); i++) {
            this.element[i] = null;
        }
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(E var) {
        return this.indexOf(var) >= 0;
    }

    public Stack(int maxsize) {
        this.maxsize = maxsize;
    }

    public int getMaxsize() {
        return size();
    }

    public void get(int i) throws Exception.IndexoutOfBoundExecption {

        if (i >= getMaxsize())
            throw new Exception.IndexoutOfBoundExecption();
    }

    public void resize(int newSize){
        assert newSize >= getMaxsize();

        E[] temp = (E[]) new Object[newSize];
        for (int i = 0; i <getMaxsize() ; i++) {
            temp[i] = e[i];
        }
        e = temp;
    }

    public void push(E var) throws Exception.OverflowExecption{
        if (maxsize == getMaxsize()) {
            throw new Exception.OverflowExecption();
        }
        e[size ++] = var;
    }



    public E pop() throws Exception.UnderflowException{
        if (isEmpty()) throw new Exception.UnderflowException();
        E s =  e [size - 1];
        e[size - 1 ] = null;
        size --;
        return s;
    }
}
