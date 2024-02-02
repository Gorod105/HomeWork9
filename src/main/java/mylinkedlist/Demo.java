package mylinkedlist;


public class Demo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Roma");
        myLinkedList.add("Stepan");
        myLinkedList.add("Mykola");
        myLinkedList.add("Ivan");
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));

    }

}
