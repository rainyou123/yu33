package iterator;

public class Test {
    public static void main(String[] args) {
        MyList myList=new ConcreteAggregate();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        System.out.println(myList.getSize());
        System.out.println(myList.get(2));
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");
        MyList myList2=new ConcreteAggregate();
        System.out.println(myList2.getSize());
        System.out.println(myList2.get(2));
    }
}
