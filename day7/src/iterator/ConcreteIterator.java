package iterator;

public class ConcreteIterator implements Iterator {
    private MyList myList;
    private int index;
    public ConcreteIterator(MyList myList){this.myList=myList;}

    @Override
    public boolean hasNext() {
        if(index>=myList.getSize()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return myList.get(index++);
    }
}
