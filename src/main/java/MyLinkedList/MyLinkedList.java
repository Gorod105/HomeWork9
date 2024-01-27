package MyLinkedList;

public class MyLinkedList <E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public void add(E element) {
        final MyLinkedList.Node<E> l = last;
        final MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
    public Node<E> get(int index){
        MyLinkedList.Node<E> x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }
    public  void remove(int index){
        MyLinkedList.Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        x.prev.next = x.next;
        x.next.prev = x.prev;
        x.item = null;
    }
    public int size() {
        return size;
    }
    public void clear() {

        for (MyLinkedList.Node<E> x = first; x != null; ) {
            MyLinkedList.Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return (String) item;
        }
    }
}

