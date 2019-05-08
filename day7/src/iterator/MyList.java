package iterator;

public interface MyList  {
    void add(Object o);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
