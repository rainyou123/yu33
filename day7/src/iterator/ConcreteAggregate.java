package iterator;

public class ConcreteAggregate implements MyList{
    private Object[] list;
    private int index;
    private int size;
    public ConcreteAggregate(){
        list=new Object[50];
        index=0;
        size=0;
    }
    @Override
    public void add(Object o) {
        list[index++]=o;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}
